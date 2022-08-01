package co.jw.sol.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"co.jw.sol.beans", "co.jw.sol.advisor"})
@EnableAspectJAutoProxy
public class ConfigClass {

}
