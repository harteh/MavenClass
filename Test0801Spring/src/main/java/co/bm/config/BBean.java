package co.bm.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "co.bm.beans")
@Configurable
public class BBean {
	
	@Bean
	public String oo2() {
		return "ooooo2?";
	}

}
