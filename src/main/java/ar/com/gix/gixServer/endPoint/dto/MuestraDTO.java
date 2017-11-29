package ar.com.gix.gixServer.endPoint.dto;

import java.util.List;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class MuestraDTO {
	private String numeroMuestra;
	private ProductoDTO producto;
	private IntervinienteAnalisisDTO comprador;
	private IntervinienteAnalisisDTO vendedor;
	private IntervinienteAnalisisDTO corredor;
	private IntervinienteAnalisisDTO titular;
	private IntervinienteAnalisisDTO intermediario;
	private IntervinienteAnalisisDTO representante;
	private List<IntervinienteAnalisisDTO> cuentaYOrden;
	private Long codigoPagador;
	private LocalidadDTO procedencia;
	private LocalidadDTO destino;
	private String numeroContratoVendedor;
	private String numeroContratoComprador;
	private Long fechaDescarga;
	private String numeroReciboCliente;
	private Long codigoPuerto;
	private Long pesoNetoSeco;
	private boolean lacrada;
	private boolean servicioLacrado;
	private Long grupoEnsayos;
	private TransporteDTO transporte; 
	private List<EnsayoReducidoDTO> ensayos;
	private Long cosecha;
	private String biotecnologia;
	private String establecimiento;
	
	public String getNumeroMuestra() {
		return numeroMuestra;
	}
	public void setNumeroMuestra(String numeroMuestra) {
		this.numeroMuestra = numeroMuestra;
	}
	public ProductoDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
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
	public IntervinienteAnalisisDTO getTitular() {
		return titular;
	}
	public void setTitular(IntervinienteAnalisisDTO titular) {
		this.titular = titular;
	}
	public IntervinienteAnalisisDTO getIntermediario() {
		return intermediario;
	}
	public void setIntermediario(IntervinienteAnalisisDTO intermediario) {
		this.intermediario = intermediario;
	}
	public IntervinienteAnalisisDTO getRepresentante() {
		return representante;
	}
	public void setRepresentante(IntervinienteAnalisisDTO representante) {
		this.representante = representante;
	}
	public List<IntervinienteAnalisisDTO> getCuentaYOrden() {
		return cuentaYOrden;
	}
	public void setCuentaYOrden(List<IntervinienteAnalisisDTO> cuentaYOrden) {
		this.cuentaYOrden = cuentaYOrden;
	}
	public Long getCodigoPagador() {
		return codigoPagador;
	}
	public void setCodigoPagador(Long codigoPagador) {
		this.codigoPagador = codigoPagador;
	}
	public LocalidadDTO getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(LocalidadDTO procedencia) {
		this.procedencia = procedencia;
	}
	public LocalidadDTO getDestino() {
		return destino;
	}
	public void setDestino(LocalidadDTO destino) {
		this.destino = destino;
	}
	public String getNumeroContratoVendedor() {
		return numeroContratoVendedor;
	}
	public void setNumeroContratoVendedor(String numeroContratoVendedor) {
		this.numeroContratoVendedor = numeroContratoVendedor;
	}
	public String getNumeroContratoComprador() {
		return numeroContratoComprador;
	}
	public void setNumeroContratoComprador(String numeroContratoComprador) {
		this.numeroContratoComprador = numeroContratoComprador;
	}
	public Long getFechaDescarga() {
		return fechaDescarga;
	}
	public void setFechaDescarga(Long fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}
	public String getNumeroReciboCliente() {
		return numeroReciboCliente;
	}
	public void setNumeroReciboCliente(String numeroReciboCliente) {
		this.numeroReciboCliente = numeroReciboCliente;
	}
	public Long getCodigoPuerto() {
		return codigoPuerto;
	}
	public void setCodigoPuerto(Long codigoPuerto) {
		this.codigoPuerto = codigoPuerto;
	}
	public Long getPesoNetoSeco() {
		return pesoNetoSeco;
	}
	public void setPesoNetoSeco(Long pesoNetoSeco) {
		this.pesoNetoSeco = pesoNetoSeco;
	}
	public boolean isLacrada() {
		return lacrada;
	}
	public void setLacrada(boolean lacrada) {
		this.lacrada = lacrada;
	}
	public boolean isServicioLacrado() {
		return servicioLacrado;
	}
	public void setServicioLacrado(boolean servicioLacrado) {
		this.servicioLacrado = servicioLacrado;
	}
	public Long getGrupoEnsayos() {
		return grupoEnsayos;
	}
	public void setGrupoEnsayos(Long grupoEnsayos) {
		this.grupoEnsayos = grupoEnsayos;
	}
	public TransporteDTO getTransporte() {
		return transporte;
	}
	public void setTransporte(TransporteDTO transporte) {
		this.transporte = transporte;
	}
	public List<EnsayoReducidoDTO> getEnsayos() {
		return ensayos;
	}
	public void setEnsayos(List<EnsayoReducidoDTO> ensayos) {
		this.ensayos = ensayos;
	}
	public Long getCosecha() {
		return cosecha;
	}
	public void setCosecha(Long cosecha) {
		this.cosecha = cosecha;
	}
	public String getBiotecnologia() {
		return biotecnologia;
	}
	public void setBiotecnologia(String biotecnologia) {
		this.biotecnologia = biotecnologia;
	}
	public String getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}
}
