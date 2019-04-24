package com.weida.easycollege.controller;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;
import com.weida.easycollege.interfaces.IAuthority;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@Api(value = "authority")
public class AuthorityController {

    @Autowired
    IAuthority authority;
    @PostMapping("/login")
    @ApiOperation(value="登录")
    public ReturnDto login(@RequestBody IdsDto idsDto){
        return authority.login(idsDto);
    }

}
