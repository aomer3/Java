package y.notes.internationalization;

import java.util.Locale;

public class LocalTest {
	
	public static void main(String[] args) {
		
		//Getting local information
		Locale l = Locale.getDefault();
		//System.out.println(l.getCountry() + " " + l.getLanguage());
		System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
		
		//Changing locales
		Locale.setDefault(Locale.UK);
		Locale l2 = Locale.getDefault();
		System.out.println(l2.getDisplayCountry() + " " + l2.getDisplayLanguage());
		
		//Get all countries
		String[] isoCountries = Locale.getISOCountries();
		for (String country : isoCountries) {
			System.out.print(country + " ");
		}
		System.out.println();
		
		//Get all languages 
		String[] isoLanguages = Locale.getISOLanguages();
		for (String language : isoLanguages) {
			System.out.print(language + " ");
		}
	}

}
