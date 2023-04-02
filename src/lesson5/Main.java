package lesson5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows of the garage:");
		int rows = sc.nextInt();
		System.out.println("Enter the cols of the garage:");
		int cols = sc.nextInt();
		Garage g = new Garage(rows, cols);

		System.out.println("*** GENERATED GARAGE ***");
		System.out.println("DISPLAY MILEAGES:");
		System.out.println(g.displayMileAges());
		System.out.println("DISPLAY PLATES:");
		System.out.println(g.displayPlates());

		g.sortGarage();

		System.out.println("*** SORTED GARAGE ***");
		System.out.println("DISPLAY MILEAGES:");
		System.out.println(g.displayMileAges());
		System.out.println("DISPLAY PALTES:");
		System.out.println(g.displayPlates());
	}
}
