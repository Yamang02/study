package practice.chapter7;

public class ArrayInsOf {
	public int[] arrayInsOf(int[] a, int idx, int x) {
		if (idx < 0 || idx > a.length) {
			return a.clone();
		} else {
			int[] c = new int[a.length + 1];

			int i = 0;
			for (; i < idx; i++) {
				c[i] = a[i];
			}
			for (; i < a.length; i++) {

				c[i + 1] = a[i];
			}
			c[idx] = x;
			return c;
		}
	}
}
