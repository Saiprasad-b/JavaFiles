package com.InterfaceExample;

public class Hdfc implements Bank {
	
	
	public static double roi =10;

	public double rateOfInt(double amount) {
		// TODO Auto-generated method stub
		return (amount/100)*roi;
	}

}
