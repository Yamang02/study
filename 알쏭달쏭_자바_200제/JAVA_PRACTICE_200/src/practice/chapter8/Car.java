package practice.chapter8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;

	public Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc) {

		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;

		this.x = y = 0.0;

	}

	public void putSpec() {
		System.out.println(this.toString());
	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		double f = dist / sfc;

		if (f > fuel)
			return false;
		else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}

	}

	void refuel(double df) {
		if (df > 0) {
			fuel += df;
			if (fuel > tankage) {
				fuel = tankage;
			}
		}
	}

}
