package date.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class GetDateTimeEx {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);//2022-11-17T20:46:28.977699500
		//2022/11/17T20-46-28.977
		//DateTimeFormatter fr = DateTimeFormatter.ofPattern("Y/MM/d'T'HH-mm-s.SSS");
		DateTimeFormatter fr = DateTimeFormatter.ofPattern("YYYY-MM-d'T'HH:mm:s.Z");
		String dateAndTime=localDateTime.format(fr);
		System.out.println(dateAndTime);
	}
}
