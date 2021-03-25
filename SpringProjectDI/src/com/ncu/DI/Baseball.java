package com.ncu.DI;

public class Baseball implements Coach {
	private Ifortune ifortune;
	
	public Baseball(Ifortune ifortune) {
		this.ifortune=ifortune;
	}
	public String getDailyWorkout() {
		return"practice 3 hrs daily!";
	}
	
	public String getDailyFortune() {
		return ifortune.getFortune();
	}
}
