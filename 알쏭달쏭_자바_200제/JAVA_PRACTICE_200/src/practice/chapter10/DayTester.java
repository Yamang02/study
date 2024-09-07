package practice.chapter10;

import java.util.Scanner;

import practice.chapter9.Day;
import util.Utility;

public class DayTester {
	static Scanner sc = Utility.getScanner();

	// 날짜 관련 정보 표시
	public static void display(Day day) {
		System.out.println(day + "에 관한 정보");
		System.out.println("윤년" + (day.isLeap() ? "입니다" : "이 아닙니다"));
		System.out.println("연도 내 경과 일수 : " + day.dayOfYear());
		System.out.println("연도 내 잔여 일수 : " + day.leftDayOfYear());
	}

}
