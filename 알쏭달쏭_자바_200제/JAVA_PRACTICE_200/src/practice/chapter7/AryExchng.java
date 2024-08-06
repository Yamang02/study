package practice.chapter7;

public class AryExchng {
	public void aryExchng(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < n; i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
}
