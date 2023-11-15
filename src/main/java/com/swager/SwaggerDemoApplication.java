package com.swager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerDemoApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SwaggerDemoApplication.class, args);
		System.out.println("Spring started.,");
	}

}
