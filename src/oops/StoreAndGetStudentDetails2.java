package oops;

public class StoreAndGetStudentDetails2 {
	static final String SCHOOL = "SVIST";
	int roolNumber;
	String fullName;
	
	public StoreAndGetStudentDetails2(String fullName) {
		this.fullName = fullName;
		this.roolNumber = this.roolNumber+1;
		//System.out.println(this.roolNumber +" : "+this.fullName +" : "+SCHOOL);
		//System.out.println("###########################################################");
		getStudentDetails();
	}
	
	public StoreAndGetStudentDetails2(int roolNumber) {
		super();
		this.roolNumber = roolNumber;
	}
	
	public StoreAndGetStudentDetails2(int roolNumber, String fullName) {
		super();
		this.roolNumber = roolNumber;
		this.fullName = fullName;
	}

	public void getStudentDetails() {
		System.out.println(this.roolNumber +" : "+this.fullName +" : "+SCHOOL);
	}

	public static void main(String[] args) {
		StoreAndGetStudentDetails2 student1 = new StoreAndGetStudentDetails2("nagarjuna");
		student1.fullName = "amnagha";
		student1.roolNumber = 2323;
		System.out.println(student1.roolNumber +" : "+student1.fullName +" : "+SCHOOL);
		StoreAndGetStudentDetails2 student2 = new StoreAndGetStudentDetails2("krishan");
		StoreAndGetStudentDetails2 student3 = new StoreAndGetStudentDetails2("mahi");
		StoreAndGetStudentDetails2 student4 = new StoreAndGetStudentDetails2("lakshmi");
		StoreAndGetStudentDetails2 student5 = new StoreAndGetStudentDetails2("bhargavi");
		System.out.println(student1.roolNumber);
		System.out.println(student1.fullName);
	}
	
	
}
