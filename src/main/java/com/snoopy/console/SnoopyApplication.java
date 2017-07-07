package com.snoopy.console;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by V on 2017/7/7.
 */
@SpringBootApplication
@MapperScan("com.snoopy.console.core.dao")
public class SnoopyApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SnoopyApplication.class, args);
    }
}
