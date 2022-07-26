package co.bm.pro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.pro.beans.Data;
import co.bm.pro.beans.Test;
import co.bm.pro.beans.Test2;

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
		t4.show();
		System.out.println("====================");
		Test t5 = ctx.getBean("test3", Test.class);
		t5.show();
		System.out.println("====================");
		Test t6 = ctx.getBean("test4", Test.class);
		t6.show();
		System.out.println("====================");
		
		Test tC = ctx.getBean("tConst", Test.class);
		tC.show();
		System.out.println("==================== ======================");
		
		
		Data data1 = new Data();
		Data data2 = new Data();
		
		Test2 test1 = new Test2(data1, data2);
		test1.show();
		System.out.println("====================");
		
		Test2 test2 = ctx.getBean("test2_1", Test2.class);
		test2.show();
		System.out.println("==================== ======================");
		
		//test2_2, test2_3
		Test2 test3 = ctx.getBean("test2_3", Test2.class);
		test3.show();
		
	}

}
