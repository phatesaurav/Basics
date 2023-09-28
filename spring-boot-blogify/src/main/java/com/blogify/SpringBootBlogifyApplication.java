package com.blogify;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBlogifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogifyApplication.class, args);
	}
 
	@Bean // Spring container will automatically create object when we autowire this class
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
