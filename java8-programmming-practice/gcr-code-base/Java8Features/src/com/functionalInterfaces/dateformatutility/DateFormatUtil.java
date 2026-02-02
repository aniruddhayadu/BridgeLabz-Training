package com.functionalInterfaces.dateformatutility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtil {
	static String formateDate(LocalDate date, String pattern) throws IllegalArgumentException {
		if(date == null || pattern == null) {
			throw new IllegalArgumentException("Date and pattern are null");
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return date.format(formatter);
	}
}
