package practice.chapter9;

import lombok.Data;

@Data
public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// 생성자, 체이닝..
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// 년, 월, 일 설정
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public int DayOfweek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = {"sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		return String.format("%04d year, %02d month, %02d day(%s)",year, month, date, wd[DayOfweek()]);
	}
	
}
