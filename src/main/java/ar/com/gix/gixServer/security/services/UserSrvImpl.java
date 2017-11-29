package ar.com.gix.gixServer.security.services;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
@Service
public class UserSrvImpl implements UserSrv, org.springframework.security.core.userdetails.UserDetailsService {

    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();
    private final HashMap<String, User> userMap = new HashMap<>();

    @Override
    public final User loadUserByUsername(String username) throws UsernameNotFoundException {
    	userMap.put("alan", new User("alan", "1234", new ArrayList<GrantedAuthority>()));
    	final User user = userMap.get(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        detailsChecker.check(user);
        return user;
    }
}