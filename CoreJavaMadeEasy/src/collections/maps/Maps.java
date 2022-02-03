package v.collections.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	
	public static void main(String[] args) {
		
		//Arrays.asList() has similar restrictions to arrays
		//Operations that can change the array size cannot be performed
		System.out.println("Original Order:");
		List<String> listNames = Arrays.asList("John","Tom","Lee","Brad");
		List<Integer> listScores = Arrays.asList(70,60,99,80);
		
		System.out.println(listNames);
		System.out.println(listScores);
		
		//Creating a map
		Map<String, Integer> map = new HashMap();
		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Brad", 80);
		
		//Creating a map from two lists (using for loop)
		Map<String, Integer> map2 = new LinkedHashMap();
		for(int i=0; i < listNames.size(); i++) {
			map2.put(listNames.get(i), listScores.get(i));
		}
		
		//Creating a map from two lists (using foreach loop)
		Map<String, Integer> map3 = new TreeMap();
		for(String name : listNames) {
			for(Integer score: listScores) {
				map3.put(name, score);
			}
		}
		
		//Getting keys and values (Method 1)
		Set<String> names = map.keySet();
		//System.out.println("Name: " + names);
		
		Collection<Integer> scores = map.values();
		//System.out.println("Scores: " + scores);
		
		//Getting keys and values (Method 2)
		System.out.println("\nHashMap (no order):");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		//LinkedHashMap maintains insertion order
		Map<String, Integer> linkedmap = new LinkedHashMap(map);
		System.out.println("\nLinkedHashMap (insertion order):");
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		//LinkedHashMap maintains sorted order
		Map<String, Integer> treemap = new TreeMap(map);
		System.out.println("\nTreeMap (sorted order):");
		for (Map.Entry<String, Integer> entry : map3.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
	}

}
