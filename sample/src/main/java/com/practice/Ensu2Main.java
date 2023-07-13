package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ensu2Main {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyyMMdd");
		
		System.out.println("現在日付は" + ft.format(now));
		System.out.println("現在日付の2年後は" + ft.format(now.plusYears(2)));
		System.out.println("現在日付の4年前は" + ft.format(now.plusYears(-4)));
		System.out.println("現在日付の3カ月後は" + ft.format(now.plusMonths(3)));
		System.out.println("現在日付の20日前は" + ft.format(now.plusDays(-20)));

	}
}
