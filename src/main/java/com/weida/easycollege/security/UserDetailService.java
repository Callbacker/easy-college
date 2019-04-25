package com.weida.easycollege.security;


import com.weida.easycollege.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import utils.BeanKit;
import utils.MessageUtil;

/**
 * 实现security的用户详情接口
 */
@Service
public class UserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		try {
			//返回实现了UserDetails接口的对象	
			return BeanKit.changeRecordToBean(userRepository.findUserAuthentic(name), UserAuthentic.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException(MessageUtil.loadMessage("noUser", name));
		}
	}

}
