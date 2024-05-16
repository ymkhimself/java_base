package org.kkhimself.java_base;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("localhost:3306/test", "root", "Ymk0910!")
                .globalConfig(builder -> builder
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java/org/java_base")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.baomidou.mybatisplus")
                        .entity("model")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
