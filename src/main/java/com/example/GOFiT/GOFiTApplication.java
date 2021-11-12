package com.example.GOFiT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.example")
@SpringBootApplication
public class GOFiTApplication extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder 
	configure(SpringApplicationBuilder application) {
		return application.sources(GOFiTApplication.class);
	}



	public static void main(String[] args) {
		SpringApplication.run(GOFiTApplication.class, args);
	}
	
	

}
