package practice.chapter7;

public class ArraySearchIndex {
	public int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				count++;
		}

		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == x) {
				c[count--] = i;
			}
		}
		return c;
	}
}
