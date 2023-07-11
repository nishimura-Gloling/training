package com.practice;

public class EnsuService {

	public static void printHello() {
		System.out.println("<<<<<<<<<<<<<<演習問題1>>>>>>>>>>>>>>>>>>>");
		System.out.println("Hello");
	}

	public static void printPI() {
		System.out.println("<<<<<<<<<<<<<<演習問題2>>>>>>>>>>>>>>>>>>>");
		System.out.println(Math.PI);		
	}

	public static void printRandomMessage() {
		System.out.println("<<<<<<<<<<<<<<演習問題3>>>>>>>>>>>>>>>>>>>");
		int n = (int)(3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		}else if (n == 1) {
			System.out.println("こんにちは");
		}else if  (n == 2){
			System.out.println("おはよう");
		}
		
	}

	public static void printMessage(String message) {
		System.out.println("<<<<<<<<<<<<<<演習問題4>>>>>>>>>>>>>>>>>>>");
		System.out.println(message);		
	}

	public static void printCircleArea(double radius) {
		System.out.println("<<<<<<<<<<<<<<演習問題5>>>>>>>>>>>>>>>>>>>");
		System.out.println("半径2の円の面積は" + radius * radius* Math.PI);
	}

	public static void printRandomMessage(String name) {
		System.out.println("<<<<<<<<<<<<<<演習問題6>>>>>>>>>>>>>>>>>>>");
		int n = (int)(3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは" + name + "さん" );
		}else if (n == 1) {
			System.out.println("こんにちは"+ name + "さん" );
		}else if  (n == 2){
			System.out.println("おはよう"+ name + "さん" );
		}
		
	}

	public static void printMessage(String message, int count) {
		System.out.println("<<<<<<<<<<<<<<演習問題7>>>>>>>>>>>>>>>>>>>");
		for (int i = 0  ; i <count ;i++) {
			System.out.println(message);		
		}
	}

	public static void printRectangleArea(double height, double width) {
		System.out.println("<<<<<<<<<<<<<<演習問題8>>>>>>>>>>>>>>>>>>>");
		System.out.println("半径2の円の面積は" + height * width * 1/2);

	}

	public static void printMaxValue(double a, double b, double c) {
		System.out.println("<<<<<<<<<<<<<<演習問題9>>>>>>>>>>>>>>>>>>>");
		if (a > b) {
			if(a > c) {
				System.out.println(a);
				return ;
			}
			System.out.println(c);
			return ;
		} else if(b > c) {
			System.out.println(b);
			return ;
		}
		
		System.out.println(c);
	}



}
