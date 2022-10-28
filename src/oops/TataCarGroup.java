package oops;

public interface TataCarGroup extends Car{
	//interface to interface = extends
	// TataCarGroup inherit from Car = extends Car 
	
	public void yearely_car_maintainee_Min_Fee();
	
	default void yearely_car_maintainee_MAX_Fee() {
		System.out.println("5000/- Rs");
	}
	
	
}
