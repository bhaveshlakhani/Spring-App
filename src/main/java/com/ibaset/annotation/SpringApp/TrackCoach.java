package com.ibaset.annotation.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	@Autowired
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}










