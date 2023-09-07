package com.StaticVariablesIntro;

public class Introduction {

	
	
	public int id=909; //instance Variable
	public void add() {
	//this is instance method
		System.out.println("adds the numbers----Instance method");
	}
	
	
	//Static key word is used to call the class level variables and methods
	//without creating their instances
	
	
	public static int age=77;
	
	public static void display() {
		System.out.println("this shows the detail----Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println(age);//static variable is called without creating object
		display();//static method is called without creating instance
		
		
		Introduction i = new Introduction();
		
		i.id=899;
		age = 90;
		System.out.println(i.id);//object is created for instance variables
		i.add();//instance is created to call instance method
	

		System.out.println(age);//static variable is called without creating object
		display();//static method is called without creating instance
		Introduction i1 = new Introduction();
		
		
		
		System.out.println(i1.id);
		System.out.println(age);//
	
	}

}
