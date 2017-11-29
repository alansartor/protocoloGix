package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class AplicacionDTO {
	private Long cartaPorte;
	private String numeroContratoComprador;
	private String numeroContratoVendedor;
	private String numeroContratoCorredor;
	private Long idInternoFijacionComprador;
	private Long kilosAplicados;
	private Long fechaAplicacion;
	public Long getCartaPorte() {
		return cartaPorte;
	}
	public void setCartaPorte(Long cartaPorte) {
		this.cartaPorte = cartaPorte;
	}
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
	public Long getIdInternoFijacionComprador() {
		return idInternoFijacionComprador;
	}
	public void setIdInternoFijacionComprador(Long idInternoFijacionComprador) {
		this.idInternoFijacionComprador = idInternoFijacionComprador;
	}
	public Long getKilosAplicados() {
		return kilosAplicados;
	}
	public void setKilosAplicados(Long kilosAplicados) {
		this.kilosAplicados = kilosAplicados;
	}
	public Long getFechaAplicacion() {
		return fechaAplicacion;
	}
	public void setFechaAplicacion(Long fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
}
