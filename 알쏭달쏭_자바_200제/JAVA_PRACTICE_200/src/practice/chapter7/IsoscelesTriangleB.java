package practice.chapter7;

public class IsoscelesTriangleB {

	public static void putChars(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	public static void putStars(int n) {
		putChars('*', n);
	}
}
