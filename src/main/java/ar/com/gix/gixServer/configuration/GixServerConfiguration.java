package ar.com.gix.gixServer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Java Configuration equivalente al archivo 'servlet-name'-servlet.xml
 * @author alansartor18@hotmail.com
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ar.com.gix.gixServer")
public class GixServerConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer
			.favorPathExtension(false)
			.favorParameter(true)
			.defaultContentType(MediaType.APPLICATION_JSON)//Por defecto devolver Json response si Acept Header no esta presente 
			.mediaType("json", MediaType.APPLICATION_JSON)
			.mediaType("xml", MediaType.APPLICATION_XML);
	  }
}
