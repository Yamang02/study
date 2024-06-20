package practice;

import java.util.Scanner;

import util.Utility;

public class Chapter5 {
	Utility util = new Utility();

	public void Print12() {
		System.out.println(" 8jinsu 12 as decimal : " + 012);
		System.out.println(" 10jinsu 12 as decimal : " + 12);
		System.out.println(" 16jinsu 12 as decimal : " + 0x12);

	}

	public void OctHex() {
		Scanner sc = util.getScanner();
		Integer x = util.getInputNumber(Integer.class, sc);
		System.out.printf("8 jinsu is %o \n", x);
		System.out.printf("16 jinsu is %x \n", x);
	}

	public void OctHex1Line() {
		Scanner sc = util.getScanner();
		Integer x = util.getInputNumber(Integer.class, sc);
		System.out.printf("8 jinsu %o and 16 jinsu %x \n", x, x);
	}

	public void FloatDoubleScanPrint() {
		Scanner sc = util.getScanner();
		System.out.println(" x is float type & y is double type");
		util.printEnterNumber("x");
		Float x = util.getInputNumber(Float.class, sc);
		util.printEnterNumber("y");
		Double y = util.getInputNumber(Double.class, sc);

		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

	public void PrintBoolean() {
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
	}
}
