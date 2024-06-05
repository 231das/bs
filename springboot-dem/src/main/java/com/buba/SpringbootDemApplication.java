package com.buba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buba.dao")
public class SpringbootDemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemApplication.class, args);
    }

}
