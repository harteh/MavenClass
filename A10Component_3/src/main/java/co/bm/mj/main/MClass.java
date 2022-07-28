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

		System.out.println("========== 1 ===========");
		Test t1 = ctx2.getBean(Test.class);
		System.out.println(t1.getD1());
		System.out.println(t1.getD2());
		System.out.println(t1.getD3()+"/ "+t1.getD4()+"/ "+t1.getD5());
		
		System.out.println("========== 2 ===========");
		Test2 t2 = ctx2.getBean(Test2.class);
		System.out.println(t2.getD1()+"/ "+ t2.getD2());
		System.out.println(t2.getD3()+"/ "+ t2.getD4());
		
		System.out.println("========== 3 ===========");
		Test3 t3 = ctx2.getBean("tt", Test3.class);
		System.out.println(t3.getD1()+"/ "+ t3.getD2());
		System.out.println(t3.getD3()+"/ "+ t3.getD4());
		
		System.out.println();
		ctx2.close();
	}

}
