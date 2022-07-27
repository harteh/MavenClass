package co.bm.ex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.bm.ex.bean.Data;
import co.bm.ex.bean.Test;

@Configuration
public class BBean {
	
	@Bean
	public Test t2() {
		return new Test();
	}
	@Bean
	public Data d2() {
		return new Data();
	}
	

}
