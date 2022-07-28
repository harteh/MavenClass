package co.bm.mj.beans;

import javax.annotation.Resource;

public class Test5 {
	
	@Resource
	private Data d1;
	
	@Resource
	private Data2 d2;
	
	public Data getD1() {
		return d1;
	}
	public Data2 getD2() {
		return d2;
	}

}
