package co.bm.mj.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Test5 {
	public Test5() {
		System.out.println("test5");
	}
	
	@PostConstruct
	public void i1() {
		System.out.println("init test5");
	}
	
	@PreDestroy
	public void d1() {
		System.out.println("destroy test5");
	}

}
