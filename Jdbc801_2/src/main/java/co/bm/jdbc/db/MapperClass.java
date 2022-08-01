package co.bm.jdbc.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import co.bm.jdbc.beans.JBean;

@Component
public class MapperClass implements RowMapper<JBean> {

	@Override
	public JBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		JBean bean = new JBean();
		
		bean.setNum1(rs.getInt("num1"));
		bean.setStr1(rs.getString("str1"));
		
		return bean;
	}
}
