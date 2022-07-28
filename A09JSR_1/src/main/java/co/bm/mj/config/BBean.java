package co.bm.mj.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

import co.bm.mj.beans.*;

@Configuration
public class BBean {
	
	@Bean(initMethod="i1", destroyMethod="des1")
	@Lazy
	public Test t1() {
		return new Test();
	}
	
	@Bean
	@Lazy
	public Test2 t2() {
		return new Test2();
	}
	
	//byName 이용해서 이름이 같을 때 d1, d2에 자동주입 되도록 설정
	@Bean
	@Lazy
	public Data d1() {
		return new Data();
	}
	@Bean
	@Lazy
	public Data2 d2() {
		return new Data2();
	}
	@Bean(autowire = Autowire.BY_NAME)
	@Lazy
	public Test3 t3() {
		return new Test3();
	}
	
	@Bean
	@Lazy
	public Test4 t4() {
		return new Test4();
	}
	
	@Bean
	@Lazy
	public Test5 t5() {
		return new Test5();
	}
	
	@Bean
	@Lazy
	public Test6 t6() {
		return new Test6();
	}
	
	
	
}
