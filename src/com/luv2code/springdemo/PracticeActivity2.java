package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PingpongCoach theCoach = context.getBean("pingpongCoach", PingpongCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
	}

}
