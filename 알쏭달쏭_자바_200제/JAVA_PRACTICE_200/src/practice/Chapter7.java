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

}
