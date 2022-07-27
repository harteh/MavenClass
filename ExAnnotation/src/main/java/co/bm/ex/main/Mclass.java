package co.bm.ex.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.ex.bean.Test;
import co.bm.ex.config.BBean;

public class Mclass {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext ctx =
//				new ClassPathXmlApplicationContext("co/bm/ex/config/beans.xml");
//		
//		Test t1 = ctx.getBean("bean1", Test.class);
//		System.out.println(t1.getD1());		//12
//		System.out.println(t1.getD2());		//null
		
		
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		Test t2 = ctx2.getBean("t2", Test.class);
		System.out.println(t2.getD1());		//12
		System.out.println(t2.getD2());		//null
		
		
	}

}
