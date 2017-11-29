package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class CetrificadoDepositoDTO {
	private Long numero;
	private String tipo;
	private Long kilosAplicados;
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getKilosAplicados() {
		return kilosAplicados;
	}
	public void setKilosAplicados(Long kilosAplicados) {
		this.kilosAplicados = kilosAplicados;
	}
}
