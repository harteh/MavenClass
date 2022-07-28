package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.bm.mj.beans.*;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext ctx =
//				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);

		System.out.println("========== BBean 1 싱글톤 ===========");
		Test t1 = ctx2.getBean(Test.class);
		System.out.println(t1);
		Test t2 = ctx2.getBean(Test.class);
		System.out.println(t2);
		
		System.out.println("========== BBean 2 ===========");
		Test2 t3 = ctx2.getBean("co1", Test2.class);
		System.out.println(t3);
		
		System.out.println("========== BBean 3 ===========");
		Test3 t4 = ctx2.getBean(Test3.class);
		System.out.println(t4);
		
		System.out.println("==========  ===========");
		Test4 t5 = ctx2.getBean(Test4.class);
		System.out.println(t5);
		
		System.out.println("==========  ===========");
		Test5 t6 = ctx2.getBean(Test5.class);
		System.out.println(t6);
		
		System.out.println();
		ctx2.close();
	
	}

}
