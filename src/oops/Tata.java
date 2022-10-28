package oops;

public class Tata implements Car{

	public String model() {
		return "nexon";
	}

	public String color() {
		return "red";
	}

	public int year() {
		return 2022;
	}
	public static void main(String[] args) {
		Tata tata = new Tata();
		System.out.println(tata.model());
		System.out.println(tata.year());
		System.out.println(tata.color());
		System.out.println(tata.carCompanyStarted("2020"));
		Car.car_mft("TATA");
	}
	// interface to class = "implements"
}
