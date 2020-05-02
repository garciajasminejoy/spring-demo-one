package com.luv2code.springdemo;

public class PingpongCoach implements Coach {
	private RandomFortuneService randomFortuneService;
	
	public PingpongCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return this.randomFortuneService.getFortune();
	}

}
