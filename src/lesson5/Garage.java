package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Garage {
	private Car[][] garage;

	public Garage(int rows, int cols) {
		fillGarage(rows, cols);
	}

	private void fillGarage(int rows, int cols) {
		this.garage = new Car[rows][cols];
		for (int i = 0; i < this.garage.length; i++) {
			for (int j = 0; j < this.garage[0].length; j++) {
				this.garage[i][j] = new Car();
			}
		}
	}

	public void sortGarage() {
		Car[] aux = new Car[this.garage.length*this.garage[0].length];
		int controller=0;
		for (int i = 0; i < this.garage.length; i++) {
			for (int j = 0; j < this.garage[0].length; j++) {
				aux[controller] = this.garage[i][j];
				controller++;
			}
		}
		
		Arrays.sort(aux);
		
		controller=0;
		for (int i = 0; i < this.garage.length; i++) {
			for (int j = 0; j < this.garage[0].length; j++) {
				this.garage[i][j]= aux[controller];
				controller++;
			}
		}
	}

	public String displayMileAges() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < this.garage.length; i++) {
			for (int j = 0; j < this.garage[0].length; j++) {
				sb.append(this.garage[i][j].getMileage() + "   |   ");
			}
			sb.deleteCharAt(sb.lastIndexOf("|"));
			sb.append("\n\n");
		}
		return sb.toString();
	}

	public String displayPlates() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < this.garage.length; i++) {
			for (int j = 0; j < this.garage[0].length; j++) {
				sb.append(this.garage[i][j].getPlate().getPlate() + "   |   ");
			}
			sb.deleteCharAt(sb.lastIndexOf("|"));
			sb.append("\n\n");
		}
		return sb.toString();
	}
}
