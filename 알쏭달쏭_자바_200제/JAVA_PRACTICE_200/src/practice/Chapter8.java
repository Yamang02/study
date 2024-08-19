package practice;

import practice.chapter8.Human;

public class Chapter8 {
	public void HumanTester() {
		Human gildong = new Human();
		Human chulsu = new Human();

		gildong.setName("길동");
		gildong.setHeight(170);
		gildong.setWeight(60);

		chulsu.setName("철수");
		chulsu.setHeight(166);
		chulsu.setWeight(72);

		System.out.println(gildong.toString());
		System.out.println(chulsu.toString());
	}
}
