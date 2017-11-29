package ar.com.gix.gixServer.endPoint.support;

import java.util.Set;

import ar.com.gix.gixServer.security.support.Rol;

import java.util.HashSet;

/**
 * Endpoints enum
 * @author alansartor18@hotmail.com
 *
 */
public enum EndPoint {
	//TODO verificar que roles pueden usar cada endpoint
	descargas(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
									 add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());add(Rol.REPRESENTANTE_ENTREGADOR.name());}}),
	contratos(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
	 								 add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	fijaciones(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
									  add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	aplicaciones(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
										add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	comprobantes(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
										add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	certificadosdepositos(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
												 add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	muestras(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());
									add(Rol.CORREDOR.name());add(Rol.INTERMEDIARIO.name());}}),
	analisis(new HashSet<String>(){{add(Rol.PRODUCTOR.name());add(Rol.ACOPIADOR.name());add(Rol.EXPORTADOR.name());}});
	
	private Set<String> autorizaciones;

	private EndPoint(Set<String> autorizaciones) {
		this.autorizaciones = autorizaciones;
	}

	public Set<String> getAutorizaciones() {
		return autorizaciones;
	}

	public void setAutorizaciones(Set<String> autorizaciones) {
		this.autorizaciones = autorizaciones;
	}
}
