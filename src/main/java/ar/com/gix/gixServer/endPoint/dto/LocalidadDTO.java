package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class LocalidadDTO {
	private Long codigoLocalidad;
	private String codigoPostal;
	private String subCodigoPostal;
	
	public Long getCodigoLocalidad() {
		return codigoLocalidad;
	}
	public void setCodigoLocalidad(Long codigoLocalidad) {
		this.codigoLocalidad = codigoLocalidad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getSubCodigoPostal() {
		return subCodigoPostal;
	}
	public void setSubCodigoPostal(String subCodigoPostal) {
		this.subCodigoPostal = subCodigoPostal;
	}
}
