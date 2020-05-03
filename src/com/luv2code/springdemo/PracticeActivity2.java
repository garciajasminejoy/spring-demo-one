package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PingpongCoach theCoach = context.getBean("pingpongCoach", PingpongCoach.class);
		PingpongCoach theCoach2 = context.getBean("pingpongCoach", PingpongCoach.class);
		
		System.out.println("thecoach memory:" + theCoach);
		System.out.println("thecoach2 memory:" + theCoach2);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach2.getDailyFortune());
		
	}

}
