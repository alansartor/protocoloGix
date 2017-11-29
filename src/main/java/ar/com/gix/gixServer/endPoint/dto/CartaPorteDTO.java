package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class CartaPorteDTO {
	private Long numeroCTG;
	private Long cartaPorte;
	private Long kilosCertificados;
	
	public Long getNumeroCTG() {
		return numeroCTG;
	}
	public void setNumeroCTG(Long numeroCTG) {
		this.numeroCTG = numeroCTG;
	}
	public Long getCartaPorte() {
		return cartaPorte;
	}
	public void setCartaPorte(Long cartaPorte) {
		this.cartaPorte = cartaPorte;
	}
	public Long getKilosCertificados() {
		return kilosCertificados;
	}
	public void setKilosCertificados(Long kilosCertificados) {
		this.kilosCertificados = kilosCertificados;
	}
}
