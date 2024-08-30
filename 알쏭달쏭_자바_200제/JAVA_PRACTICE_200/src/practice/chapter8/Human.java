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
	private String name;
	private int height;
	private int weight;
	private Day birthday;


	public void gainWeight(int w) {
		this.weight += w;
	}

	public void reduceWeight(int w) {
		this.weight -= w;
	}

}
