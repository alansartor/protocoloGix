package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class ComprobanteDTO {
	private IntervinienteReducidoDTO emisorComprobante;
	private IntervinienteReducidoDTO destinatarioComprobante;
	private Long codigoComprobante;
	private Long codigoTipoComprobante;
	private String letraComprobante;
	private Long sucursalComprobante;
	private Long numeroComprobante;
	private Long numeroCaiCoe;
	private Long fechaComprobante;
	private Long fechaVencimiento;
	private String numeroContratoComprador;
	private String numeroContratoVendedor;
	private String numeroContratoCorredor;
	private Long idInternoFijacionComprador;
	private Long kilosComprobante;
	private Long precioProducto;
	private Long codigoMonedaPrecio;
	private Long tipoCambio;
	private Long porcentajeAlicuotaIvaProducto;
	private Long porcentajeMercaderia;
	private Long factor;
	private Long importeTotalComprobante;
	private Long codigoMonedaImporteTotalComprobante;
	private Long codigoComprobanteQueAnula;
	private Long fechaComprobanteQueAnula;
	private String letraComprobanteQueAnula;
	private Long sucursalComprobanteQueAnula;	
	private Long numeroComprobanteQueAnula;
	private ItemsDetalleComprobanteDTO itemsDetalleComprobante;
	private CetrificadoDepositoDTO cetrificadoDeposito;
	private ParcialIncluidaEnFinalDTO parcialesIncluidasEnFinal;
	private RetencionDTO retenciones;
	private PercepcionDTO percepciones;
	
	public IntervinienteReducidoDTO getEmisorComprobante() {
		return emisorComprobante;
	}
	public void setEmisorComprobante(IntervinienteReducidoDTO emisorComprobante) {
		this.emisorComprobante = emisorComprobante;
	}
	public IntervinienteReducidoDTO getDestinatarioComprobante() {
		return destinatarioComprobante;
	}
	public void setDestinatarioComprobante(IntervinienteReducidoDTO destinatarioComprobante) {
		this.destinatarioComprobante = destinatarioComprobante;
	}
	public Long getCodigoComprobante() {
		return codigoComprobante;
	}
	public void setCodigoComprobante(Long codigoComprobante) {
		this.codigoComprobante = codigoComprobante;
	}
	public Long getCodigoTipoComprobante() {
		return codigoTipoComprobante;
	}
	public void setCodigoTipoComprobante(Long codigoTipoComprobante) {
		this.codigoTipoComprobante = codigoTipoComprobante;
	}
	public String getLetraComprobante() {
		return letraComprobante;
	}
	public void setLetraComprobante(String letraComprobante) {
		this.letraComprobante = letraComprobante;
	}
	public Long getSucursalComprobante() {
		return sucursalComprobante;
	}
	public void setSucursalComprobante(Long sucursalComprobante) {
		this.sucursalComprobante = sucursalComprobante;
	}
	public Long getNumeroComprobante() {
		return numeroComprobante;
	}
	public void setNumeroComprobante(Long numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	public Long getNumeroCaiCoe() {
		return numeroCaiCoe;
	}
	public void setNumeroCaiCoe(Long numeroCaiCoe) {
		this.numeroCaiCoe = numeroCaiCoe;
	}
	public Long getFechaComprobante() {
		return fechaComprobante;
	}
	public void setFechaComprobante(Long fechaComprobante) {
		this.fechaComprobante = fechaComprobante;
	}
	public Long getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Long fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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
	public Long getIdInternoFijacionComprador() {
		return idInternoFijacionComprador;
	}
	public void setIdInternoFijacionComprador(Long idInternoFijacionComprador) {
		this.idInternoFijacionComprador = idInternoFijacionComprador;
	}
	public Long getKilosComprobante() {
		return kilosComprobante;
	}
	public void setKilosComprobante(Long kilosComprobante) {
		this.kilosComprobante = kilosComprobante;
	}
	public Long getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Long precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Long getCodigoMonedaPrecio() {
		return codigoMonedaPrecio;
	}
	public void setCodigoMonedaPrecio(Long codigoMonedaPrecio) {
		this.codigoMonedaPrecio = codigoMonedaPrecio;
	}
	public Long getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(Long tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public Long getPorcentajeAlicuotaIvaProducto() {
		return porcentajeAlicuotaIvaProducto;
	}
	public void setPorcentajeAlicuotaIvaProducto(Long porcentajeAlicuotaIvaProducto) {
		this.porcentajeAlicuotaIvaProducto = porcentajeAlicuotaIvaProducto;
	}
	public Long getPorcentajeMercaderia() {
		return porcentajeMercaderia;
	}
	public void setPorcentajeMercaderia(Long porcentajeMercaderia) {
		this.porcentajeMercaderia = porcentajeMercaderia;
	}
	public Long getFactor() {
		return factor;
	}
	public void setFactor(Long factor) {
		this.factor = factor;
	}
	public Long getImporteTotalComprobante() {
		return importeTotalComprobante;
	}
	public void setImporteTotalComprobante(Long importeTotalComprobante) {
		this.importeTotalComprobante = importeTotalComprobante;
	}
	public Long getCodigoMonedaImporteTotalComprobante() {
		return codigoMonedaImporteTotalComprobante;
	}
	public void setCodigoMonedaImporteTotalComprobante(Long codigoMonedaImporteTotalComprobante) {
		this.codigoMonedaImporteTotalComprobante = codigoMonedaImporteTotalComprobante;
	}
	public Long getCodigoComprobanteQueAnula() {
		return codigoComprobanteQueAnula;
	}
	public void setCodigoComprobanteQueAnula(Long codigoComprobanteQueAnula) {
		this.codigoComprobanteQueAnula = codigoComprobanteQueAnula;
	}
	public Long getFechaComprobanteQueAnula() {
		return fechaComprobanteQueAnula;
	}
	public void setFechaComprobanteQueAnula(Long fechaComprobanteQueAnula) {
		this.fechaComprobanteQueAnula = fechaComprobanteQueAnula;
	}
	public String getLetraComprobanteQueAnula() {
		return letraComprobanteQueAnula;
	}
	public void setLetraComprobanteQueAnula(String letraComprobanteQueAnula) {
		this.letraComprobanteQueAnula = letraComprobanteQueAnula;
	}
	public Long getSucursalComprobanteQueAnula() {
		return sucursalComprobanteQueAnula;
	}
	public void setSucursalComprobanteQueAnula(Long sucursalComprobanteQueAnula) {
		this.sucursalComprobanteQueAnula = sucursalComprobanteQueAnula;
	}
	public Long getNumeroComprobanteQueAnula() {
		return numeroComprobanteQueAnula;
	}
	public void setNumeroComprobanteQueAnula(Long numeroComprobanteQueAnula) {
		this.numeroComprobanteQueAnula = numeroComprobanteQueAnula;
	}
	public ItemsDetalleComprobanteDTO getItemsDetalleComprobante() {
		return itemsDetalleComprobante;
	}
	public void setItemsDetalleComprobante(ItemsDetalleComprobanteDTO itemsDetalleComprobante) {
		this.itemsDetalleComprobante = itemsDetalleComprobante;
	}
	public CetrificadoDepositoDTO getCetrificadoDeposito() {
		return cetrificadoDeposito;
	}
	public void setCetrificadoDeposito(CetrificadoDepositoDTO cetrificadoDeposito) {
		this.cetrificadoDeposito = cetrificadoDeposito;
	}
	public ParcialIncluidaEnFinalDTO getParcialesIncluidasEnFinal() {
		return parcialesIncluidasEnFinal;
	}
	public void setParcialesIncluidasEnFinal(ParcialIncluidaEnFinalDTO parcialesIncluidasEnFinal) {
		this.parcialesIncluidasEnFinal = parcialesIncluidasEnFinal;
	}
	public RetencionDTO getRetenciones() {
		return retenciones;
	}
	public void setRetenciones(RetencionDTO retenciones) {
		this.retenciones = retenciones;
	}
	public PercepcionDTO getPercepciones() {
		return percepciones;
	}
	public void setPercepciones(PercepcionDTO percepciones) {
		this.percepciones = percepciones;
	}
}
