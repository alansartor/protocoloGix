package ar.com.gix.gixServer.security.services;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import ar.com.gix.gixServer.support.MyAuthentication;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public interface SecuritySrv {
	public static final String AUTH_HEADER_NAME = "Authorization";
	public static final String AUTH_HEADER_VALUE_PREFIX = "Bearer ";
	
	public static final String PAYLOAD_CUIT = "cuit";
	public static final String PAYLOAD_PERMISOS = "permisos"; 
	
	public MyRestGenericResponse<String> generateToken(User principal, Collection<? extends GrantedAuthority> authorities);

	public MyAuthentication getAuthentication(HttpServletRequest request);

}
