package com.ncu.DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.TS.TextEditor;
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Coach coach=(Coach)context.getBean("myTCoach");
		Coach coach1=(Coach)context.getBean("myBCoach");
		
		TextEditor te=(TextEditor)context.getBean("texteditor");
		te.spellchecker();

		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach1.getDailyFortune());
		

	}

}
