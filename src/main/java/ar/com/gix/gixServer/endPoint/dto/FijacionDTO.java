package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class FijacionDTO {
	private String numeroContratoComprador;
	private String numeroContratoVendedor;
	private String numeroContratoCorredor;
	private Long fechaFijacion;
	private Long kilosFijados;
	private Long precio;
	private Long codigoMonedaPrecio;
	private Long idInternoFijacionComprador;
	public String getNumeroContratoComprador() {
		return numeroContratoComprador;
	}
	public void setNumeroContratoComprador(String numeroContratoComprador) {
		this.numeroContratoComprador = numeroContratoComprador;
	}
	public String getNumeroContratoVendedor() {
		return numeroContratoVendedor;
	}
	public void setNumeroContratoVendedor(String numeroContratoVendedor) {
		this.numeroContratoVendedor = numeroContratoVendedor;
	}
	public String getNumeroContratoCorredor() {
		return numeroContratoCorredor;
	}
	public void setNumeroContratoCorredor(String numeroContratoCorredor) {
		this.numeroContratoCorredor = numeroContratoCorredor;
	}
	public Long getFechaFijacion() {
		return fechaFijacion;
	}
	public void setFechaFijacion(Long fechaFijacion) {
		this.fechaFijacion = fechaFijacion;
	}
	public Long getKilosFijados() {
		return kilosFijados;
	}
	public void setKilosFijados(Long kilosFijados) {
		this.kilosFijados = kilosFijados;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Long getCodigoMonedaPrecio() {
		return codigoMonedaPrecio;
	}
	public void setCodigoMonedaPrecio(Long codigoMonedaPrecio) {
		this.codigoMonedaPrecio = codigoMonedaPrecio;
	}
	public Long getIdInternoFijacionComprador() {
		return idInternoFijacionComprador;
	}
	public void setIdInternoFijacionComprador(Long idInternoFijacionComprador) {
		this.idInternoFijacionComprador = idInternoFijacionComprador;
	}
}
