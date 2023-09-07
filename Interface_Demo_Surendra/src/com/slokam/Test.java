package com.slokam;

public class Test implements InterfaceDemo {

	
	public static void main(String[] args) {
		InterfaceDemo obj = new Test();
		obj.getMethod();
		
	}

	@Override
	public void getMethod() {
		// TODO Auto-generated method stub
		System.out.println("GEt MEthod in Test class");
	}
}
