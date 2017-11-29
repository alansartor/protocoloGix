package ar.com.gix.gixServer.security.support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.access.AccessDeniedException;

import ar.com.gix.gixServer.endPoint.support.EndPoint;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class RolUtil {
	
	public static List<Rol> verificarPermiso(EndPoint endPoint, Collection<Rol> authorities) throws AccessDeniedException {
		List<Rol> roles = new ArrayList<Rol>();
		for (Rol grantedAuthority : authorities) {
			if(endPoint.getAutorizaciones().contains(grantedAuthority.getAuthority())) {
				roles.add(grantedAuthority);//Armo lista con los roles habilitados para consumir el endpoint
			}
		}
		if(roles.isEmpty()){
			throw new AccessDeniedException("No tiene permisos para consultar Analisis");
		}
		return roles;
	}

}
