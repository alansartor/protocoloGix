package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.DescargaDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint descargas
 * @author alansartor18@hotmail.com
 *
 */
public class DescargasResponse extends MyRestGenericResponse<List<DescargaDTO>>{
	private List<DescargaDTO> data;

	@Override
	public List<DescargaDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<DescargaDTO> data) {
		this.data = data;
	}
}
