package collections;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo2 {
	
	public static void main(String[] args) {
		
		
		 Map<String, String> map = new HashMap<String, String>();
		 String a="a";
		 String b="b";
		 String c="c";
		    map.put(a, "value1");
		    map.put(b, "value2");
		    map.put(c, "value3");

		    System.out.println(map.values());

	}

	

}
