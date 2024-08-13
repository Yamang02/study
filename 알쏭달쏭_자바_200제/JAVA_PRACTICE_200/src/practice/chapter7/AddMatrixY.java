package practice.chapter7;

public class AddMatrixY {

	public int[][] addMatrix(int[][] x, int[][] y) {
		int[][] z = new int[x.length][];
		for (int i = 0; i < x.length; i++) {
			z[i] = new int[x[i].length];
			for (int j = 0; j < x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return z;
	}

}
