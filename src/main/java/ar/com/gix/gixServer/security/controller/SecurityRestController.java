package ar.com.gix.gixServer.security.controller;

import javax.annotation.Resource;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.gix.gixServer.security.services.SecuritySrv;
import ar.com.gix.gixServer.support.MyRestGenericResponse;

/**
 * EndPoint para gestionar los Tokens
 * @author alansartor18@hotmail.com
 *
 */
@RestController
@RequestMapping(value = "/api")
public class SecurityRestController {
	@Resource private SecuritySrv securitySrv;
	
	@RequestMapping( value = "/auth", method = RequestMethod.GET)
	public MyRestGenericResponse<String> getToken() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null) {
        	throw new PreAuthenticatedCredentialsNotFoundException("No se encontro registro de Autentificacion");
        }
        return securitySrv.generateToken((User) authentication.getPrincipal(), authentication.getAuthorities());
	}
}
