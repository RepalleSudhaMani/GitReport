package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("properties-applicationContext.xml");
    TennisCoach myCoach=context.getBean("myTennisCoach",TennisCoach.class);
   // System.out.println(myCoach.getEmailAddress());
   // System.out.println(myCoach.getWorkout());
    //System.out.println(myCoach.getTeam());
    TennisCoach myCoach1=context.getBean("myTennisCoach",TennisCoach.class);
    boolean result=(myCoach==myCoach1);
    System.out.println("myCOach anf myCoach1 refering to the same oject"+"   "+result);
    System.out.println("myCoach memory location"+myCoach);
    System.out.println("myCoach1 memory location"+myCoach1);
	}

}
