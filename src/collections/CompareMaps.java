package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class CompareMaps {
	public static void main(String[] a) throws Exception {
	    Map<String,String> map = new HashMap<String,String>();
	    //Map<String,String> map1 = new HashMap<String,String>();
	    Map<String,String> map1 = new HashMap<String,String>();
	    for (int i = 0; i < 5; i++) {
	    	
	    	map1.put("key"+i+"", "value"+i+"");
	    	map1.put("key"+i+"", "value"+i+"");
	    	map.putAll(map1);
		}
	    System.out.println("1"+map);
	    map.putAll(map1);
	   /* map.put("key1", "value1");
	    map.put("key2", "value2");
	    map.put("key3", "value3");*/
	    //map.putAll(map1);
	    System.out.println("2"+map1);
	    //System.out.print(map);
	    Map<String,String> map2 = new HashMap<String,String>();
	    map2.put("key1", "value1");
	    map2.put("key2", "value2");
	    map2.put("key3", "value4");
	    //map2.put("key4", "value4");
	    
	  //  ArrayList<String> ab= new ArrayList<>(map.values()); 
	    ArrayList<String> cd= new ArrayList<>(map2.values()); 
	   
	   // getUmatchedInArrayComparision(ab,cd);
	    //compareTwoArrayList(ab,cd);
	}
	
	
	public static boolean compareTwoArrayList(ArrayList<String> actuallist, ArrayList<String> expectedlist){
		boolean status=false;
		for(Iterator<String> itr=expectedlist.iterator(); itr.hasNext();){
			String elem=itr.next();
			if(actuallist.remove(elem)){
				itr.remove();
			}
		}
		if(actuallist.isEmpty() && expectedlist.isEmpty()){
			status= true;
		}
		else{		
			System.out.println("Unmatched Documents from Actual Data:"+actuallist.size());
			System.out.println("Unmatched Documents from Actual Data:"+actuallist);
			System.out.println("Unmatched Documents from Expected Data: "+expectedlist.size());
			System.out.println("Unmatched Documents from Expected Data: "+expectedlist);
			status=false;
		}
		return status;
	}
	
	public static ArrayList<String> getUmatchedInArrayComparision(ArrayList<String> array1, ArrayList<String> array2) throws Exception
	{
		ArrayList<String> UnmatchedArray = new ArrayList<String>();
		if(array1!=null && array2!=null &&array1.size()>0&&array2.size()>0 && array1.size()==array2.size()){
			for(int i=0;i<array1.size();i++)
			{
				if(!((array1.get(i)).contentEquals(array2.get(i))))
					UnmatchedArray.add(array1.get(i));
				
			}
		}
		else{
			throw new Exception("Arrya Sizes are not matched");
		}
		System.out.println("The unmatched array elements are "+UnmatchedArray);
		return UnmatchedArray;			
	}
}
