package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.AplicacionDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint aplicaciones
 * @author alansartor18@hotmail.com
 *
 */
public class AplicacionesResponse extends MyRestGenericResponse<List<AplicacionDTO>>{
	private List<AplicacionDTO> data;

	@Override
	public List<AplicacionDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<AplicacionDTO> data) {
		this.data = data;
	}
}
