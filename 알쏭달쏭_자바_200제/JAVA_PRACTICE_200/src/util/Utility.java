package util;

import java.util.Random;
import java.util.Scanner;

import practice.chapter8.Human;

public class Utility {

	public static Scanner getScanner() {
		return new Scanner(System.in);
	}

	public static Random getRandom() {
		return new Random();
	}

	public static void printEnterNumber() {
		System.out.print("please enter number : ");
	}

	public static void printEnterNumber(String string) {
		System.out.print("please enter number for " + string + " : ");
	}

	// Wrapper class와 generic을 이용해 모둔 Number형 받기
	public static <T extends Number> T getInputNumber(Class<T> type, Scanner sc) {
		if (type == Integer.class) {
			return type.cast(sc.nextInt());
		} else if (type == Double.class) {
			return type.cast(sc.nextDouble());
		} else if (type == Float.class) {
			return type.cast(sc.nextFloat());
		} else if (type == Long.class) {
			return type.cast(sc.nextLong());
		}
		return null;
	}

	public static double[] getDoubleArray(int size) {
		return new double[size];
	}

	public static int[] getIntegerArray(Scanner sc) {
		return new int[sc.nextInt()];
	}

//	public static <T extends Number> T[] createNumberArray(Class<T> type, int size, Scanner sc) {
//		@SuppressWarnings("unchecked")
//		T[] array = (T[]) Array.newInstance(type, size);
//		return array;
//	}

	public static <T extends Object> void printAllElementsInArray(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}

	}

	// 배열 반환
	public static int[] getIntArray(Scanner sc) {
		printEnterNumber("size of array");
		int size = sc.nextInt();
		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			System.out.println(" array[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		return x;
	}

	public static void printAllElementsInIntArray(int[] ia) {
		for (int i = 0; i < ia.length; i++) {
			System.out.println("array[" + i + "] = " + ia[i]);
		}
	}

	public static int getIntForEnterString(Scanner sc, String string) {
		printEnterNumber(string);
		return sc.nextInt();
	}

	public static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] aryClone(int[][] a) {
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j];
			}
		}
		return c;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[a.length - 1]);
		System.out.println();
	}

	public static void printArray(int[][] a) {
		int[][] width = new int[a.length][];
		int max = 0;
		for (int i = 0; i < a.length - 1; i++) {
			width[i] = new int[a[i].length];
			if (a[i].length > max)
				max = a[i].length;
		}
		int[] maxWidth = new int[max];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = a[i][j];
				width[i][j] = (value < 0) ? 1 : 0;
				do {
					width[i][j]++;
					value /= 10;
				} while (value != 0);
				if (width[i][j] > maxWidth[j])
					maxWidth[j] = width[i][j];
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				for (int k = 0; k < maxWidth[j] - width[i][j]; k++) {
					System.out.print(" ");
				}
				System.out.println(a[i][a[i].length - 1]);
			}
		}
	}

	public static void printHuman(Human h) {
		System.out.println(h);
	}

	// a, b 최솟값 반환
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	// a, b, c 의 최솟값 반환
	public static int min(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	// 배열 a의 최솟값 반환
	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	// 배열 a의 최솟값을 가지는 모든 요소의 인덱스를 저장한 배열 반환
	public static int[] minIndexArray(int[] a) {
		int min = min(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				count++;
			}
		}
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == min) {
				c[count--] = i;
			}
		}
		return c;
	}

	// a, b의 최댓값을 반환
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	// a, b, c의 최댓값을 반환
	public static int max(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	// 배열 a의 최댓값 반환
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int[] maxIndexArray(int[] a) {
		int max = max(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				count++;
			}
		}
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == max) {
				c[count--] = i;
			}
		}
		return c;
	}

}