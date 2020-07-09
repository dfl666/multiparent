package com.hiram.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hiram.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;


    @GetMapping("/say2/{name}")
    public String sayHello(@PathVariable  String name){
        return demoService.sayHello(name);
    }


}
