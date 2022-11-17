package date.util;

import java.time.LocalDate;

public class GetDateS {
	public static void main(String[] args) {
		//Fri Nov 25 2022
		//Thu Nov 17 2022
		//17-Nov-2022
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(1400));
		System.out.println("yesterDay =>"+date.minusDays(1));
		System.out.println("Tomorrow =>"+date.plusDays(1));
		System.out.println("after one Week =>"+date.plusDays(7));
		
	}
}
