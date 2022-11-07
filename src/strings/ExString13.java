package strings;

public class ExString13 {
	public static void main(String[] args) {
		String ss = "transactionID; 10000a005245 snq	s qsbjiq	s 1ajnsdcjnna";
		String[] trxID = ss.split("a"); 
		for (String data : trxID) {
			System.out.println(data);
		}
		
	}
}
