package com.onlinecakeshopping;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;



import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




//this annotation is to denote this is spring boot application
@SpringBootApplication
@EnableSwagger2
//It tells spring to scan for annotated components
@ComponentScan(basePackages = "com.onlinecakeshopping")
public class OnlineCakeShoppingApplication {



   public static void main(String[] args) {
        SpringApplication.run(OnlineCakeShoppingApplication.class, args);
        System.out.println("Online_Cake_Shopping is Application is Ready ");
    }
    @Bean
    public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
    .apis(RequestHandlerSelectors.basePackage("com")).build();
    }
}