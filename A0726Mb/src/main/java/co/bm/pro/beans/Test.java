package co.bm.pro.beans;

public class Test {

	private int d1;
	private double d2;
	private String d3;
	
	public Test() {
		System.out.println("default");
		this.d1=0;
		this.d2=0.0;
		this.d3=null;
	}
	
	public Test(int d1) {
		System.out.println("int");
		this.d1 = d1;
		this.d2=0.0;
		this.d3=null;
	}
	
	public void show() {
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
