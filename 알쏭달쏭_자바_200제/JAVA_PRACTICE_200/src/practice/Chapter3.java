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
}
