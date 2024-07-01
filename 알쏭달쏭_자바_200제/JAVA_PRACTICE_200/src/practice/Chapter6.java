package practice;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import util.Utility;

public class Chapter6 {
	Utility util = new Utility();

	public void DoubleArray() {
		double[] a = util.getDoubleArray(5);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

	public void DoubleArrayFor() {
		double[] a = util.getDoubleArray(5);

		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1) * 1.1;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

	public void IntArrayFor() {
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++)
			a[i] = 5 - i;

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] =" + a[i]);
	}

	public void ColumnChart() {
		Random rand = new Random();
		Scanner sc = util.getScanner();
		util.printEnterNumber("n");
		Integer n = util.getInputNumber(Integer.class, sc);

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = 1 + rand.nextInt(10);
		}

		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print('-');

		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(i % 10 + " ");

		}
		System.out.println();
	}

	public void IntArray54321() {
		int[] a = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}

	public void PrintArray() {
		Scanner sc = util.getScanner();
		util.printEnterNumber("n");
		Integer n = util.getInputNumber(Integer.class, sc);

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("a = {");
		if (n >= 2)
			for (int i = 0; i < a.length - 1; i++) {
				System.out.print(a[i] + " , ");
			}
		if (n >= 1)
			System.out.print(a[n - 1]);
		System.out.println("}");

	}

}
