package practice.chapter10;

import lombok.Data;

@Data
public class ExId {
	static int counter = 0;
	static int step = 1;
	private int id;

	public ExId() {
		id = counter += step;
	}

	public static int setStep(int s) {
		step = (s >= 1) ? s : 1;
		return step;
	}

	public static int getMaxId() {
		return counter;
	}
}
