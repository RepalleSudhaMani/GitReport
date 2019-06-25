package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisMyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
  Coach myCoach=context.getBean("theCoach",Coach.class);
  System.out.println(myCoach.getDailyWorkout());
  context.close();
	}

}
