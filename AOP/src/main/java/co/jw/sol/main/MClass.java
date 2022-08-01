package co.jw.sol.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.jw.sol.beans.Test;

public class MClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("co/jw/sol/config/beans.xml");
		
		Test t1=ctx.getBean("a1", Test.class);
		
		int n=t1.m1();
		System.out.println(n);
		
		ctx.close();
		
	

	}

}
