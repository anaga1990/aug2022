package date.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetDateS2 {
	public static void main(String[] args) {
		
		//17-Nov-2022 => d-MMM-Y
		//17/Nov/2022 => d/MMM/Y
		LocalDate date = LocalDate.now();
		date = date.plusMonths(10);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d/MMM/Y");
		String today = date.format(formatDate);
		System.out.println(today);
	}
}
