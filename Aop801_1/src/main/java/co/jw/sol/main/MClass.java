package co.jw.sol.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.jw.sol.beans.BBean;
import co.jw.sol.config.ConfigClass;

public class MClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("co/jw/sol/config/beans.xml");

		BBean bb = ctx.getBean(BBean.class);
		bb.m1();
		ctx.close();
		
		
		AnnotationConfigApplicationContext ctx2 =
				new AnnotationConfigApplicationContext(ConfigClass.class);
		
		BBean b1 = ctx2.getBean(BBean.class);
		b1.m1();
		ctx2.close();
		/**
		 * order 지정하지 않으면
		 	around one			(1)
			before <- AdClass
			m1 <- BBean			(1)
			return <- AdClass
			around two			(1)
			after
		 */
		/**
		 * order 지정하면 
			before <- AdClass
			around one			(1)
			m1 <- BBean			(1)
			around two			(1)
			after
			return <- AdClass
		 */
		
		
		
		
		
	

	}

}
