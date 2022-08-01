package co.jw.sol.advisor;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AdClass {
	
	@Before("execution(* m1())")
	public void b1() {
		System.out.println("before <- AdClass");
	}
	
	@AfterReturning("execution(* m1())")
	public void a1() {
		System.out.println("return <- AdClass");
	}
	
	@AfterThrowing("execution(* m1())")
	public void af1() {
		System.out.println("throw");
	}


}
