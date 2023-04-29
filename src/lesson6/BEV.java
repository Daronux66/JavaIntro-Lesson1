package lesson6;

public class BEV extends Car2{

	private BEV_Fuel_Types fuel;
	
	public BEV() {
		super();
		fuel = BEV_Fuel_Types.Battery_power;
	}
	
	public BEV(BEV_Fuel_Types fuel) {
		super();
		this.fuel=fuel;
	}
	
	@Override
	public String getFuel() {
		if(fuel!=null) return fuel.toString();
		else return "Not fuel specified";
	}
}
