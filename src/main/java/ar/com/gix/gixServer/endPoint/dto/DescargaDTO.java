package ar.com.gix.gixServer.endPoint.dto;

import java.util.List;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class DescargaDTO {
	 private Long cartaPorte;
	 private Long numeroCEE;
	 private Long fechaCarga;
	 private Long fechaVencimiento;
	 private Long numeroCTG;
	 private IntervinienteReducidoDTO titular;
	 private IntervinienteReducidoDTO intermediario;
	 private IntervinienteReducidoDTO remitenteComercial;
	 private boolean remitenteComercialActuaComoProductor;
	 private IntervinienteReducidoDTO corredorComprador;
	 private IntervinienteReducidoDTO corredorVendedor;
	 private IntervinienteReducidoDTO mercadoaTermino; 
	 private IntervinienteReducidoDTO intermediarioFlete;
	 private IntervinienteReducidoDTO entregador;
	 private IntervinienteReducidoDTO destinatario;
	 private IntervinienteReducidoDTO destino;
	 private IntervinienteReducidoDTO transportista;
	 private IntervinienteReducidoDTO chofer;
	 private IntervinienteReducidoDTO vendedor;
	 private IntervinienteReducidoDTO comprador;
	 private IntervinienteReducidoDTO vendedorTermino;
	 private IntervinienteReducidoDTO compradortermino;
	 private IntervinienteReducidoDTO corredorTermino;
	 private LocalidadDTO localidadVendedor;
	 private LocalidadDTO localidadComprador;
	 private ProcedenciaDTO procedencia;
	 private DestinoDTO lugarDestino;
	 private TransporteDescargaDTO transporte;
	 private String numeroContratoVendedor;
	 private String numeroContratoComprador;
	 private Long kilosBrutosOrigen;
	 private Long kilosTaraOrigen;
	 private Long kilosNetoOrigen;
	 private String observacionesEnCartaPorte;
	 private String observacionesGenerales;
	 private String alfanumericoCupo;
	 private Long kmARecorrer;
	 private String statusCamionEnPuerto;
	 private Long fechaDescarga;
	 private Long kilosBrutosDestino;
	 private Long kilosTaraDestino;
	 private Long kilosNetoDestino;
	 private Double porcentajeHumedad;
	 private Long kilosMermaHumedad;
	 private Long kilosMermaCalidad;
	 private Long kilosMermaVolatil;
	 private Long kilosMermaZaranda;
	 private Long kilosFinalesDescarga;
	 private Long kilosConfirmadosDefinitivosCTG;
	 private Long fechaConfirmacionCTG;
	 private String conformidad;
	 private Long codigoBolsaAnalisisCalidad;
	 private String grado;
	 private List<CalidadDTO> calidad;
	 private List<ServicioDTO> servicios;
	 private List<BiotecnologiaDTO> biotecnologia;
	 
	public Long getCartaPorte() {
		return cartaPorte;
	}
	public void setCartaPorte(Long cartaPorte) {
		this.cartaPorte = cartaPorte;
	}
	public Long getNumeroCEE() {
		return numeroCEE;
	}
	public void setNumeroCEE(Long numeroCEE) {
		this.numeroCEE = numeroCEE;
	}
	public Long getFechaCarga() {
		return fechaCarga;
	}
	public void setFechaCarga(Long fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	public Long getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Long fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Long getNumeroCTG() {
		return numeroCTG;
	}
	public void setNumeroCTG(Long numeroCTG) {
		this.numeroCTG = numeroCTG;
	}
	public IntervinienteReducidoDTO getTitular() {
		return titular;
	}
	public void setTitular(IntervinienteReducidoDTO titular) {
		this.titular = titular;
	}
	public IntervinienteReducidoDTO getIntermediario() {
		return intermediario;
	}
	public void setIntermediario(IntervinienteReducidoDTO intermediario) {
		this.intermediario = intermediario;
	}
	public IntervinienteReducidoDTO getRemitenteComercial() {
		return remitenteComercial;
	}
	public void setRemitenteComercial(IntervinienteReducidoDTO remitenteComercial) {
		this.remitenteComercial = remitenteComercial;
	}
	public boolean isRemitenteComercialActuaComoProductor() {
		return remitenteComercialActuaComoProductor;
	}
	public void setRemitenteComercialActuaComoProductor(boolean remitenteComercialActuaComoProductor) {
		this.remitenteComercialActuaComoProductor = remitenteComercialActuaComoProductor;
	}
	public IntervinienteReducidoDTO getCorredorComprador() {
		return corredorComprador;
	}
	public void setCorredorComprador(IntervinienteReducidoDTO corredorComprador) {
		this.corredorComprador = corredorComprador;
	}
	public IntervinienteReducidoDTO getCorredorVendedor() {
		return corredorVendedor;
	}
	public void setCorredorVendedor(IntervinienteReducidoDTO corredorVendedor) {
		this.corredorVendedor = corredorVendedor;
	}
	public IntervinienteReducidoDTO getMercadoaTermino() {
		return mercadoaTermino;
	}
	public void setMercadoaTermino(IntervinienteReducidoDTO mercadoaTermino) {
		this.mercadoaTermino = mercadoaTermino;
	}
	public IntervinienteReducidoDTO getIntermediarioFlete() {
		return intermediarioFlete;
	}
	public void setIntermediarioFlete(IntervinienteReducidoDTO intermediarioFlete) {
		this.intermediarioFlete = intermediarioFlete;
	}
	public IntervinienteReducidoDTO getEntregador() {
		return entregador;
	}
	public void setEntregador(IntervinienteReducidoDTO entregador) {
		this.entregador = entregador;
	}
	public IntervinienteReducidoDTO getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(IntervinienteReducidoDTO destinatario) {
		this.destinatario = destinatario;
	}
	public IntervinienteReducidoDTO getDestino() {
		return destino;
	}
	public void setDestino(IntervinienteReducidoDTO destino) {
		this.destino = destino;
	}
	public IntervinienteReducidoDTO getTransportista() {
		return transportista;
	}
	public void setTransportista(IntervinienteReducidoDTO transportista) {
		this.transportista = transportista;
	}
	public IntervinienteReducidoDTO getChofer() {
		return chofer;
	}
	public void setChofer(IntervinienteReducidoDTO chofer) {
		this.chofer = chofer;
	}
	public IntervinienteReducidoDTO getVendedor() {
		return vendedor;
	}
	public void setVendedor(IntervinienteReducidoDTO vendedor) {
		this.vendedor = vendedor;
	}
	public IntervinienteReducidoDTO getComprador() {
		return comprador;
	}
	public void setComprador(IntervinienteReducidoDTO comprador) {
		this.comprador = comprador;
	}
	public IntervinienteReducidoDTO getVendedorTermino() {
		return vendedorTermino;
	}
	public void setVendedorTermino(IntervinienteReducidoDTO vendedorTermino) {
		this.vendedorTermino = vendedorTermino;
	}
	public IntervinienteReducidoDTO getCompradortermino() {
		return compradortermino;
	}
	public void setCompradortermino(IntervinienteReducidoDTO compradortermino) {
		this.compradortermino = compradortermino;
	}
	public IntervinienteReducidoDTO getCorredorTermino() {
		return corredorTermino;
	}
	public void setCorredorTermino(IntervinienteReducidoDTO corredorTermino) {
		this.corredorTermino = corredorTermino;
	}
	public LocalidadDTO getLocalidadVendedor() {
		return localidadVendedor;
	}
	public void setLocalidadVendedor(LocalidadDTO localidadVendedor) {
		this.localidadVendedor = localidadVendedor;
	}
	public LocalidadDTO getLocalidadComprador() {
		return localidadComprador;
	}
	public void setLocalidadComprador(LocalidadDTO localidadComprador) {
		this.localidadComprador = localidadComprador;
	}
	public ProcedenciaDTO getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(ProcedenciaDTO procedencia) {
		this.procedencia = procedencia;
	}
	public DestinoDTO getLugarDestino() {
		return lugarDestino;
	}
	public void setLugarDestino(DestinoDTO lugarDestino) {
		this.lugarDestino = lugarDestino;
	}
	public TransporteDescargaDTO getTransporte() {
		return transporte;
	}
	public void setTransporte(TransporteDescargaDTO transporte) {
		this.transporte = transporte;
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
	public Long getKilosBrutosOrigen() {
		return kilosBrutosOrigen;
	}
	public void setKilosBrutosOrigen(Long kilosBrutosOrigen) {
		this.kilosBrutosOrigen = kilosBrutosOrigen;
	}
	public Long getKilosTaraOrigen() {
		return kilosTaraOrigen;
	}
	public void setKilosTaraOrigen(Long kilosTaraOrigen) {
		this.kilosTaraOrigen = kilosTaraOrigen;
	}
	public Long getKilosNetoOrigen() {
		return kilosNetoOrigen;
	}
	public void setKilosNetoOrigen(Long kilosNetoOrigen) {
		this.kilosNetoOrigen = kilosNetoOrigen;
	}
	public String getObservacionesEnCartaPorte() {
		return observacionesEnCartaPorte;
	}
	public void setObservacionesEnCartaPorte(String observacionesEnCartaPorte) {
		this.observacionesEnCartaPorte = observacionesEnCartaPorte;
	}
	public String getObservacionesGenerales() {
		return observacionesGenerales;
	}
	public void setObservacionesGenerales(String observacionesGenerales) {
		this.observacionesGenerales = observacionesGenerales;
	}
	public String getAlfanumericoCupo() {
		return alfanumericoCupo;
	}
	public void setAlfanumericoCupo(String alfanumericoCupo) {
		this.alfanumericoCupo = alfanumericoCupo;
	}
	public Long getKmARecorrer() {
		return kmARecorrer;
	}
	public void setKmARecorrer(Long kmARecorrer) {
		this.kmARecorrer = kmARecorrer;
	}
	public String getStatusCamionEnPuerto() {
		return statusCamionEnPuerto;
	}
	public void setStatusCamionEnPuerto(String statusCamionEnPuerto) {
		this.statusCamionEnPuerto = statusCamionEnPuerto;
	}
	public Long getFechaDescarga() {
		return fechaDescarga;
	}
	public void setFechaDescarga(Long fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}
	public Long getKilosBrutosDestino() {
		return kilosBrutosDestino;
	}
	public void setKilosBrutosDestino(Long kilosBrutosDestino) {
		this.kilosBrutosDestino = kilosBrutosDestino;
	}
	public Long getKilosTaraDestino() {
		return kilosTaraDestino;
	}
	public void setKilosTaraDestino(Long kilosTaraDestino) {
		this.kilosTaraDestino = kilosTaraDestino;
	}
	public Long getKilosNetoDestino() {
		return kilosNetoDestino;
	}
	public void setKilosNetoDestino(Long kilosNetoDestino) {
		this.kilosNetoDestino = kilosNetoDestino;
	}
	public Double getPorcentajeHumedad() {
		return porcentajeHumedad;
	}
	public void setPorcentajeHumedad(Double porcentajeHumedad) {
		this.porcentajeHumedad = porcentajeHumedad;
	}
	public Long getKilosMermaHumedad() {
		return kilosMermaHumedad;
	}
	public void setKilosMermaHumedad(Long kilosMermaHumedad) {
		this.kilosMermaHumedad = kilosMermaHumedad;
	}
	public Long getKilosMermaCalidad() {
		return kilosMermaCalidad;
	}
	public void setKilosMermaCalidad(Long kilosMermaCalidad) {
		this.kilosMermaCalidad = kilosMermaCalidad;
	}
	public Long getKilosMermaVolatil() {
		return kilosMermaVolatil;
	}
	public void setKilosMermaVolatil(Long kilosMermaVolatil) {
		this.kilosMermaVolatil = kilosMermaVolatil;
	}
	public Long getKilosMermaZaranda() {
		return kilosMermaZaranda;
	}
	public void setKilosMermaZaranda(Long kilosMermaZaranda) {
		this.kilosMermaZaranda = kilosMermaZaranda;
	}
	public Long getKilosFinalesDescarga() {
		return kilosFinalesDescarga;
	}
	public void setKilosFinalesDescarga(Long kilosFinalesDescarga) {
		this.kilosFinalesDescarga = kilosFinalesDescarga;
	}
	public Long getKilosConfirmadosDefinitivosCTG() {
		return kilosConfirmadosDefinitivosCTG;
	}
	public void setKilosConfirmadosDefinitivosCTG(Long kilosConfirmadosDefinitivosCTG) {
		this.kilosConfirmadosDefinitivosCTG = kilosConfirmadosDefinitivosCTG;
	}
	public Long getFechaConfirmacionCTG() {
		return fechaConfirmacionCTG;
	}
	public void setFechaConfirmacionCTG(Long fechaConfirmacionCTG) {
		this.fechaConfirmacionCTG = fechaConfirmacionCTG;
	}
	public String getConformidad() {
		return conformidad;
	}
	public void setConformidad(String conformidad) {
		this.conformidad = conformidad;
	}
	public Long getCodigoBolsaAnalisisCalidad() {
		return codigoBolsaAnalisisCalidad;
	}
	public void setCodigoBolsaAnalisisCalidad(Long codigoBolsaAnalisisCalidad) {
		this.codigoBolsaAnalisisCalidad = codigoBolsaAnalisisCalidad;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public List<CalidadDTO> getCalidad() {
		return calidad;
	}
	public void setCalidad(List<CalidadDTO> calidad) {
		this.calidad = calidad;
	}
	public List<ServicioDTO> getServicios() {
		return servicios;
	}
	public void setServicios(List<ServicioDTO> servicios) {
		this.servicios = servicios;
	}
	public List<BiotecnologiaDTO> getBiotecnologia() {
		return biotecnologia;
	}
	public void setBiotecnologia(List<BiotecnologiaDTO> biotecnologia) {
		this.biotecnologia = biotecnologia;
	}
}
