package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringBootJspApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}
	
	
	   @Override

	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

	      return application.sources(SpringBootJspApplication.class);

	   }


}
