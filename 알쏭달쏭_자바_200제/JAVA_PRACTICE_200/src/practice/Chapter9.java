package practice;

import java.util.Scanner;

import practice.chapter8.Human;
<<<<<<< HEAD
import practice.chapter9.Account;
=======
>>>>>>> 50dbbb9876ad6cf6c9371e760a2b244b2f8ceb02
import practice.chapter9.Coordinate;
import practice.chapter9.Day;
import util.Utility;

public class Chapter9 {

	public void CoordinateTester1() {
		Scanner sc = Utility.getScanner();

		System.out.println("input p");
		System.out.print("point x : ");
		double x = sc.nextDouble();
		System.out.print("point y : ");
		double y = sc.nextDouble();

		Coordinate p = new Coordinate(x, y);
		System.out.println(p.toString());
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println(p.toString());
		System.out.println(q.toString());
// p도 좌표값이 함께 바뀜
	}

	public void CoordinateTester2() {
		Scanner sc = Utility.getScanner();

		double x, y;
		System.out.println("input p");
		System.out.print("point x : ");
		x = sc.nextDouble();
		System.out.print("point y : ");
		y = sc.nextDouble();
		Coordinate p = new Coordinate(x, y);

		System.out.println("input q");
		System.out.print("point x : ");
		x = sc.nextDouble();
		System.out.print("point y : ");
		y = sc.nextDouble();
		Coordinate q = new Coordinate(x, y);

		System.out.println((p == q) ? "p == q" : "p != q");

		System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "p 와 q 가 같다" : "p 와 q가 다르다");

		System.out.println(practice.chapter9.CoordinateTester2.compCoordinate(p, q) ? "p 와 q가 같다" : "p와 q가 다르다");

	}

	public void CoordinateTester3Error() {
		Scanner sc = Utility.getScanner();
		int n = Utility.getIntForEnterString(sc, "좌표 개수? ");

		Coordinate[] a = new Coordinate[n];

		for (int i = 0; i < a.length; i++) {
			// a[i].set(5.5, 7.7); // nullpointer exception
			a[i] = new Coordinate(5.5, 7.7);
			; // instance 생성
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
		}

	}

	public void HumanArrayTester() {
		Scanner sc = Utility.getScanner();
		int n;

		Human[] p = { new Human("철수", 170, 70), new Human("길동", 160, 59), };

		n = Utility.getIntForEnterString(sc, "array q's count : ");

		Human[] q = new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q[" + i + "]");
			System.out.println("name : ");
			String name = sc.next();
			System.out.println("height : ");
			int height = sc.nextInt();
			System.out.println("weight : ");
			int weight = sc.nextInt();

			q[i] = new Human(name, height, weight);

			// 2차원 배열
			// 생성과 동시에 초기화(3행 2열)
			Human[][] x = { { new Human("김철수", 175, 52), new Human("김영희", 169, 60) },
					{ new Human("홍길동", 178, 70), new Human("이철수", 172, 61) },
					{ new Human("이영희", 168, 59), new Human("김길동", 165, 59) }, };

		}

		n = Utility.getIntForEnterString(sc, "array y's row count : ");

		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			n = Utility.getIntForEnterString(sc, "y[" + i + "]'s row count : ");
			y[i] = new Human[n];
			for (int j = 0; j < y.length; j++) {
				System.out.println("y[" + i + "][" + j + "]");
			}
<<<<<<< HEAD

			System.out.println("array p");

=======
			
		System.out.println("array p");
			
>>>>>>> 50dbbb9876ad6cf6c9371e760a2b244b2f8ceb02
		}

	}

<<<<<<< HEAD
	public void DayTester() {
		Scanner sc = Utility.getScanner();

		Utility.printEnterNumber("day1");
		int y = Utility.getIntForEnterString(sc, "year : ");
		int m = Utility.getIntForEnterString(sc, "month : ");
		int d = Utility.getIntForEnterString(sc, "day : ");

		practice.chapter9.Day day1 = new Day(y, m, d);
		System.out.println("day1 : " + day1);

		Day day2 = new Day(day1);
		System.out.println("day2 created same as day1");
		System.out.println("day2 : " + day2);

		if (day1.equalTo(day2)) {
			System.out.println("day1 = day2");
		} else {
			System.out.println("day1 != day2");
		}

		Day d1 = new Day();
		Day d2 = new Day(2017);
		Day d3 = new Day(2017, 10);
		Day d4 = new Day(2017, 10, 15);

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);

		Day[] a = new Day[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Day();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}

	}

	public void AccountTester1() {
		Day day = new Day();
		day.set(2017, 10, 25);
		Account ac = new Account("test", "1234", 0, day);

		System.out.println(ac.toString());
	}

=======
>>>>>>> 50dbbb9876ad6cf6c9371e760a2b244b2f8ceb02
}
