package com.ncu.Spring.LoanOrganisationProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
    LoanProcess a = (LoanProcess)context.getBean("lprocess");
    ICustomer iginfo =(Customer)context.getBean("customer");
    a.Sourcing(iginfo);
    }
    	
}
