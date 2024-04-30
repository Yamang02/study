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

	public void Absolute1() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer : ");
		int n = stdIn.nextInt();

		if (n >= 0)
			System.out.println("Absolute : " + n);
		else
			System.out.println("Absolute : " + -n);
	}

	public void Absolute2() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer : ");
		int n = stdIn.nextInt();
		int abs;

		if (n >= 0)
			abs = n;
		else
			abs = -n;
		System.out.println("Absolute : " + abs);
	}

	public void Measure1() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("var A : ");
		int a = stdIn.nextInt();
		System.out.print("var B : ");
		int b = stdIn.nextInt();

		if (a % b == 0)
			System.out.println("B는 A의 약수");
		else
			System.out.println("B는 A의 약수가 아님");

	}

	public void Measure2() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("var A : ");
		int a = stdIn.nextInt();
		System.out.print("var B : ");
		int b = stdIn.nextInt();

		if (!(a % b == 0))
			System.out.println("B는 A의 not 약수");
		else
			System.out.println("B는 A의 약수");
	}

	public void Sign() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("int : ");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("value is plus");
		else if (n < 0)
			System.out.println("value is minus");
		else if (n == 0)
			System.out.println("value is 0");

	}

	public void Balance() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("var A : ");
		int a = stdIn.nextInt();
		System.out.print("var B : ");
		int b = stdIn.nextInt();

		if (a > b)
			System.out.println("a is bigger");
		else if (a < b)
			System.out.println("b is bigger");
		else
			System.out.println("they are equal");

	}

	public void BalanceWrong() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("var A : ");
		int a = stdIn.nextInt();
		System.out.print("var B : ");
		int b = stdIn.nextInt();

		// int의 값 한계로 인해 아래 식은 유효하지 않다. -1 -2147483648
		// input missmatch
		int diff = a - b;
		if (diff > 0)
			System.out.println("a is bigger");
		else if (diff < 0)
			System.out.println("b is bigger");
		else
			System.out.println("they are equal");
	}

	public void GoInto5() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("int : ? ");
		int n = stdIn.nextInt();

		if (n > 0)
			if (n % 5 == 0)
				System.out.println("this value could divide by 5");
			else
				System.out.println("this value couldn't divide by 5");
		else
			System.out.println("you inserted minus int");
	}

	public void MultipleOf10() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("int : ? ");
		int n = stdIn.nextInt();

		if (n > 0)
			if (n % 10 == 0)
				System.out.println("this value is multiple of 10");
			else
				System.out.println("this value isn't multiple of 10");
		else
			System.out.println("you inserted minus int");

	}

}
