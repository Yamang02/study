package practice;

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

}
