package strings;

public class ExString19 {
	public static void main(String[] args) {
		char[] ch = new char[] {'j','a','v','a', ' ','i','s',' ','g','o','o','d'};
		String tmp=String.copyValueOf(ch);//java is good
		System.out.println(tmp);
		System.out.println("*******************************");
		System.out.println(String.copyValueOf(ch, 5, 4));
		System.out.println("-------------------------------");
		String address="127";
		String address1="0";
		String address2="0";
		String address3="1"; //127.0.0.1
		System.out.println(String.join(".", address, address1, address2, address3));
		
		String date="07";
		String date1="11";
		String date2="2022";
		System.out.println(String.join("-", date2, date1, date));
		
	}
}
