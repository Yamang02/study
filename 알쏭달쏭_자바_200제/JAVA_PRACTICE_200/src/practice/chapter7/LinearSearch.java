package practice.chapter7;

public class LinearSearch {

	public int linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public int linearSeachR(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
