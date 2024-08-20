package practice.chapter8;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@AllArgsConstructor
public class Human {
	public String name;
	public int height;
	public int weight;

	public void gainWeight(int w) {
		this.weight += w;
	}

	public void reduceWeight(int w) {
		this.weight -= w;
	}

}
