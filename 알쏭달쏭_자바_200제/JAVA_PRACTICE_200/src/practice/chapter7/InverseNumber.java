package practice.chapter7;

import java.util.Scanner;

import util.Utility;

public class InverseNumber {

	static Scanner sc = Utility.getScanner();

	public static int readPlusInt() {
		int x;
		do {
			System.out.print("plus int : ");
			x = sc.nextInt();

		} while (x <= 0);
		return x;
	}

}
