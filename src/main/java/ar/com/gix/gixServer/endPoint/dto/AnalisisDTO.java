package ar.com.gix.gixServer.endPoint.dto;

import java.util.List;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class AnalisisDTO {
	private String numeroSolicitud;
	private String numeroSolicitudReemplazo;
	private String numeroSolicitudReconsideracion;
	private String numeroMuestra;
	private Long fechaIngreso;
	private Long fechaEmision;
	private String muestraDeclarada;
	private String numeroCondicionCamara;
	private Long fechaTomaDeMuestraDescarga;
	private Long cantidadKilosDeclarados;
	private String numeroReciboCliente;
	private Long numeroRemitoContable;
	private Long numeroRemitoLacrado;
	private Double honorariosSolicitudRemitoContable;
	private Double honorariosServicioDeLacrado;
	private String contratoVendedor;
	private String contratoComprador;
	private String buque;
	private String destino;
	private String siloCelda;
	private String otrosDatos;
	private String identificacion;
	private ProductoDTO producto;
	private IntervinienteAnalisisDTO solicitante;
	private IntervinienteAnalisisDTO comprador;
	private IntervinienteAnalisisDTO vendedor;
	private IntervinienteAnalisisDTO corredor;
	private List<IntervinienteAnalisisDTO> cuentaYOrden;
	private PuertoDTO puertoTerminalDeDescargaEmbarque;
	private List<IntervinienteAnalisisDTO> pagadores;
	private LocalidadDTO procedencia;
	private List<String> precintos;
	private TransporteDTO transporte;
	private List<EnsayoDTO> ensayos;
	
	public String getNumeroSolicitud() {
		return numeroSolicitud;
	}
	public void setNumeroSolicitud(String numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}
	public String getNumeroSolicitudReemplazo() {
		return numeroSolicitudReemplazo;
	}
	public void setNumeroSolicitudReemplazo(String numeroSolicitudReemplazo) {
		this.numeroSolicitudReemplazo = numeroSolicitudReemplazo;
	}
	public String getNumeroSolicitudReconsideracion() {
		return numeroSolicitudReconsideracion;
	}
	public void setNumeroSolicitudReconsideracion(String numeroSolicitudReconsideracion) {
		this.numeroSolicitudReconsideracion = numeroSolicitudReconsideracion;
	}
	public String getNumeroMuestra() {
		return numeroMuestra;
	}
	public void setNumeroMuestra(String numeroMuestra) {
		this.numeroMuestra = numeroMuestra;
	}
	public Long getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Long getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Long fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getMuestraDeclarada() {
		return muestraDeclarada;
	}
	public void setMuestraDeclarada(String muestraDeclarada) {
		this.muestraDeclarada = muestraDeclarada;
	}
	public String getNumeroCondicionCamara() {
		return numeroCondicionCamara;
	}
	public void setNumeroCondicionCamara(String numeroCondicionCamara) {
		this.numeroCondicionCamara = numeroCondicionCamara;
	}
	public Long getFechaTomaDeMuestraDescarga() {
		return fechaTomaDeMuestraDescarga;
	}
	public void setFechaTomaDeMuestraDescarga(Long fechaTomaDeMuestraDescarga) {
		this.fechaTomaDeMuestraDescarga = fechaTomaDeMuestraDescarga;
	}
	public Long getCantidadKilosDeclarados() {
		return cantidadKilosDeclarados;
	}
	public void setCantidadKilosDeclarados(Long cantidadKilosDeclarados) {
		this.cantidadKilosDeclarados = cantidadKilosDeclarados;
	}
	public String getNumeroReciboCliente() {
		return numeroReciboCliente;
	}
	public void setNumeroReciboCliente(String numeroReciboCliente) {
		this.numeroReciboCliente = numeroReciboCliente;
	}
	public Long getNumeroRemitoContable() {
		return numeroRemitoContable;
	}
	public void setNumeroRemitoContable(Long numeroRemitoContable) {
		this.numeroRemitoContable = numeroRemitoContable;
	}
	public Long getNumeroRemitoLacrado() {
		return numeroRemitoLacrado;
	}
	public void setNumeroRemitoLacrado(Long numeroRemitoLacrado) {
		this.numeroRemitoLacrado = numeroRemitoLacrado;
	}
	public Double getHonorariosSolicitudRemitoContable() {
		return honorariosSolicitudRemitoContable;
	}
	public void setHonorariosSolicitudRemitoContable(Double honorariosSolicitudRemitoContable) {
		this.honorariosSolicitudRemitoContable = honorariosSolicitudRemitoContable;
	}
	public Double getHonorariosServicioDeLacrado() {
		return honorariosServicioDeLacrado;
	}
	public void setHonorariosServicioDeLacrado(Double honorariosServicioDeLacrado) {
		this.honorariosServicioDeLacrado = honorariosServicioDeLacrado;
	}
	public String getContratoVendedor() {
		return contratoVendedor;
	}
	public void setContratoVendedor(String contratoVendedor) {
		this.contratoVendedor = contratoVendedor;
	}
	public String getContratoComprador() {
		return contratoComprador;
	}
	public void setContratoComprador(String contratoComprador) {
		this.contratoComprador = contratoComprador;
	}
	public String getBuque() {
		return buque;
	}
	public void setBuque(String buque) {
		this.buque = buque;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getSiloCelda() {
		return siloCelda;
	}
	public void setSiloCelda(String siloCelda) {
		this.siloCelda = siloCelda;
	}
	public String getOtrosDatos() {
		return otrosDatos;
	}
	public void setOtrosDatos(String otrosDatos) {
		this.otrosDatos = otrosDatos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public ProductoDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}
	public IntervinienteAnalisisDTO getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(IntervinienteAnalisisDTO solicitante) {
		this.solicitante = solicitante;
	}
	public IntervinienteAnalisisDTO getComprador() {
		return comprador;
	}
	public void setComprador(IntervinienteAnalisisDTO comprador) {
		this.comprador = comprador;
	}
	public IntervinienteAnalisisDTO getVendedor() {
		return vendedor;
	}
	public void setVendedor(IntervinienteAnalisisDTO vendedor) {
		this.vendedor = vendedor;
	}
	public IntervinienteAnalisisDTO getCorredor() {
		return corredor;
	}
	public void setCorredor(IntervinienteAnalisisDTO corredor) {
		this.corredor = corredor;
	}
	public List<IntervinienteAnalisisDTO> getCuentaYOrden() {
		return cuentaYOrden;
	}
	public void setCuentaYOrden(List<IntervinienteAnalisisDTO> cuentaYOrden) {
		this.cuentaYOrden = cuentaYOrden;
	}
	public PuertoDTO getPuertoTerminalDeDescargaEmbarque() {
		return puertoTerminalDeDescargaEmbarque;
	}
	public void setPuertoTerminalDeDescargaEmbarque(PuertoDTO puertoTerminalDeDescargaEmbarque) {
		this.puertoTerminalDeDescargaEmbarque = puertoTerminalDeDescargaEmbarque;
	}
	public List<IntervinienteAnalisisDTO> getPagadores() {
		return pagadores;
	}
	public void setPagadores(List<IntervinienteAnalisisDTO> pagadores) {
		this.pagadores = pagadores;
	}
	public LocalidadDTO getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(LocalidadDTO procedencia) {
		this.procedencia = procedencia;
	}
	public List<String> getPrecintos() {
		return precintos;
	}
	public void setPrecintos(List<String> precintos) {
		this.precintos = precintos;
	}
	public TransporteDTO getTransporte() {
		return transporte;
	}
	public void setTransporte(TransporteDTO transporte) {
		this.transporte = transporte;
	}
	public List<EnsayoDTO> getEnsayos() {
		return ensayos;
	}
	public void setEnsayos(List<EnsayoDTO> ensayos) {
		this.ensayos = ensayos;
	}
}
