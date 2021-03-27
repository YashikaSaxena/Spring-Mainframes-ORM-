package com.ncu.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor_bean.xml");
		Coach coach=(Coach)context.getBean("ccoach");
		
		System.out.println("calling constructor injection");
		System.out.println(coach.toString());
		
		//System.out.println(coach.getDailyWorkout());
		//System.out.println(coach.getDailyFortune());
		//System.out.println(coach.getName());
		

	}

}
