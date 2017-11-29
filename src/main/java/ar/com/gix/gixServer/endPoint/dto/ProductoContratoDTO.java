package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ProductoContratoDTO extends ProductoDescargaDTO {
	private Long codigoCondicionesCalidad;

	public Long getCodigoCondicionesCalidad() {
		return codigoCondicionesCalidad;
	}
	public void setCodigoCondicionesCalidad(Long codigoCondicionesCalidad) {
		this.codigoCondicionesCalidad = codigoCondicionesCalidad;
	}
}
