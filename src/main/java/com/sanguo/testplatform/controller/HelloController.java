package com.sanguo.testplatform.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ license : (C) Copyright 2013-2019, SanGuo Information Technology Co., Ltd.
 * @ Author  : TimWang
 * @ FileName: HelloController.java
 * @ Time    : 2019/12/24 15:05
 * @ Software: IntelliJ IDEA
 */
@Api(tags = "测试Hello接口")
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!--Test Docker!!";
    }
}
