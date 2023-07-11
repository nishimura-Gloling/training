package com.practice;

import java.util.List;

import org.hibernate.type.descriptor.jdbc.H2FormatJsonJdbcType;

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
		int n = (int) (3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else if (n == 2) {
			System.out.println("おはよう");
		}

	}

	public static void printMessage(String message) {
		System.out.println("<<<<<<<<<<<<<<演習問題4>>>>>>>>>>>>>>>>>>>");
		System.out.println(message);
	}

	public static void printCircleArea(double radius) {
		System.out.println("<<<<<<<<<<<<<<演習問題5>>>>>>>>>>>>>>>>>>>");
		System.out.println("半径2の円の面積は" + radius * radius * Math.PI);
	}

	public static void printRandomMessage(String name) {
		System.out.println("<<<<<<<<<<<<<<演習問題6>>>>>>>>>>>>>>>>>>>");
		int n = (int) (3 * Math.random());
		String[] message = { "こんばんは", "こんにちは", "おはよう" };
		System.out.println(message[n] + name + "さん");
	}

	public static void printMessage(String message, int count) {
		System.out.println("<<<<<<<<<<<<<<演習問題7>>>>>>>>>>>>>>>>>>>");
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public static void printRectangleArea(double height, double width) {
		System.out.println("<<<<<<<<<<<<<<演習問題8>>>>>>>>>>>>>>>>>>>");
		System.out.println("半径2の円の面積は" + height * width * 1 / 2);

	}

	public static void printMaxValue(double a, double b, double c) {
		System.out.println("<<<<<<<<<<<<<<演習問題9>>>>>>>>>>>>>>>>>>>");
		if (a > b) {
			if (a > c) {
				System.out.println(a);
				return;
			}
			System.out.println(c);
			return;
		} else if (b > c) {
			System.out.println(b);
			return;
		}

		System.out.println(c);
	}

	public static String getMessage() {
		System.out.println("<<<<<<<<<<<<<<演習問題10>>>>>>>>>>>>>>>>>>>");
		return "よろしくお願いいたします";
	}

	public static String getWeatherForecast() {
		System.out.println("<<<<<<<<<<<<<<演習問題11>>>>>>>>>>>>>>>>>>>");
		int n = (int) (3 * Math.random());
		int m = (int) (4 * Math.random());

		String[] message1 = { "今日", "明日", "明後日" };
		String[] message2 = { "晴れ", "曇り", "雨", "雪" };

		return message1[n] + "は" + message2[m];
	}

	public static double getSquareRootOf2() {
		System.out.println("<<<<<<<<<<<<<<演習問題12>>>>>>>>>>>>>>>>>>>");
		double d = Math.sqrt(2.0);
		return d;
	}

	public static String getRandomMessage(String name) {
		System.out.println("<<<<<<<<<<<<<<演習問題13>>>>>>>>>>>>>>>>>>>");
		int n = (int) (3 * Math.random());
		String[] message = { "こんばんは", "こんにちは", "おはよう" };
		return message[n] + name + "さん";
	}

	public static double getAbsoluteValue(double value) {
		System.out.println("<<<<<<<<<<<<<<演習問題14>>>>>>>>>>>>>>>>>>>");
		return Math.abs(value);
	}

	public static boolean isEvenNumber(int value) {
		System.out.println("<<<<<<<<<<<<<<演習問題15>>>>>>>>>>>>>>>>>>>");
		// return value % 2 == 0; ←これだけでOK
		if (value % 2 == 0) {
			System.out.print(value + "は偶数");
			return true;
		}
		System.out.print(value + "は奇数");
		return false;
	}

	public static double getMinValue(double a, double b) {
		System.out.println("<<<<<<<<<<<<<<演習問題16>>>>>>>>>>>>>>>>>>>");
		return Math.min(a, b);
	}

	public static boolean isSameAbsoluteValue(int i, int j) {
		System.out.println("<<<<<<<<<<<<<<演習問題17>>>>>>>>>>>>>>>>>>>");
		// return i==j; ←これだけでOK
		if (i == j) {
			System.out.print(i + "と" + j + "は同じ値です");
			return true;
		}
		System.out.print(i + "と" + j + "は違う値です");
		return false;
	}

	public static String getMessage(String name, boolean isKid) {
		System.out.println("<<<<<<<<<<<<<<演習問題18>>>>>>>>>>>>>>>>>>>");
		if (isKid) {
			return "こんにちは。" + name + "ちゃん";
		}
		return "こんにちは。" + name + "さん";
	}

	public static int getMinValue(int[] array) {
		System.out.println("<<<<<<<<<<<<<<演習問題19>>>>>>>>>>>>>>>>>>>");
		int min = array[0];
		System.out.print(min + " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

	public static double getAverage(double[] array) {
		System.out.println("<<<<<<<<<<<<<<演習問題20>>>>>>>>>>>>>>>>>>>");
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
		}

		return sum / array.length;
	}

	public static String getLongestString(String[] array) {
		System.out.println("<<<<<<<<<<<<<<演習問題21>>>>>>>>>>>>>>>>>>>");
		String message = array[0];
		System.out.print(message + " ");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i].length() > message.length()) {
				message = array[i];
			}
		}
		return message;
	}

	public static double getDistanceFromOrigin(Point p) {
		System.out.println("<<<<<<<<<<<<<<演習問題22>>>>>>>>>>>>>>>>>>>");
		double x = p.x;
		double y = p.y;
		return Math.sqrt(x * x + y * y);
	}

	public static double getDistanceBetweenTwoPoints(Point p0, Point p1) {
		System.out.println("<<<<<<<<<<<<<<演習問題23>>>>>>>>>>>>>>>>>>>");
		double x0 = p0.x;
		double x1 = p1.x;
		double y0 = p0.y;
		double y1 = p1.y;

		return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}

	public static Point getBarycenter(List<Point> points) {
		System.out.println("<<<<<<<<<<<<<<演習問題24>>>>>>>>>>>>>>>>>>>");
		double x = 0.00;
		double y = 0.00;
		for (Point point : points) {
			x += point.x;
			y += point.y;
		}

		return new Point(x / points.size(), y / points.size());
	}

	public static void printMessage(Person person) {
		System.out.println("<<<<<<<<<<<<<<演習問題25>>>>>>>>>>>>>>>>>>>");
		System.out.println("こんにちは" + person.getName() + "さん");
	}

	public static boolean isAdult(Person person) {
		System.out.println("<<<<<<<<<<<<<<演習問題26>>>>>>>>>>>>>>>>>>>");
		if (person.getAge() >= 20) {
			System.out.print("大人");
			return true;
		}
		System.out.print("子供");
		return false;
	}

	public static Person getYoungestPerson(List<Person> personList) {
		System.out.println("<<<<<<<<<<<<<<演習問題27>>>>>>>>>>>>>>>>>>>");
		int minAge = personList.get(0).getAge();
		String minName = personList.get(0).getName();

		for(Person person: personList) {
			int age =person.getAge();
			if(minAge >= person.getAge()) {
				minAge = age;
				minName = person.getName();
			}
		}
		
		return new Person(minName,minAge);
	}
}
