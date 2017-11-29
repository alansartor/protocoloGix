package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class IntervinienteAnalisisDTO extends IntervinienteReducidoDTO {
	private Long codigoSucursal;

	public Long getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(Long codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}
}
