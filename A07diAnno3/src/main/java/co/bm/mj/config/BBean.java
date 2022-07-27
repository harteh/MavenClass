package co.bm.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.bm.mj.beans.Data;
import co.bm.mj.beans.Data2;
import co.bm.mj.beans.Data3;
import co.bm.mj.beans.Data4;
import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;

@Configuration
public class BBean {
	
	@Bean
	public Test t1() {
		return new Test();
	}
	
	@Bean
	public Data d1() {
		return new Data();
	}

	@Bean
	public Data2 q4() {
		return new Data2();
	}
	@Bean
	public Data2 q5() {
		return new Data2();
	}
	
	//Test2
	@Bean
	public Test2 tt2() {
		return new Test2();
	}
	
	
	
}
