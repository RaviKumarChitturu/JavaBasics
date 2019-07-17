package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReturnMap {
	
	public static Map<String, String> getMyMap(){
		//Map<String,String> map = new HashMap<String,String>();
		Map<String,String> map1= new HashMap<String,String>();
	    for (int i = 0; i < 5; i++) {
	    	//Map<String,String> map1 = new HashMap<String,String>();
	    	map1.put("key"+i+"", "value"+i+"");
	    	map1.put("kesi"+i+"", "Kesiv"+i+"");
	    	map1.put("Test"+i+"", "Testv"+i+"");
	    	//System.out.println(map1);
		}
	    Map<String,String> map2= new HashMap<String,String>();
	    map2.putAll(map1);
	    System.out.println(map1);
	    return map1;
	}
	public static Map<String, String> getMyMap1(){
		//Map<String,String> map = new HashMap<String,String>();
		Map<String,String> map1= new HashMap<String,String>();
	    for (int i = 0; i < 5; i++) {
	    	//Map<String,String> map1 = new HashMap<String,String>();
	    	map1.put("key"+i+"", "value"+i+"");
	    	map1.put("key"+i+"", "value"+i+"");
	    	
		}
	   
	    return map1;
	}
	public static void main(String[] args) {
		Map<String, String> a=getMyMap();
		//System.out.println(a);
		Map<String, String> a1=getMyMap1();
		//System.out.println(a1);
		ArrayList<String> ab= new ArrayList<>(a.values()); 
		//System.out.println("1st Arry"+ab);
		ArrayList<String> cd= new ArrayList<>(a1.values()); 
		//System.out.println("2nd Arry"+cd);
		//CompareMaps.compareTwoArrayList(ab,cd);
	}

}
