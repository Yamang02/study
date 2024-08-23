package practice.chapter9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinate {
	private double x;
	private double y;

	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
