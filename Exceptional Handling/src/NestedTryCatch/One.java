package NestedTryCatch;

public class One {

	public static void main(String[] args) {
		String s = "sai";
		System.out.println("hiii");
		try {
		  System.out.println(s.charAt(9));
		  System.out.println("inside try 1");
		   try {
			System.out.println(10/0);
		}catch(Exception e) {//child of  exception
			System.out.println("One "+e);
		}
		  
		}catch(Exception e) {//parent exception
			System.out.println("Hiii second"+e);
		}
	
}
	}
