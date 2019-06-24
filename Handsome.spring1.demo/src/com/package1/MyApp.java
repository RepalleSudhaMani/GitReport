package com.package1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.spring.Coach;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		   Coach myCoach=context.getBean("myGolfCoach",Coach.class);
		   System.out.println(myCoach.getWorkout());
		   System.out.println(myCoach.getRandomValue());
	}

}
