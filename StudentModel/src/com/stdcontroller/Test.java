package com.stdcontroller;
import com.stdpojo.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		stdpojo sp = new stdpojo();
		
		System.out.println("---Student Registration");
		System.out.println("PLease Enter the Student name :");
		sp.setsName(sc.next());
		System.out.println("PLease Enter the Student ID :");
		sp.setsId(sc.nextInt());
		System.out.println("PLease Enter the Student Marks :");
		sp.setsMarks(sc.nextDouble());
		System.out.println("PLease Enter the Student Qualification :");
		sp.setsQual(sc.next());
		
		stdcontroller stc  =  new stdcontroller();
		stc.save(sp);
	}

}
