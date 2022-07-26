package co.bm.pro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.pro.beans.Test;
import co.bm.pro.beans.Test2;
import co.bm.pro.beans.Test3;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("co/bm/pro/config/beans.xml");
		
		System.out.println("========= t1 ===========");
		Test t1 = ctx.getBean("t1", Test.class);
		System.out.println( t1.getD1() +" / "+ t1.getD2() );
		
		System.out.println("========== t2 ==========");
		Test t2 = ctx.getBean("t2", Test.class);
		System.out.println( t2.getD1() +" / "+ t2.getD2());

		System.out.println("========== t3 ==========");
		Test2 t3 = ctx.getBean("t3", Test2.class);
		System.out.println( t3.getD1() +" / "+ t3.getD2());
		
		System.out.println("========= t4 : 매개변수 2개 ===========");
		Test3 t4 = ctx.getBean("t4", Test3.class);
		System.out.println(t4.getD1() +" / "+ t4.getD2());
		System.out.println(t4.getD3() +" / "+ t4.getD4());
		
		System.out.println("========== t5 : 매개변수 4개 ==========");
		Test3 t5 = ctx.getBean("t5", Test3.class);
		System.out.println(t5.getD1() +" / "+ t5.getD2());
		System.out.println(t5.getD3() +" / "+ t5.getD4());
		
		System.out.println("========== t6 : 매개변수 2개 ==========");
		Test3 t6 = ctx.getBean("t6", Test3.class);
		System.out.println(t6.getD1() +" / "+ t6.getD2());
		System.out.println(t6.getD3() +" / "+ t6.getD4());
		
		System.out.println("========== t7 : 매개변수 4개 ==========");
		Test3 t7 = ctx.getBean("t7", Test3.class);
		System.out.println(t7.getD1() +" / "+ t7.getD2());
		System.out.println(t7.getD3() +" / "+ t7.getD4());
		
		System.out.println("========== t8 : Test ==========");
		Test t8 = ctx.getBean("t8", Test.class);
		System.out.println(t8.getD1() +" / "+ t8.getD2());
		
		System.out.println("========== t9 : Test ==========");
		Test t9 = ctx.getBean("t9", Test.class);
		System.out.println(t9.getD1() +" / "+ t9.getD2());
	}

}
