package practice.chapter7;

public class ArrayClone {
	public int[] arrayClone(int[] a) {
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		return c;
	}
}
