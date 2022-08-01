package co.bm.jdbc.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.bm.jdbc.beans.JBean;
import co.bm.jdbc.config.BBean;
import co.bm.jdbc.db.JdbcDAO;

public class MjdbcClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BBean.class);
		
		JdbcDAO dao = ctx2.getBean(JdbcDAO.class);
		
		JBean b1 = new JBean();
		b1.setNum1(2);
		b1.setStr1("새 데이터");
		
		dao.in_sert(b1);
		
		JBean b2 = new JBean();
		b2.setNum1(2);
		b2.setStr1("뭐야 데이터");
		dao.up_date(b2);
		
		//삭제
		dao.de_lete(2);
		
		
		List<JBean> li = dao.sel_ect();
		for(JBean b3 : li) {
			System.out.println(b3.getNum1());
			System.out.println(b3.getStr1());
		}
		
		ctx2.close();

	}

}
