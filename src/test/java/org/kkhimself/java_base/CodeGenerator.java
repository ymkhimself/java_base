package org.kkhimself.java_base;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test", "root", "Ymk0910!")
                .globalConfig(builder -> builder
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java/")
                        .commentDate("yyyy-MM-dd").disableOpenDir()
                        .author("ymk")
                )
                .packageConfig(builder -> builder
                        .parent("org.kkhimself.java_base")
                        .entity("model")
                        .mapper("dao")
                        .service("service")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                        .serviceBuilder().formatServiceFileName("%sService")
                        .mapperBuilder().disableMapperXml()
                )
                .templateConfig(builder -> builder.disable(TemplateType.XML))
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
