package ar.com.gix.gixServer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ar.com.gix.gixServer.security.support.CustomBasicAuthenticationEntryPoint;
import ar.com.gix.gixServer.security.support.StatelessAuthenticationFilter;

/**
 * Java Configuration equivalente al archivo spring-security.xml
 * @author alansartor18@hotmail.com
 *
 */
@EnableWebSecurity
public class GixServerMultipleSecurityConfiguration {
	public static String REALM="GIX_REALM";
	
	@Configuration
	@Order(1)
	public static class AuthSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
		
		/**
		 * Configura la seguridad del EndPoint para obetener Tokens
		 * (Basic Authentication)
		 */
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
			.antMatcher("/api/auth").authorizeRequests()//esta configuracion solo se aplica para este EndPoint
			.anyRequest().authenticated()
	        .and()
	        .httpBasic()
	        .realmName(REALM)
	        .authenticationEntryPoint(getBasicAuthEntryPoint())
	        .and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		}
		
	    @Bean
	    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
	        return new CustomBasicAuthenticationEntryPoint();
	    }
	}

	/**
	 * Configura la seguridad de los demas EndPoint publicados
	 * Para poder consumir los EndPoints, en el header tiene que haber un token valido 
	 * @author alansartor18@hotmail.com
	 *
	 */
	@Configuration
	public static class EndPointSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
			.antMatcher("/api/**").authorizeRequests()//esta configuracion solo se aplica para todos los EndPoint
	    	.anyRequest().authenticated()
	        .and()
	        //el filtro extrae el token y arma la authentificacion necesaria para consumir el EndPoint
            .addFilterBefore(getStatelessAuthenticationFilter(),
                    UsernamePasswordAuthenticationFilter.class);
		}
		
		@Bean
		public StatelessAuthenticationFilter getStatelessAuthenticationFilter() {
			return new StatelessAuthenticationFilter();
		}
	}
}
