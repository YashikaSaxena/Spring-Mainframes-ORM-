package com.ncu.aop.pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
	       System.out.println("Started the Program");
		Logic x = context.getBean("logic",Logic.class);
	       x.logicX();
	       
	       context.close();
	}

}
