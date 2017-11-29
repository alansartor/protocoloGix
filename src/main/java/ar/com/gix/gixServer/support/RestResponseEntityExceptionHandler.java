package ar.com.gix.gixServer.support;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Esta clase maneja todas las excepciones de los Controllers
 * Ademas tambien maneja excepciones de autentificacion (CustomBasicAuthenticationEntryPoint las redirecciona para aca)
 * @author alansartor18@hotmail.com
 *
 */
@ControllerAdvice//(annotations = RestController.class)Target all Controllers annotated with @RestController
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
    protected ResponseEntity<MyRestGenericResponse<String>> handleException(Exception ex){
		MyRestGenericResponse<String> response = new MyRestGenericResponse<String>() {
			@Override
			public String getData() {
				return null;
			}
		};
		response.setStatus(new Status(StatusCodes.ERROR_CLIENTE, ex.getMessage()));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
