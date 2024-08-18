package practice;

import java.util.Random;
import java.util.Scanner;

import practice.chapter7.Absolute;
import practice.chapter7.AryExchng;
import practice.chapter7.MIn;
import practice.chapter7.PrintBits;
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

	public void ArrayClone() {
		practice.chapter7.ArrayClone ac = new practice.chapter7.ArrayClone();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int[] b = ac.arrayClone(a);
		System.out.println("Cloned");
		Utility.printAllElementsInIntArray(b);
	}

	public void ArraySearchIndex() {
		practice.chapter7.ArraySearchIndex asi = new practice.chapter7.ArraySearchIndex();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int n = Utility.getIntForEnterString(sc, "value to search");
		int[] result = asi.arraySrchIdx(a, n);
		if (result.length == 0) {
			System.out.println("there is no value");
		} else {
			System.out.println("idx : ");
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}

	}

	public void ArrayRemoveOf() {
		practice.chapter7.ArrayRemoveOf aro = new practice.chapter7.ArrayRemoveOf();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int idx = Utility.getIntForEnterString(sc, "idx to delete");
		int[] b = aro.arrayRmvOf(a, idx);
		Utility.printAllElementsInIntArray(b);
	}

	public void ArrayRemoveOfN() {
		practice.chapter7.ArrayRemoveOfN aron = new practice.chapter7.ArrayRemoveOfN();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int idx = Utility.getIntForEnterString(sc, "idx to start delete");
		int n = Utility.getIntForEnterString(sc, "number to delete");
		int[] b = aron.arrayRmvOfN(a, idx, n);
		Utility.printAllElementsInIntArray(b);

	}

	public void ArrayInsOf() {
		practice.chapter7.ArrayInsOf aio = new practice.chapter7.ArrayInsOf();
		Scanner sc = Utility.getScanner();
		int[] a = Utility.getIntArray(sc);
		int idx = Utility.getIntForEnterString(sc, "idx to insert");
		int n = Utility.getIntForEnterString(sc, "vlaue to in");
		int[] b = aio.arrayInsOf(a, idx, n);
		Utility.printAllElementsInIntArray(b);

	}

	public void AddMatrix() {
		practice.chapter7.AddMatrix am = new practice.chapter7.AddMatrix();
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		int[][] c = new int[2][3];

		if (am.addMatrix(a, b, c)) {
			System.out.println(" matrix a ");
			Utility.printMatrix(a);
			System.out.println(" matrix b ");
			Utility.printMatrix(b);
			System.out.println(" matrix c ");
			Utility.printMatrix(c);
		}
	}

	public void AddMatrixY() {
		practice.chapter7.AddMatrixY am = new practice.chapter7.AddMatrixY();
		Scanner sc = Utility.getScanner();
		int height = Utility.getIntForEnterString(sc, "height of matrix");
		int width = Utility.getIntForEnterString(sc, "width of matrix");
		int[][] a = new int[height][width];
		int[][] b = new int[height][width];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d} : ", i, j);
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d} : ", i, j);
				b[i][j] = sc.nextInt();
			}
		}

		int[][] c = am.addMatrix(a, b);
		Utility.printMatrix(a);
		Utility.printMatrix(b);
		Utility.printMatrix(c);

	}

	public void AryClone2() {
		practice.chapter7.AryClone2 ac = new practice.chapter7.AryClone2();
		Scanner sc = Utility.getScanner();
		int height = Utility.getIntForEnterString(sc, "height");
		int width = Utility.getIntForEnterString(sc, "width");

		int[][] a = new int[height][width];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d} : ", i, j);
				a[i][j] = sc.nextInt();
			}
		}

		int[][] ca = Utility.aryClone(a);
		Utility.printMatrix(a);
		Utility.printMatrix(ca);
	}

	public void Min() {
		practice.chapter7.MIn min = new practice.chapter7.MIn();
		Scanner sc = Utility.getScanner();

		int x = Utility.getIntForEnterString(sc, "value of x");
		int y = Utility.getIntForEnterString(sc, "value of y");
		int z = Utility.getIntForEnterString(sc, "value of z");
		int[] a = Utility.getIntArray(sc);

		System.out.println(min.min(x, y));
		System.out.println(min.min(x, y, z));
		System.out.println(min.min(a));
	}

	public void Absolute() {
		practice.chapter7.Absolute ab = new Absolute();
		Scanner sc = Utility.getScanner();

		int a = Utility.getIntForEnterString(sc, "int a, long b, float c, double d : ");
		long b = sc.nextLong();
		float c = sc.nextFloat();
		double d = sc.nextDouble();

		System.out.println("a  : " + ab.absolute(a));
		System.out.println("b  : " + ab.absolute(b));
		System.out.println("c  : " + ab.absolute(c));
		System.out.println("d  : " + ab.absolute(d));

	}

	public void PrintBits() {
		practice.chapter7.PrintBits pb = new practice.chapter7.PrintBits();
		Scanner sc = Utility.getScanner();

		System.out.println(" byte a short b int c long d");
		byte a = sc.nextByte();
		short b = sc.nextShort();
		int c = sc.nextInt();
		long d = sc.nextLong();

		System.out.println("a  : ");
		pb.printBits(a);
		System.out.println("\nb  : ");
		pb.printBits(b);
		System.out.println("\nc  : ");
		pb.printBits(c);
		System.out.println("\nd  : ");
		pb.printBits(d);
	}

	public void PrintArray() {
		Scanner sc = Utility.getScanner();
		int[] x = Utility.getIntArray(sc);

		System.out.println("2 level matrix : ");
		int height = sc.nextInt();

		int[][] y = new int[height][];
		for (int i = 0; i < y.length; i++) {
			System.out.print(i + "row's column number :");
			int width = sc.nextInt();
			y[i] = new int[width];
		}

		System.out.println("enter element");
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.printf("y[%d][%d] : ", i, j);
				y[i][j] = sc.nextInt();
			}
		}

		Utility.printArray(x);
		Utility.printArray(y);

	}
}
