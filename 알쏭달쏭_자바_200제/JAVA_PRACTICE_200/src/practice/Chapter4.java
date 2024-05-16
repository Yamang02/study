package practice;

import java.util.Random;
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

	public void ThreeDigits() {
		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.print("Three Digit int : ");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999);

		System.out.println("insert value is : " + x);
	}

	public void Number2digits() {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int no = 10 + rand.nextInt(10); // 10~99 random int
		System.out.println("guess 2 digit int start ");
		System.out.println("get 10~99 int");
		int x;
		do {
			x = stdIn.nextInt();
			if (x > no)
				System.out.println("smaller int");
			else if (x < no)
				System.out.println("bigger int");
		} while (x != no);

		System.out.println("gotcha!");

	}

}
