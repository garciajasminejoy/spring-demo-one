package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new private fields
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside set email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside set team");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("im in cirkcet coach");
	}

	// setter method called to inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inject the dep");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15mins";
	}

	@Override
	public String getDailyFortune() {
		return  fortuneService.getFortune();
	}
	
	

}
