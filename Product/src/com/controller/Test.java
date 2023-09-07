package com.controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.pojo.Product;

public class Test {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hi There Please Enter the Option");
	System.out.println("Please Enter 1 for All Prouct Data");
	System.out.println("Please Enter pId for Product ID");
	System.out.println("Please Enter pName for Product Name");
	System.out.println("Please Enter pCost for Product Cost");
	System.out.println("Please Enter pBrand for Product Brand");
	
	String input = sc.next();
	controller cont  =null;
	switch (input) {
	case "1" :
		cont  =new controller();
		Set<Product> AllData = new HashSet<Product>();
		AllData = cont.getAllData();
		 Iterator ii = AllData.iterator();
		 while (ii.hasNext()) {
			 System.out.println(ii.next());
		 }
		break;
	case "pId" :
		cont  =new controller();
		Product pr = cont.getDataBasedOnId(110);
		System.out.println(pr);
		break;
		
	case "pName":
		 cont  =new controller();
		 Set<Product> DataBasedOnName = new HashSet<Product>();
		 DataBasedOnName=  cont.getDataBasedOnName("Choc");
		 Iterator i = DataBasedOnName.iterator();
		 while (i.hasNext()) {
			 System.out.println(i.next());
			 break;
		 }
	case "pCost":
		cont = new controller();
		Set<Product> DataBasedOnCost = new HashSet<Product>();
		 DataBasedOnCost=  cont.getDataBasedOnCost(100.00);
		 Iterator i1 = DataBasedOnCost.iterator();
		 while (i1.hasNext()) {
			 System.out.println(i1.next());
			 break;
		 }
	case "pBrand":
		 cont  =new controller();
		 Set<Product> DataBasedOnBrand = new TreeSet<Product>();
		 DataBasedOnBrand=  cont.getDataBasedOnBrand("Coke");
		 Iterator i2 = DataBasedOnBrand.iterator();
		 while (i2.hasNext()) {
			 System.out.println(i2.next());
			 break;
		 }
	case "Brands":
		 cont  =new controller();
		 Set<Product> AllBrand = new TreeSet<Product>();
		 AllBrand = cont.getAllBrandData();
		 Iterator i4 = AllBrand.iterator();
		 while (i4.hasNext()) {
			 System.out.println(i4.next());
		 }
		 break;
	}
	
		
	
	
	}

}
