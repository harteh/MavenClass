package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.mj.beans.Test;
import co.bm.mj.beans.Test2;
import co.bm.mj.beans.Test3;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		System.out.println("========== a1 ===========");
		Test a1 = ctx.getBean("a1", Test.class);
		System.out.println(a1);
		
		System.out.println("========== a2 lazy-init ===========");
		Test2 a2 = ctx.getBean("a2", Test2.class);
		System.out.println(a2);
		Test2 a3 = ctx.getBean("a2", Test2.class);
		System.out.println(a3);
		Test2 a4 = ctx.getBean("a2", Test2.class);
		System.out.println(a4);

		System.out.println("========== a3 scope=\"prototype\" ===========");
		Test3 a5 = ctx.getBean("a3", Test3.class);
		System.out.println(a5);
		Test3 a6 = ctx.getBean("a3", Test3.class);
		System.out.println(a6);
		

		System.out.println("========== BBean ===========");
		
		//자바파일 로딩 -> @Configuration
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		
		System.out.println("========== a1 파일이 로딩될때 객체가 생성된다 ===========");
		Test aa1 = ctx2.getBean("a1", Test.class);		System.out.println(aa1);
		Test aa2 = ctx2.getBean("a1", Test.class);		System.out.println(aa2);
		
		System.out.println("========== a2 name=tt ===========");
		//이름을 지정하면 함수로 못 불러온다
		Test aa3 = ctx2.getBean("tt", Test.class);		System.out.println(aa3);
		
		System.out.println("========== a3 @Lazy : 싱글톤 ===========");
		Test2 aa4 = ctx2.getBean("a3", Test2.class);		System.out.println(aa4);
		Test2 aa5 = ctx2.getBean("a3", Test2.class);		System.out.println(aa5);
		
		System.out.println("========== a4 @Scope(\"prototype\") : 싱글톤아님 ===========");
		Test3 aa6 = ctx2.getBean("a4", Test3.class);		System.out.println(aa6);
		Test3 aa7 = ctx2.getBean("a4", Test3.class);		System.out.println(aa7);
		
		
	}

}
