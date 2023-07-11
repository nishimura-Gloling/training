package com.practice;

import java.util.ArrayList;
import java.util.List;

public class EnsuMain {

	public static void main(String[] args) {
		EnsuService ensuService = new EnsuService();

		// 演習問題1
		EnsuService.printHello();
		// 演習問題2
		EnsuService.printPI();
		// 演習問題3
		EnsuService.printRandomMessage();
		// 演習問題4
		EnsuService.printMessage("Hello");
		// 演習問題5
		EnsuService.printCircleArea(2.0);
		// 演習問題6
		EnsuService.printRandomMessage("社長");
		// 演習問題7
		EnsuService.printMessage("Hello", 5);
		// 演習問題8
		EnsuService.printRectangleArea(2.0, 3.0);
		// 演習問題9
		EnsuService.printMaxValue(2.0, 3.0, 4.0);
		EnsuService.printMaxValue(4.0, 3.0, 5.0);
		EnsuService.printMaxValue(3.0, 6.0, 5.0);
		EnsuService.printMaxValue(5.0, 6.0, 4.0);
		EnsuService.printMaxValue(7.0, 3.0, 5.0);
		EnsuService.printMaxValue(7.0, 6.0, 5.0);
		// 演習問題10
		System.out.println(EnsuService.getMessage());
		// 演習問題11
		System.out.println(EnsuService.getWeatherForecast());
		// 演習問題12
		System.out.println("2の平方根は" + EnsuService.getSquareRootOf2());
		// 演習問題13
		System.out.println(EnsuService.getRandomMessage("社長"));
		// 演習問題14
		System.out.println(EnsuService.getAbsoluteValue(5.2));
		System.out.println(EnsuService.getAbsoluteValue(-3.6));
		// 演習問題15
		System.out.println(EnsuService.isEvenNumber(5));
		System.out.println(EnsuService.isEvenNumber(10));
		// 演習問題16
		System.out.println("最小値は" + EnsuService.getMinValue(7.7, 11.1));
		System.out.println("最小値は" + EnsuService.getMinValue(7.7, -11.1));
		// 演習問題17
		System.out.println(EnsuService.isSameAbsoluteValue(1, 2));
		System.out.println(EnsuService.isSameAbsoluteValue(2, 1));
		System.out.println(EnsuService.isSameAbsoluteValue(100, 100));
		// 演習問題18
		System.out.println(EnsuService.getMessage("社長", true));
		System.out.println(EnsuService.getMessage("社長", false));
		// 演習問題19
		int[] numberList = { 10, 50, 1, 20, 15, 5 };
		System.out.println("←の数値の中で最小値は" + EnsuService.getMinValue(numberList));
		// 演習問題20
		double[] doubleList = { 10.0, 50.0, 20.0 };
		System.out.println("←の平均値は" + EnsuService.getAverage(doubleList));

		// 演習問題21
		String[] messageList = { "Hello", "hoge", "おはようございます。", "こんにちは" };
		System.out.println("←最大文字列は" + EnsuService.getLongestString(messageList));
		// 演習問題22
		System.out.println("距離は" + EnsuService.getDistanceFromOrigin(new Point(3.0, 2.0)));
		// 演習問題23
		System.out.println("距離は" + EnsuService.getDistanceBetweenTwoPoints(new Point(0.0, 0.0), new Point(3.0, 2.0)));
		// 演習問題24
		List<Point> pointList = new ArrayList<Point>();
		Point point = new Point(0.0, 0.0);
		Point point2 = new Point(4.0, 5.0);
		Point point3 = new Point(2.0, 1.0);
		Point point4 = new Point(10.0, 10.0);

		pointList.add(point);
		pointList.add(point2);
		pointList.add(point3);
		pointList.add(point4);

		Point pointAverage = EnsuService.getBarycenter(pointList);
		System.out.println("平均座標はx=" + pointAverage.x + "y=" + pointAverage.y);

		// 演習問題25
		EnsuService.printMessage(new Person("社長",36));
		// 演習問題26
		System.out.println(EnsuService.isAdult(new Person("大人",20)));
		System.out.println(EnsuService.isAdult(new Person("子供",19)));
		
		// 演習問題27
		List<Person> personList = new ArrayList<Person>();
		Person person = new Person("社長",36);
		Person person1 = new Person("西村",35);
		Person person2 = new Person("大橋",36);
		Person person3 = new Person("富武",30);
		Person person4 = new Person("堀江",30);
		
		personList.add(person);
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		Person minPerson = EnsuService.getYoungestPerson(personList);
		System.out.println("メンバーの最少年齢は" + minPerson.getName() + "さんで年齢は" + minPerson.getAge() + "です");
		
		// 演習問題28
		System.out.println("<<<<<<<<<<<<<<演習問題28>>>>>>>>>>>>>>>>>>>");
		Person person5 = new Person();
		person5.setName("渡辺");
		System.out.println(person5.getName());
		
		// 演習問題29
		System.out.println("<<<<<<<<<<<<<<演習問題29>>>>>>>>>>>>>>>>>>>");
		person5.setAge(35);

		Person person6 = new Person();
		person6.setName("hoge");
		person6.setAge(-1);

		System.out.println(person5.getName()+ "は" + person5.getAge()+ "歳です");
		System.out.println(person6.getName()+ "は" + person6.getAge()+ "歳です");
		
	}
}
