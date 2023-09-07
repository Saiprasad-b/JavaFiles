package com.StaticVariablesIntro;

public class ScopeOfStatic {

	
	static { // this will run first than the main block
		System.out.println("This is static block");
	}
	{
		System.out.println("Empty block");
	}
	public static void main(String[] args) {
		System.out.println("Main block");
	}

}
