package org.mutualser.oauth2;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


public class CustomMutualUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("CustomMutualUserDetailsService loadUserByUsername!!");
		Set<GrantedAuthority> authority = new HashSet<GrantedAuthority>();
		authority.add(new SimpleGrantedAuthority("ADMIN_MUTUAL"));
		User userDetails = new User(username, "", false, false, false, false,
				authority);
		return userDetails;
	}

}
