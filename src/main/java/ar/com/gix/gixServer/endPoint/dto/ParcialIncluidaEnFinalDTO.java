package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ParcialIncluidaEnFinalDTO {
	private Long codigo;
	private String letra;
	private Long sucursal;
	private Long numeroComprobanteParcial;
	private Long numeroCoe;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Long getSucursal() {
		return sucursal;
	}
	public void setSucursal(Long sucursal) {
		this.sucursal = sucursal;
	}
	public Long getNumeroComprobanteParcial() {
		return numeroComprobanteParcial;
	}
	public void setNumeroComprobanteParcial(Long numeroComprobanteParcial) {
		this.numeroComprobanteParcial = numeroComprobanteParcial;
	}
	public Long getNumeroCoe() {
		return numeroCoe;
	}
	public void setNumeroCoe(Long numeroCoe) {
		this.numeroCoe = numeroCoe;
	}
}
