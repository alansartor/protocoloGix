package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.MuestraDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint muestras
 * @author alansartor18@hotmail.com
 *
 */
public class MuestrasResponse extends MyRestGenericResponse<List<MuestraDTO>>{
	private List<MuestraDTO> data;

	@Override
	public List<MuestraDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<MuestraDTO> data) {
		this.data = data;
	}
}
