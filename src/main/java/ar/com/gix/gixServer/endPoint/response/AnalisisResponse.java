package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.AnalisisDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint analisis
 * @author alansartor18@hotmail.com
 *
 */
public class AnalisisResponse extends MyRestGenericResponse<List<AnalisisDTO>>{
	private List<AnalisisDTO> data;

	@Override
	public List<AnalisisDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<AnalisisDTO> data) {
		this.data = data;
	}
}
