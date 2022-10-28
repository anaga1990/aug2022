package oops;

public class TataSuv implements TataCarGroup{

	@Override
	public String model() {
		System.out.println("Nexon");
		return "Nexon";
	}

	@Override
	public String color() {
		System.out.println("red");
		return "Red";
	}

	@Override
	public int year() {
		System.out.println("2022");
		return 2022;
	}

	@Override
	public void yearely_car_maintainee_Min_Fee() {
		System.out.println("min fee for car service is 3000");
	}
	
	public static void main(String[] args) {
		TataSuv suv = new TataSuv();
		System.out.println(suv.carCompanyStarted("2000"));
		suv.yearely_car_maintainee_MAX_Fee();
		suv.year();
	}

	

}
