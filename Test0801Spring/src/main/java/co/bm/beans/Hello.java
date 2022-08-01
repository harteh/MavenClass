package co.bm.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	@Autowired
	@Qualifier("oo2")
	private String strHello = "";

	Computer acom2 = new AComputer();
	
	
	public Hello() {}

	public Hello(String strHello, Computer acom2) {
		super();
		this.strHello = strHello;
		this.acom2 = acom2;
	}

	public String getStrHello() {
		return strHello;
	}

	public void setStrHello(String strHello) {
		this.strHello = strHello;
	}

	public Computer getAcom2() {
		return acom2;
	}

	public void setAcom2(Computer acom2) {
		this.acom2 = acom2;
	}
	
}
