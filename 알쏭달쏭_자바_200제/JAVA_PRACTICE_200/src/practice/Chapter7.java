package practice;

import util.Utility;

import java.util.Scanner;

public class Chapter7 {

	Utility util = new Utility();

	public void SignOf1() {

		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("int x : ");
		int x = sc.nextInt();

		int s = new practice.chapter7.SignOf1().signOf(x);
		System.out.println("signOf(x) is " + s);

	}

	public void Min3() {

		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("int a");
		int a = sc.nextInt();
		Utility.printEnterNumber("int b");
		int b = sc.nextInt();
		Utility.printEnterNumber("int c");
		int c = sc.nextInt();
		System.out.println("min is " + new practice.chapter7.Min3().min(a, b, c));
	}

	public void SumUp1() {
		Scanner sc = util.getScanner();

		System.out.println("Sum 1 to x");
		int x;
		do {
			System.out.print("value of x : ");
			x = sc.nextInt();
		} while (x <= 0);

		System.out.print("Sum 1 to x is " + new practice.chapter7.SumUp1().sumUp(x));
	}

	public void SumUp2() {
		Scanner sc = util.getScanner();

		System.out.println("Sum 1 to x");
		int x;
		do {
			System.out.print("value of x : ");
			x = sc.nextInt();
		} while (x <= 0);

		System.out.print("Sum 1 to x is " + new practice.chapter7.SumUp2().sumUp(x));
	}

	public void Hello() {
		new practice.chapter7.Hello().hello();
	}

	public void PrintSeason(int n) {
		new practice.chapter7.PrintSeason().printSeason(n);
	}

	public void IsoscelesTriangleB() {
		Scanner sc = Utility.getScanner();

		System.out.println("print left-bottom jicgak triangle");
		System.out.print("level ? : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			new practice.chapter7.IsoscelesTriangleB().putStars(i);
			System.out.println();
		}

	}
}
