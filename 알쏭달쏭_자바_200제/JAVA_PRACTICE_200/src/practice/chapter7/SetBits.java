package practice.chapter7;

public class SetBits {

	public static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println(); // 줄바꿈을 위해 추가
	}

	// setN 메서드의 매개변수 선언 수정
	public static int setN(int x, int pos, int n) {
		return x | (~(~0 << n) << pos);
	}

	public static int resetN(int x, int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}

	public static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}
	
	
}