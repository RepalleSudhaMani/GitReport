package com.spring;

public class BaseBallCaoch implements Coach {
  private FortuneService myFortuneService;
  public BaseBallCaoch(FortuneService myFortuneService)
  {
	  this.myFortuneService=myFortuneService;
  }
  public BaseBallCaoch()
  {
	  super();
  }
  public void setMyFortuneService(FortuneService myFortuneService)
  {
	  this.myFortuneService=myFortuneService;
  }
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Do workout for haif_an_hour";
	}
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
