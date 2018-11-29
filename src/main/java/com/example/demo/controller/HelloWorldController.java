package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by liuping on 2018/11/29
 */
@RestController
@Api
public class HelloWorldController {

    @ApiOperation(value="hello",notes = "你好")
    @RequestMapping("hello")
    public String hello(@ApiParam(name = "name",value = "name",required = true) @RequestParam(value = "name") String name) {
        return "hello "+name;
    }
}
