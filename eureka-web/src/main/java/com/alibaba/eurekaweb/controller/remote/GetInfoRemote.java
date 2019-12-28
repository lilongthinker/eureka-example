package com.alibaba.eurekaweb.controller.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "eureka-server")
public interface GetInfoRemote {

    @GetMapping("/get/{name}")
    public String getName(@PathVariable("name") String name);

}
