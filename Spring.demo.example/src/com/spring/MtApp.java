package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MtApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
   Coach myCoach=context.getBean("myBaseBallCoach",Coach.class);
   System.out.println(myCoach.getWorkout());
   System.out.println(myCoach.getDailyFortune());
  // Coach myCoach1=context.getBean("myTrackCoach",Coach.class);
  // System.out.println(myCoach1.getWorkout());

   context.close();
	}

}
