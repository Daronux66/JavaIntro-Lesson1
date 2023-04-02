package lesson5;

public class Main {
	public static void main(String[] args) {
		Garage g = new Garage(5, 4);
		
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
