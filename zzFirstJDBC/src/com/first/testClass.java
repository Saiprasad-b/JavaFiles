package com.first;

public class testClass {

	
	public void multiply() {
		System.out.println("mul");
	}
	// Not Extending but return type is mentioned as Interface we can create Objects
	public static TestInterface call() {
		System.out.println();
		
		return null;
		
	}
	
	
	public static void main(String[] args) {
		testClass ts = new testClass();
		ts.multiply();
		
		
		TestInterface obj = testClass.call();
		obj.add();
	}
}
