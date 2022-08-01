package co.jw.sol.beans;

import org.springframework.stereotype.Component;

@Component
public class BBean {

	public void m1() {
		//예외 발생 시키기 위한 값 -> int a= 100/0;
		System.out.println("m1 <- BBean");
	}
}
