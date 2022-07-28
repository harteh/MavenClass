package co.bm.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.bm.mj.beans.*;

@Configuration
@ComponentScan(basePackages = "co.bm.mj.beans")
public class BBean {
	
	/**
	 * @return
	 */

	@Bean
	public Data3 a1() {
		return new Data3();
	}
	
	@Bean
	public Data3 a2() {
		return new Data3();
	}

	@Bean
	public Test3 tt() {
		Test3 t1 = new Test3(20, "자바", new Data4(), new Data5());
		return t1;
	}
	
	
}
