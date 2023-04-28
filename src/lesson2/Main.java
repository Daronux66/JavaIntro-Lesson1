package lesson2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("This program will create a multiplication table of two ranges given by the user.");
		
		System.out.print("Write the min value of range 1: ");
		int r1Down = sc.nextInt();
		
		System.out.print("Write the max value of range 1: ");
		int r1Up = sc.nextInt();

		System.out.print("Write the min value of range 2: ");
		int r2Down = sc.nextInt();
		
		System.out.print("Write the max value of range 2: ");
		int r2Up = sc.nextInt();
		
		System.out.println();
		MultiplicationTable m = new MultiplicationTable(r1Down, r1Up, r2Down, r2Up);
		
		System.out.println(m.toString());
	}
}
