package co.bm.mj.beans;

import javax.annotation.Resource;

public class Test6 {

	@Resource(name="d1")
	private Data dd;
	
	@Resource(name="d2")
	private Data2 dd2;

	public Data getDd() {
		return dd;
	}

	public Data2 getDd2() {
		return dd2;
	}
	
}
