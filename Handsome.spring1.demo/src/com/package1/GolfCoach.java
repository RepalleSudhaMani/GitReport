package com.package1;

public class GolfCoach implements Coach {
 private FortuneService myFortuneService;
 public GolfCoach()
 {
	 super();
 }
 public GolfCoach(FortuneService myFortuneService)
 {
	 this.myFortuneService=myFortuneService;
 }
 public void setMyFortuneService(FortuneService myFortuneService)
 {
	 this.myFortuneService=myFortuneService;
 }
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "do 10 round throughout the ground";
	}

	@Override
	public String getRandomValue() {
		// TODO Auto-generated method stub
		return myFortuneService.random();
	}

}
