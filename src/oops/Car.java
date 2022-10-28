package oops;

public interface Car {
	/*
	 * car model name
	 * car color
	 * car MIN SUV, SUV
	 * car price
	 * car brand(MFR)
	 */
	
	/*
	 * 1) if you declare instance variables , it will automatically java treat as static & final
	 */
	int a = 10;
	int b = 20;
	
	/*
	 * abstract methods
	 */
	public String model();
	public String color();
	public int year();
	
	/*
	 * static methods
	 */
	public static void car_mft(String mfr) {
		System.out.println(mfr);
	}
	
	//default methods
	default String carCompanyStarted(String company_staretd_year) {
		return company_staretd_year;
	}
	
	public static void main(String[] args) {
		System.out.println("i am from car");
		//Car car = new Car(); C.E not instance/object created 
	}
	
	
	
}
