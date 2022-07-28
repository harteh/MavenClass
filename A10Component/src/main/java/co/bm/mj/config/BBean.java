package co.bm.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans2.Test4;

@Configuration
@ComponentScan(basePackages = "co.bm.mj.beans2")
@ComponentScan(basePackages = "co.bm.mj.beans3")
public class BBean {
	
	@Bean
	public Test tt1() {
		return new Test();
	}
	@Bean
	public Test2 tt2() {
		return new Test2();
	}
	
	//이름다르게
	@Bean
	public Test4 tt3() {
		return new Test4();
	}
	
	
	
}
