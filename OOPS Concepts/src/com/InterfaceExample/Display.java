package com.InterfaceExample;
import java.util.*;

public class Display {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();

		Bank h = new Hdfc(); //here the object is created for HDFC and 
		// Bank methods are called for the HDFC Values
		
		System.out.println("hdfc----------"+h.rateOfInt(amount));
		
		
		Bank i =new Icici();
		System.out.println("Icici----------"+i.rateOfInt(amount));
		
		Bank s =new sbi();
		System.out.println("SBI----------"+s.rateOfInt(amount));
		
		
		
	
	
	
	}
	
}
