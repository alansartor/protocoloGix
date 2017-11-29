package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ContratoDTO {
	private IntervinienteContratoDTO comprador;
	private IntervinienteContratoDTO vendedor;
	private IntervinienteReducidoDTO corredor;
	private ProcedenciaContratoDTO procedencia;
	private ProcedenciaContratoDTO destino;
	private ProductoContratoDTO producto;
	private Long codigoBolsa;
	private Long fechaContrato;
	private String numeroContratoComprador;
	private String numeroContratoVendedor;
	private String numeroContratoCorredor;
	private String codigoUnidadMedida;
	private Long cantidadDesde;
	private Long cantidadHasta;
	private Long codigoAjuste;
	private Long cantidadCamiones;
	private String codigoMedioTransporte;
	private Long codigoAPrecio;
	private Long codigoTipoContrato;
	private Long codigoTipoOperacion;
	private Long codigoMercaderiaDeOperacionPropia;
	private Long codigoModalidadOperacion;
	private Long codigoEsCompradorFinal;
	private Long porcentajeMercaderiaParcial;
	private Long fechaEntregaDesde;
	private Long fechaEntregaHasta;
	private Long codigoCondicionPago;
	private Long codigoOpcionFijacion;
	private Long precio;
	private Long codigoMoneda;
	private Long fechaConvenidaPago;
	private Long cantidadFijcionMinima;
	private Long cantidadFijcionMaxima;
	private String codigoUnidadMedidaFijacion;
	private Long codigoFijacionPeriodo;
	private Long fechaFijcionDesde;
	private Long fechaFijacionHasta;
	private Long codigoRegistracionAFIP;
	private String observaciones;
	public IntervinienteContratoDTO getComprador() {
		return comprador;
	}
	public void setComprador(IntervinienteContratoDTO comprador) {
		this.comprador = comprador;
	}
	public IntervinienteContratoDTO getVendedor() {
		return vendedor;
	}
	public void setVendedor(IntervinienteContratoDTO vendedor) {
		this.vendedor = vendedor;
	}
	public IntervinienteReducidoDTO getCorredor() {
		return corredor;
	}
	public void setCorredor(IntervinienteReducidoDTO corredor) {
		this.corredor = corredor;
	}
	public ProcedenciaContratoDTO getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(ProcedenciaContratoDTO procedencia) {
		this.procedencia = procedencia;
	}
	public ProcedenciaContratoDTO getDestino() {
		return destino;
	}
	public void setDestino(ProcedenciaContratoDTO destino) {
		this.destino = destino;
	}
	public ProductoContratoDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoContratoDTO producto) {
		this.producto = producto;
	}
	public Long getCodigoBolsa() {
		return codigoBolsa;
	}
	public void setCodigoBolsa(Long codigoBolsa) {
		this.codigoBolsa = codigoBolsa;
	}
	public Long getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(Long fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	public String getNumeroContratoComprador() {
		return numeroContratoComprador;
	}
	public void setNumeroContratoComprador(String numeroContratoComprador) {
		this.numeroContratoComprador = numeroContratoComprador;
	}
	public String getNumeroContratoVendedor() {
		return numeroContratoVendedor;
	}
	public void setNumeroContratoVendedor(String numeroContratoVendedor) {
		this.numeroContratoVendedor = numeroContratoVendedor;
	}
	public String getNumeroContratoCorredor() {
		return numeroContratoCorredor;
	}
	public void setNumeroContratoCorredor(String numeroContratoCorredor) {
		this.numeroContratoCorredor = numeroContratoCorredor;
	}
	public String getCodigoUnidadMedida() {
		return codigoUnidadMedida;
	}
	public void setCodigoUnidadMedida(String codigoUnidadMedida) {
		this.codigoUnidadMedida = codigoUnidadMedida;
	}
	public Long getCantidadDesde() {
		return cantidadDesde;
	}
	public void setCantidadDesde(Long cantidadDesde) {
		this.cantidadDesde = cantidadDesde;
	}
	public Long getCantidadHasta() {
		return cantidadHasta;
	}
	public void setCantidadHasta(Long cantidadHasta) {
		this.cantidadHasta = cantidadHasta;
	}
	public Long getCodigoAjuste() {
		return codigoAjuste;
	}
	public void setCodigoAjuste(Long codigoAjuste) {
		this.codigoAjuste = codigoAjuste;
	}
	public Long getCantidadCamiones() {
		return cantidadCamiones;
	}
	public void setCantidadCamiones(Long cantidadCamiones) {
		this.cantidadCamiones = cantidadCamiones;
	}
	public String getCodigoMedioTransporte() {
		return codigoMedioTransporte;
	}
	public void setCodigoMedioTransporte(String codigoMedioTransporte) {
		this.codigoMedioTransporte = codigoMedioTransporte;
	}
	public Long getCodigoAPrecio() {
		return codigoAPrecio;
	}
	public void setCodigoAPrecio(Long codigoAPrecio) {
		this.codigoAPrecio = codigoAPrecio;
	}
	public Long getCodigoTipoContrato() {
		return codigoTipoContrato;
	}
	public void setCodigoTipoContrato(Long codigoTipoContrato) {
		this.codigoTipoContrato = codigoTipoContrato;
	}
	public Long getCodigoTipoOperacion() {
		return codigoTipoOperacion;
	}
	public void setCodigoTipoOperacion(Long codigoTipoOperacion) {
		this.codigoTipoOperacion = codigoTipoOperacion;
	}
	public Long getCodigoMercaderiaDeOperacionPropia() {
		return codigoMercaderiaDeOperacionPropia;
	}
	public void setCodigoMercaderiaDeOperacionPropia(Long codigoMercaderiaDeOperacionPropia) {
		this.codigoMercaderiaDeOperacionPropia = codigoMercaderiaDeOperacionPropia;
	}
	public Long getCodigoModalidadOperacion() {
		return codigoModalidadOperacion;
	}
	public void setCodigoModalidadOperacion(Long codigoModalidadOperacion) {
		this.codigoModalidadOperacion = codigoModalidadOperacion;
	}
	public Long getCodigoEsCompradorFinal() {
		return codigoEsCompradorFinal;
	}
	public void setCodigoEsCompradorFinal(Long codigoEsCompradorFinal) {
		this.codigoEsCompradorFinal = codigoEsCompradorFinal;
	}
	public Long getPorcentajeMercaderiaParcial() {
		return porcentajeMercaderiaParcial;
	}
	public void setPorcentajeMercaderiaParcial(Long porcentajeMercaderiaParcial) {
		this.porcentajeMercaderiaParcial = porcentajeMercaderiaParcial;
	}
	public Long getFechaEntregaDesde() {
		return fechaEntregaDesde;
	}
	public void setFechaEntregaDesde(Long fechaEntregaDesde) {
		this.fechaEntregaDesde = fechaEntregaDesde;
	}
	public Long getFechaEntregaHasta() {
		return fechaEntregaHasta;
	}
	public void setFechaEntregaHasta(Long fechaEntregaHasta) {
		this.fechaEntregaHasta = fechaEntregaHasta;
	}
	public Long getCodigoCondicionPago() {
		return codigoCondicionPago;
	}
	public void setCodigoCondicionPago(Long codigoCondicionPago) {
		this.codigoCondicionPago = codigoCondicionPago;
	}
	public Long getCodigoOpcionFijacion() {
		return codigoOpcionFijacion;
	}
	public void setCodigoOpcionFijacion(Long codigoOpcionFijacion) {
		this.codigoOpcionFijacion = codigoOpcionFijacion;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Long getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(Long codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public Long getFechaConvenidaPago() {
		return fechaConvenidaPago;
	}
	public void setFechaConvenidaPago(Long fechaConvenidaPago) {
		this.fechaConvenidaPago = fechaConvenidaPago;
	}
	public Long getCantidadFijcionMinima() {
		return cantidadFijcionMinima;
	}
	public void setCantidadFijcionMinima(Long cantidadFijcionMinima) {
		this.cantidadFijcionMinima = cantidadFijcionMinima;
	}
	public Long getCantidadFijcionMaxima() {
		return cantidadFijcionMaxima;
	}
	public void setCantidadFijcionMaxima(Long cantidadFijcionMaxima) {
		this.cantidadFijcionMaxima = cantidadFijcionMaxima;
	}
	public String getCodigoUnidadMedidaFijacion() {
		return codigoUnidadMedidaFijacion;
	}
	public void setCodigoUnidadMedidaFijacion(String codigoUnidadMedidaFijacion) {
		this.codigoUnidadMedidaFijacion = codigoUnidadMedidaFijacion;
	}
	public Long getCodigoFijacionPeriodo() {
		return codigoFijacionPeriodo;
	}
	public void setCodigoFijacionPeriodo(Long codigoFijacionPeriodo) {
		this.codigoFijacionPeriodo = codigoFijacionPeriodo;
	}
	public Long getFechaFijcionDesde() {
		return fechaFijcionDesde;
	}
	public void setFechaFijcionDesde(Long fechaFijcionDesde) {
		this.fechaFijcionDesde = fechaFijcionDesde;
	}
	public Long getFechaFijacionHasta() {
		return fechaFijacionHasta;
	}
	public void setFechaFijacionHasta(Long fechaFijacionHasta) {
		this.fechaFijacionHasta = fechaFijacionHasta;
	}
	public Long getCodigoRegistracionAFIP() {
		return codigoRegistracionAFIP;
	}
	public void setCodigoRegistracionAFIP(Long codigoRegistracionAFIP) {
		this.codigoRegistracionAFIP = codigoRegistracionAFIP;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
