package co.bm.jdbc.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import co.bm.jdbc.beans.JBean;

@Component
public class JdbcDAO {
	
	//JDBC 객체를 주입
	//BBean의 (Jdbc 관리해주는 객체의 주소값)을 JdbcDAO에 (타입으로)자동 주입
	@Autowired
	private JdbcTemplate db;
	
	//MapperClass 자동주입
	@Autowired
	private MapperClass mapper;
	
	
	public void in_sert(JBean bean) {
		String sql ="insert into spr_table(num1, str1) values (?, ?) ";
		db.update(sql, bean.getNum1(), bean.getStr1());
	}
	
	public List<JBean> sel_ect(){
		String sql ="select num1, str1 from spr_table ";
		List<JBean> li = db.query(sql, mapper);
		//아까 테이블로부터 값을 꺼내서 bean에 저장한 것 반환받음
		return li;
	}
	
	public void up_date(JBean bean) {
		String sql ="update spr_table set str1=? where num1=?";
		db.update(sql, bean.getStr1(), bean.getNum1());
	}
	
	public void de_lete(int n) {
		String sql ="delete from spr_table where num1=?";
		db.update(sql, n);
	}

}
