package ar.com.gix.gixServer.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Java Configuration para registrar el springSecurityFilterChain Filter
 * Sin esto no funciona el filtro de seguridad
 * @author alansartor18@hotmail.com
 *
 */
public class GixServerSecurityAppInitializer extends AbstractSecurityWebApplicationInitializer  {}
