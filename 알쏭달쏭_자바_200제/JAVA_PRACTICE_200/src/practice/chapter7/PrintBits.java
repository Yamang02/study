package practice.chapter7;

public class PrintBits {
	public void printBits(byte x) {
		for (int i = 7; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1 ? '1' : '0'));
		}
	}

	public void printBits(short x) {
		for (int i = 15; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1 ? '1' : '0'));
		}
	}

	public void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1 ? '1' : '0'));
		}
	}

	public void printBits(long x) {
		for (int i = 63; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1 ? '1' : '0'));
		}
	}

}
