package com.ncu.DI;

public class TennisCoach implements Coach {
	
	private Ifortune ifortune;
	public TennisCoach(Ifortune ifortune) {
		this.ifortune=ifortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 3 hrs daily!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

}
