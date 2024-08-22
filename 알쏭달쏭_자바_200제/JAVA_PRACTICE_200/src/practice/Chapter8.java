package practice;

import java.util.Scanner;

import practice.chapter8.Car;
import practice.chapter8.Human;
import util.Utility;

public class Chapter8 {

	Human gildong = new Human("길동", 170, 60);
	Human chulsu = new Human("철수", 166, 72);

	public void HumanTester() {

//		gildong.setName("길동");
//		gildong.setHeight(170);
//		gildong.setWeight(60);
//
//		chulsu.setName("철수");
//		chulsu.setHeight(166);
//		chulsu.setWeight(72);

//		System.out.println(gildong.toString());
//		System.out.println(chulsu.toString());
		Utility.printHuman(gildong);
		Utility.printHuman(chulsu);

	}

	public void HumanTester2() {

		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		Utility.printHuman(gildong);
		Utility.printHuman(chulsu);

	}

	public void CarTester1() {
		Car k3 = new Car("k3", "서울999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		Car k5 = new Car("k5", "서울999-98", 1660, 1525, 3695, 41.0, 35.0, 12.0);

		k3.putSpec();
		System.out.println();
		k5.putSpec();
	}

	// 대화형으로 자동차 이동
	public void CarTester2() {
		Scanner sc = Utility.getScanner();
		System.out.println("set new car");
		// 입력 받아서 해야되지만 편의상 생략
		Car myCar = new Car("k3", "서울999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);

		while (true) {
			System.out.printf("present position : (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("left fuel : %.2f\n", myCar.getFuel());
			System.out.print("move? [ 0 ... No / 1 ... Yes ]");
			if (sc.nextInt() == 0)
				break;
			System.out.println("add x : ");
			double dx = sc.nextDouble();
			System.out.println("add y : ");
			double dy = sc.nextDouble();

			if (!myCar.move(dx, dy)) {
				System.out.println("not enough fuel");
			}

		}

	}
}
