package com.epam.cleartrip.suitBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbstractSuitSteps {
	
	
	
	
	public static String getCurrentdate() {
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
        return dateFormat.format(date);
 }

}