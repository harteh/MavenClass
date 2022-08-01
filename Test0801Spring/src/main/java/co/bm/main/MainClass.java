package co.bm.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.bm.beans.Hello;
import co.bm.beans.Hi;
import co.bm.config.BBean;

public class MainClass {

	public static void main(String[] args) {

		//1.
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("co/bm/config/Beans.xml");
		
		Hi h1 = ctx.getBean("hicom", Hi.class);
		System.out.println( h1.getStr1() +" / "+ h1.getAcom() );
		ctx.close();
		
		
		//2.
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		
		Hello h2 = ctx2.getBean(Hello.class);
		System.out.println(h2.getStrHello()+"/ "+h2.getAcom2());
		ctx2.close();
		
	}

}
