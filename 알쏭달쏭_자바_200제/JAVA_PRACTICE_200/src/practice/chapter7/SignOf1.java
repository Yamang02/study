package practice.chapter7;

public class SignOf1 {

	public static int signOf(int n) {
		int sign = 0;

		if (n > 0)
			sign = 1;
		else if (n < 0)
			sign = -1;

		return sign;
	}

}
