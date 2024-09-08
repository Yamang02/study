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

	// 날짜 변경
	public static void change(Day day) {
		System.out.println("[1] 연월일을 변경");
		System.out.println("[2] 연을 변경");
		System.out.println("[3] 월을 변경");
		System.out.println("[4] 일을 변경");
		System.out.println("[5] 1일 뒤");
		System.out.println("[6] 1일 앞");
		System.out.println("[7] n일 뒤");
		System.out.println("[8] n일 앞 :");

		int change = sc.nextInt();
		int y = 0, m = 0, d = 0, n = 0;

		if (change == 1 || change == 2) {
			y = Utility.getIntForEnterString(sc, "year");
		}
		if (change == 1 || change == 3) {
			m = Utility.getIntForEnterString(sc, "month");
		}
		if (change == 1 || change == 4) {
			d = Utility.getIntForEnterString(sc, "date");
		}
		if (change == 7 || change == 8) {
			n = Utility.getIntForEnterString(sc, "how many days?");
		}

		switch (change) {
		case 1:
			day.set(y, m, d);
			break;
		case 2:
			day.setYear(y);
			break;
		case 3:
			day.setMonth(m);
			break;
		case 4:
			day.setDate(d);
			break;
		case 5:
			day.succeed();
			break;
		case 6:
			day.precede();
			break;
		case 7:
			day.succeedDays(n);
			break;
		case 8:
			day.precedeDays(n);
			break;

		}
		System.out.println(day + "로 변경되었습니다.");

	}

}
