package practice;

import practice.chapter10.ExId;
import practice.chapter10.Id;

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

}
