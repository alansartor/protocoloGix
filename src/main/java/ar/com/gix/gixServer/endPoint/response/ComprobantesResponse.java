package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.ComprobanteDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint comprobantes
 * @author alansartor18@hotmail.com
 *
 */
public class ComprobantesResponse extends MyRestGenericResponse<List<ComprobanteDTO>>{
	private List<ComprobanteDTO> data;

	@Override
	public List<ComprobanteDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<ComprobanteDTO> data) {
		this.data = data;
	}
}
