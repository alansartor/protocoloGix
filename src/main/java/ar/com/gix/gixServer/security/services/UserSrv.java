package ar.com.gix.gixServer.security.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public interface UserSrv {
	public User loadUserByUsername(String username) throws UsernameNotFoundException;
}
