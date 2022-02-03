package v.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		
		//Arrays are strict and allow for one data type
		String[] arr = new String[3];
		
		List listA = new ArrayList();		
		listA.add(5);
		listA.add(true);
		listA.add("red");
		
		//Generics brings this strictness to collections
		List<String> listB = new ArrayList();
		
		//ListB will only hold Strings
		listB.add("blue"); //can't add number

		
		
	}

}
