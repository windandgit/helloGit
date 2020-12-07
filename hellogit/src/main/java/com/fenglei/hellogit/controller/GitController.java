package com.fenglei.hellogit.controller;

import com.fenglei.hellogit.bean.TbContent;
import com.fenglei.hellogit.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/git")
public class GitController {

    @Autowired
    private GitService gitService;

    @GetMapping("/test")
    @ResponseBody
    public String testController(){

        System.out.println("git 测试数据");
        System.out.println("git 修改测试");

        return "请求收到了，这是给你的响应";
    }

    @GetMapping("/tbContentList")
    @ResponseBody
    public String gitTbContentList(){
        System.out.println("进入方法");
        List<TbContent> tbContents = gitService.getTbContentList();
        System.out.println(tbContents);
        for (TbContent tbContent : tbContents) {
            System.out.println(tbContent.toString());
        }
        return "请求成功 ";
    }
}
