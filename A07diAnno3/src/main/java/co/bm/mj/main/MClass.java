package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		System.out.println("========== d1, d2, d3 ===========");
		Test t1 = ctx.getBean("a1", Test.class);
		System.out.println(t1.getD1() +" / "+ t1.getD2());
		System.out.println(t1.getD3());
		
		System.out.println("========== d4, d5 ===========");
		System.out.println(t1.getD4());
		System.out.println(t1.getD5());
		System.out.println("========== d6 ===========");
		System.out.println(t1.getD6());
		
		System.out.println("========== Test2 ===========");
		Test2 t2 = ctx.getBean("a2", Test2.class);
		System.out.println(t2.getD1() +" / "+ t2.getD2());
		System.out.println(t2.getD3() +" / "+ t2.getD4());
		
		
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);

		System.out.println("========== 어노테이션 ===========");
		Test t3 = ctx2.getBean("t1", Test.class);
		System.out.println(t3.getD1() +" / "+ t3.getD2());
		System.out.println(t3.getD3() +" / "+ t3.getD4()+" / "+ t3.getD5());
		
		System.out.println("========== Test2 어노테이션 ===========");
		Test2 t4 = ctx2.getBean("tt2", Test2.class);
		System.out.println(t4.getD1() +" / "+ t4.getD2());
		System.out.println(t4.getD3() +" / "+ t4.getD4());
		

		
		
		
		
		
	}

}
