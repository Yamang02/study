package practice.chapter7;

public class AryIns {
	public void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length - 1; i > idx; i--) {
				a[i] = a[i - 1];
			}
			a[idx] = x;
		}
	}
}
