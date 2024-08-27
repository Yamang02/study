package practice;

import java.util.Iterator;
import java.util.Scanner;

import practice.chapter8.Human;
import practice.chapter9.Coordinate;
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
			
		System.out.println("array p");
			
		}

	}

}
