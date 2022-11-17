package date.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetDateS3 {
	public static void main(String[] args) {
		//Fri Nov 25 2022
		//Thu Nov 17 2022
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("EEE MMM d YYYY");
		String today = date.format(formatDate);
		System.out.println(today);
		date = date.plusDays(8);
		String nextWeek = date.format(formatDate);
		System.out.println(nextWeek);
	}
}
