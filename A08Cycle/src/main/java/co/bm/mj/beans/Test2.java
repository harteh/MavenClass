package co.bm.mj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Test2 {

	public Test2() {
		System.out.println("Test2");
	}
	
	public void default_init() {
		System.out.println("test2_default-init");
	}
	public void default_destroy() {
		System.out.println("test2_default-destroy");
	}	
	
	
	public void b1_init() {
		System.out.println("test B1_init");
	}
	public void b1_destroy() {
		System.out.println("test B1_destroy");
	}
	
}
