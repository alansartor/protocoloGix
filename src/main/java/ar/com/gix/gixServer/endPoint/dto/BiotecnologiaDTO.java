package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class BiotecnologiaDTO {
	private String codigoBiotecnologia;
	private Long porcentaje;
	
	public String getCodigoBiotecnologia() {
		return codigoBiotecnologia;
	}
	public void setCodigoBiotecnologia(String codigoBiotecnologia) {
		this.codigoBiotecnologia = codigoBiotecnologia;
	}
	public Long getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(Long porcentaje) {
		this.porcentaje = porcentaje;
	}
}
