package com.ncu.aop.pointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectPerformance {
long start,end;
	
	@Pointcut("execution(* * *Logic())")
	private void onLogicX() {}
	
	@Before("execution(public void logicX())")
	public void beforeLogicX()
	{
		start=System.currentTimeMillis();
		
	}
	
	@After("execution(public void logicX())")
	public void afterLogicX()
	{
		end=System.currentTimeMillis();
		long time=end-start;
		System.out.println("Time taken in execution: "+ time);
	}

}
