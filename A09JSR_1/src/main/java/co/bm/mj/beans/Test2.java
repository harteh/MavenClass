package co.bm.mj.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test2 {
	
	public Test2() {
		System.out.println("test2");
	}
	
	//생성자 호출 이후에 호출됨(자동)
	@PostConstruct
	public void i2() {
		System.out.println("init2");
	}
	
	//객체 소멸되기 전에 호출(자동)
	@PreDestroy
	public void des2() {
		System.out.println("destroy2");
	}
}
