package com.sts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptTest {

    @Value("${spring.datasource.password}")
    private String jasyptTestPassword;

    @RequestMapping(value = "/testJasypt", method = RequestMethod.GET)
    public Object testJasyptPassword(){
        return "get password:" + jasyptTestPassword;
    }
}
