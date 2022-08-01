package co.bm.jdbc.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import co.bm.jdbc.mapper.MapInterface;

@Configuration
@ComponentScan(basePackages = {"co.bm.jdbc.beans"})
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
	
	//mybatis
	//DB 연결과 sql 연결과 실행하는 객체
	@Bean
	public SqlSessionFactory fac(BasicDataSource source) throws Exception {
		
		SqlSessionFactoryBean f = new SqlSessionFactoryBean();
		f.setDataSource(source);
		
		SqlSessionFactory fa = f.getObject();
		return fa;
	}
	
	@Bean
	public MapperFactoryBean<MapInterface> mm(SqlSessionFactory factory){
		MapperFactoryBean<MapInterface> f = new MapperFactoryBean<MapInterface>(MapInterface.class);
		
		f.setSqlSessionFactory(factory);
		return f;
	}
	
	
}
