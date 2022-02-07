package y.notes.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatAssignment {
	
	public static void main(String[] args) {
		
		Long l = 457836985L;
		
		NumberFormat localeUS = NumberFormat.getInstance(Locale.US);
		NumberFormat localeUK = NumberFormat.getInstance(Locale.UK);
		
		System.out.println("US: " + localeUS.format(l));
		System.out.println("UK: " + localeUK.format(l));
		
	}

}
