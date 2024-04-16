package practice;

import java.util.Random;
import java.util.Scanner;

public class Chapter2 {

	public void SumDiff1() {
		System.out.println(82 + 17);
		System.out.println(82 - 17);
	}

	public void SumDiff2() {
		System.out.println("82 + 17 = " + (82 + 17));
		System.out.println("82 - 17 = " + (82 - 17));

	}

	public void SumAve3A() {

		int x, y, z;

		x = 63;
		y = 18;
		z = 52;

		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + (x + y + z) + "입니다.");
		System.out.println("평균값은 " + (x + y + z) / 3 + "입니다.");

	}

	public void SumAve3B() {
		int x, y, z;
		int sum;

		x = 63;
		y = 18;
		z = 52;

		sum = x + y + z;

		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균값은 " + sum / 3 + "입니다.");

	}

	public void SumAve1() {
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("합계는 " + (x + y) + "입니다.");
		System.out.println("평균값은 " + (x + y) / 2 + "입니다.");

	}

	public void ScanInteger() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("integer: ");
		int x = stdIn.nextInt();
		System.out.println("you inputted integer : " + x);

	}

	public void PlusMinus10() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer : ");
		int x = stdIn.nextInt();

		System.out.println("Plus 10 : " + (x + 10));
		System.out.println("Minus 10 : " + (x - 10));

	}

	public void LowestDigit() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer : ");
		int x = stdIn.nextInt();

		System.out.println("value except Lowest digit is : " + (x / 10));
		System.out.println("Lowest digit is : " + (x % 10));

	}

	public void SumAveDouble() {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("value x : ");
		double x = stdIn.nextDouble();

		System.out.print("value y : ");
		double y = stdIn.nextDouble();

		System.out.println("sum : " + (x + y));
		System.out.println("average : " + (x + y) / 2);

	}

	public void Triangle() {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("get triangle size");

		System.out.print("width : ");
		double width = stdIn.nextDouble();

		System.out.print("height : ");
		double height = stdIn.nextDouble();

		System.out.println("size : " + (width * height) / 2);

	}

	public void Globe() {
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;

		System.out.println("Golbe size volume");
		System.out.print("radius : ");
		double r = stdIn.nextDouble();

		System.out.println("size : " + (4 * PI * r * r));
		System.out.println("volume : " + (4 / 3.0 * PI * r * r * r));
	}

	public void RandomInteger() {
		Random rand = new Random();

		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 + rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);

		System.out.println("make 3 random value");
		System.out.println("1 digit plus : " + n1);
		System.out.println("1 digit minus : " + n2);
		System.out.println("2 digit plus : " + n3);

	}

	public void RandomPlusMinus5() {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("integer? : ");
		int x = stdIn.nextInt();

		System.out.println("generate +-5 random int");
		System.out.println("value : " + (x - 5 + rand.nextInt(11)));

	}

	public void RandomDouble() {
		Random rand = new Random();

		double x1 = rand.nextDouble();
		double x2 = -1 + rand.nextDouble() * 10;
		double x3 = -1 + 2 * rand.nextDouble();

		System.out.println("generating 3 random double");
		System.out.println("0.0 ~ 1.0 :  " + x1);
		System.out.println("0.0 ~ 10.0 :  " + x2);
		System.out.println("-1.0 ~ 1.0 :  " + x3);
	}

}