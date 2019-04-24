package com.weida.easycollege.service;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;
import com.weida.easycollege.interfaces.IAuthority;
import com.weida.easycollege.po.UserPo;
import com.weida.easycollege.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorityService extends BaseService implements IAuthority {
    @Autowired
    UserRepository userRepository;
    @Override
    public ReturnDto login(IdsDto idsDto) {
        Optional<UserPo> optionalUserPo = userRepository.findById(idsDto.getUserId());
        if (optionalUserPo.isPresent()){
            return ReturnDto.okData("login: name-"+optionalUserPo.get().getName());
        }
        return ReturnDto.fail("login:"+idsDto.getUserId());
    }
}
