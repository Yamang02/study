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

}
