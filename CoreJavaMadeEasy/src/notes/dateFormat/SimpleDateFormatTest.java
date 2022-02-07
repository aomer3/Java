package y.notes.dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat is useful for converting one date format to another
public class SimpleDateFormatTest {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		//Converting String to Date
		String dateString = "10-12-2014";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = sdf1.parse(dateString);
		System.out.println(date1);
		
		
		
	}

}
