package com.ClassExample;

public class CarObjects {
		
	public static void main(String[] args) {
		
		Car CarOne=new Car();
		CarOne.Color="Red";
		CarOne.EngineCC=2000;
		CarOne.FuelType="Petrol";
		
		
		System.out.println("Color :"+ CarOne.Color);
		System.out.println("Engine CC :"+ CarOne.EngineCC);
		System.out.println("FuelType :"+  CarOne.FuelType);
		System.out.println("Safety : " +CarOne.SafetyBags);
		
		System.out.println("----------------------------------------");
		
		Car CarTwo=new Car();
		CarTwo.Color="Black";
		CarTwo.EngineCC=2200;
		CarTwo.FuelType="Diesel";
		CarTwo.SafetyBags=8;
		
		
		System.out.println("Color :"+ CarTwo.Color);
		System.out.println("Engine CC :"+ CarTwo.EngineCC);
		System.out.println("FuelType :"+  CarTwo.FuelType);
		System.out.println("Safety : " +CarTwo.SafetyBags);
		
	}
}
