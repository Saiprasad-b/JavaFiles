package MethodsIntro;


public class Calculator {
	void add() {
		System.out.println("Here add method is called");
		System.out.println("                           ");
		int a= 12;
		int b=13;
		System.out.println("Addition of "+a+" and "+b+ " is " +(a+b));
	}
	void sub() {
		System.out.println("Here sub method is called");
		System.out.println("                           ");
		int a= 123;
		int b=13;
		System.out.println("Subtraction of "+a+" and "+b+ "is "+(a-b));
	}
	void mul() {
		System.out.println("Here multiplication method is called");
		System.out.println("                           ");
		int a= 12;
		int b=13;
		System.out.println("Multiplication of "+a+" and  "+b+ "is " +a*b);
	}
	void div() {
		System.out.println("Here division method is called");
		System.out.println("                           ");
		int a= 12;
		int b=6;
		System.out.println("Division of "+a+" and "+b+ "is " +a/b);
	}
	void sqaureRoot() {
		System.out.println("Here SqaureRoot method is called");
		System.out.println("                           ");
		int a= 12;
		System.out.println("sqaure of "+a+"  is " +a*a);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.sqaureRoot();

	}
}
