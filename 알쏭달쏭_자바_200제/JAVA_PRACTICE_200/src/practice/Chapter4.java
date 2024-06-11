package practice;

import java.util.Iterator;
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

	public void SumUpFor() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("From 1 to n SUM ");
		int n;
		do {
			System.out.println("type n : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i;
		System.out.println("result to " + n + " sum : " + sum);

	}

	public void SumUpForExp() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("get Sum from 1 to n");
		int n;
		do {
			System.out.print("type n : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}

	public void HeightWeight() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("From cm : ");
		int hMin = stdIn.nextInt();
		System.out.print("To cm : ");
		int hMax = stdIn.nextInt();
		System.out.print("step cm : ");
		int step = stdIn.nextInt();
		System.out.println("H average kg");
		System.out.println("--------------------");

		for (int i = hMin; i <= hMax; i += step)
			System.out.println(i + " " + 0.9 * (i - 100));

	}

	public void PutAsterisk5A() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("how many *  ? : ");
		int n = stdIn.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print('*');
				if (i % 5 == 4)
					System.out.println();
			}
			if (n % 5 != 0)
				System.out.println();
		}

	}

	public void PutAsterisk5B() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("How many * ? : ");
		int n = stdIn.nextInt();
		if (n > 0) {
			for (int i = 0; i < n / 5; i++)
				System.out.println("*****");
			int rest = n % 5;
			if (rest > 0) {
				for (int i = 0; i < rest; i++)
					System.out.print("*");
				System.out.println();
			}
		}
	}

	public void Measure() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("int : ");
		int n = stdIn.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		System.out.println("\n yaksu count : " + count);
	}

	public void Square1() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("int : ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println(i + " square is " + i * i);

	}

	public void Square2() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("int : ");
		int n = stdIn.nextInt();
		for (int i = 1, j = 1; i <= n; i++, j = i * i)
			System.out.println(i + " square is " + j);

	}

	public void SeasonRepeat() {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("find season");
		do {
			int month;
			do {
				System.out.print("which month? : ");
				month = stdIn.nextInt();
			} while (month < 1 || month > 12);

			if (month >= 3 && month <= 5)
				System.out.println("spring");
			else if (month >= 6 && month <= 8)
				System.out.println("summer");
			else if (month >= 9 && month <= 11)
				System.out.println("fall");
			else if (month >= 12 || month == 1 || month == 2)
				System.out.println("winter");

			System.out.print("retry? 1_YES/ 0_NO : ");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}

	public void Square() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("print square");
		System.out.print("level : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public void IsoscelesTriangleLB() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Triangle which Left Bottom is 90 degree");
		System.out.print("level? : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	public void IsoscelesTriangleLU() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Triangle which Left Bottom is 90 degree");
		System.out.print("level? : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	public void IsocelesTriangleRB() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Triangle which Right Bottom is 90 degree");
		System.out.print("level? : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	public void IsocelesTriangleRU() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Triangle which Right Bottom is 90 degree");
		System.out.print("level? : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

	public void Pyramid() {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("print Pyramid");
		System.out.print("level? : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	public void DigitPyramid() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("print digitPyramid");
		System.out.print("level? : ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print(i % 10);
			System.out.println();
		}

	}

	public void Prime() {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.println("int over 2 :");
			n = stdIn.nextInt();
		} while (n < 2);

		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0)
				break;

		if (i == n)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");

	}

}
