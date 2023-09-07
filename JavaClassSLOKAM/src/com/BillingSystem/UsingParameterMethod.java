package com.BillingSystem;

public class UsingParameterMethod {
	// items count , price , GST ,disc ,TotalBill
	public void Bill(int count ,double price,double GST,double disc) {
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
		UsingParameterMethod P = new UsingParameterMethod();
		P.Bill(4,500,18,20);
	}
}
