package util;

import java.util.Scanner;

public class Utility {

	public Scanner getScanner() {
		return new Scanner(System.in);
	}

	public void printEnterNumber() {
		System.out.print("please enter number : ");
	}

	public void printEnterNumber(String string) {
		System.out.print("please enter number for " + string + " : ");
	}

	// Wrapper class와 generic을 이용해 모둔 Number형 받기
	public <T extends Number> T getInputNumber(Class<T> type, Scanner sc) {
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

	public double[] getDoubleArray(int size) {
		return new double[size];
	}

	public int[] getIntegerArray(Scanner sc) {
		return new int[sc.nextInt()];
	}

}
