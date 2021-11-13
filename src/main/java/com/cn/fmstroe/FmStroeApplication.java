package com.cn.fmstroe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cn.fmstroe.dao")
public class FmStroeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmStroeApplication.class, args);
    }

}
