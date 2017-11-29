package ar.com.gix.gixServer.endPoint.response;

import java.util.List;

import ar.com.gix.gixServer.endPoint.dto.CertificadodepositoDTO;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * Respuesta del EndPoint certificadosdepositos
 * @author alansartor18@hotmail.com
 *
 */
public class CertificadosdepositosResponse extends MyRestGenericResponse<List<CertificadodepositoDTO>>{
	private List<CertificadodepositoDTO> data;

	@Override
	public List<CertificadodepositoDTO> getData() {
		return data;
	}

	@Override
	public void setData(List<CertificadodepositoDTO> data) {
		this.data = data;
	}
}
