package lesson23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime;

public class Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		LocalDate date1 = LocalDate.now();
//		LocalDateTime date2 = LocalDate.now();
		System.out.println(date1);
//		System.out.println(date2);
		LocalDate date3=LocalDate.of(2020,06,10);
		System.out.println(date3);
		LocalDate date4=LocalDate.of(2021,Month.JUNE,18);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getMonth());
		date3.getMonthValue();
		date3.getDayOfWeek();
		date3.getDayOfWeek().getValue();
		System.out.println(date3.isLeapYear());
		System.out.println(date3.plusYears(2));
		System.out.println(date3.plusMonths(2));
		System.out.println(date3.plusDays(10));
		System.out.println(date3.plusWeeks(2));
		System.out.println(date1.isBefore(date3));
		System.out.println(date1.isAfter(date3));
		System.out.println(date1.isAfter(date1));
		System.out.println(date1.isEqual(date1));
		LocalDate date5=LocalDate.parse("2022-12-12"); // Yıl-Ay-Gün, Ayda veya günde sınırı aşarsan hata veriri
		System.out.println(date5.getDayOfYear());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String date6=LocalDate.now().format(formatter);
		System.out.println(date6);
		
		LocalDate date7 = LocalDate.parse("11/10/2022", formatter);
		System.out.println(date7);
		
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm");
//		LocalDateTime date7 = LocalDateTime.parse("15/05/2022 15:16", formatter2);
		System.out.println(date7);
		LocalDate date8 = LocalDate.now();
		LocalDate date9 = LocalDate.parse("2022-06-05");
//		long ay=date9.until(date8, ChronoUnit.Months)
	
	
	}

}
