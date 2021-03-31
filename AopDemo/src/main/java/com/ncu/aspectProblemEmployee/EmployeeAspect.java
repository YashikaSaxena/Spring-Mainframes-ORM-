package com.ncu.aspectProblemEmployee;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	 @Pointcut("execution(* com.ncu.aspectProblemEmployee.Employee.cal_sal())")
	 public void calSal(){}
	 
	 
	@Before("execution( public String com.ncu.aspectProblemEmployee.Employee.getName())")
	public void beforeAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on getName()");
		
	}
	@After("execution(public void com.ncu.aspectProblemEmployee.Employee.setName(String))")
	public void afterAdvice() {
		System.out.println("\n=====>>> Executing @After advice on setName() ");
	}
	@Around("calSal()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println(" =======>>>> Before Around advice");
		Object obj=proceedingJoinPoint.proceed();  
		System.out.println(" =======>>>> After Around advice");
		return obj;
	}
	
}
