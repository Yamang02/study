package practice.chapter7;

public class SetBit {
	public static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	public static int set(int x, int pos) {
		return x | (1 << pos);
	}

	public static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}

	public static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}
}
