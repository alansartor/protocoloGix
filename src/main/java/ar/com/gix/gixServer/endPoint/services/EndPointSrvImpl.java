package ar.com.gix.gixServer.endPoint.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.gix.gixServer.endPoint.dto.AnalisisDTO;
import ar.com.gix.gixServer.endPoint.dto.AplicacionDTO;
import ar.com.gix.gixServer.endPoint.dto.CertificadodepositoDTO;
import ar.com.gix.gixServer.endPoint.dto.ComprobanteDTO;
import ar.com.gix.gixServer.endPoint.dto.ContratoDTO;
import ar.com.gix.gixServer.endPoint.dto.DescargaDTO;
import ar.com.gix.gixServer.endPoint.dto.EnsayoDTO;
import ar.com.gix.gixServer.endPoint.dto.FijacionDTO;
import ar.com.gix.gixServer.endPoint.dto.MuestraDTO;
import ar.com.gix.gixServer.endPoint.dto.VariedadDTO;
import ar.com.gix.gixServer.endPoint.response.AnalisisResponse;
import ar.com.gix.gixServer.endPoint.response.AplicacionesResponse;
import ar.com.gix.gixServer.endPoint.response.CertificadosdepositosResponse;
import ar.com.gix.gixServer.endPoint.response.ComprobantesResponse;
import ar.com.gix.gixServer.endPoint.response.ContratosResponse;
import ar.com.gix.gixServer.endPoint.response.DescargasResponse;
import ar.com.gix.gixServer.endPoint.response.FijacionesResponse;
import ar.com.gix.gixServer.endPoint.response.MuestrasResponse;
import ar.com.gix.gixServer.endPoint.support.EndPoint;
import ar.com.gix.gixServer.endPoint.support.EndPointVersion;
import ar.com.gix.gixServer.security.support.Rol;
import ar.com.gix.gixServer.security.support.RolUtil;
import ar.com.gix.gixServer.support.MyAuthentication;
import ar.com.gix.gixServer.support.MyRestGenericResponse;
import ar.com.gix.gixServer.support.Status;
import ar.com.gix.gixServer.support.StatusCodes;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
@Service
public class EndPointSrvImpl implements EndPointSrv {

