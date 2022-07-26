package co.bm.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.beans.Test;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("co/bm/config/beans.xml");
		
		Test t1 = ctx.getBean("test", Test.class);
		System.out.println("ctx.getBean= " + t1);
		ctx.close();
	}

}
