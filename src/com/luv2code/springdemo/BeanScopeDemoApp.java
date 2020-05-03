package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same bean
		boolean result = theCoach == alphaCoach;
		
		System.out.println("pointing to the same object: " + result);
		
		System.out.println("Memory location of theCoach: " + theCoach);
		System.out.println("Memory location of alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
