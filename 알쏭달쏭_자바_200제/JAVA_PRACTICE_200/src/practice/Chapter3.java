package practice;

import java.util.Scanner;

public class Chapter3 {
	public void Negative() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer : ");
		int n = stdIn.nextInt();

		if (n < 0)
			System.out.println("This integer is minus");

	}

}
