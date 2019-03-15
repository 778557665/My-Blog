package com.my.blog.website.controller.wechat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/wechat")
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "success";
    }
}