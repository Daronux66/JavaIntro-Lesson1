package lesson4;

public class MatrixSum {
	private int[][] mA;
	private int[][] mB;

	public MatrixSum(int[][] ma, int[][] mb) {
		this.mA = ma;
		this.mB = mb;
	}

	public MatrixSum(int rows, int cols, int max, int min) {
		this.mA = new int[rows][cols];
		this.mB = new int[rows][cols];
		this.fillMatrix(this.mA, max, min);
		this.fillMatrix(this.mB, max, min);
	}

	private void fillMatrix(int[][] matrix, int max, int min) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) genRand(max, min);
			}
		}
	}
	
	public int[][] sumMatrix() throws Exception{
		if(this.mA.length!=this.mB.length ||
				this.mA[0].length!=this.mB[0].length) {
			throw new Exception("Error. To be able to add matrix. "
					+ "They need to have the same dimensions.");
		}
		int sum[][] = new int [this.mA.length][this.mA[0].length];
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j] = this.mA[i][j] + this.mB[i][j];
			}
		}
		return sum;
	}

	private double genRand(int max, int min) {
		return Math.floor(Math.random() * (max - min + 1) + min);
	}

	public int[][] getmA() {
		return mA;
	}

	public void setmA(int[][] mA) {
		this.mA = mA;
	}

	public int[][] getmB() {
		return mB;
	}

	public void setmB(int[][] mB) {
		this.mB = mB;
	}
}
