package lesson4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the rows of the matrixes:");
		int rows=sc.nextInt();
		
		System.out.println("Enter the cols of the matrixes:");
		int cols=sc.nextInt();
		
		int min, max;
		do{
			System.out.println("Enter the min range of the random values:");
			min=sc.nextInt();
			
			System.out.println("Enter the max range of the random values:");
			max=sc.nextInt();
			if(min>max) System.out.println("Random range not valid. Max should be greater than Min");
		}while(min>max);
		
		
		MatrixSum s =  new MatrixSum(rows, cols, max, min);
		
		System.out.println(matrixToString(s.getmA())+"\n+\n");
		
		System.out.println(matrixToString(s.getmB())+"\n=\n");
		
		try {
			System.out.println(matrixToString(s.sumMatrix()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String matrixToString(int[][] m) {
		if (m.length == 0)
			return "Matrix not inicializated";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m.length; i++) {
			sb.append("[");
			for (int j = 0; j < m[0].length; j++) {
				sb.append(m[i][j]);
				if(j!=m[0].length-1) sb.append("\t");
			}
			sb.append("]\n");
		}
		return sb.toString();
	}
}
