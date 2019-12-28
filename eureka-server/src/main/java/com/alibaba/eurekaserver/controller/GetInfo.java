package com.alibaba.eurekaserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GetInfo {

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name")String name){

        try {
            Thread.sleep(1*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return name + (System.currentTimeMillis());
    }

}
