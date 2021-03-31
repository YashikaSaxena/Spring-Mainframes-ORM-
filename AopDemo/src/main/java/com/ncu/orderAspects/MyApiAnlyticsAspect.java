package com.ncu.orderAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyApiAnlyticsAspect {
	
	
	@Before("execution(public void addAccount())")
	public void performApi() {
	
	System.out.println("API method execution----ApiAnlytics----3");
	
}

}
