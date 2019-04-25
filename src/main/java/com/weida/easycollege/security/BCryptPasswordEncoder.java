package com.weida.easycollege.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import utils.HashKit;


public class BCryptPasswordEncoder implements PasswordEncoder {

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encodedPassword.equals(HashKit.md5(rawPassword.toString()));
	}
	
	@Override
	public String encode(CharSequence rawPassword) {
		return HashKit.md5(rawPassword.toString());
	}

}
