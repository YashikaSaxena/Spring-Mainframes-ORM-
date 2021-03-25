package com.ncu.SI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.TS.TextEditor;
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Coach thecoach=(Coach)context.getBean("myCCoach", Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		

	}

}
