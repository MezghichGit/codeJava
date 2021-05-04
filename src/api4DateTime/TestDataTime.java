package api4DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestDataTime {

	
	public static void main(String[] args) {
	
	  //1-creation des dates et times
      /*
	  LocalDate d = LocalDate.now();
      System.out.println(d);
      
      LocalTime t = LocalTime.now();
      System.out.println(t);
      
      
      LocalDateTime dt = LocalDateTime.of(d,t);
      System.out.println(dt);
      
      //LocalDate anniv = LocalDate.of(1985, 7, 10);
      LocalDateTime anniv = LocalDateTime.of(1985, Month.JULY, 10, 10,15,20);
      System.out.println(anniv);
      */
		
    //2-Manipulation des dates et times
		/*
		LocalDate d = LocalDate.now();
	     System.out.println(d);
	     
	     //d.plusDays(2);
	     // d = d.plusDays(2);
	     d = d.plusYears(1);
	     //d = d.minusDays(6);
	     
	     System.out.println(d);
	     */
		
	    // 3-formatting
		
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		LocalDate d = LocalDate.now();
		
		System.out.println(d.format(fs));
		System.out.println(d.format(fm));
		System.out.println(d.format(fl));
		System.out.println(d.format(ff));
	}

}
