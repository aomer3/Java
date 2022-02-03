package v.collections.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMaps {
	
	public static void main(String[] args) {
		
		//HashMap overrides similar keys
		Map<Integer,String> map = new HashMap();
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
		map.put(id1, "Jack");
		map.put(id2, "John");
		System.out.println("HashMap:" + map);
		
		//IdentityHashMap preserves similar keys
		Map<Integer,String> map2 = new IdentityHashMap();
		Integer id3 = new Integer(10);
		Integer id4 = new Integer(10);
		
		map2.put(id3, "Jack");
		map2.put(id4, "John");
		System.out.println("IdentityHashMap:" + map2);
	}

}
