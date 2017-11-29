package ar.com.gix.gixServer.support;

import java.util.Collection;

import org.springframework.security.core.Authentication;

import ar.com.gix.gixServer.security.support.Rol;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class MyAuthentication implements Authentication{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String cuit;
	private Collection<Rol> permisos;
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public void setPermisos(Collection<Rol> permisos) {
		this.permisos = permisos;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Collection<Rol> getAuthorities() {
		return permisos;
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getDetails() {
		return null;
	}

	@Override
	public Object getPrincipal() {
		return name;
	}

	@Override
	public boolean isAuthenticated() {
		return true;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {}

}
