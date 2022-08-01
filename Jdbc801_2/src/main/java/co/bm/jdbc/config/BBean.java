package co.bm.jdbc.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"co.bm.jdbc.beans", "co.bm.jdbc.db"})
public class BBean {

	//함수단위 빈 등록
	@Bean
	public BasicDataSource source() {
		
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521/xepdb1");
		source.setUsername("BM");
		source.setPassword("bm0301");
		
		return source;
	}
	
	//DB에 접속해 쿼리를 전달하는 빈을 등록한다
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
	
}
