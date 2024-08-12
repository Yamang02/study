package util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

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

}