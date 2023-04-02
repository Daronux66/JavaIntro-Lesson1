package lesson5;

public class Plate {
	private String plate;

	public Plate(Country country) {
		this.plate = genPlate(genFormat(country));
	}

	private String genPlate(String format) {
		StringBuffer sb = new StringBuffer();
		char[] aux = format.toCharArray();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] == '0')
				sb.append(genNumber());
			else if (aux[i] == 'X')
				sb.append(genChar());
			else
				sb.append(aux[i]);
		}
		return sb.toString();
	}

	private char genChar() {
		return (char) genRand(65, 90);
	}

	private int genNumber() {
		return (int)genRand(0, 9);
	}

	private String genFormat(Country country) {
		switch (country) {
		case SPAIN:
			return "0000 XXX";
		case CZECH_REPUBLIC:
			return "0XX 0000";
		case ALBANIA:
			return "XX 000XX";
		case AUSTRIA:
			return "X 000XX";
		case BOSNIA_AND_HERZEGOBINA:
			return "000-X-000";
		default:
			throw new IllegalArgumentException("Unexpected value: " + country);
		}
	}
	
	/**
	 * Generates random values from min to max (both included)
	 * @param min
	 * @param max
	 * @return random value
	 */
	private double genRand(int min, int max) {
		return Math.floor(Math.random() * (max - min + 1) + min);
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	
}
