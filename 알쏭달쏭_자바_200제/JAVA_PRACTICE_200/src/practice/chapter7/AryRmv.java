package practice.chapter7;

public class AryRmv {
	public void aryRmv(int[] a, int idx) {
		if (idx >= 0 && idx < a.length) {
			for (int i = idx; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
		}
	}
}
