package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//   FootBallCoach myCoach=context.getBean("footBallCoach",FootBallCoach.class);
//   System.out.println(myCoach.getDailyWorkout());
//   System.out.println(myCoach.getDailyFortune());
//   System.out.println(myCoach.getEmailAddress());
//   System.out.println(myCoach.getTeam());
//   context.close();
//   //As the Scope is changed to prototype in the classes the init and destroy will not be in control
//	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SwimConfig.class);
	Coach myCoach=context.getBean("swimCoach",Coach.class);
	System.out.println(myCoach.getDailyFortune());
	System.out.println(myCoach.getDailyWorkout());
	context.close();
	}

}
