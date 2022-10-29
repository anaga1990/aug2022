package oops;

//HAS-I
public class ExofAddhar2 {
	String dob;
	String personName;
	Address address;
	long mobileNumber;
	String mailId;

	public ExofAddhar2(String dob, String personName, Address address, long mobileNumber, String mailId) {
		super();
		this.dob = dob;
		this.personName = personName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
	}



	public void displayAddharCreationDetails() {
		System.out.println("******************************************************************************************");
		System.out.println("personName => " + personName + ",DOB is => " + dob + ",Addrres Of Applicant => " + address.houseNumber +":"+address.crossStreet
				+":"+address.area+":"+address.city+":"+address.country+":"+address.zip
				+ ", Mob Num =>" + mobileNumber + ", mail id => " + mailId);
		
	}
	public static void main(String[] args) {
		ExofAddhar2 ex = new ExofAddhar2("19-1-1910", "nagaruna", new Address("2nd Cross", "2A", "KRPURAM", "BANG", "india", 560036), 999999, "anga@g.com");
		ex.displayAddharCreationDetails();
		
		Address address2 = new Address(null, "201", "ongole", "Ongole", "india", 523225);
		ExofAddhar2 ex2 = new ExofAddhar2("30-04-2020", "hanvik", address2, 111111, "hav@g.com");
		ex2.displayAddharCreationDetails();
	
	}
	
	

}
