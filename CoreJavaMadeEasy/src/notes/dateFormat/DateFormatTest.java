package y.notes.dateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	
	public static void main(String[] args) {
		
		//Get current date and time
		Date d = new Date();
		
		//Set to another locale
		DateFormat usdf = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukdf = DateFormat.getDateInstance(0, Locale.UK);
		
		System.out.println("Date in US fomat: " + usdf.format(d));
		System.out.println("Date in UK fomat: " + ukdf.format(d));
		
		//getTimeInstance can take values from 0(full)-3(least amount of time info)
		DateFormat timeInstance = DateFormat.getTimeInstance(3);
		System.out.println(timeInstance.format(d));
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0,0);
		System.out.println(dateTimeInstance.format(d));
	}

}
