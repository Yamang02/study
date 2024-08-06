package practice;

import java.util.Random;
import java.util.Scanner;

import practice.chapter7.AryExchng;
import practice.chapter7.SetBit;
import practice.chapter7.SetBits;
import util.Utility;

public class Chapter7 {

	Utility util = new Utility();

	public void SignOf1() {

		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("int x : ");
		int x = sc.nextInt();

		int s = new practice.chapter7.SignOf1().signOf(x);
		System.out.println("signOf(x) is " + s);

	}

	public void Min3() {

		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("int a");
		int a = sc.nextInt();
		Utility.printEnterNumber("int b");
		int b = sc.nextInt();
		Utility.printEnterNumber("int c");
		int c = sc.nextInt();
		System.out.println("min is " + new practice.chapter7.Min3().min(a, b, c));
	}

	public void SumUp1() {
		Scanner sc = util.getScanner();

		System.out.println("Sum 1 to x");
		int x;
		do {
			System.out.print("value of x : ");
			x = sc.nextInt();
		} while (x <= 0);

		System.out.print("Sum 1 to x is " + new practice.chapter7.SumUp1().sumUp(x));
	}

	public void SumUp2() {
		Scanner sc = util.getScanner();

		System.out.println("Sum 1 to x");
		int x;
		do {
			System.out.print("value of x : ");
			x = sc.nextInt();
		} while (x <= 0);

		System.out.print("Sum 1 to x is " + new practice.chapter7.SumUp2().sumUp(x));
	}

	public void Hello() {
		new practice.chapter7.Hello().hello();
	}

	public void PrintSeason(int n) {
		new practice.chapter7.PrintSeason().printSeason(n);
	}

	public void IsoscelesTriangleB() {
		Scanner sc = Utility.getScanner();

		System.out.println("print left-bottom jicgak triangle");
		System.out.print("level ? : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			new practice.chapter7.IsoscelesTriangleB().putStars(i);
			System.out.println();
		}

	}

	public void RandomTester() {
		Scanner sc = Utility.getScanner();

		System.out.println("get random int ");
		System.out.print("min ? : ");
		int min = sc.nextInt();
		System.out.print("max ? : ");
		int max = sc.nextInt();

		System.out.println("random int is " + new practice.chapter7.RandomTester().random(min, max));
	}

	public void InverseNumber() {

		Scanner sc = Utility.getScanner();

		int x;
		do {
			int n = new practice.chapter7.InverseNumber().readPlusInt();

			System.out.print("in reverse...");
			while (n > 0) {
				System.out.print(n % 10);
				n /= 10;
			}

			do {
				System.out.print("retry? Yes...1 / No... 0 :");
				x = sc.nextInt();

			} while (x != 0 && x != 1);
		} while (x == 1);

	}

	public void MentalArithemtic() {

		Random rand = new Random();
		System.out.println("Mental Arithemtic");
		Scanner sc = Utility.getScanner();

		do {
			int x = rand.nextInt(900) + 100; // 3자리 수
			int y = rand.nextInt(900) + 100; // 3자리 수
			int z = rand.nextInt(900) + 100; // 3자리 수
			int pattern = rand.nextInt(4); // 패턴 번호

			int answer;
			switch (pattern) {
			case 0:
				answer = x + y + z;
				break;
			case 1:
				answer = x + y - z;
				break;
			case 2:
				answer = x - y + z;
				break;
			default:
				answer = x - y - z;
				break;
			}

			while (true) {
				System.out.print(
						x + ((pattern < 2) ? " + " : " - ") + y + ((pattern % 2 == 0) ? " + " : " - ") + z + " =");
				int k = sc.nextInt();
				if (k == answer)
					break;
				System.out.println("wrong");
			}
		} while (new practice.chapter7.MentalArithmetic().confirmRetry());
	}

	public void ShitfValue() {

		Scanner sc = Utility.getScanner();

		System.out.println("int x, n bit shift");
		Utility.printEnterNumber("x");
		int x = sc.nextInt();
		Utility.printEnterNumber("n");
		int n = sc.nextInt();

		int mPower = x * new practice.chapter7.Shiftvalue().pow2(n);
		int dPower = x / new practice.chapter7.Shiftvalue().pow2(n);
		int lShift = x << n;
		int rShift = x >> n;

		System.out.printf("[a] x * (2의 %d승) = %d\n", n, mPower);
		System.out.printf("[b] x / (2의 %d승) = %d\n", n, dPower);
		System.out.printf("[a] x << %d = %d\n", n, lShift);
		System.out.printf("[a] x >> %d = %d\n", n, rShift);

		System.out.println("[a] 와 [c]의 값의 일치" + ((mPower == lShift) ? "합니다." : "하지 않습니다."));
		System.out.println("[b] 와 [d]의 값의 일치" + ((dPower == rShift) ? "합니다." : "하지 않습니다."));
	}

//	public void Rotate() {
//		Scanner sc = Utility.getScanner();
//
//		System.out.println("정수x를 n비트 회전");
//		Utility.printEnterNumber("x");
//		int x = sc.nextInt();
//		Utility.printEnterNumber("n");
//		int n = sc.nextInt();
//		System.out.println("befor");
//		practice.chapter7.Rotate rt = new practice.chapter7.Rotate();
//
//		rt.printBits(x);
//
//		System.out.print("\n 오른쪽 회전");
//		rt.printBits();
//		
//	}

