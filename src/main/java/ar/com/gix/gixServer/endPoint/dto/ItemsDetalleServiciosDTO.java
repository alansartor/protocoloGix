package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ItemsDetalleServiciosDTO {	
	 private Long codigoTipoItem;
	 private Long desctipcionTipoItem;
	 private Long cantidad;
	 private Long importeExento;
	 private Long importeNetoGravado;
	 private Long porcentajeAlicuotaIva;
	 private Long importeIva;
	 private Long importeTotal;
	 
	public Long getCodigoTipoItem() {
		return codigoTipoItem;
	}
	public void setCodigoTipoItem(Long codigoTipoItem) {
		this.codigoTipoItem = codigoTipoItem;
	}
	public Long getDesctipcionTipoItem() {
		return desctipcionTipoItem;
	}
	public void setDesctipcionTipoItem(Long desctipcionTipoItem) {
		this.desctipcionTipoItem = desctipcionTipoItem;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public Long getImporteExento() {
		return importeExento;
	}
	public void setImporteExento(Long importeExento) {
		this.importeExento = importeExento;
	}
	public Long getImporteNetoGravado() {
		return importeNetoGravado;
	}
	public void setImporteNetoGravado(Long importeNetoGravado) {
		this.importeNetoGravado = importeNetoGravado;
	}
	public Long getPorcentajeAlicuotaIva() {
		return porcentajeAlicuotaIva;
	}
	public void setPorcentajeAlicuotaIva(Long porcentajeAlicuotaIva) {
		this.porcentajeAlicuotaIva = porcentajeAlicuotaIva;
	}
	public Long getImporteIva() {
		return importeIva;
	}
	public void setImporteIva(Long importeIva) {
		this.importeIva = importeIva;
	}
	public Long getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(Long importeTotal) {
		this.importeTotal = importeTotal;
	}
}
