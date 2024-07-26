package practice.chapter7;

import java.util.Scanner;

public class MentalArithmetic {

	public static Scanner sc = new Scanner(System.in);

	public static boolean confirmRetry() {
		int count; do {
			System.out.print("Retry? Yes...1 / No... 0");
			count = sc.nextInt();
			
		} while (count != 0 && count != 1);
		return count ==1;
	}

}