	public void SetBit() {
		Scanner sc = Utility.getScanner();
		SetBit sb = new practice.chapter7.SetBit();

		System.out.println("정수 x의 pos번째 비트를 변경");
		Utility.printEnterNumber("x");
		int x = sc.nextInt();
		System.out.print("pos : ");
		int pos = sc.nextInt();

		System.out.print("x                      = ");
		sb.printBits(x);
		System.out.print("\nset(x,pos)           = ");
		sb.printBits(sb.set(x, pos));
		System.out.print("\nreset(x,pos)         = ");
		sb.printBits(sb.reset(x, pos));
		System.out.print("\ninverse(x,pos)       = ");
		sb.printBits(sb.inverse(x, pos));
		System.out.println();
	}

	public void SetBits() {
		SetBits sb = new practice.chapter7.SetBits();
		Scanner sc = Utility.getScanner();
		System.out.println("정수 x의 pos번째 비트를 변경");
		Utility.printEnterNumber("x");
		int x = sc.nextInt();
		System.out.print("pos : ");
		int pos = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();

		System.out.print("x                      : ");
		sb.printBits(x);
		System.out.print("\nset(x,pos)           = ");
		sb.printBits(sb.setN(x, pos, n));
		System.out.print("\nreset(x,pos)         = ");
		sb.printBits(sb.resetN(x, pos, n));
		System.out.print("\ninverse(x,pos)       = ");
		sb.printBits(sb.inverseN(x, pos, n));
		System.out.println();

	}

	public void SumOf1() {
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("elements number : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.println("sum is " + new practice.chapter7.SumOf1().sumOf(x));

	}

	public void minOfHeightWeight() {
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("number of people");
		int num = sc.nextInt();

		int[] height = new int[num];
		int[] weight = new int[num];

		System.out.println(num + "people's heiht and weight");
		for (int i = 0; i < num; i++) {
			System.out.print(i + 1 + "'s height");
			height[i] = sc.nextInt();
			System.out.print(i + 1 + "'s weight");
			weight[i] = sc.nextInt();
		}

		practice.chapter7.minOfHeightWeight mo = new practice.chapter7.minOfHeightWeight();
		System.out.println("smallest's height :" + mo.minOf(height));
		System.out.println("smallest's height :" + mo.minOf(weight));
	}

	public void LinearSearch() {
		practice.chapter7.LinearSearch ls = new practice.chapter7.LinearSearch();
		Scanner sc = Utility.getScanner();
		Utility.printEnterNumber("element count");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		Utility.printEnterNumber("value?");
		int key = sc.nextInt();

		int idxTop = ls.linearSearch(x, key);
		int idxBtm = ls.linearSeachR(x, key);

		if (idxTop == -1) {
			System.out.println("no value in x ");
		} else if (idxTop == idxBtm) {
			System.out.println("there is " + key + "in index" + idxTop);
		} else {
			System.out.println("there is multiple value in x ....");
			System.out.println("first one is on " + idxTop + "and last one is on " + idxBtm);
		}

	}

	public void AryRmv() {
		practice.chapter7.AryRmv ar = new practice.chapter7.AryRmv();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		Utility.printEnterNumber("index to rmv");
		int idx = sc.nextInt();
		ar.aryRmv(a, idx);
		Utility.printAllElementsInIntArray(a);
	}

	public void AryRmvN() {
		practice.chapter7.AryRmvN ar = new practice.chapter7.AryRmvN();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int idx = Utility.getIntForEnterString(sc, "start rmv index");
		int n = Utility.getIntForEnterString(sc, "count for rmv");
		ar.aryRmvN(a, idx, n);
		Utility.printAllElementsInIntArray(a);
	}

	public void AryIns() {
		practice.chapter7.AryIns ai = new practice.chapter7.AryIns();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int idx = Utility.getIntForEnterString(sc, "idx of enter");
		int n = Utility.getIntForEnterString(sc, "value of enter");
		ai.aryIns(a, idx, n);
		Utility.printAllElementsInIntArray(a);
	}

	public void AryExchange() {
		practice.chapter7.AryExchng ae = new AryExchng();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int[] b = Utility.getIntArray(sc);
		ae.aryExchng(a, b);
		System.out.println("exchanged");
		Utility.printAllElementsInIntArray(a);
		Utility.printAllElementsInIntArray(b);
	}
}
