package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Data3;
import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans.Test3;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		System.out.println("========== a1 생성자 주입 ===========");
		Test t1 = ctx.getBean("a1", Test.class);
		System.out.println(t1.getD1() +" /"+ t1.getD2()+" /"+t1.getD3());
		
		System.out.println("========== a2 setter 주입 ===========");
		Test t2 = ctx.getBean("a2", Test.class);
		System.out.println(t2.getD1() +" /"+ t2.getD2()+" /"+t2.getD3());
		
		System.out.println("========== a3 자동주입 ===========");
		Test2 t3 = ctx.getBean("a3", Test2.class);
		System.out.println(t3.getD1() +" /"+ t3.getD2());
		
		System.out.println("========== a4 자동주입 ===========");
		Data3 d33 = ctx.getBean("ddd", Data3.class);
		System.out.println(d33);
		Test3 t4 = ctx.getBean("a4", Test3.class);
		System.out.println(t4.getD1() +" /"+ t4.getD2());
		
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		
		System.out.println("========== 어노테이션 ===========");
		Test p1 = ctx2.getBean("s1", Test.class);
		System.out.println(p1.getD1()+" /"+ p1.getD2()+" /"+p1.getD3());
		
		System.out.println("========== s2 set메서드 ===========");
		Test p2 = ctx2.getBean("s2", Test.class);
		System.out.println(p2.getD1()+" /"+ p2.getD2()+" /"+p2.getD3());
		
		System.out.println("========== s3 이름, 자동주입 ===========");
		Test2 p3 = ctx2.getBean("s3", Test2.class);
		System.out.println(p3.getD1()+" /"+ p3.getD2());
		
		System.out.println("========== s4 타입, 자동주입 ===========");
		Test3 p4 = ctx2.getBean("s4", Test3.class);
		System.out.println(p4.getD1()+" /"+ p4.getD2());
		
	}

}