	@Override
	public MyRestGenericResponse<?> getDescargas(EndPointVersion version,
			MyAuthentication authentication, Long cartaPorte, Long numeroCTG, Long corredorCompradorCuit,
			Long corredorVendedorCiut, Long vendedorCuit, Long compradorCuit, Long productoCodigo,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			String alfanumericoCupo, Long destinoCodigoPlantaOncca, Long fechaDescarga, Long fechaCargaDesde,
			Long fechaCargaHasta, String statusCamionEnPuerto) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.descargas, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		DescargasResponse respuesta = new DescargasResponse();
		List<DescargaDTO> registros = new ArrayList<DescargaDTO>();
		DescargaDTO resultado = new DescargaDTO();
        resultado.setCartaPorte(cartaPorte);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.descargas));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getContratos(EndPointVersion version, MyAuthentication authentication,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			Long compradorCuit, Long vendedorCuit, Long corredorCuit, Long productoCodigo, Long fechaContratoDesde,
			Long fechaContratoHasta) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.contratos, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		ContratosResponse respuesta = new ContratosResponse();
		List<ContratoDTO> registros = new ArrayList<ContratoDTO>();
		ContratoDTO resultado = new ContratoDTO();
        resultado.setNumeroContratoComprador(numeroContratoComprador);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.contratos));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getFijaciones(EndPointVersion version, MyAuthentication authentication,
			String numeroContratoComprador, String numeroContratoVendedor, String numeroContratoCorredor,
			Long fechaFijacionDesde, Long fechaFijacionHasta, Long idInternoFijacionComprador) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.fijaciones, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		FijacionesResponse respuesta = new FijacionesResponse();
		List<FijacionDTO> registros = new ArrayList<FijacionDTO>();
		FijacionDTO resultado = new FijacionDTO();
        resultado.setNumeroContratoComprador(numeroContratoComprador);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.fijaciones));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getAplicaciones(EndPointVersion version, MyAuthentication authentication,
			Long cartaPorte, String numeroContratoComprador, String numeroContratoVendedor,
			String numeroContratoCorredor, Long idInternoFijacionComprador, Long fechaAplicacionDesde,
			Long fechaAplicacionHasta) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.aplicaciones, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		AplicacionesResponse respuesta = new AplicacionesResponse();
		List<AplicacionDTO> registros = new ArrayList<AplicacionDTO>();
		AplicacionDTO resultado = new AplicacionDTO();
        resultado.setNumeroContratoComprador(numeroContratoComprador);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.aplicaciones));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getComprobantes(EndPointVersion version, MyAuthentication authentication,
			Long codigoComprobante, Long sucursalComprobante, Long numeroComprobante, Long emisorComprobanteCuit,
			Long destinatarioComprobanteCuit, Long codigoTipoComprobante, String letraComprobante, Long numeroCaiCoe,
			Long fechaComprobanteDesde, Long fechaComprobanteHasta, String numeroContratoComprador,
			String numeroContratoVendedor, String numeroContratoCorredor) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.comprobantes, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		ComprobantesResponse respuesta = new ComprobantesResponse();
		List<ComprobanteDTO> registros = new ArrayList<ComprobanteDTO>();
		ComprobanteDTO resultado = new ComprobanteDTO();
        resultado.setNumeroContratoComprador(numeroContratoComprador);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.comprobantes));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getCertificadosdepositos(EndPointVersion version, MyAuthentication authentication,
			Long numeroCertificado, Long numeroCaiCoe, Long numeroCTG, Long cartaPorte, Long tipoLiquidacion,
			Long fechaCerificadoDesde, Long fechaCerificadoHasta, String depositanteCuit, String depositarioCuit,
			String productoCodigo) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.certificadosdepositos, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		CertificadosdepositosResponse respuesta = new CertificadosdepositosResponse();
		List<CertificadodepositoDTO> registros = new ArrayList<CertificadodepositoDTO>();
		CertificadodepositoDTO resultado = new CertificadodepositoDTO();
        resultado.setNumeroCertificado(numeroCertificado);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.certificadosdepositos));
        return respuesta;
	}

	@Override
	public MyRestGenericResponse<?> getMuestras(EndPointVersion version, MyAuthentication authentication,
			String numeroMuestra, Long fechaDescargaDesde, Long fechaDescargaHasta, Long cartaPorte) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.muestras, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		MuestrasResponse respuesta = new MuestrasResponse();
		List<MuestraDTO> registros = new ArrayList<MuestraDTO>();
		MuestraDTO resultado = new MuestraDTO();
        resultado.setNumeroMuestra(numeroMuestra);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.muestras));
        return respuesta;
	}
	
	@Override
	public MyRestGenericResponse<?> getAnalisis(EndPointVersion version,
			MyAuthentication authentication, Long cartaPorte, String numeroMuestra, Long fechaIngresoDesde, Long fechaIngresoHasta) {
		//1 - Validar que el usuario tenga acceso a realizar esta consulta
		List<Rol> rolesHabilitados = RolUtil.verificarPermiso(EndPoint.analisis, authentication.getAuthorities());
		//2 - Validar los argumentos
		//3 - utilizo los roles habilitados y el cuit del token para armar el filtro adicional
		String cuit = authentication.getCuit();
		//3 - busco los datos en el repositorio aplicando los filtros
		
		//Respuesta Hardcode
		AnalisisResponse respuesta = new AnalisisResponse();
		List<AnalisisDTO> registros = new ArrayList<AnalisisDTO>();
        AnalisisDTO resultado = new AnalisisDTO();
        resultado.setNumeroMuestra(numeroMuestra);
        List<EnsayoDTO> ensayos = new ArrayList<EnsayoDTO>();
        EnsayoDTO ensayo = new EnsayoDTO();
        ensayo.setTipo("F");
        ensayo.setCodigo(4l);
        ensayo.setDescripcion("Materias Extrañas");
        ensayo.setValor("0.14");
        ensayo.setUnidad("%");
        ensayo.setTecnica("Res ex SAGyP 1075");
        ensayo.setFueraStandar(false);
        List<VariedadDTO> variedades = new ArrayList<VariedadDTO>();
        VariedadDTO variedad = new VariedadDTO();
        variedad.setNombre("Lorem Ipsum");
        variedad.setResultado("Lorem Ipsum");
        variedades.add(variedad);
        variedad = new VariedadDTO();
        variedad.setNombre("Lorem Ipsum");
        variedad.setResultado("Lorem Ipsum");
        variedades.add(variedad);
        ensayo.setVariedades(variedades);
        ensayo.setVeredicto("");
        ensayos.add(ensayo);
        ensayo = new EnsayoDTO();
        ensayo.setTipo("F");
        ensayo.setCodigo(20l);
        ensayo.setDescripcion("Grado");
        ensayo.setValor("Grado 2");
        ensayo.setTecnica("Res ex SAGyP 1075");
        ensayo.setFueraStandar(false);
        variedades = new ArrayList<VariedadDTO>();
        ensayo.setVariedades(variedades);
        ensayo.setVeredicto("");
        ensayos.add(ensayo);
        resultado.setEnsayos(ensayos);
        registros.add(resultado);
        respuesta.setData(registros);
        Status status = new Status();
        status.setMensaje(authentication.getName());
        respuesta.setStatus(new Status(StatusCodes.OK, "Respuesta EndPoint " + EndPoint.analisis));
        return respuesta;
	}
	   
}