package main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d04 = LocalDate.parse("2023-10-13");
		LocalDateTime d05 = LocalDateTime.parse("2023-10-13T01:30:26");
		Instant d06 = Instant.parse("2023-10-13T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(d04.format(fmt1));
		System.out.println(d05);
		System.out.println(d06);

		
	}

}
