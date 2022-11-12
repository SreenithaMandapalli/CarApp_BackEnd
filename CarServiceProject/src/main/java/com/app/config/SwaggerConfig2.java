package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.controller.BillController;
import com.app.controller.CarController;
import com.app.controller.UserController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = { 
		  UserController.class,CarController.class, BillController.class})
public class SwaggerConfig2 {
	
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Car REST API's").apiInfo(apiInfo()).select()
				.paths(PathSelectors.regex("/.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Car Rest Services")
				.description("Sample Documentation Generated Using SWAGGER2 for our Car Rest API")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java Swagger docs")
				.licenseUrl("sreenithamandapalli1819@gmail.com").version("1.0").build();
	}

}
