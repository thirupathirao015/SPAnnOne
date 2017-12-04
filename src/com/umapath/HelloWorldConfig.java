package com.umapath;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration 
public class HelloWorldConfig {
	@Bean
	@Scope(value="prototype") 
	public HelloWorld helloWorld(){ 
		
		HelloWorld h=new HelloWorld();
		h.setMessage("Hello Raj");
		return h;
		} 
	}