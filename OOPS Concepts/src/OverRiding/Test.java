package OverRiding;

public class Test {
	/*
	 * private ,static ,final cannot be overridden.
	 * Run-Time Poly Morphism
	 * Dynamic Poly Morphism.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c = new Child();
		c.add2();
		
		
		
		
		
		
	
		System.out.println("-------------------");
		c.add1();
		c.add3();
		c.add4();
		c.addition(4, 2,2);
	}

}
