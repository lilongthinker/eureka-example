package com.alibaba.eurekaweb.controller;

import com.alibaba.eurekaweb.controller.remote.GetInfoRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetName {

    @Autowired
    private GetInfoRemote getInfoRemote;

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name") String name){
        String result = null;
        try{
            result = getInfoRemote.getName(name);
        }catch (Exception e){
            e.printStackTrace();
            result = "fail invoke";
        }
        return result;
    }

}
