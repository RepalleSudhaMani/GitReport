package com.example;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
private FortuneService myFortuneService;
  public SwimCoach()
  {
	  super();
  }
  public SwimCoach(FortuneService myFortuneService)
  {
	  this.myFortuneService=myFortuneService;
  }
  @Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "do not swim today ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
