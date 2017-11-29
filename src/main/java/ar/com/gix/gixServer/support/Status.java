package ar.com.gix.gixServer.support;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class Status {
	private Integer code;
	private String mensaje;
	private String detalle;
	
	public Status() {
		super();
	}

	public Status(StatusCodes statusCode, String detalle) {
		super();
		this.code = statusCode.getCode();
		this.mensaje = statusCode.getMensaje();
		this.detalle = detalle;
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
