package practice.chapter10;

import java.util.GregorianCalendar;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.util.GregorianCalendar.*;

@Data
public class Point2D {
	private static int counter = 0; // 몇 번까지 식별 번호를 부여했는가?
	private static int day; // 오늘 날짜

	private int x = 0; // X좌표
	private int y = 0; // Y좌표

	// 클래스 초기화 블록
	static {
		GregorianCalendar today = new GregorianCalendar();
		day = today.get(DATE);
	}

	// 인스턴스 초기화 블록
	{
		if (++counter == day) {
			System.out.print("당첨");
			System.out.printf("오늘 %d개의 좌표가 생성되었습니다.\n", counter);
		}
	}

	// 생성자
	public Point2D() {
	}

	public Point2D(int x) {
		this.x = x;
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 마지막에 부여한 식별 번호
	public static int getCounter() {
		return counter;
	}
}
