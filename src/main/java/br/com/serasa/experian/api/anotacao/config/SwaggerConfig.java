package br.com.serasa.experian.api.anotacao.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
   
	@Bean
    public Docket api() { 
    
        return new Docket(DocumentationType.SWAGGER_2)  
        		.select()                 
        		.apis(RequestHandlerSelectors.basePackage("br.com.serasa.experian.api.anotacao.controller"))
        		.paths(regex("/api.*"))
        		.build()
        		.apiInfo(apiInfo());                                          
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "NOTACAO REST API", 
          "API ANOTACAO", 
          "VERSION 1.0", 
          "Terms of service", 
          new Contact("Leonardo Barros", "", "gft.leonardo.barros@br.experian"), 
          "License of API", "API license URL", Collections.emptyList());
   }
    
  
}