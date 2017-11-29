package ar.com.gix.gixServer.security.response;

import ar.com.gix.gixServer.support.MyRestGenericResponse;
import ar.com.gix.gixServer.support.Status;
import ar.com.gix.gixServer.support.StatusCodes;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class TokenResponse extends MyRestGenericResponse<String>{
	private String data;
	
	public TokenResponse(String data) {
		setData(data);
		setStatus(new Status(StatusCodes.OK, "El token se genero con exito"));
	}

	@Override
	public String getData() {
		return data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}

}
