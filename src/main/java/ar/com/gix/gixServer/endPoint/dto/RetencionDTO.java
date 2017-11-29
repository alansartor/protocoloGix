package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class RetencionDTO {
	private Long codigoTipoImpuesto;
	private Long codigoJurisdiccion;
	private Long codigoRegimen;
	private Long importe;
	
	public Long getCodigoTipoImpuesto() {
		return codigoTipoImpuesto;
	}
	public void setCodigoTipoImpuesto(Long codigoTipoImpuesto) {
		this.codigoTipoImpuesto = codigoTipoImpuesto;
	}
	public Long getCodigoJurisdiccion() {
		return codigoJurisdiccion;
	}
	public void setCodigoJurisdiccion(Long codigoJurisdiccion) {
		this.codigoJurisdiccion = codigoJurisdiccion;
	}
	public Long getCodigoRegimen() {
		return codigoRegimen;
	}
	public void setCodigoRegimen(Long codigoRegimen) {
		this.codigoRegimen = codigoRegimen;
	}
	public Long getImporte() {
		return importe;
	}
	public void setImporte(Long importe) {
		this.importe = importe;
	}
}
