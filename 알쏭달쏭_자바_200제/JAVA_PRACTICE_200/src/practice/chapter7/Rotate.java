package practice.chapter7;

public class Rotate {

	public static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	
	int rRotate(int x, int n) {
		if (n < 0 ) return lRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : ( x >>> n) | (x << (32 -n)));
	}
	
	
	public static int lRotate(int x, int n) {
		if (n < 0 ) return rRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : ( x << n) | (x >>> (32 -n)));
	}
	
	}
}
