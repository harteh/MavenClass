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
	
	public Test(double d2) {
		System.out.println("double");
		this.d1 = 0;
		this.d2= d2;
		this.d3 = null;
	}
	
	public Test(String d3) {
		System.out.println("String");
		this.d1 = 0;
		this.d2= 0.0;
		this.d3 = d3;
	}
	
	public Test(int d1, double d2, String d3) {
		System.out.println("const");
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	public void show() {
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
