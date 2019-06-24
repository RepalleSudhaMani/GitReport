package com.spring;

public class CricketCoach implements Coach {
 private String emailAddress;
 private String team;
 private FortuneService myFortuneService;
 public CricketCoach()
 {
	 super();
 }
 public CricketCoach(FortuneService myFortuneService)
 {
	 this.myFortuneService=myFortuneService;
 }
 
 
	public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public FortuneService getMyFortuneService() {
		return myFortuneService;
	}

public void setTeam(String team) {
	this.team = team;
}

public void setMyFortuneService(FortuneService myFortuneService) {
	this.myFortuneService = myFortuneService;
}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Do Running For half_an_hour" ;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
