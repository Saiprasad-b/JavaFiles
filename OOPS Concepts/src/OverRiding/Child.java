package OverRiding;

public class Child extends Parent {

	
	
	public void mul1() {
		System.out.println("MUL in Child");
	}
	
	public void add2(){//this method is overridden 
		System.out.println("Add2 in Child----OverRidden From Parent class");
	}
	public  void addition(int a ,int b ,int c) {
		System.out.println(a+b+c +"child");
	}
}
