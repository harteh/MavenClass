package co.bm.mj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {
	
	private int d1;
	private Data d2;
	
	//객체타입으로 자동주입 
	//beans.xml에 정의한 Data 타입을 d3에 DI
	//set메서드 없이도 주입 가능하다
	@Autowired
	private Data d3;
	
	@Autowired
	@Qualifier("q4")
	private Data2 d4;
	
	@Autowired
	@Qualifier("q5")
	private Data2 d5;
	
	@Autowired(required = false)
	@Qualifier("q6")
	private Data2 d6;
	
	
	
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public Data getD2() {
		return d2;
	}
	public void setD2(Data d2) {
		this.d2 = d2;
	}
	
	public Data getD3() {
		return d3;
	}

	/*
	 * public void setD3(Data d3) { this.d3 = d3; }
	 */
	public Data2 getD4() {
		return d4;
	}
	public Data2 getD5() {
		return d5;
	}
	public Data2 getD6() {
		return d6;
	}
}
