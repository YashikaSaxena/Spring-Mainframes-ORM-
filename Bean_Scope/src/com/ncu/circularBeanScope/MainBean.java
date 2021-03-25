package com.ncu.circularBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring_CircularBeanScope.xml");
		
		A a_obj = (A) ac.getBean("a_obj");
		A a_obj2 = (A) ac.getBean("a_obj");
		//System.out.println(a_obj);

	}

}
