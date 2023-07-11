package com.exmple.enshu;

public class ProductService {
	public static int getTaxPrice(int price ,int reducedTaxKbn) {
		if (reducedTaxKbn == 0) {
			return (int)(price + price * 0.08)  ;
		}
		
		return (int)(price + price * 0.1)  ;
	}
}
