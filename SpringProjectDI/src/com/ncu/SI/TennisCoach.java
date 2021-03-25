package com.ncu.SI;

public class TennisCoach implements Coach {
	
	private Ifortune ifortune;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 3 hrs daily!";
	}
	public Ifortune getIFortune() {
		return ifortune;
	}
	
	public void setIfortune(Ifortune ifortune) {
		System.out.println("TennisCoach: inside setter method: setFortuneService");
		this.ifortune=ifortune; 
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

}
