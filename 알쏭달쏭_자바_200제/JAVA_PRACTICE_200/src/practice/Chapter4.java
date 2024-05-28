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

// 두 정수 사이의 정수를 작은 것부터 순서대로 표시
	public void EnumScope() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("int A : ");
		int a = stdIn.nextInt();
		System.out.print("int B : ");
		int b = stdIn.nextInt();
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		do {
			System.out.println(a + " ");
			a = a + 1;
		} while (a <= b);
		System.out.println();
	}

	public void CountDown() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Start Countdown");
		int x;
		do {
			System.out.print("plus int : ? ");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0)

			System.out.println(x--);
		System.out.println("x value reached " + x);
	}

	public void CountDownPre() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Start Countdown");
		int x;
		do {
			System.out.print("plus int : ? ");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0)

			System.out.println(--x);
		System.out.println("x value reached " + x);

	}

	public void PutAsterisk1() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("how many * ? :  ");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n) {
				System.out.print("*");
				i++;
			}
			System.out.println();
		}
	}

	public void PutAsterisk2() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("how many * ? :  ");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

	public void PutAsteriskAlt1() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("how many ? :  ");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n) {
				if (i % 2 == 0)
					System.out.print('*');
				else
					System.out.print('+');
				i++;

			}
			System.out.println();
		}

	}

	public void PutAsteriskAlt2() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("how many *?");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n / 2) {
				System.out.print("*+");
				i++;
			}
			if (n % 2 == 1) {
				System.out.print('*');
				System.out.println();
			}
		}

	}

	public void DigitNo() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Digit of Plus");
		int x;

		do {
			System.out.println("plus int : ");
			x = stdIn.nextInt();
		} while (x <= 0);

		int digit = 0;
		while (x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("value is " + digit + " number");
	}

	public void Factorial() {
		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.println("plus int : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int factorial = 1;
		int i = 1;

		while (i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("from 1 to " + n + " factorial is " + factorial);
	}

	public void PutAsteriskFor() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("how many * ? : ");
		int n = stdIn.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++)
				System.out.print('*');
			System.out.println();
		}

	}

	public void CountUp() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("start countup");
		int x;
		do {
			System.out.println("plus int : ");
			x = stdIn.nextInt();
		} while (x < 0);

		for (int i = 0; i <= x; i++)
			System.out.println(i);
	}

	public void CountDownFor() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("start countdown ");

		int x;
		do {
			System.out.println("plus int");
			x = stdIn.nextInt();
		} while (x <= 0);

		for (; x >= 0; x--)
			System.out.println(x);
	}

}
