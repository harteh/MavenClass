package co.jw.sol.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.jw.sol.beans.Test;
import co.jw.sol.beans.Test2;

public class MClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("co/jw/sol/config/beans.xml");
		
		Test t1=ctx.getBean("a1",Test.class);
		Test2 t2=ctx.getBean("a2",Test2.class);
		co.jw.sol.beans2.Test t3=ctx.getBean("a3",co.jw.sol.beans2.Test.class);
				
		t3.m1();
		
		System.out.println("------------------------------");

		t2.m1();
		
		System.out.println("------------------------------");

		t1.m1();
		
		System.out.println("------------------------------");
		
		t1.m1(3);

		System.out.println("------------------------------");
		
		t1.m1("aa");
		
		System.out.println("------------------------------");
		
		t1.m1(10,20);
		
		System.out.println("------------------------------");
		
		t1.m1(3,"aa");
		
		System.out.println("------------------------------");
		
		t1.m2();
		
		System.out.println("------------------------------");

		int a=t1.m3();
		System.out.println(a);
		
		
		
		
		
		
		
	

	}

}
