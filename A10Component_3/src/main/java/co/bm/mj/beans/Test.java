package co.bm.mj.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	@Autowired
	private Data d1;
	
	@Autowired
	@Qualifier("o2")
	private Data2 d2;
	
	@Resource(name="o3")
	private Data3 d3;
	
	@Resource(name="a1")
	private Data3 d4;
	
	@Resource(name="a2")
	private Data3 d5;
	
	
	
	public Data getD1() {
		return d1;
	}

	public Data2 getD2() {
		return d2;
	}

	public Data3 getD3() {
		return d3;
	}

	public Data3 getD4() {
		return d4;
	}

	public Data3 getD5() {
		return d5;
	}
	
	
	

}
