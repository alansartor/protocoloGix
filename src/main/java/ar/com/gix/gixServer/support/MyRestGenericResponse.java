package ar.com.gix.gixServer.support;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
@JacksonXmlRootElement(localName = "respuesta", namespace="ar.com.gix.gixServer")//con esto podemos poner el rootElement en la abstract class
public abstract class MyRestGenericResponse<T> {
	private Status status;
	private MetaData metadata;
	
	public abstract T getData();
	
	public void setData(T data) {};

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public MetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
}
