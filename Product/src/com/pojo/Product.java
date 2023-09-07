package com.pojo;

import java.util.Objects;

public class Product  implements Comparable<Product>{
	
	private int pId;
	private String pName;
	private double pCost;
	private String  pBrand;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost= pCost;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	public Product(int pId, String pName, double pCost, String pBrand) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.pBrand = pBrand;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(pBrand, pCost, pId, pName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(pBrand, other.pBrand)
				&& Double.doubleToLongBits(pCost) == Double.doubleToLongBits(other.pCost) && pId == other.pId
				&& Objects.equals(pName, other.pName);
	}
	@Override
	public String toString() {
		return "pId--->" + pId + ", pName--->" + pName + ", pCost--->" + pCost + ", pBrand--->" + pBrand;
	}
	@Override
	public int compareTo(Product pbrand) {
		
		return this.pBrand.compareTo(pbrand.getpBrand());
	}
	
	
	
	
	
}
