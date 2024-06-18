package practice;

import util.Utility;

public class Chapter5 {
	Utility util = new Utility();

	public void Print12() {
		System.out.println(" 8jinsu 12 as decimal : " + 012);
		System.out.println(" 10jinsu 12 as decimal : " + 12);
		System.out.println(" 16jinsu 12 as decimal : " + 0x12);

	}

	public void OctHex() {
		int x = util.getInputInt();

		System.out.printf("8 jinsu is %o \n", x);
		System.out.printf("16 jinsu is %x \n", x);
	}

}
