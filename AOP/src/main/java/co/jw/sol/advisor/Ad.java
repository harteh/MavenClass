package co.jw.sol.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Ad {
	
	public void beforemethod() {
		System.out.println("before");
	}
	
	public void aftermethod() {
		System.out.println("after");
	}
	
	public Object aroundmethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("around1");
		
		Object obj=p.proceed();
		
		System.out.println("around2");
		
		return obj;
	}
	
	public void afterReturningmethod() {
		System.out.println("afterreturn");
	}
	public void afterThrowingmethod(Throwable e) {
		System.out.println("throw");
		System.out.println(e);
	}
	
	
	
	
	
	
	
	
	
	

}
