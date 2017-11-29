package ar.com.gix.gixServer.endPoint.services;

import ar.com.gix.gixServer.endPoint.support.EndPointVersion;
import ar.com.gix.gixServer.support.MyAuthentication;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public interface EndPointSrv {

	MyRestGenericResponse<?> getDescargas(EndPointVersion version, MyAuthentication authentication,
			Long cartaPorte, Long numeroCTG, Long corredorCompradorCuit, Long corredorVendedorCiut, Long vendedorCuit,
			Long compradorCuit, Long productoCodigo, String numeroContratoComprador, String numeroContratoVendedor,
			String numeroContratoCorredor, String alfanumericoCupo, Long destinoCodigoPlantaOncca, Long fechaDescarga,
			Long fechaCargaDesde, Long fechaCargaHasta, String statusCamionEnPuerto);

	MyRestGenericResponse<?> getContratos(EndPointVersion version, MyAuthentication authentication,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			Long compradorCuit, Long vendedorCuit, Long corredorCuit, Long productoCodigo, Long fechaContratoDesde,
			Long fechaContratoHasta);

	MyRestGenericResponse<?> getFijaciones(EndPointVersion version, MyAuthentication authentication,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			Long fechaFijacionDesde, Long fechaFijacionHasta, Long idInternoFijacionComprador);

	MyRestGenericResponse<?> getAplicaciones(EndPointVersion version, MyAuthentication authentication, Long cartaPorte,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			Long idInternoFijacionComprador, Long fechaAplicacionDesde, Long fechaAplicacionHasta);

	MyRestGenericResponse<?> getComprobantes(EndPointVersion version, MyAuthentication authentication,
			Long codigoComprobante, Long sucursalComprobante, Long numeroComprobante, Long emisorComprobanteCuit,
			Long destinatarioComprobanteCuit, Long codigoTipoComprobante, String letraComprobante, Long numeroCaiCoe,
			Long fechaComprobanteDesde, Long fechaComprobanteHasta, String numeroContratoComprador,
			String numeroContratoVendedor, String numeroContratoCorredor);

	MyRestGenericResponse<?> getCertificadosdepositos(EndPointVersion version, MyAuthentication authentication,
			Long numeroCertificado, Long numeroCaiCoe, Long numeroCTG, Long cartaPorte, Long tipoLiquidacion,
			Long fechaCerificadoDesde, Long fechaCerificadoHasta, String depositanteCuit, String depositarioCuit,
			String productoCodigo);

	MyRestGenericResponse<?> getMuestras(EndPointVersion version, MyAuthentication authentication, String numeroMuestra,
			Long fechaDescargaDesde, Long fechaDescargaHasta, Long cartaPorte);

	MyRestGenericResponse<?> getAnalisis(EndPointVersion version, MyAuthentication authentication,
			Long cartaPorte, String numeroMuestra, Long fechaIngresoDesde, Long fechaIngresoHasta);
}
