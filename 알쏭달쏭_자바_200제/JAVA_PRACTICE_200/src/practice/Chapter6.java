package practice;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import util.Utility;

public class Chapter6 {
	Utility util = new Utility();

	public void DoubleArray() {
		double[] a = Utility.getDoubleArray(5);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

	public void DoubleArrayFor() {
		double[] a = Utility.getDoubleArray(5);

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
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("n");
		Integer n = Utility.getInputNumber(Integer.class, sc);

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
		Integer[] a = { 5, 4, 3, 2, 1 };

//		for (int i = 0; i < a.length; i++) {
//			System.out.println("a[" + i + "]=" + a[i]);
//		}
		Utility.printAllElementsInArray(a);

	}

	public void PrintArray() {
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("n");
		int[] a = Utility.getIntegerArray(sc);

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("a = {");
		if (a.length >= 2)
			for (int i = 0; i < a.length - 1; i++) {
				System.out.print(a[i] + " , ");
			}
		if (a.length >= 1)
			System.out.print(a[a.length - 1]);
		System.out.println("}");

	}

	public void PointSumAve() {
		Scanner sc = Utility.getScanner();

		Utility.printEnterNumber("people");
		int[] point = Utility.getIntegerArray(sc);

		System.out.println("input score");
		int sum = 0;

		for (int i = 0; i < point.length; i++) {
			System.out.print("score of " + (i + 1));
			point[i] = sc.nextInt();
			sum += point[i];
		}

		int max = point[0];
		int min = point[0];
		for (int i = 1; i < point.length; i++) {
			if (point[i] > max)
				max = point[i];
			if (point[i] < min)
				min = point[i];
		}

		System.out.println("sum is " + sum);
		System.out.println("average is " + (double) sum / point.length);
		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}

	public void LinearSerachTop() {
		Scanner sc = Utility.getScanner();

		Utility.printEnterNumber("elements");
		int[] a = Utility.getIntegerArray(sc);

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = sc.nextInt();
		}

		System.out.print("int to find : ");
		int key = sc.nextInt();

		int j;
		for (j = 0; j < a.length; j++)
			if (a[j] == key)
				break;

		if (j < a.length)
			System.out.println("value is in a[" + j + "]");
		else
			System.out.println("there is no value on the array");

	}

	public void ArraySumAve() {
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements");
		Integer n = Utility.getInputNumber(Integer.class, sc);

		double[] a = new double[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = sc.nextDouble();

		}

		double sum = 0;
		for (double i : a)
			sum += i;

		System.out.println("sum is " + sum);
		System.out.println("average is " + sum / n);
	}

	public void ArrayRand() {
		Random rand = new Random();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("element");
		Integer n = Utility.getInputNumber(Integer.class, sc);

		Integer[] a = new Integer[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + rand.nextInt(10);
		}

		Utility.printAllElementsInArray(a);
	}

	public void ArrayRandX() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements");
		Integer n = Utility.getInputNumber(Integer.class, sc);
		Integer[] a = new Integer[n];

		a[0] = 1 + rand.nextInt(10);

		for (int i = 1; i < a.length; i++) {
			do {
				a[i] = 1 + rand.nextInt(10);
			} while (a[i] == a[i - 1]);
		}

		Utility.printAllElementsInArray(a);
	}

	public void ArrayRandY() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements");
		Integer n = Utility.getInputNumber(Integer.class, sc);
		Integer[] a = new Integer[n];

		a[0] = 1 + rand.nextInt(10);

		for (int i = 1; i < a.length; i++) {
			int j;
			do {
				a[i] = 1 + rand.nextInt(10);
				for (j = 0; j < a.length; j++) {
					if (a[j] == a[i]) {
						break;
					}
				}
			} while (j < i);
		}

		Utility.printAllElementsInArray(a);
	}

}
