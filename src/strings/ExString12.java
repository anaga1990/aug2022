package strings;

public class ExString12 {
	public static void main(String[] args) {
		String ss = "transactionID: 10000005245";
		
		String[] trxID = ss.split(" "); // part-1:"transactionID:"  part-2:"10000005245"
		//System.out.println(trxID[0]);		
		System.out.println(trxID[1]);
		String actucal_TRX_id = trxID[1];
		
	}
}
