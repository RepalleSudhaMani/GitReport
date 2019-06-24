/**
 * 
 */
package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ibmfsd04
 *
 */
public class CricketMyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("setter-applicationContext.xml");
		  CricketCoach myCoach=context.getBean("myCoach",CricketCoach.class);
		  System.out.println(myCoach.getWorkout());
		  System.out.println(myCoach.getDailyFortune());
		  System.out.println(myCoach.getEmailAddress());
		  System.out.println(myCoach.getTeam());
		  System.out.println(myCoach.getMyFortuneService());

	}

}
