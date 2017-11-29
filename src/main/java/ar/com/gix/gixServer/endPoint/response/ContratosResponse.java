package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.ContratoDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint contratos
 * @author alansartor18@hotmail.com
 *
 */
public class ContratosResponse extends MyRestGenericResponse<List<ContratoDTO>>{
	private List<ContratoDTO> data;

	@Override
	public List<ContratoDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<ContratoDTO> data) {
		this.data = data;
	}
}
