package com.dev.guide01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class JavaBeanConfigController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("bean")
    public String show(){

        return "hello dataSource"+dataSource;
    }
}
