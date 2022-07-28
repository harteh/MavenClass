package co.bm.mj.beans;

import org.springframework.stereotype.Component;

//객체 생성 할 때 자동으로 객체 생성됨
//타입(Test)을 통해 등록된 Bean 객체 생성
@Component
public class Test {
	
	public Test() {
		System.out.println("test");
	}

}
/**
 *  class -> bean으로 등록해야한다
 	=> @Bean, @Component
	=> xml, annotation
*/
