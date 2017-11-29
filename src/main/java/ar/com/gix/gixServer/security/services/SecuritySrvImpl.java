package ar.com.gix.gixServer.security.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import ar.com.gix.gixServer.security.response.TokenResponse;
import ar.com.gix.gixServer.security.support.Rol;
import ar.com.gix.gixServer.support.MyAuthentication;
import ar.com.gix.gixServer.support.MyRestGenericResponse;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
@Service
public class SecuritySrvImpl implements SecuritySrv {
	   
	/**
	 * Firma secreta codificada en Base64
	 * Esta clave se usa para firmar y verificar la firma de los tokens
	 * No difundir o dejar en lugar poco segurido, ya que si alguien obtiene esta
	 * key, podria generar tokens validos
	 */
	private final String superSecretKey = "bXlzdXBlcnNlY3JldGtleXBhcmFjb2RpZmljYXJ0b2tlbnM=";

	@Override
	public MyRestGenericResponse<String> generateToken(User user, Collection<? extends GrantedAuthority> authorities) {	
    Date now = new Date();
    Date expiration = new Date(now.getTime() + TimeUnit.HOURS.toMillis(1l));
    
    //Datos Hardcode, deberian saler de UserSrvImpl.loadUserByUsername
    Map<String, Object> datos = new HashMap<String, Object>();
    datos.put(PAYLOAD_CUIT, "30909000012");
    List<String> permisos = new ArrayList<String>();
    permisos.add("EXPORTADOR");
    datos.put(PAYLOAD_PERMISOS, permisos);
    
    return new TokenResponse(Jwts.builder()
    		.setId(UUID.randomUUID().toString())
            .setSubject(user.getUsername())
            .setIssuedAt(now)
            .setExpiration(expiration)
    		.addClaims(datos)
            .signWith(SignatureAlgorithm.HS512, superSecretKey)
            .compact());
	}

	@Override
	public MyAuthentication getAuthentication(HttpServletRequest request) {
        String headerValue = request.getHeader(AUTH_HEADER_NAME);

        if (headerValue == null || !headerValue.startsWith(AUTH_HEADER_VALUE_PREFIX)) {
            throw new JwtException("No JWT token found in request headers");
        }      
        String jwt = headerValue.substring(AUTH_HEADER_VALUE_PREFIX.length());
        Jws<Claims> claims = Jwts.parser()
          .setSigningKey(superSecretKey)
          .parseClaimsJws(jwt);
        String username = claims.getBody().getSubject();
        if(username == null) {
        	throw new JwtException("Incorrect Payload on JWT token");
        }
        List<String> permisosString = (List<String>) claims.getBody().get(PAYLOAD_PERMISOS);
        if(permisosString == null) {
        	throw new JwtException("Incorrect Payload on JWT token");
        }
        String cuit = (String) claims.getBody().get(PAYLOAD_CUIT);
        if(cuit == null) {
        	throw new JwtException("Incorrect Payload on JWT token");
        }
        MyAuthentication authentication = new MyAuthentication();
        authentication.setName(username);
        authentication.setPermisos(Rol.getValues(permisosString));
        authentication.setCuit(cuit);
        return authentication;
	}
}