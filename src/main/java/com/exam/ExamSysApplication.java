package com.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.exam.mapper")
public class ExamSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamSysApplication.class, args);
    }

}
