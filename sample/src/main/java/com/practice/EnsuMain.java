package com.practice;

public class EnsuMain {

	public static void main(String[] args) {
		EnsuService ensuService = new EnsuService();
		
		//演習問題1
		EnsuService.printHello();
		//演習問題2
		EnsuService.printPI();
		//演習問題3
		EnsuService.printRandomMessage();
		//演習問題4
		EnsuService.printMessage("Hello");
		//演習問題5
		EnsuService.printCircleArea(2.0);
		//演習問題6
		EnsuService.printRandomMessage("社長");
		//演習問題7
		EnsuService.printMessage("Hello",5);
		//演習問題8
		EnsuService.printRectangleArea(2.0,3.0);
		//演習問題9
		EnsuService.printMaxValue(2.0,3.0,4.0);
		EnsuService.printMaxValue(4.0,3.0,5.0);
		EnsuService.printMaxValue(3.0,6.0,5.0);
		EnsuService.printMaxValue(5.0,6.0,4.0);
		EnsuService.printMaxValue(7.0,3.0,5.0);
		EnsuService.printMaxValue(7.0,6.0,5.0);
	}

}
