package oops;

public class ExofAddhar {
	String dob;
	String personName;
	String address;
	long mobileNumber;
	String mailId;

	public ExofAddhar(String dob, String personName, String address, long mobileNumber, String mailId) {
		super();
		this.dob = dob;
		this.personName = personName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
	}

	public void displayAddharCreationDetails() {
		System.out.println(dob);
		System.out.println(personName);
		System.out.println(address);
		System.out.println(mobileNumber);
		System.out.println(mailId);
	}

	public void displayAddharCreationDetailsPattern() {
		System.out.println("******************************************************************************************");
		System.out.println("personName => " + personName + ",DOB is => " + dob + ",Addrres Of Applicant => " + address
				+ ", Mob Num =>" + mobileNumber + ", mail id => " + mailId);
		
	}
	
	public static void main(String[] args) {
		ExofAddhar ex = new ExofAddhar("12-April-2000", "nagarjuna", "1st corss,krpuram,560036", 123456, "ashbs@g.com");
		ExofAddhar ex1 = new ExofAddhar("15-May-2001", "lakshmi", "room No:22#,1st cross, reddigari bazar, mangamuru,AP, india", 99999, "asjkscbc@g.com");
		
		ex.displayAddharCreationDetails();
		ex.displayAddharCreationDetailsPattern();
		ex1.displayAddharCreationDetails();
		ex1.displayAddharCreationDetailsPattern();
	}

}
