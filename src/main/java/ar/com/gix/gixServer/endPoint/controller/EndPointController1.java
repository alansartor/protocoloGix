package ar.com.gix.gixServer.endPoint.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.gix.gixServer.endPoint.services.EndPointSrv;
import ar.com.gix.gixServer.endPoint.support.EndPointVersion;
import ar.com.gix.gixServer.support.MyAuthentication;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * EndPoints para la version 1
 * @author alansartor18@hotmail.com
 *
 */
@RestController
@RequestMapping(value = "/api/v1.0")
public class EndPointController1 {
	@Resource private EndPointSrv endPointSrv;
	
	@RequestMapping( value = "/descargas", method = RequestMethod.GET)
	public MyRestGenericResponse<?> descargas(
			MyAuthentication authentication, 
			@RequestParam(name="cartaPorte",required=false) Long cartaPorte,
			@RequestParam(name="numeroCTG",required=false) Long numeroCTG,
			@RequestParam(name="corredorComprador.cuit",required=false) Long corredorCompradorCuit,
			@RequestParam(name="corredorVendedor.ciut",required=false) Long corredorVendedorCiut,
			@RequestParam(name="vendedor.cuit",required=false) Long vendedorCuit,
			@RequestParam(name="comprador.cuit",required=false) Long compradorCuit,
			@RequestParam(name="producto.codigo",required=false) Long productoCodigo,
			@RequestParam(name="numeroContratoComprador",required=false) String numeroContratoComprador,
			@RequestParam(name="numeroContratoVendedor",required=false) String numeroContratoVendedor,
			@RequestParam(name="numeroContratoCorredor",required=false) String numeroContratoCorredor,
			@RequestParam(name="alfanumericoCupo",required=false) String alfanumericoCupo,
			@RequestParam(name="destino.codigoPlantaOncca",required=false) Long destinoCodigoPlantaOncca,
			@RequestParam(name="fechaDescarga",required=false) Long fechaDescarga,
			@RequestParam(name="fechaCargaDesde",required=false) Long fechaCargaDesde,
			@RequestParam(name="fechaCargaHasta",required=false) Long fechaCargaHasta,
			@RequestParam(name="statusCamionEnPuerto",required=false) String statusCamionEnPuerto) {
		return endPointSrv.getDescargas(EndPointVersion.v1_0, authentication, cartaPorte, numeroCTG, corredorCompradorCuit, corredorVendedorCiut, vendedorCuit, compradorCuit, productoCodigo, numeroContratoComprador,
				numeroContratoVendedor, numeroContratoCorredor, alfanumericoCupo, destinoCodigoPlantaOncca, fechaDescarga, fechaCargaDesde, fechaCargaHasta, statusCamionEnPuerto);
	}
	
	@RequestMapping( value = "/contratos", method = RequestMethod.GET)
	public MyRestGenericResponse<?> contratos(
			MyAuthentication authentication, 
			@RequestParam(name="numeroContratoComprador",required=false) String numeroContratoComprador,
			@RequestParam(name="numeroContratoVendedor",required=false) String numeroContratoVendedor,
			@RequestParam(name="numeroContratoCorredor",required=false) String numeroContratoCorredor,
			@RequestParam(name="comprador.cuit",required=false) Long compradorCuit,
			@RequestParam(name="vendedor.cuit",required=false) Long vendedorCuit,
			@RequestParam(name="corredor.cuit",required=false) Long corredorCuit,
			@RequestParam(name="producto.codigo",required=false) Long productoCodigo,
			@RequestParam(name="fechaContratoDesde",required=false) Long fechaContratoDesde,
			@RequestParam(name="fechaContratoHasta",required=false) Long fechaContratoHasta) {
		return endPointSrv.getContratos(EndPointVersion.v1_0, authentication, numeroContratoComprador, numeroContratoVendedor, numeroContratoCorredor, compradorCuit, vendedorCuit, corredorCuit, productoCodigo, fechaContratoDesde, fechaContratoHasta);
	}
	
	@RequestMapping( value = "/fijaciones", method = RequestMethod.GET)
	public MyRestGenericResponse<?> fijaciones(
			MyAuthentication authentication, 
			@RequestParam(name="numeroContratoComprador",required=false) String numeroContratoComprador,
			@RequestParam(name="numeroContratoVendedor",required=false) String numeroContratoVendedor,
			@RequestParam(name="numeroContratoCorredor",required=false) String numeroContratoCorredor,
			@RequestParam(name="fechaFijacionDesde",required=false) Long fechaFijacionDesde,
			@RequestParam(name="fechaFijacionHasta",required=false) Long fechaFijacionHasta,
			@RequestParam(name="idInternoFijacionComprador",required=false) Long idInternoFijacionComprador) {
		return endPointSrv.getFijaciones(EndPointVersion.v1_0, authentication, numeroContratoComprador, numeroContratoVendedor, numeroContratoCorredor, fechaFijacionDesde, fechaFijacionHasta, idInternoFijacionComprador);
	}
	
