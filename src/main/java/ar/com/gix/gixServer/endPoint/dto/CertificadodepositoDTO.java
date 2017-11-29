package ar.com.gix.gixServer.endPoint.dto;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class CertificadodepositoDTO {
	private IntervinienteReducidoDTO depositante;
	private IntervinienteReducidoDTO depositario;
	private IntervinienteReducidoDTO laboratorio;
	private LocalidadDTO origen;
	private LocalidadDTO entrega;
	private ProductoDescargaDTO producto;
	private String tipoLiquidacion;
	private Long numeroCertificado;
	private Long numeroCaiCoe;
	private Long fechaCerificado;
	private String grado;
	private Long coeficienteGrado;
	private Long factor;
	private Long tarifaAlmacenaje;
	private Long diasLibresAlmacenaje;
	private Long importeTotalServicios;
	private Long codigoMonedaImporteTotalServicios;
	private Long codigoEstablecimiento;
	private String numeroAnalisis;
	private Long numeroBoletin;
	private Long fechaAnalisis;
	private Long porcentajeContenidoProteico;
	private Long kilosBrutos;
	private Long kilosMermaVolatil;
	private Long kilosMermaZaranda;
	private Long kilosMermaSecada;
	private Long kilosNeto;
	private CartaPorteDTO cartasPorte;
	private ItemsDetalleServiciosDTO itemsDetalleServicios;
	
	public IntervinienteReducidoDTO getDepositante() {
		return depositante;
	}
	public void setDepositante(IntervinienteReducidoDTO depositante) {
		this.depositante = depositante;
	}
	public IntervinienteReducidoDTO getDepositario() {
		return depositario;
	}
	public void setDepositario(IntervinienteReducidoDTO depositario) {
		this.depositario = depositario;
	}
	public IntervinienteReducidoDTO getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(IntervinienteReducidoDTO laboratorio) {
		this.laboratorio = laboratorio;
	}
	public LocalidadDTO getOrigen() {
		return origen;
	}
	public void setOrigen(LocalidadDTO origen) {
		this.origen = origen;
	}
	public LocalidadDTO getEntrega() {
		return entrega;
	}
	public void setEntrega(LocalidadDTO entrega) {
		this.entrega = entrega;
	}
	public ProductoDescargaDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoDescargaDTO producto) {
		this.producto = producto;
	}
	public String getTipoLiquidacion() {
		return tipoLiquidacion;
	}
	public void setTipoLiquidacion(String tipoLiquidacion) {
		this.tipoLiquidacion = tipoLiquidacion;
	}
	public Long getNumeroCertificado() {
		return numeroCertificado;
	}
	public void setNumeroCertificado(Long numeroCertificado) {
		this.numeroCertificado = numeroCertificado;
	}
	public Long getNumeroCaiCoe() {
		return numeroCaiCoe;
	}
	public void setNumeroCaiCoe(Long numeroCaiCoe) {
		this.numeroCaiCoe = numeroCaiCoe;
	}
	public Long getFechaCerificado() {
		return fechaCerificado;
	}
	public void setFechaCerificado(Long fechaCerificado) {
		this.fechaCerificado = fechaCerificado;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public Long getCoeficienteGrado() {
		return coeficienteGrado;
	}
	public void setCoeficienteGrado(Long coeficienteGrado) {
		this.coeficienteGrado = coeficienteGrado;
	}
	public Long getFactor() {
		return factor;
	}
	public void setFactor(Long factor) {
		this.factor = factor;
	}
	public Long getTarifaAlmacenaje() {
		return tarifaAlmacenaje;
	}
	public void setTarifaAlmacenaje(Long tarifaAlmacenaje) {
		this.tarifaAlmacenaje = tarifaAlmacenaje;
	}
	public Long getDiasLibresAlmacenaje() {
		return diasLibresAlmacenaje;
	}
	public void setDiasLibresAlmacenaje(Long diasLibresAlmacenaje) {
		this.diasLibresAlmacenaje = diasLibresAlmacenaje;
	}
	public Long getImporteTotalServicios() {
		return importeTotalServicios;
	}
	public void setImporteTotalServicios(Long importeTotalServicios) {
		this.importeTotalServicios = importeTotalServicios;
	}
	public Long getCodigoMonedaImporteTotalServicios() {
		return codigoMonedaImporteTotalServicios;
	}
	public void setCodigoMonedaImporteTotalServicios(Long codigoMonedaImporteTotalServicios) {
		this.codigoMonedaImporteTotalServicios = codigoMonedaImporteTotalServicios;
	}
	public Long getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}
	public void setCodigoEstablecimiento(Long codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}
	public String getNumeroAnalisis() {
		return numeroAnalisis;
	}
	public void setNumeroAnalisis(String numeroAnalisis) {
		this.numeroAnalisis = numeroAnalisis;
	}
	public Long getNumeroBoletin() {
		return numeroBoletin;
	}
	public void setNumeroBoletin(Long numeroBoletin) {
		this.numeroBoletin = numeroBoletin;
	}
	public Long getFechaAnalisis() {
		return fechaAnalisis;
	}
	public void setFechaAnalisis(Long fechaAnalisis) {
		this.fechaAnalisis = fechaAnalisis;
	}
	public Long getPorcentajeContenidoProteico() {
		return porcentajeContenidoProteico;
	}
	public void setPorcentajeContenidoProteico(Long porcentajeContenidoProteico) {
		this.porcentajeContenidoProteico = porcentajeContenidoProteico;
	}
	public Long getKilosBrutos() {
		return kilosBrutos;
	}
	public void setKilosBrutos(Long kilosBrutos) {
		this.kilosBrutos = kilosBrutos;
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
	public Long getKilosMermaSecada() {
		return kilosMermaSecada;
	}
	public void setKilosMermaSecada(Long kilosMermaSecada) {
		this.kilosMermaSecada = kilosMermaSecada;
	}
	public Long getKilosNeto() {
		return kilosNeto;
	}
	public void setKilosNeto(Long kilosNeto) {
		this.kilosNeto = kilosNeto;
	}
	public CartaPorteDTO getCartasPorte() {
		return cartasPorte;
	}
	public void setCartasPorte(CartaPorteDTO cartasPorte) {
		this.cartasPorte = cartasPorte;
	}
	public ItemsDetalleServiciosDTO getItemsDetalleServicios() {
		return itemsDetalleServicios;
	}
	public void setItemsDetalleServicios(ItemsDetalleServiciosDTO itemsDetalleServicios) {
		this.itemsDetalleServicios = itemsDetalleServicios;
	}
}
