package co.bm.mj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;

public class MClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		Test t1 = ctx.getBean("a1", Test.class);
		System.out.println(t1);
		
//		ctx.close();

		System.out.println("=============================");
		Test2 t2 = ctx.getBean("a2", Test2.class);
		System.out.println(t2);
		
		ctx.close();

		
	}

}
