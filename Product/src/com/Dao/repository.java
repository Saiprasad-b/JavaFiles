package com.Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.pojo.Product;

public class repository {
	FileReader fr =null;
	BufferedReader br =null;
	public Product getDataBasedOnId(int pId) {
		
		Product dataBasedOnId = null;
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
				int prodId = Integer.parseInt(s[0]);
				if(prodId ==pId) {
					dataBasedOnId= new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataBasedOnId;
	}
	public Set<Product> getDataBasedOnName(String pName) {
		
		Set<Product> dataBasedOnName = new HashSet<>();
		
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
				if(s[1].equals(pName)) {
					
					dataBasedOnName.add(new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]));
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataBasedOnName;
	}
	public Set<Product> getDataBasedOnCost(double pCost) {
		
		Set<Product> dataBasedOnCost = new HashSet<>();
		
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
				double cost = Double.valueOf(s[2]);
				if(pCost==cost) {
					
					dataBasedOnCost.add(new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]));
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataBasedOnCost;
	}
	public Set<Product> getDataBasedOnBrand(String pBrand) {
		Set<Product> dataBasedOnBrand = new HashSet();
		
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
				if(s[3].equals(pBrand)) {
					
					dataBasedOnBrand.add(new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]));
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataBasedOnBrand;
	}
	public Set<Product> getAllData() {

		Set<Product> AllData = new HashSet<>();
		
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
					
				AllData.add(new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return AllData;
	}
	public Set<Product> getAllBrandData() {
		Set<Product> AllBrandData = new TreeSet<>();
		
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Product.txt");
			br = new BufferedReader(fr);
			for(String h = br.readLine();h!=null;h=br.readLine()) {
				String []s = h.split(",");
					
				AllBrandData.add(new Product(Integer.parseInt(s[0]), s[1], Double.valueOf(s[2]), s[3]));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return AllBrandData;
	}

}
