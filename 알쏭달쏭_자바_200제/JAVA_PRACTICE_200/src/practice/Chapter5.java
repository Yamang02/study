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

	public void Average3Wrong() {
		Scanner sc = util.getScanner();
		System.out.println("get x,y,z average");

		util.printEnterNumber("x");
		Integer x = util.getInputNumber(Integer.class, sc);
		util.printEnterNumber("y");
		Integer y = util.getInputNumber(Integer.class, sc);
		util.printEnterNumber("z");
		Integer z = util.getInputNumber(Integer.class, sc);

		double ave = (x + y + z) / 3.0;
		System.out.printf("x, y, z average %.3f\n", ave);

	}

	public void FloatToInteger() {
		int a;

		a = (int) 10.0;
		// a = 10.0;

		System.out.println("a = " + a);

	}

	public void LoopFloatInt() {
		System.out.println("float        int");
		System.out.println("--------------------");

		float x = 0.0f;
		for (int i = 0; i <= 1000; i++, x += 0.001F)
			System.out.printf("%9.7f %9.7f\n", x, (float) i / 1000);

	}

	public void SquareFloat() {
		System.out.println("x       square of x");
		System.out.println("--------------------");

		float x = 0.0f;
		for (int i = 0; i <= 1000; i++, x += 0.001F)
			System.out.printf("%5.3f %10.7f\n", x, x * x);

	}

	public void printABC() {
		System.out.println("\"ABC\\n\"");
		
	}
}
