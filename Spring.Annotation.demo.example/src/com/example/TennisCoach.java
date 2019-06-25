package com.example;

import org.springframework.stereotype.Component;
@Component("theCoach")
public class TennisCoach implements Coach {
	public String getDailyWorkout()
	{
		return "RUNNN";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
