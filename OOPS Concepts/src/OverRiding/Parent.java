package OverRiding;

public class Parent {

	public void add1() {
		System.out.println("Add1 in Parent");
	}
	public void add2(){//this method is overridden 
		System.out.println("Add2 in Parent");
	}
	public void add3() {
		System.out.println("Add3 in Parent");
	}
	public void add4() {
		System.out.println("Add4 in Parent");
	}
	
	
	public  void addition(int a ,int b) {
		System.out.println(a+b);
	}
}