	@RequestMapping( value = "/aplicaciones", method = RequestMethod.GET)
	public MyRestGenericResponse<?> aplicaciones(
			MyAuthentication authentication, 
			@RequestParam(name="cartaPorte",required=false) Long cartaPorte,
			@RequestParam(name="numeroContratoComprador",required=false) String numeroContratoComprador,
			@RequestParam(name="numeroContratoVendedor",required=false) String numeroContratoVendedor,
			@RequestParam(name="numeroContratoCorredor",required=false) String numeroContratoCorredor,
			@RequestParam(name="idInternoFijacionComprador",required=false) Long idInternoFijacionComprador,
			@RequestParam(name="fechaAplicacionDesde",required=false) Long fechaAplicacionDesde,
			@RequestParam(name="fechaAplicacionHasta",required=false) Long fechaAplicacionHasta) {
		return endPointSrv.getAplicaciones(EndPointVersion.v1_0, authentication, cartaPorte, numeroContratoComprador, numeroContratoVendedor, numeroContratoCorredor, idInternoFijacionComprador, fechaAplicacionDesde, fechaAplicacionHasta);
	}
	
	@RequestMapping( value = "/comprobantes", method = RequestMethod.GET)
	public MyRestGenericResponse<?> comprobantes(
			MyAuthentication authentication, 
			@RequestParam(name="codigoComprobante",required=false) Long codigoComprobante,
			@RequestParam(name="sucursalComprobante",required=false) Long sucursalComprobante,
			@RequestParam(name="numeroComprobante",required=false) Long numeroComprobante,
			@RequestParam(name="emisorComprobante.cuit",required=false) Long emisorComprobanteCuit,
			@RequestParam(name="destinatarioComprobante.cuit",required=false) Long destinatarioComprobanteCuit,
			@RequestParam(name="codigoTipoComprobante",required=false) Long codigoTipoComprobante,
			@RequestParam(name="letraComprobante",required=false) String letraComprobante,
			@RequestParam(name="numeroCaiCoe",required=false) Long numeroCaiCoe,
			@RequestParam(name="fechaComprobanteDesde",required=false) Long fechaComprobanteDesde,
			@RequestParam(name="fechaComprobanteHasta",required=false) Long fechaComprobanteHasta,
			@RequestParam(name="numeroContratoComprador",required=false) String numeroContratoComprador,
			@RequestParam(name="numeroContratoVendedor",required=false) String numeroContratoVendedor,
			@RequestParam(name="numeroContratoCorredor",required=false) String numeroContratoCorredor) {
		return endPointSrv.getComprobantes(EndPointVersion.v1_0, authentication, codigoComprobante, sucursalComprobante, numeroComprobante, emisorComprobanteCuit, destinatarioComprobanteCuit, codigoTipoComprobante, 
				letraComprobante, numeroCaiCoe, fechaComprobanteDesde, fechaComprobanteHasta, numeroContratoComprador, numeroContratoVendedor, numeroContratoCorredor);
	}
	
	@RequestMapping( value = "/certificadosdepositos", method = RequestMethod.GET)
	public MyRestGenericResponse<?> certificadosdepositos(
			MyAuthentication authentication, 
			@RequestParam(name="numeroCertificado",required=false) Long numeroCertificado,
			@RequestParam(name="numeroCaiCoe",required=false) Long numeroCaiCoe,
			@RequestParam(name="numeroCTG",required=false) Long numeroCTG,
			@RequestParam(name="cartaPorte",required=false) Long cartaPorte,
			@RequestParam(name="tipoLiquidacion",required=false) Long tipoLiquidacion,
			@RequestParam(name="fechaCerificadoDesde",required=false) Long fechaCerificadoDesde,
			@RequestParam(name="fechaCerificadoHasta",required=false) Long fechaCerificadoHasta,
			@RequestParam(name="depositante.cuit",required=false) String depositanteCuit,
			@RequestParam(name="depositario.cuit",required=false) String depositarioCuit,
			@RequestParam(name="producto.codigo",required=false) String productoCodigo) {
		return endPointSrv.getCertificadosdepositos(EndPointVersion.v1_0, authentication, numeroCertificado, numeroCaiCoe, numeroCTG, cartaPorte, tipoLiquidacion, fechaCerificadoDesde, 
				fechaCerificadoHasta, depositanteCuit, depositarioCuit, productoCodigo);
	}
	
	@RequestMapping( value = "/muestras", method = RequestMethod.GET)
	public MyRestGenericResponse<?> muestras(
			MyAuthentication authentication, 
			@RequestParam(name="numeroMuestra",required=false) String numeroMuestra,
			@RequestParam(name="fechaDescargaDesde",required=false) Long fechaDescargaDesde,
			@RequestParam(name="fechaDescargaHasta",required=false) Long fechaDescargaHasta,
			@RequestParam(name="cartaPorte",required=false) Long cartaPorte) {
		return endPointSrv.getMuestras(EndPointVersion.v1_0, authentication, numeroMuestra, fechaDescargaDesde, fechaDescargaHasta, cartaPorte);
	}
	
	@RequestMapping( value = "/analisis", method = RequestMethod.GET)
	public MyRestGenericResponse<?> analisis(
			MyAuthentication authentication, 
			@RequestParam(name="cartaPorte",required=false) Long cartaPorte,
			@RequestParam(name="numeroMuestra",required=false) String numeroMuestra,
			@RequestParam(name="fechaIngresoDesde",required=false) Long fechaIngresoDesde,
			@RequestParam(name="fechaIngresoHasta",required=false) Long fechaIngresoHasta) {
		return endPointSrv.getAnalisis(EndPointVersion.v1_0, authentication, cartaPorte, numeroMuestra, fechaIngresoDesde, fechaIngresoHasta);
	}
}
