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
		
		System.out.println("========== a1 생성자 주입 ===========");
		Test a1 = ctx.getBean("a1", Test.class);
		System.out.println(a1.getD1() +"/"+ a1.getD2()+"/"+a1.getD3());
		
		
		
		
	}

}
