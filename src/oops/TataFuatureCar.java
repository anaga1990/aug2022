package oops;


public abstract class TataFuatureCar implements TataCarGroup{
	/*
	 * 1)  you declare instance variables in abstract class
	 */
	int a = 10;
	int b = 20;
	
	@Override
	public String model() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int year() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void testOne() {
		
	}
	
	public void testTwo() {
		
	}
	
	public String carCompanyStarted(String company_staretd_year) {
		return company_staretd_year;
	}
	
	// created static, instance methods but not Default methods
	// object creation not possible
	public static void main(String[] args) {
		//TataFuatureCar tt = new TataFuatureCar();
	}
	
	
}
