package practice.chapter10;

import lombok.Data;

@Data
public class Id {
	static int counter = 0;
	private int id;

	public Id() {
		id = ++counter;
	}
}
