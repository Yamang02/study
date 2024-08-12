package practice.chapter7;

public class AddMatrix {
	public boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if (x.length != y.length || y.length != z.length) {
			return false;
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i].length != y[i].length || y[i].length != z[i].length) {
				return false;
			}
		}

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		return true;
		// 유효성 검사 부분을 로직 부분과 분리하는 게 맞지 않나...
	}
	
}
