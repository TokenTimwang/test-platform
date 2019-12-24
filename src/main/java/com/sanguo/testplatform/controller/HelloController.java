package com.sanguo.testplatform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ license : (C) Copyright 2013-2019, SanGuo Information Technology Co., Ltd.
 * @ Author  : TimWang
 * @ FileName: HelloController.java
 * @ Time    : 2019/12/24 15:05
 * @ Software: IntelliJ IDEA
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!--Test Docker!!";
    }
}
