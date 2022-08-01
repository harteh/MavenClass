package co.bm.beans;

public class Hi {
	
	private String str1 ="";
	
	Computer acom = new AComputer();
	
	public Hi() {}
	
	public Hi(String str1, AComputer acom) {
		super();
		this.str1 = str1;
		this.acom = acom;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public Computer getAcom() {
		return acom;
	}

	public void setAcom(Computer acom) {
		this.acom = acom;
	}


}
