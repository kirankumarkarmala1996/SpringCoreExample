package com.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
		helloWorld.sayHello();
	
		
	}
}
