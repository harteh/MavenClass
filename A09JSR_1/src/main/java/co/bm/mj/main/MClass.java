package co.bm.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.bm.mj.beans.*;
import co.bm.mj.config.BBean;

public class MClass {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext ctx =
//				new ClassPathXmlApplicationContext("co/bm/mj/config/beans.xml");
		
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);

		System.out.println("========== t1 ===========");
//		Test t1 = ctx2.getBean(Test.class);
		Test t1 = ctx2.getBean("t1", Test.class);
		
		System.out.println("========== t2 ===========");
		Test2 t2 = ctx2.getBean("t2", Test2.class);
		//객체가 생성되면서 생성자 호출 -> init -> 생성자 소멸 -> destroy
		
		System.out.println("========== t3 : byName 이용해서 이름이 같을 때 d1, d2에 자동주입 되도록 설정 ===========");
		Test3 t3 = ctx2.getBean("t3", Test3.class);
		System.out.println( t3.getD1() +" / "+ t3.getD2() ); 
		

		
		
		
		
		System.out.println();
		System.out.println("=== 소멸 ===");
		ctx2.close();
		

		
		
		
		
		
	}

}
