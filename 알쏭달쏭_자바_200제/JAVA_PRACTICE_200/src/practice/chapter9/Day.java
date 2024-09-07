package practice.chapter9;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import lombok.Data;

@Data
public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;
	// 각 월의 일수
	private static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};

	// 생성자, 체이닝..
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(YEAR);
		this.month = today.get(MONTH) + 1;
		this.date = today.get(DATE);
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = adjustedMonth(month);
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date = adjustedDay(year, this.month, date);
	}

	// 날짜 복사해서 생성
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	// 필드에 세터 메소드들 Adjusted 메소드 이용하며 변경...(생략)

	// 년, 월, 일 설정
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// 요일 구하기
	public int DayOfweek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 윤년 판단
	public static boolean isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
	}

	public boolean isLeap() {
		return isLeap(this.year);
	}

	// y년 m월의 일수(28/29/30/31)
	private static int dayOfMonth(int y, int m) {
		return mdays[isLeap(y) ? 1 : 0][m - 1];
	}

	// 조정된 m월 (1~12 범위 외의 값을 조정)
	private static int adjustedMonth(int m) {
		return m < 1 ? 1 : m > 12 ? 12 : m;
	}

	// 조정된 y년 m월의 d일 (1~28/29/30/31 범위 외의 값을 조정)
	private static int adjustedDay(int y, int m, int d) {
		if (d < 1) {
			return 1;
		}
		int dMax = dayOfMonth(y, m);
		return d > dMax ? dMax : d;
	}

	// 동일 여부 판단
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// 연내 경과 일수 계산
	public int dayOfYear() {
		int days = date;
		for (int i = 1; i < month; i++)
			days += dayOfMonth(year, i);
		return days;
	}

	// 연내 잔여 일수
	public int leftDayOfYear() {
		return 365 + (isLeap(year) ? 1 : 0) - dayOfYear();
	}

	// 날짜 d 와의 전후 관계
	public int compareTo(Day d) {
		return compare(this, d);
	}

	private int compare(Day d1, Day d2) {
		if (d1.year > d2.year)
			return 1;
		if (d1.year < d2.year)
			return -1;

		if (d1.month > d2.month)
			return 1;
		if (d1.month < d2.month)
			return -1;

		return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;
	}

	public String toString() {
		String[] wd = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		return String.format("%04d year, %02d month, %02d day(%s)", year, month, date, wd[DayOfweek()]);
	}

	// 날짜 하루 뒤로 변경
	public void succeed() {
		if (date < dayOfMonth(year, month))
			date++;
		else {
			if (++month > 12) {
				year++;
				month = 1;
			}
			date = 1;
		}
	}

	// 하루 뒤 날짜를 반환
	public Day suceedingDay() {
		Day temp = new Day(this);
		temp.succeed();
		return temp;
	}

	// 날짜를 하루 앞으로 변경
	public void precede() {
		if (date > 1) {
			date--;
		} else {
			if (--month < 1) {
				year--;
				month = 12;
			}
		}
		date = dayOfMonth(year, month);
	}

	// 하루 앞 날짜를 반환
	public Day precedingDay() {
		Day temp = new Day(this);
		temp.precede();
		return temp;
	}

	// 날짜를 n일 뒤로 변경
	public void succeedDays(int n) {
		if (n < 0) {
			precedeDays(-n);
		} else if (n > 0) {
			date += n;
			while (date > dayOfMonth(year, month)) {
				date -= dayOfMonth(year, month);
				if (++month > 12) {
					year++;
					month = 1;
				}
			}
		}
	}

	// n일 뒤의 날짜를 반환
	public Day after(int n) {
		Day temp = new Day(this);
		temp.succeedDays(n);
		return temp;
	}

	// 날짜를 n일 앞으로 변경
	public void precedeDays(int n) {
		if (n < 0)
			succeedDays(-n);
		else if (n > 0) {
			date -= n;
			while (date < 1) {
				if (--month < 1) {
					year--;
					month = 12;
				}
				date += dayOfMonth(year, month);
			}
		}
	}

	public Day before(int n) {
		Day temp = new Day(this);
		temp.precedeDays(n);
		return temp;
	}

}
