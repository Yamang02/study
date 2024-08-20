package practice;

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
}
