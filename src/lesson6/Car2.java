package lesson6;

import lesson5.CarBrand;
import lesson5.Country;
import lesson5.Plate;

public abstract class Car2 implements Comparable<Car2> {
	private int mileage;
	private CarBrand brand;
	private Plate plate;
	private static final int MAX_KM = 320000;
	
	public Car2() {
		this.mileage = (int) genRand(0, MAX_KM);
		this.brand = genBrand();
		this.plate = genPlate(genCountry());
	}

	public abstract String getFuel();
	
	private Plate genPlate(Country country) {
		return new Plate(country);
	}
	
	private Country genCountry() {
		int rand = (int) genRand(0, 9);
		switch (rand) {
		case 0:
			return Country.ALBANIA;
		case 1:
			return Country.AUSTRIA;
		case 2:
			return Country.BOSNIA_AND_HERZEGOBINA;
		case 3:
			return Country.SPAIN;
		default:
			return Country.CZECH_REPUBLIC;
		}
	}

	private CarBrand genBrand() {
		int rand = (int) genRand(0, 9);
		switch (rand) {
		case 0:
			return CarBrand.ALPHA_ROMEO;
		case 1:
			return CarBrand.ALPHATAURI;
		case 2:
			return CarBrand.ALPINE;
		case 3:
			return CarBrand.ASTON_MARTIN;
		case 4:
			return CarBrand.FERRARI;
		case 5:
			return CarBrand.HASS;
		case 6:
			return CarBrand.MCLAREN;
		case 7:
			return CarBrand.MERCEDES;
		case 8:
			return CarBrand.RED_BULL;
		default:
			return CarBrand.WILLIAMS;
		}
	}

	/**
	 * Generates random values from min to max (both included)
	 * 
	 * @param min
	 * @param max
	 * @return random value
	 */
	private double genRand(int min, int max) {
		return Math.floor(Math.random() * (max - min + 1) + min);
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public CarBrand getBrand() {
		return brand;
	}

	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}

	public Plate getPlate() {
		return plate;
	}

	public void setPlate(Plate plate) {
		this.plate = plate;
	}

	@Override
	public int compareTo(Car2 c) {
		if (this.getMileage() < c.getMileage())
			return -1;
		if (this.getMileage() == c.getMileage())
			return 0;
		return 1;
	}
	
	@Override
	public String toString() {
		return "Car properties:\nBrand => "+getBrand()
				+",\nPlate => "+getPlate().getPlate()+"\nMileage => "
				+getMileage()+"\nFuel => "+ getFuel();
	}
}
