package practice.chapter9;

@data
public class Coordinate2 {
	private double x = 0.0;
	private double y = 0.0;

	public Coordinate2() {
	};

	public Coordinate2(double x, double y) {
		set(x, y);
	}

	public Coordinate2(Coordinate2 c) {
		this(c.x, c.y);
	}

	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean equalTo(Coordinate2 c) {
		return x == c.x && y == c.y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
