package com.weida.easycollege.controller;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;
import com.weida.easycollege.interfaces.IAuthorization;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@Api(value = "authorization")
public class AuthorizationController {

    @Autowired
    IAuthorization authorization;
    @PostMapping("/login")
    @ApiOperation(value="登录")
    public ReturnDto login(@RequestBody IdsDto idsDto){
        return authorization.login(idsDto);
    }

}
