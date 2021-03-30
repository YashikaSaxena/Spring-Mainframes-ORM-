package com.ncu.coll_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring_coll_const.xml");
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust.toString());


	}

}
