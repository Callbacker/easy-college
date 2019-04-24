package com.weida.easycollege.controller;

import com.weida.easycollege.dto.IdsDto;
import com.weida.easycollege.dto.ReturnDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Api(value = "authority")
public class AuthorityController {

    @GetMapping("/login")
    public ReturnDto login(@RequestBody IdsDto idsDto){
        return ReturnDto.fail(idsDto);
    }

}
