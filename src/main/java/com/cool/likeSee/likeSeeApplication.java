package com.cool.likeSee;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *

 */
@SpringBootApplication
@MapperScan("com.cool.likeSee.mapper")
@EnableScheduling
public class likeSeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(likeSeeApplication.class, args);
    }

}