package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ServicioDTO {
	private Long codigoTipoItemServicios;
	private String metodoDeDescuentoServicio;
	private Long kilosDescuentoPorServicio;
	public Long getCodigoTipoItemServicios() {
		return codigoTipoItemServicios;
	}
	public void setCodigoTipoItemServicios(Long codigoTipoItemServicios) {
		this.codigoTipoItemServicios = codigoTipoItemServicios;
	}
	public String getMetodoDeDescuentoServicio() {
		return metodoDeDescuentoServicio;
	}
	public void setMetodoDeDescuentoServicio(String metodoDeDescuentoServicio) {
		this.metodoDeDescuentoServicio = metodoDeDescuentoServicio;
	}
	public Long getKilosDescuentoPorServicio() {
		return kilosDescuentoPorServicio;
	}
	public void setKilosDescuentoPorServicio(Long kilosDescuentoPorServicio) {
		this.kilosDescuentoPorServicio = kilosDescuentoPorServicio;
	}
}
