package practice.chapter7;

public class ArrayRemoveOfN {
	public int[] arrayRmvOfN(int[] target, int idx, int n) {
		if (n < 0 || idx < 0 || idx > target.length) {
			return target.clone();
		} else {
			if (idx + n > target.length) {
				n = target.length - idx;
			}
			int[] c = new int[target.length - n];
			int i = 0;
			for (; i < idx; i++) {
				c[i] = target[i];
			}
			for (; i < target.length - n; i++) {
				c[i] = target[i + n];
			}
			return c;
		}

	}
}