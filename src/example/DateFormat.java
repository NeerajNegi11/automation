package example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date =  LocalDate.now();
		Random num  = new Random ();
		int num1 = num.nextInt(1,90);
		System.out.println(date);
		System.out.println(num1);
		
		LocalTime date1 = LocalTime.now();
        System.out.println(date1);
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        
        Date date3 = new Date();
        SimpleDateFormat time1 = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
        String str = time1.format(date3);
        System.out.println(str);
        
        
	}

}
