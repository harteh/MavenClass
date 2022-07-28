package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans2.Test3;
import co.bm.mj.beans2.Test4;
import co.bm.mj.beans3.Test5;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		
		System.out.println("========== Test ===========");
		Test t1 = ctx.getBean(Test.class);
		System.out.println(t1);
		
		System.out.println("========== Test2 ===========");
		Test2 t2 = (Test2) ctx.getBean("a2");
		Test2 t3 = (Test2) ctx.getBean("a3");
		System.out.println(t2 +"/ "+ t3);

		System.out.println("========== Test3 ===========");
		Test3 t4 = ctx.getBean(Test3.class);
		System.out.println(t4);
		
		System.out.println("========== Test4 ===========");
		Test4 t5 = (Test4)ctx.getBean("b4");
		Test4 t55 = ctx.getBean("a4", Test4.class);
		System.out.println(t5 +" / "+ t55);
		
		
		System.out.println("========== Test5 ===========");
		Test5 t6 = ctx.getBean(Test5.class);
		System.out.println(t6);
		
		System.out.println();
		ctx.close();
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);

		System.out.println("========== BBean 1 ===========");
		Test t8 = ctx2.getBean("tt1", Test.class);
		System.out.println(t8);
		
		System.out.println("========== BBean 2 ===========");
		Test2 t9 = ctx2.getBean("tt2", Test2.class);
		System.out.println(t9);
		
		System.out.println("========== BBean 3 ===========");
		Test3 t10 = ctx2.getBean(Test3.class);
		System.out.println(t10);
		
		System.out.println("========== BBean 4 ===========");
		Test4 t11 = ctx2.getBean("b4", Test4.class);
		System.out.println(t11);
		Test4 t12 = ctx2.getBean("tt3", Test4.class);
		System.out.println(t12);

		System.out.println("========== BBean 5 ===========");
		Test5 t13 = ctx2.getBean(Test5.class);
		System.out.println(t13);
		
	}

}
