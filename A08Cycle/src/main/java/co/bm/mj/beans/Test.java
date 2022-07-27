package co.bm.mj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {
	
	public Test() {
		System.out.println("Test");
	}
	
	public void b_init() {
		System.out.println("test_init");
	}
	public void b_destroy() {
		System.out.println("test_destroy");
	}
	
}
