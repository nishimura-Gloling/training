package com.exmple.enshu;

public class Product {
 
	private String name;
	private int price;
	private int reducedTaxKbn;
	private double taxPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getReducedTaxKbn() {
		return reducedTaxKbn;
	}
	public void setReducedTaxKbn(int reducedTaxKbn) {
		this.reducedTaxKbn = reducedTaxKbn;
	}
	
	public void setTaxPrice() {
		if (this.reducedTaxKbn == 0) {
			taxPrice = this.price *1.08;
		} else {
			taxPrice = this.price * 1.1;
		}
	}
	
	public double getTaxPrice() {
		return taxPrice;
	}
}
