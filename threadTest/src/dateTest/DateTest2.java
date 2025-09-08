package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class DateTest2 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		
		System.out.println(calendar.getTime());
		System.out.println(simple.format(calendar.getTime()));
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		System.out.println(LocalDate.parse("1900년 10월 11일" , DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
	}
}
