package co.bm.pro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.pro.beans.Test;

public class MClass {

	public static void main(String[] args) {

		Test t1 = new Test();
		System.out.println("t1= "+ t1);
		t1.show();
		
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("co/bm/pro/config/beans.xml");
		Test t2 = ctx.getBean("test1", Test.class);
		System.out.println("t2= "+ t2);
		t2.show();
		System.out.println("====================");
		
		Test t3 = new Test(12);
		System.out.println("t3= "+ t3);
		t3.show();
		
		Test t4 = ctx.getBean("test2", Test.class);
		System.out.println("t4= "+ t4);
		t4.show();
		System.out.println("====================");
		
	}

}
