package com.fenglei.hellogit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/git")
public class GitController {

    @GetMapping("/test")
    @ResponseBody
    public String testController(){

        System.out.println("git 测试数据");

        return "请求收到了，这是给你的响应";
    }
}
