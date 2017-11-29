package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class TransporteDTO {
	private String codigoMedioTransporte;
	private Long cartaPorte;
	private Long numeroCTG;
	private String patenteChasis;
	private String patenteAcoplado;
	private String identificadorVagon;
	private Long cantidadVagones;
	
	public String getCodigoMedioTransporte() {
		return codigoMedioTransporte;
	}
	public void setCodigoMedioTransporte(String codigoMedioTransporte) {
		this.codigoMedioTransporte = codigoMedioTransporte;
	}
	public Long getCartaPorte() {
		return cartaPorte;
	}
	public void setCartaPorte(Long cartaPorte) {
		this.cartaPorte = cartaPorte;
	}
	public Long getNumeroCTG() {
		return numeroCTG;
	}
	public void setNumeroCTG(Long numeroCTG) {
		this.numeroCTG = numeroCTG;
	}
	public String getPatenteChasis() {
		return patenteChasis;
	}
	public void setPatenteChasis(String patenteChasis) {
		this.patenteChasis = patenteChasis;
	}
	public String getPatenteAcoplado() {
		return patenteAcoplado;
	}
	public void setPatenteAcoplado(String patenteAcoplado) {
		this.patenteAcoplado = patenteAcoplado;
	}
	public String getIdentificadorVagon() {
		return identificadorVagon;
	}
	public void setIdentificadorVagon(String identificadorVagon) {
		this.identificadorVagon = identificadorVagon;
	}
	public Long getCantidadVagones() {
		return cantidadVagones;
	}
	public void setCantidadVagones(Long cantidadVagones) {
		this.cantidadVagones = cantidadVagones;
	}
}
