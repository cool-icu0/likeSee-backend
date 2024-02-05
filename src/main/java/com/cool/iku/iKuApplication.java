package com.cool.iku;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *

 */
@SpringBootApplication
@MapperScan("com.cool.iku.mapper")
public class iKuApplication {

    public static void main(String[] args) {
        SpringApplication.run(iKuApplication.class, args);
    }

}