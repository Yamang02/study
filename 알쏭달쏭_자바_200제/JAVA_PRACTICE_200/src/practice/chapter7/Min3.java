package practice.chapter7;

public class Min3 {

	public static int min(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}
}
