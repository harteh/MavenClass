package co.bm.mj.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	private List<String> l1;
	private List<Data> l2;
	
	private Set<String> s1;
	private Set<Data> s2;
	
	private Map<String, Object> m1;

	public List<String> getL1() {
		return l1;
	}

	public void setL1(List<String> l1) {
		this.l1 = l1;
	}

	public List<Data> getL2() {
		return l2;
	}

	public void setL2(List<Data> l2) {
		this.l2 = l2;
	}

	public Set<String> getS1() {
		return s1;
	}

	public void setS1(Set<String> s1) {
		this.s1 = s1;
	}

	public Set<Data> getS2() {
		return s2;
	}

	public void setS2(Set<Data> s2) {
		this.s2 = s2;
	}

	public Map<String, Object> getM1() {
		return m1;
	}

	public void setM1(Map<String, Object> m1) {
		this.m1 = m1;
	}
	
}
