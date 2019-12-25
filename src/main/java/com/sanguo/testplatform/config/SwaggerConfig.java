package com.sanguo.testplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ license : (C) Copyright 2013-2019, SanGuo Information Technology Co., Ltd.
 * @ Author  : TimWang
 * @ FileName: SwaggerConfig.java
 * @ Time    : 2019/12/25 14:43
 * @ Software: IntelliJ IDEA
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        // swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.sanguo.testplatform"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        // 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
        return new ApiInfoBuilder()
                .title("测试系统平台接口文档")
                // 创建人
                .contact(new Contact("sanGuo", "http://localhost", ""))
                // 版本号
                .version("1.0.0")
                // 描述
                .description("Restful API 描述说明")
                .build();
    }
}
