package co.bm.pro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.pro.beans.Test;

public class MClass {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.setD1(13);
		System.out.println("d1= "+ t1.getD1());
		System.out.println("====================");
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/pro/config/beans.xml");
		
		Test t2 = ctx.getBean("t1", Test.class);
		System.out.println(t2.getD1()+" / "+t2.getD3());
		System.out.println(t2.getD4() +" / "+ t2.getD5());
		System.out.println("====================");
	
		
	}

}
