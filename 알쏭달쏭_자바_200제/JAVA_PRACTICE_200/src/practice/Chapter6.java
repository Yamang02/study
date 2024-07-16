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

	public void Shuffle() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements");
		Integer n = Utility.getInputNumber(Integer.class, sc);
		Integer[] a = new Integer[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 2 * n; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}

		System.out.println("elements suffled");
		Utility.printAllElementsInArray(a);

	}

	public void CopyArrayReverse() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements");
		Integer n = Utility.getInputNumber(Integer.class, sc);
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = a[n - i - 1];
		}

		System.out.println(" copy all of elements in a, reversed on b array");
		Utility.printAllElementsInArray(b);

	}

	public void MonthCAI() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();

		String[] monthString = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		System.out.println("insert month");
		System.out.println("Type First alphabet as Uppercase");

		int retry;
		int last = -1;

		do {
			int month;
			do {
				month = rand.nextInt(12);
			} while (month == last);
			last = month;

			while (true) {
				System.out.print((month + 1) + " Month : ");
				String s = sc.next();

				if (s.equals(monthString[month]))
					break;
				System.out.println("wrong");
			}
			System.out.print("Correct. retry? 1...Yes/0...No");
			retry = sc.nextInt();
		} while (retry == 1);
	}

	public void DayCAI1() {
		Random rand = Utility.getRandom();
		Scanner sc = Utility.getScanner();

		String[] dayKorean = { "일", "월", "화", "수", "목", "금", "토" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

		System.out.println("type day name in English");

		int retry;
		int last = -1;

		do {
			int day;
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;

			while (true) {
				System.out.println(dayKorean[day] + "요일 : ");
				String s = sc.next();

				if (s.equals(dayEnglish[day]))
					break;
				System.out.println("wrong");
			}
			System.out.print("Correct. retry? 1...Yes/0...No");
			retry = sc.nextInt();
		} while (retry == 1);
	}

	public void PrintArrayVariable() {
		int[] a = new int[5];
		System.out.println("a = " + a);
		a = null;
		System.out.println("a = " + a);

//		a = {1, 2, 3, 4, 5};
		int[] b = { 6, 5, 4, 3, 2, 1, 0 };
		b = a;
		// garbage collection

//		final int[]a = new int [5]; -- 배열의 요소는 바뀔 수 있으나, 참조 위치는 바뀔 수 없음. 

	}

	public void MatrixProduct() {
		Scanner sc = Utility.getScanner();
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];

		System.out.println("Insert element of matrix array a");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("a[%d][%d] : ", i, j);
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Insert element of matrix array b");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("b[%d][%d] : ", i, j);
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		System.out.println("multiply of array a and b");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%5d", c[i][j]);
			}
		}

	}

	public void PointTotalization() {
		Scanner sc = Utility.getScanner();
		final int number = 6;

		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];

		System.out.printf("Insert Korean, Math score of %d students.\n", number);

		for (int i = 0; i < number; i++) {
			System.out.printf("%2d korean score : ", i + 1);
			point[i][0] = sc.nextInt();
			System.out.println("     math score : ");
			point[i][1] = sc.nextInt();

			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];

		}

		System.out.println("No. Korean Math Average");
		for (int i = 0; i < number; i++) {
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1], (double) sumStudent[i] / 2);
			System.out.printf("Average%6.1f%6.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);
		}
	}

	public void UnevennessArray() {
		Scanner sc = Utility.getScanner();

		System.out.println("creating random 2 degree matrix array");
		Utility.printEnterNumber("row count");
		int height = sc.nextInt();

		int[][] c = new int[height][];

		for (int i = 0; i < c.length; i++) {
			System.out.print(i + "row count column :");
			int width = sc.nextInt();
			c[i] = new int[width];
		}

		System.out.println("Inter each Element");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("c[%d][%d] : ", i, j);
				c[i][j] = sc.nextInt();
			}
		}

		System.out.println("array c's element are....");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();

		}
	}

	public void PointClass() {
		Scanner sc = Utility.getScanner();

		Utility.printEnterNumber("num of class");
		int classNum = sc.nextInt();
		int[][] point = new int[classNum][];
		int totNumber = 0;

		for (int i = 0; i < point.length; i++) {
			System.out.printf("\n%d class's student count : ", i + 1);
			int num = sc.nextInt();
			point[i] = new int[num];
			totNumber += num;
			for (int j = 0; j < point[i].length; j++) {
				System.out.printf("%d class %d number's score : ", i + 1, j + 1);
				point[i][j] = sc.nextInt();
			}
		}

		System.out.println(" class , sum    average ");
		System.out.println("-------------------------");
		int total = 0;
		for (int i = 0; i < point.length; i++) {
			int sum = 0;
			for (int j = 0; j < point[i].length; j++) {
				sum += point[i][j];
			}
			total += sum;
			System.out.printf(" %2d class, %7d%7.1f\n", i + 1, sum, (double) sum / point[i].length);
		}
		System.out.println("------+------------------");
		System.out.printf("  sum  : %7d%7.1f\n  ", total, (double) total / totNumber);
	}

}
