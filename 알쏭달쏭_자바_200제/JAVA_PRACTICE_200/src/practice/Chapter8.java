package practice;

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

}
