package com.cg;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableHystrix
public class RouteServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RouteServiceApplication.class, args);
	}
	@Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/routeCtrl/**"))
                .apis(RequestHandlerSelectors.basePackage("com.cg"))
                .build()
                .apiInfo(myApiInfo());
       
    }
private ApiInfo myApiInfo() {
    // TODO Auto-generated method stub
    ApiInfo apiInfo=new ApiInfo(
            "SPRING WITH SWAGGER API",
             "API CREATION",
             "1.0",
             "Free to Use",
             new Contact("Rohan Kachare","/api" ,"rohan.kachare@capgemini.com"),
             "API licence",
             "/api",
             Collections.emptyList());
    return apiInfo;
}

}
