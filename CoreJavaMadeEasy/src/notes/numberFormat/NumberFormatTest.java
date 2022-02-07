package y.notes.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		
		//Formatting the number depending on the locale
		Double d = 1232322.3434;
		
		//Default locale 
		NumberFormat nf = NumberFormat.getInstance();
		
		//German locale
		NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMAN);
		
		//setting the decimal digits to 4 (instead of default 3)
		nf.setMinimumFractionDigits(4);
		
		System.out.println("US: " + nf.format(d));
		System.out.println("Germany: " + nf2.format(d));
	}

}
