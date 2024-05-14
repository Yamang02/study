package practice;

import java.util.Scanner;

public class Chapter4 {

	public void SignRepeat() {
		Scanner stdIn = new Scanner(System.in);
		int retry;

		do {
			System.out.print("int : ?");
			int n = stdIn.nextInt();

			if (n > 0)
				System.out.println("this value is +");
			else if (n < 0)
				System.out.println("this value is -");
			else
				System.out.println("this value is 0 ");

			System.out.println("retry? 1-yes / 0-No : ");
			retry = stdIn.nextInt();

		} while (retry == 1);

	}

}
