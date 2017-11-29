package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class PuertoDTO {
	private Long cuit;
	private String codigoDePuerto;
	private String razonSocial;
	
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public String getCodigoDePuerto() {
		return codigoDePuerto;
	}
	public void setCodigoDePuerto(String codigoDePuerto) {
		this.codigoDePuerto = codigoDePuerto;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
}
