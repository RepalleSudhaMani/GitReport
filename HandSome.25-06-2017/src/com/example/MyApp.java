package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      Coach myCoach=context.getBean("golfCoach",Coach.class);
      System.out.println(myCoach.getWorkout());
      System.out.println(myCoach.getFortune());
      context.close();
      
	}

}
