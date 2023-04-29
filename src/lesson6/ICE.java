package lesson6;

public class ICE extends Car2{
	
	private ICE_Fuel_Types fuel;
	
	public ICE() {
		super();
		fuel = ICE_Fuel_Types.Gas;
	}
	
	public ICE(ICE_Fuel_Types fuel) {
		super();
		this.fuel=fuel;
	}

	@Override
	public String getFuel() {
		if(fuel!=null) return fuel.toString();
		else return "Not fuel specified";
	}
	
}
