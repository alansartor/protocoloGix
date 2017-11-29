package ar.com.gix.gixServer.security.support;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.web.servlet.HandlerExceptionResolver;

import ar.com.gix.gixServer.configuration.GixServerMultipleSecurityConfiguration;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
    @Autowired
    private HandlerExceptionResolver resolver;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
    	resolver.resolveException(request, response, null, exception);//esto termina llamando a RestResponseEntityExceptionHandler.handleException
    }
     
    @Override
    public void afterPropertiesSet() throws Exception {
        setRealmName(GixServerMultipleSecurityConfiguration.REALM);
        super.afterPropertiesSet();
    }
}