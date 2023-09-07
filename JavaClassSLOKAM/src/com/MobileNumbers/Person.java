package com.MobileNumbers;

public class Person {
	private String Pname;
	private String Padress;
	private  SimDetails[] Psim;
	
	
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPadress() {
		return Padress;
	}
	public void setPadress(String padress) {
		Padress = padress;
	}
	public SimDetails[] getPsim() {
		return Psim;
	}
	public void setPsim(SimDetails[] psim) {
		Psim = psim;
	}
}
