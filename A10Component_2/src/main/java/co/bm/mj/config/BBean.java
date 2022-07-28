package co.bm.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.bm.mj.beans.Test2;

@Configuration
@ComponentScan(basePackages = "co.bm.mj.beans")
public class BBean {
	
	@Bean
	public Test2 a1() {
		return new Test2();
	}
	
	
}
