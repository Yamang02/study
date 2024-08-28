package practice.chapter9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
	private String name;
	private String no;
	private long balance;
	private Day openDay;

	public Day getOpenDay() {
		return new Day(openDay);
	}

	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}
}
