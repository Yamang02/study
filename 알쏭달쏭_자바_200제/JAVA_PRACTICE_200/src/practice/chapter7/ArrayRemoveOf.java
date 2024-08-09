package practice.chapter7;

public class ArrayRemoveOf {

	public int[] arrayRmvOf(int[] a, int idx) {
		if (idx < 0 && idx >= a.length - 1) {
			return a.clone();
		} else {
			int[] c = new int[a.length - 1];
			int i = 0;
			for (; i < idx; i++) {
				c[i] = a[i];
			}
			for (; i < a.length - 1; i++) {
				c[i] = a[i + 1];
			}
			return c;
		}
	}
}
