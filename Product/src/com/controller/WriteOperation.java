package com.controller;
import com.pojo.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.pojo.Product;

public class WriteOperation {

	public void writeToProduct(Product prod) {
		FileWriter fw;
		BufferedWriter bw ;
		try {
			fw = new FileWriter("C:\\Users\\kranthi\\Desktop\\Product.txt",true);
			bw= new BufferedWriter(fw);
			bw.write(prod.getpId()+","+prod.getpName()+","+prod.getpCost()+","+prod.getpBrand() );
			bw.newLine();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WriteOperation w = new WriteOperation();
		Product prod = new Product();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please Enter the product ID");
		 prod.setpId(sc.nextInt());
		 System.out.println("Please Enter the product Name");
		 prod.setpName(sc.next());
		 System.out.println("Please Enter the product Cost");
		 prod.setpCost(sc.nextDouble());
		 System.out.println("Please Enter the product Brand");
		 prod.setpBrand(sc.next());
		 
		 
		
		 w.writeToProduct(prod);
	}

}
