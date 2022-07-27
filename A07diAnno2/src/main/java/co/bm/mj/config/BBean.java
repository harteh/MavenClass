package co.bm.mj.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.bm.mj.beans.Data;
import co.bm.mj.beans.Data2;
import co.bm.mj.beans.Data3;
import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans.Test3;

@Configuration
public class BBean {
	
	//생성자를 통한 주입(어노테이션)
	@Bean
	public Test s1() {
		return new Test(78, "어노테이션 생성자 주입", new Data());
	}
	
	//수정자(setter)를 통한 주입(어노테이션)
	@Bean
	public Test s2() {
		Test t1 = new Test();
		t1.setD1(545);
		t1.setD2("어노테이션 setter 주입");
		t1.setD3(new Data());
		
		return t1;
	}
	
	
	//Data2의 객체2개 생성
	@Bean
	public Data2 d1() {
		return new Data2();
	}
	@Bean
	public Data2 d2() {
		return new Data2();
	}
	//이름이 같을때 자동주입 설정
	@Bean(autowire = Autowire.BY_NAME)
	public Test2 s3() {
		return new Test2();
	}
	
	
	@Bean
	public Data3 d3() {
		return new Data3();
	}
	@Bean(autowire = Autowire.BY_TYPE)
	public Test3 s4() {
		return new Test3();
	}
	
	
}
