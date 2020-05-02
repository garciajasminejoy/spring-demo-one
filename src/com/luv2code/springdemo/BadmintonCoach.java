package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {

	@Override 
	public String getDailyWorkout() {
		return "Run forrest run!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
}
