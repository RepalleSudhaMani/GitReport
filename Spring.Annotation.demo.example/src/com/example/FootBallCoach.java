package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:sports-properties")
public class FootBallCoach implements Coach {
//--->Property Level Injection
	@Qualifier("fileFortuneService")
	@Autowired private FortuneService myFortuneService;
		//---->direct
	//@Value("abcd@gmail.com")
		//private String emailAddress;
	//@Value("firstTeam")
	//private String team;

@Value("${foo.emailAddress}")
private String emailAddress;
@Value("${foo.team}")
private String team;
public String getEmailAddress() {
	return emailAddress;
}
public String getTeam() {
	return team;
}
public FootBallCoach()
{
	super();
}
///--->Constructor Injection
//@Autowired
//public FootBallCoach(FortuneService myFortuneService)
//{
//	super();
//	this.myFortuneService=myFortuneService;
//}
	@Override
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "FootBall PLayers need to  Run for 30mins";
	}
///--->Setter Method Injection
//    @Autowired
//	public void setMyFortuneService(FortuneService myFortuneService) {
//	this.myFortuneService = myFortuneService;
//}
///---->Customised Method Injection
//@Autowired
//public void mySetFortune(FortuneService myFortuneService)
//{
//	this.myFortuneService=myFortuneService;
//}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}
	@PostConstruct
	public void doSomeInitStuff()
	{
		System.out.println(">>INIT Method");
	}
	@PreDestroy
    public void doSomeDestroyStuff()
    {
    	System.out.println(">>DESTROY Method");
    }
}
