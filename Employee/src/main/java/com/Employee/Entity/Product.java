package com.Employee.Entity;

public class Product {
	
	public int pId;
	public String pName;
	public int pPrice;
	
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
	
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	

}
