package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ProductoDescargaDTO {
	private Long codigo;
	private Long extension;
	private Long codigoCosecha;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getExtension() {
		return extension;
	}
	public void setExtension(Long extension) {
		this.extension = extension;
	}
	public Long getCodigoCosecha() {
		return codigoCosecha;
	}
	public void setCodigoCosecha(Long codigoCosecha) {
		this.codigoCosecha = codigoCosecha;
	}
}
