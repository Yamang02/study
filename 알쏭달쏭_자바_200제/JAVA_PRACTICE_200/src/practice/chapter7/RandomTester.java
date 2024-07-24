package practice.chapter7;

import java.util.Random;

public class RandomTester {
	public static int random(int a, int b) {
		if (b >= a)
			return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b - a + 1);
		}
	}
}
