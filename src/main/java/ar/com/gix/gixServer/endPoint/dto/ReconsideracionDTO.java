package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ReconsideracionDTO {
	private String primerResultado;
	private String reconsideracion;
	private String tercerResultado;
	private String resultadoFinal;
	private String textoReconsideracion;
	public String getPrimerResultado() {
		return primerResultado;
	}
	public void setPrimerResultado(String primerResultado) {
		this.primerResultado = primerResultado;
	}
	public String getReconsideracion() {
		return reconsideracion;
	}
	public void setReconsideracion(String reconsideracion) {
		this.reconsideracion = reconsideracion;
	}
	public String getTercerResultado() {
		return tercerResultado;
	}
	public void setTercerResultado(String tercerResultado) {
		this.tercerResultado = tercerResultado;
	}
	public String getResultadoFinal() {
		return resultadoFinal;
	}
	public void setResultadoFinal(String resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}
	public String getTextoReconsideracion() {
		return textoReconsideracion;
	}
	public void setTextoReconsideracion(String textoReconsideracion) {
		this.textoReconsideracion = textoReconsideracion;
	}
}
