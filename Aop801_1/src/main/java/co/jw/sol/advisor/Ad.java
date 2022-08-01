package co.jw.sol.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Ad {
	
	@Around("execution(* m1())")
	public Object a1(ProceedingJoinPoint jp) throws Throwable {
		
		System.out.println("around one");
		Object obj = jp.proceed();
		System.out.println("around two");
		return obj;
		
	}
	
	@After("execution(* m1())")
	public void af1() {
		System.out.println("after");
	}

}
