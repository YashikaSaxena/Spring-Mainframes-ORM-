package com.ncu.coll_getterSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring_getterSetter.xml");
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust.toString());


	}

}
