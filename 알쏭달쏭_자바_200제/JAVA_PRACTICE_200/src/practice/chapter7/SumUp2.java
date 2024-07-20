package practice.chapter7;

public class SumUp2 {

	public static int sumUp(int n) {
		int sum = 0;
		while (n > 0)
			sum += n--;
		return sum;
	}
}
