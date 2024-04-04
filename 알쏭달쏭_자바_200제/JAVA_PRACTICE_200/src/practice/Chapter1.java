package practice;

public class Chapter1 {

	public void Hello() {
		System.out.println("첫 Java 프로그램입니다.");
		System.out.println("화면에 출력하고 있습니다.");
	}

	public void HelloError() {
//		System.out.println("세미콜론이 없으면??")
		System.out.println("화면에 출력하고 있습니다.");
	}

	public void Hello1A() {
		System.out.println("첫 Java 프로그램입니다. 화면에 출력하고 있습니다.");
	}

	public void Hello1B() {
		System.out.print("첫 Java 프로그램입니다. ");
		System.out.println(" 화면에 출력하고 있습니다.");

	}

	public void Hello1C() {
		System.out.println("첫 Java 프로그램입니다. " + " 화면에 출력하고 있습니다.");

	}
	
	public void PrintName1A() {
		System.out.println("홍");
		System.out.println("길");
		System.out.println("동");
	}
	
	public void PrintName1B() {
		System.out.println("홍\n길\n동");
	}

}
