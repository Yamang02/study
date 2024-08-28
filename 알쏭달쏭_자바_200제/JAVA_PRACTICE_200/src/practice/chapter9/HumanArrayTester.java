package practice.chapter9;

import practice.chapter8.Human;

public class HumanArrayTester {
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("No.%d %s %3dcm %3dkg\n", i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
	}

}
