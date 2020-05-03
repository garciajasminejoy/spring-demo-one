package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// you can set multiple constructors for a class
	// Java creates a default constructor if you dont define any constructor in the class
	// if  this class has a constructor with DIs and you also don't define any argument-less constructor 
	// initialization (with no arguments) of this class somewhere in your project will throw error
	// bcos java wont define a default argument-less constructor cos you defined one (w/ args nga lang)
	// so the compiler will use that, then tada error
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff( ) {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
