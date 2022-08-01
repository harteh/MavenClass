package co.bm.jdbc.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.bm.jdbc.beans.JBean;
import co.bm.jdbc.config.BBean;
import co.bm.jdbc.mapper.MapInterface;

public class MjdbcClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		
		MapInterface m = ctx2.getBean("mm", MapInterface.class); 
		
		//삽입
//		JBean b1 = new JBean();
//		b1.setNum1(2);
//		b1.setStr1("세종대왕");
//		
//		m.in(b1);
		
//		//업데이트
//		JBean b2 = new JBean();
//		b2.setNum1(3);
//		b2.setStr1("단군");
//		m.up(b2);
		
		//삭제
//		m.del(2);
		
		//출력
		List<JBean> li = m.sel();
		for(JBean b3 : li) {
			System.out.print(b3.getNum1() +" / ");
			System.out.println(b3.getStr1());
		}
		
		ctx2.close();
		
		
	}
}
