package com.ncu.aspectProblemEmployee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DemoConfig.class);
		Employee theEmployee=context.getBean("emp",Employee.class);

		
		theEmployee.setName("Yashika");
		System.out.println(theEmployee.getName());
		
		theEmployee.setNo_of_day_working(5);
		
		
		
		theEmployee.cal_sal();
		
		
		
		context.close();
	}

}
