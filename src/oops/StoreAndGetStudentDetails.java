package oops;

public class StoreAndGetStudentDetails {
	static final String SCHOOL = "SVIST";
	int roolNumber;
	String fullName;
	
	public StoreAndGetStudentDetails(int roolNumber, String fullName) {
		System.out.println(" parameters  Constructor");
		this.roolNumber = roolNumber;
		this.fullName = fullName;
		System.out.println(this.roolNumber +" : "+this.fullName +" : "+SCHOOL);
		System.out.println("###########################################################");
	}
	

	//Constructor used to load instance variables & user can provide values to instance variables
	/*	Constructor header 
	 * Step01: access Modifier (its optional)
	 * Step02: Constructor name must be classname
	 * Step03: based on requirement instance variables values we can pass as parameters to Constructor
	 * 
	 * body
	 * Step01: by default in 1st line super() Constructor (IS-A, has-A)
	 * Step02: instance variables values changed based on Constructor parameters 
	 */
	
	/*
	 * public StoreAndGetStudentDetails() {
	 * System.out.println(" default Constructor"); }
	 */
	
	
	
	public static void main(String[] args) {
		StoreAndGetStudentDetails student1 = new StoreAndGetStudentDetails(1, "nagarjuna");
		StoreAndGetStudentDetails student2 = new StoreAndGetStudentDetails(2, "krishan");
		StoreAndGetStudentDetails student3 = new StoreAndGetStudentDetails(3, "mahi");
		StoreAndGetStudentDetails student4 = new StoreAndGetStudentDetails(4, "lakshmi");
		StoreAndGetStudentDetails student5 = new StoreAndGetStudentDetails(5, "bhargavi");
		System.out.println(student1.roolNumber);
		System.out.println(student1.fullName);
	}
	
	
}
