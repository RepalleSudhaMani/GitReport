/**
 * 
 */
package com.spring;

/**
 * @author ibmfsd04
 *
 */
public class TennisCoach implements Coach {
 private String emailAddress;
 private String team;
 
	public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "do 10 runs around the ground";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
