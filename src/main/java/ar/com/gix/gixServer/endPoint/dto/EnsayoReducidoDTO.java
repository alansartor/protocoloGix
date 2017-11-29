package ar.com.gix.gixServer.endPoint.dto;

import java.util.List;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class EnsayoReducidoDTO {
	private Long id;
	private String tipo;
	private Long codigo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
