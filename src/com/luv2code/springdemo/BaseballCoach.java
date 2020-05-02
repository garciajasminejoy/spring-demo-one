package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define private fields for the dependencies
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
