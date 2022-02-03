package v.collections.maps;

import java.util.TreeMap;

public class TreeMaps {
	
	public static void main(String[] args) {
		
		TreeMap<String, String> fruits = new TreeMap();
		fruits.put("orange", "orange");
		fruits.put("banana", "yellow");
		fruits.put("apple", "red");
		fruits.put("pear", "green");
		fruits.put("grapes", "purple");
		fruits.put("blueberries", "blue");
		
		System.out.println("original: " + fruits);
		//1.floorKey() = returns highest element in the map, which is lower than or equal to the value passed in	
		System.out.println("floor: " + fruits.floorKey("grapes"));
		//2.lowerKey() = returns highest element in the map, which is lower than the value passed in
		System.out.println("lower: " + fruits.lowerKey("grapes"));
		//3.ceilingKey() = returns lowest element in the map, which is higher than or equal to the value passed in	
		System.out.println("ceiling: " + fruits.ceilingKey("orange"));
		//4.higherKey() = returns lowest element in the map, which is higher than the value passed in	
		System.out.println("higher: " + fruits.higherKey("orange"));
		//5.pollFirstEntry() = returns and removes the first element in the map
		System.out.println("pollFirst: " + fruits.pollFirstEntry());
		//6.pollLastEntry() = returns and removes the last element in the map
		System.out.println("pollLast: " + fruits.pollLastEntry());
		//7.descendingMap() = returns the map in reverse order
		System.out.println("descending:" + fruits.descendingMap());
		
	}

}
