package org.mutualser.oauth2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

public class CustomMutualUserDetailsContextMapper implements UserDetailsContextMapper {

	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx,
			String username, Collection<? extends GrantedAuthority> authorities) {
		System.out.println("CustomMutualUserDetailsContextMapper mapUserFromContext!!  "
				+ " " +  username);
		Set<GrantedAuthority> authority = new HashSet<GrantedAuthority>();
		authority.add(new SimpleGrantedAuthority("ADMIN_MUTUAL"));
		User userDetails = new User(username, "", false, false, false, false,
				authority);
		return userDetails;
	}

	@Override
	public void mapUserToContext(UserDetails arg0, DirContextAdapter arg1) {
		// TODO Auto-generated method stub
		
	}

}
