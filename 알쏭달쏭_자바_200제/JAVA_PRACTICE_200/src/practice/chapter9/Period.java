package practice.chapter9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Period {
	private Day from;
	private Day to;

}
