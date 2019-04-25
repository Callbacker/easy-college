package com.weida.easycollege.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import utils.HashKit;

import javax.annotation.Resource;


@Component("authenticationManager")
public class MyAuthenticationManager implements AuthenticationManager {
	
	@Resource(name="userDetailService")
	private UserDetailsService userDetailsService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
		String userName = token.getName(); 
		//从数据库找到的用户  
        UserDetails userDetails = null;
        if(userName != null) {
        	userDetails = this.userDetailsService.loadUserByUsername(userName);
        }
        if(userDetails == null) {
        	throw new UsernameNotFoundException("用户名或密码无效！");
        }
        
        String pwd  = userDetails.getPassword();
        
        if(!pwd.equals(HashKit.md5(token.getCredentials().toString()))) {
        	throw new BadCredentialsException("密码错误！");
        }
		return new UsernamePasswordAuthenticationToken(userDetails,pwd,userDetails.getAuthorities());
	}

}
