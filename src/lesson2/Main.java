package lesson2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Write the number of tables´s columns: ");
		int cols = sc.nextInt();
		
		System.out.print("\nWrite the number of tables´s rows: ");
		int rows =sc.nextInt();
		
		System.out.print("\nWrite from what value should the table start: ");
		int from =sc.nextInt();
		
		System.out.println();
		MultiplicationTable m = new MultiplicationTable(rows, cols, from);
		
		System.out.println(m.getTable());
	}
}
