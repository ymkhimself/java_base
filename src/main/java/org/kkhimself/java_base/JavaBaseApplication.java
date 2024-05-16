package org.kkhimself.java_base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.kkhimself.java_base.dao")
public class JavaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBaseApplication.class, args);
    }

}
