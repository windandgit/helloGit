package com.fenglei.hellogit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fenglei.hellogit.mapper")    //因为我们此处是基于接口扫描的方式
public class HellogitApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellogitApplication.class, args);
    }

}
