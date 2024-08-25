package practice;

import java.util.Iterator;
import java.util.Scanner;

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
			// a[i].set(5.5, 7.7);  // nullpointer exception
			a[i] = new Coordinate(5.5, 7.7);; // instance 생성
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
		}

	}

}
