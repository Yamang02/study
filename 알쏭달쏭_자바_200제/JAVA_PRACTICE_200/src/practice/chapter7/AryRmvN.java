package practice.chapter7;

public class AryRmvN {
	public void aryRmvN(int[] a, int idx, int n) {
		if (n > 0 && idx >= 0 && idx + n < a.length) {
			int idx2 = idx + n - 1;
			if (idx2 > a.length - n - 1) {
				idx2 = a.length - n - 1;
				for (int i = idx; i <= idx2; i++) {
					a[i] = a[i + n];
				}
			}
		}
	}
}
