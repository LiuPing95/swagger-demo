package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * created by liuping on 2018/11/29
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket applicationApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("helloApi")
                .select()  // 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build()
                .apiInfo(applicationInfo());
    }


    private ApiInfo applicationInfo() {
        ApiInfo apiInfo = new ApiInfo("helloTestApi",//大标题
                "this is an demo" ,//小标题
                "1.0",//版本
                "changsha",
                "apple",// 作者
                "",//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }


    /*public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/

}
