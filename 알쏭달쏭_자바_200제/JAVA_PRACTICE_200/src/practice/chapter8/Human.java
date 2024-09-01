package practice.chapter8;

import lombok.AllArgsConstructor;
import lombok.Data;
import practice.chapter9.Day;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@AllArgsConstructor
public class Human {
	private static int counter = 0;
	private String name;
	private int height;
	private int weight;
	// private Day birthday;
	private int id;

	// constructor
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

		id = ++counter;
	}

	public void gainWeight(int w) {
		this.weight += w;
	}

	public void reduceWeight(int w) {
		this.weight -= w;
	}

}
