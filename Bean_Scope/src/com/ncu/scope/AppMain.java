package com.ncu.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring_beanScope.xml");
		Coach coach= (Coach)ac.getBean("tcoach", Coach.class);
		Coach coach2= (Coach)ac.getBean("tcoach", Coach.class);
		coach.setName("John");
		coach2.setName("Jeff");
		System.out.println(coach.getName());
		System.out.println(coach2.getName());
		
		/*System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyFortune());*/
		
	}

}
