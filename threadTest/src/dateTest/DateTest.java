package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(date);
		System.out.println(simple.format(date));
		
		try {
			System.out.println(simple.parseObject("2025년 09월 08일"));
		} catch (ParseException e) {;}
		
		
	}
}
