package com.weida.easycollege.service;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;
import com.weida.easycollege.interfaces.IAuthority;
import com.weida.easycollege.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService extends BaseService implements IAuthority {
    @Autowired
    UserRepository userRepository;
    @Override
    public ReturnDto login(IdsDto idsDto) {
        return ReturnDto.fail("login:"+idsDto.getUserId());
    }
}
