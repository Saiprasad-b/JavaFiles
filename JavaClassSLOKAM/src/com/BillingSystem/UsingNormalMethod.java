package com.BillingSystem;

public class UsingNormalMethod {
	// items count , price , GST ,disc ,TotalBill
	public void Bill() {
		int count=4;
		double price=500;
		double GST=18;
		double disc=20;
		double discValue=((count*price)*(disc/100));
		double GSTValue=((count*price)*(GST/100));
		double totalBill=(count*price)+(GSTValue-discValue);
		System.out.println("Number of Items: "+count);
		System.out.println("Price of Each Product: Rs "+price+"/-");
		System.out.println("Discount Value : Rs "+discValue+"/-");
		System.out.println("GST Value : Rs "+GSTValue+"/-");
		System.out.println("The Total Bill : Rs "+ totalBill+"/-");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingNormalMethod N = new UsingNormalMethod();
		N.Bill();
	}

}
