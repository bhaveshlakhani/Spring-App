package com.ibaset.annotation.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bcoach")
public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	@Autowired
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}


	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}
}








