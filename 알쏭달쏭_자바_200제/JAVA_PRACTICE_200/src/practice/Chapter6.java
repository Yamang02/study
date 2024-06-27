package practice;

import java.util.Iterator;
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

}
