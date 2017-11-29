package ar.com.gix.gixServer.security.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

/**
 * Roles de los consumidores de los Endpoint
 * El/los roles definen que EndPoint puede consumir el usuario
 * @author alansartor18@hotmail.com
 *
 */
public enum Rol implements GrantedAuthority {
	PRODUCTOR,
	ACOPIADOR,
	INTERMEDIARIO,
	CORREDOR,
	REPRESENTANTE_ENTREGADOR,
	EXPORTADOR,
	LABORATORIO;
	
	@Override
	public String getAuthority() {
		return name();
	}

	public static List<Rol> getValues(List<String> permisosString) {
		List<Rol> roles = new ArrayList<Rol>();
		for (String rolString : permisosString) {
			roles.add(Rol.valueOf(rolString));
		}
		return roles;
	}	
}
