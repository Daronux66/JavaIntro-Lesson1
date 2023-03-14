package lesson3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		if(length<=0) {
			System.out.println("ERROR. Length must be greater than 0");
			return;
		}
		int min, max;
		do {
			System.out.print("\nEnter the smallest posible number of the random values: ");
			min=sc.nextInt();
			System.out.print("\nEnter the biggest posible number of the random values: ");
			max = sc.nextInt();
			if(min>max) System.out.println("\nERROR. The min value has to be smaller than the max value");
		}while(min>max);
		ArraySort arrayObj = new ArraySort(length, min, max);
		System.out.println("\nGenerated array:\n"+arrayObj.printArray());
		arrayObj.dSort();
		System.out.println("Descending sort array:\n"+arrayObj.printArray());
		arrayObj.aSort();
		System.out.println("Ascending sort array:\n"+arrayObj.printArray());
	}

}
