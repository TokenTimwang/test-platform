package com.sanguo.testplatform.controller;

import com.sanguo.testplatform.utils.RestJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @ license : (C) Copyright 2013-2019, SanGuo Information Technology Co., Ltd.
 * @ Author  : TimWang
 * @ FileName: UserController.java
 * @ Time    : 2019/12/25 14:58
 * @ Software: IntelliJ IDEA
 */
@Api(tags = "测试User接口")
@RestController
public class UserController {

    @GetMapping("/login")
    @ApiOperation(value = "登陆信息loginValue", notes = "登陆信息loginNotes")
    @ApiImplicitParam(name = "loginuserName", value = "login用户名称")
    public String login(){
        return "Hello Spring Boot 2.0!--Test Docker!login";
    }

    @ResponseBody
    @PostMapping("/insert")
    @ApiOperation(value = "登陆信息insertValue", notes = "登陆信息insertNotes")
//    @ApiImplicitParam(name = "insertuserName", value = "insert用户名称")
    public String insert(){
        return "Hello Spring Boot 2.0!--Test Docker!insert";
    }
}
