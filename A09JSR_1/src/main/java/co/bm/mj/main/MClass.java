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
		
		System.out.println("========== t4 : @Autowired  @Qualifier(\"d2\") ===========");
		Test4 t4 = ctx2.getBean("t4", Test4.class);
		System.out.println( t4.getD1() +" / "+ t4.getD2() ); 
		
		System.out.println("========== t5 : @Resource : 이름기준 ===========");
		Test5 t5 = ctx2.getBean("t5", Test5.class);
		System.out.println( t5.getD1() +" / "+ t5.getD2() ); 
		
		System.out.println("========== t6 : @Resource(name=\"d1\") ===========");
		Test6 t6 = ctx2.getBean("t6", Test6.class);
		System.out.println( t6.getDd() +" / "+ t6.getDd2() ); 
		

		
		
		
		
		System.out.println();
		System.out.println("=== 소멸 ===");
		ctx2.close();
		

		
		
		
		
		
	}

}
