package practice;

public class Chapter2 {

	public void SumDiff1() {
		System.out.println(82 + 17);
		System.out.println(82 - 17);
	}

	public void SumDiff2() {
		System.out.println("82 + 17 = " + (82 + 17));
		System.out.println("82 - 17 = " + (82 - 17));

	}

	public void SumAve3A() {

		int x, y, z;

		x = 63;
		y = 18;
		z = 52;

		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + (x + y + z) + "입니다.");
		System.out.println("평균값은 " + (x + y + z) / 3 + "입니다.");

	}

	public void SumAve3B() {
		int x, y, z;
		int sum;

		x = 63;
		y = 18;
		z = 52;

		sum = x + y + z;

		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균값은 " + sum / 3 + "입니다.");

	}
	
	public void SumAve1() {
		int x;
		int y;
		
		x=63;
		y=18;
		
		System.out.println("x값은 " + x +  "입니다.");
		System.out.println("y값은 " + y +  "입니다.");
		System.out.println("합계는 " + (x+y) +  "입니다.");
		System.out.println("평균값은 " + (x+y)/2 +  "입니다.");
		
	}
}
