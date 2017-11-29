package ar.com.gix.gixServer.endPoint.dto;

import java.util.List;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class EnsayoDTO extends EnsayoReducidoDTO {
	private String descripcion;
	private String valor;
	private String unidad;
	private String tecnica;
	private boolean fueraStandar;
	private Long focoConjunto;
	private List<VariedadDTO> variedades;
	private ReconsideracionDTO reconsideracion;
	private String veredicto;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public boolean isFueraStandar() {
		return fueraStandar;
	}
	public void setFueraStandar(boolean fueraStandar) {
		this.fueraStandar = fueraStandar;
	}
	public Long getFocoConjunto() {
		return focoConjunto;
	}
	public void setFocoConjunto(Long focoConjunto) {
		this.focoConjunto = focoConjunto;
	}
	public List<VariedadDTO> getVariedades() {
		return variedades;
	}
	public void setVariedades(List<VariedadDTO> variedades) {
		this.variedades = variedades;
	}
	public ReconsideracionDTO getReconsideracion() {
		return reconsideracion;
	}
	public void setReconsideracion(ReconsideracionDTO reconsideracion) {
		this.reconsideracion = reconsideracion;
	}
	public String getVeredicto() {
		return veredicto;
	}
	public void setVeredicto(String veredicto) {
		this.veredicto = veredicto;
	}
}
