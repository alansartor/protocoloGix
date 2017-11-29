package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.FijacionDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint fijaciones
 * @author alansartor18@hotmail.com
 *
 */
public class FijacionesResponse extends MyRestGenericResponse<List<FijacionDTO>>{
	private List<FijacionDTO> data;

	@Override
	public List<FijacionDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<FijacionDTO> data) {
		this.data = data;
	}
}
