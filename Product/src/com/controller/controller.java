package com.controller;

import java.util.Set;

import com.Dao.repository;
import com.pojo.Product;

public class controller {
	private repository rep = new repository();
	
	public Set<Product> getProductData(){
		return null;
		
	}

	public Product getDataBasedOnId(int pId) {
		
		return rep.getDataBasedOnId(pId);
	}

	public Set<Product> getDataBasedOnName(String pName) {
		// TODO Auto-generated method stub
		return  rep.getDataBasedOnName(pName);
	}

	public Set<Product> getDataBasedOnCost(double pCost) {
		
		return rep.getDataBasedOnCost(pCost);
	}

	public Set<Product> getDataBasedOnBrand(String pBrand){
		
		return rep.getDataBasedOnBrand(pBrand);
	}

	public Set<Product> getAllData() {
		// TODO Auto-generated method stub
		return rep.getAllData();
	}

	public Set<Product> getAllBrandData() {
		// TODO Auto-generated method stub
		return rep.getAllBrandData();
	}
	
	
	
	
}
