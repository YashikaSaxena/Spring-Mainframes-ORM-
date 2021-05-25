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
	public void expression1() {

}
@Around("expression1()")
public Object aroundAdvice(ProceedingJoinPoint jp) { Object obj = null;
long startTime = 0;
try {
System.out.println("Now Start Measuring Time"); startTime = System.currentTimeMillis();
obj = jp.proceed();
}catch(Throwable e) {
e.printStackTrace();
}finally {
System.out.println("Now End Measuring Time"); long endTime = System.currentTimeMillis();
System.out.println("Total Time is: "+(endTime - startTime)+" ms");
}
return obj;
}


}
