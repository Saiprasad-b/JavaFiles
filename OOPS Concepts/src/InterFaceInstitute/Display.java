package InterFaceInstitute;

import java.util.Scanner;

public class Display {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter the Course");
		String group = sc.next();
		
		Institute k;//k reference is created
		
		if(group.equals("bsc")) {
			k = new Bsc();
			k.course();
			k.fee();
		}
		else if(group.equals("Btech")) {
			k = new Btech();
			k.course();
			k.fee();
		}
		else if(group.equals("Mca")) {
			k = new Mca();
			k.course();
			k.fee();
		}
		else {
			System.out.println("Please Enter the Correct Course");
			
		}
		
	}
}
