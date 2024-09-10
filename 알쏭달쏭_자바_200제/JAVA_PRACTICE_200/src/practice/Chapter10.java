package practice;

import java.util.Scanner;

import practice.chapter10.DayTester;
import practice.chapter10.ExId;
import practice.chapter10.Id;
import practice.chapter7.Min3;
import practice.chapter9.Day;
import util.Utility;

public class Chapter10 {

	public void IdTester() {
		Id a = new Id();
		Id b = new Id();

		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println("마지막 식별 번호 : " + Id.getMaxId());
		System.out.println("마지막 식별 번호 : " + a.getMaxId());
		System.out.println("마지막 식별 번호 : " + b.getMaxId());

	}

	public void ExIdTester() {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId.setStep(4);
		ExId c = new ExId();
		ExId d = new ExId();

		System.out.println(a.getId());
		System.out.println(b.getId());

		System.out.println(c.getId());
		System.out.println(d.getId());

		int max = ExId.getMaxId();
		System.out.println(max);

	}

	public void IntegerLimits() {
		System.out.println("정수형의 표현 범위");
		System.out.println("byte  	형 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short   형 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("Integer 형 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("Long 	형 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

	}

	public void MathMethods() {
		Scanner sc = Utility.getScanner();

		System.out.print("실수값 : ");
		double x = sc.nextDouble();

		System.out.println("절댓값 : " + Math.abs(x));
		System.out.println("제곱근 : " + Math.sqrt(x));
		System.out.println("면 적  : " + Math.PI * x * x);

	}

	public void MinMaxTester() {
		Scanner sc = Utility.getScanner();
		int x = Utility.getIntForEnterString(sc, "x : ");
		int y = Utility.getIntForEnterString(sc, "y : ");
		int z = Utility.getIntForEnterString(sc, "z : ");

		int num = Utility.getIntForEnterString(sc, "array a num : ");
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		System.out.printf("x, y의 최솟값은 %d;\n", Utility.min(x, y));
		System.out.printf("x, y의 최댓값은 %d;\n", Utility.max(x, y));
		System.out.printf("x, y, z 의 최솟값은 %d;\n", Utility.min(x, y, z));
		System.out.printf("x, y, z 의 최댓값은 %d;\n", Utility.max(x, y, z));
		System.out.printf("배열 a의 최솟값은 %d;\n", Utility.min(a));

		int xmin[] = Utility.minIndexArray(a);
		System.out.print("인덱스는 { ");
		for (int i = 0; i < xmin.length; i++) {
			System.out.print(xmin[i] + " ");
		}
		System.out.println("}입니다.");
		System.out.printf("배열 a의 최댓값은 %d\n", Utility.max(a));
		int xmax[] = Utility.maxIndexArray(a);
		System.out.print("인덱스는 { ");
		for (int i = 0; i < xmax.length; i++) {
			System.out.print(xmax[i] + " ");
		}
		System.out.println("}입니다.");
	}

	public void DayTester() {

		Day d = new Day();
		// practice.chapter10.DayTester.display(d);
		// practice.chapter10.DayTester.change(d);
		// practice.chapter10.DayTester.compare(d);
		practice.chapter10.DayTester.beforeAfter(d);
	}

}
