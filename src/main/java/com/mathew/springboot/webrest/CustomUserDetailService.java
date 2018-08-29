package com.mathew.springboot.webrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	BCryptPasswordEncoder passEncode;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User("mathew", passEncode.encode("george"),
				AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN"));
	}

}
