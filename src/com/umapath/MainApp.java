package com.umapath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class); 
		HelloWorld helloWorld1 =(HelloWorld) ctx.getBean(HelloWorld.class);
		helloWorld1.setMessage("Hello Ram!"); 
		helloWorld1.getMessage();
		System.out.println(helloWorld1.hashCode());
		
		HelloWorld helloWorld2 =(HelloWorld) ctx.getBean(HelloWorld.class);
		helloWorld2.setMessage("Hello Ravi!"); 
		helloWorld2.getMessage();
		helloWorld1.getMessage();
		System.out.println(helloWorld2.hashCode());
		}

	}


