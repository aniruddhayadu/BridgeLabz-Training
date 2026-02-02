package com.functionalInterfaces.dateformatutility;
import java.time.LocalDate;

public class DateFormatUtilityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate invoiceDate = LocalDate.now();
		
		String format1 = DateFormatUtil.formateDate(invoiceDate, "dd-MM-yyyy");
		String format2 = DateFormatUtil.formateDate(invoiceDate, "yyyy/MM/dd");
		String format3 = DateFormatUtil.formateDate(invoiceDate, "dd MM yyyy");
		
		System.out.println("Format 1: "+format1);
		System.out.println("Format 2: "+format2);
		System.out.println("Format 3: "+format3);
	}

}
