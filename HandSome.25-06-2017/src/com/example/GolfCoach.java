/**
 * 
 */
package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GolfCoach implements Coach {
@Autowired private FortuneService myFortuneService;
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
     return "Do  100 jumping jacks now"; 
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getDailyFortune();
	}
	@PostConstruct
	public void init()
	{
		System.out.println("happy init of Gulf" );
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy of Golf ");
	}

}
