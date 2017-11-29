package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class DestinoDTO extends LocalidadDTO{
	private Long codigoPlantaOncca;
	private String direccion;
	private Long codigoProvincia;
	
	public Long getCodigoPlantaOncca() {
		return codigoPlantaOncca;
	}
	public void setCodigoPlantaOncca(Long codigoPlantaOncca) {
		this.codigoPlantaOncca = codigoPlantaOncca;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(Long codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}
}
