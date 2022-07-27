package co.bm.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans.Test3;

@Configuration
public class BBean {
	
	@Bean
	//빈 객체 정의 
	//메소드가 반환하는 객체의 주소값을 컨테이너가 빈 객체로 가지고 있게 되고 메소드명으로 등록하게 됨
	public Test a1() {
		Test t1 = new Test();
		return t1;
	}
	
	@Bean(name = "tt")
	public Test a2() {
		Test t1 = new Test();
		return t1;
	}
	
	@Bean
	@Lazy
	public Test2 a3() {
		Test2 t2 = new Test2();
		return t2;
	}

	@Bean
	@Scope("prototype")
	public Test3 a4() {
		Test3 t3 = new Test3();
		return t3;
	}
	
	
	
	
}
