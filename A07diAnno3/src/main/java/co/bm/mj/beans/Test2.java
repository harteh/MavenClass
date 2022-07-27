package co.bm.mj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Test2 {

	private int d1;
	private String d2;
	private Data3 d3;
	private Data4 d4;
	
	public Test2() {}
	public Test2(@Value("34")int d1, 
			@Value("자바")String d2, 
			Data3 d3, Data4 d4) {
		this.d1=d1;	this.d2=d2;
		this.d3=d3; this.d4=d4;
	}
	
	
	public int getD1() {
		return d1;
	}
	public String getD2() {
		return d2;
	}
	public Data3 getD3() {
		return d3;
	}
	public Data4 getD4() {
		return d4;
	}
	
}
