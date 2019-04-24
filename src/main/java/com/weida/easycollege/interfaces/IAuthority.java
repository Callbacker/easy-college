package com.weida.easycollege.interfaces;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;

public interface IAuthority {
    public ReturnDto login(IdsDto idsDto);
}
