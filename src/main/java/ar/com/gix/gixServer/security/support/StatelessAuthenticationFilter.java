package ar.com.gix.gixServer.security.support;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import ar.com.gix.gixServer.security.services.SecuritySrv;

/**
 * Filtro que extrae el token del header del request y verifica que el token sea valido
 * Si esta todo correcto, entonces guarda los datos del usuario del token para que sean
 * usados en el Controller
 * @author alansartor18@hotmail.com
 *
 */
public class StatelessAuthenticationFilter extends GenericFilterBean {
    @Resource private SecuritySrv securitySrv;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = securitySrv.getAuthentication((HttpServletRequest) request);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        filterChain.doFilter(request, response);
    }
}