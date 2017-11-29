package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class TransporteDescargaDTO {
	private String incisoCTG;
	private String codigoMedioTransporte;
	private String patenteCamion;
	private String patenteAcoplado;
	private Long numeroVagonOBarcaza;
	private String nombreOperativoOConvoy;
	public String getIncisoCTG() {
		return incisoCTG;
	}
	public void setIncisoCTG(String incisoCTG) {
		this.incisoCTG = incisoCTG;
	}
	public String getCodigoMedioTransporte() {
		return codigoMedioTransporte;
	}
	public void setCodigoMedioTransporte(String codigoMedioTransporte) {
		this.codigoMedioTransporte = codigoMedioTransporte;
	}
	public String getPatenteCamion() {
		return patenteCamion;
	}
	public void setPatenteCamion(String patenteCamion) {
		this.patenteCamion = patenteCamion;
	}
	public String getPatenteAcoplado() {
		return patenteAcoplado;
	}
	public void setPatenteAcoplado(String patenteAcoplado) {
		this.patenteAcoplado = patenteAcoplado;
	}
	public Long getNumeroVagonOBarcaza() {
		return numeroVagonOBarcaza;
	}
	public void setNumeroVagonOBarcaza(Long numeroVagonOBarcaza) {
		this.numeroVagonOBarcaza = numeroVagonOBarcaza;
	}
	public String getNombreOperativoOConvoy() {
		return nombreOperativoOConvoy;
	}
	public void setNombreOperativoOConvoy(String nombreOperativoOConvoy) {
		this.nombreOperativoOConvoy = nombreOperativoOConvoy;
	}
}
