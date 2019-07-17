package myPractice;
/*
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Practice{
	public static void main(String[] args)
	{ TreeMap h = new TreeMap();
	h.put(111,"ratan");
	h.put(222,"anu");
	h.put(333,"aaa");
	h.put(444,"aaa");
	System.out.println(h);
	Map m = h.subMap(222,444);
	System.out.println(m);
	System.out.println(h.firstEntry());
	System.out.println(h.lastEntry());
	System.out.println(h.firstKey());
	System.out.println(h.lastKey());
	System.out.println(h.lowerKey(222));
	System.out.println(h.higherKey(222));
	SortedMap s1 = h.headMap(333);
	System.out.println(s1);
	TreeMap t1 = new TreeMap(s1);
	System.out.println(t1);
	SortedMap s2 = h.tailMap(333);
	TreeMap t2 = new TreeMap(s2);

	System.out.println(t2);
	}
}

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Practice{
	public static void main(String[] args)
	{ TreeMap<String,String> tmain = new TreeMap<String,String>();
	tmain.put("ratan","no1");
	tmain.put("anu","no2");
	TreeMap<String,String> tsub = new TreeMap<String,String>();
	tsub.putAll(tmain);
	tsub.put("x","no3");
	tsub.put("y","no4");
	System.out.println(tsub);
	if (tmain.containsKey("ratan"))
	{System.out.println("ratan is great");
	}
	if (tsub.containsValue("no1"))
	{System.out.println("no1 ratan only");
	}
	//printing all the keys
	Set<String> s = tsub.keySet();
	for (String ss : s)
	{ System.out.println(ss);
	}
	//printing all the values
	Collection<String> s1 = tsub.values();
	for (String ss1 : s1)
	{ System.out.println(ss1);
	}
	Set<Entry<String,String>> s2 = tsub.entrySet();
	for (Entry<String,String> ss2 : s2)
	{ System.out.println(ss2);
	}
	tsub.clear();
	System.out.println(tsub);
	}
}















import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Practice{
	void m1(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		System.out.println(a1);
		a1.set(1, "Raja");
		System.out.println(a1);
		a1.set(0, "Amruth");
				System.out.println(a1);
				a1.remove(0);
				System.out.println(a1);
	}
	public static void main(String[] args){
		Practice p=new Practice();
		p.m1();
	}
	
}






public class Practice{

	public ArrayList<String>  printduplicatevalues() 
	{
		 ArrayList<Integer> a1= new ArrayList<Integer>();
		 a1.add(1);
		 a1.add(2);
		 a1.add(1);
		 a1.add(3);
		 a1.add(1);
		 a1.add(3);
		 a1.add(4);
		 a1.add(4);
		 a1.add(4);
		 a1.add(1);
		 a1.add(3);
		 a1.add(1);

		 System.out.println("All valules of A1:"+ a1);
		 HashSet<Integer> hs=new HashSet<>();
		 HashSet<Integer> duplicates= new HashSet<>();
		 for (Integer i:a1){

			 if(hs.add(i)){
				 duplicates.add(i);
			 }
		 }
		 System.out.println("Duplicate values are  valules of A1"+ duplicates);
		return null;
	}

public static void  main(String[] args) {
	Practice p=new Practice();
	p.printduplicatevalues();


}
}
import java.util.Set;





public class Practice{
	public static void main(String args[]){  
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  al.add("Ajay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add("Ravi");  
		  al.add("Ravi");  
		  al.add("Ravi");  
		  for (int i = 0; i < al.size(); i++)
		   { 
			   for (int j = i + 1 ; j < al.size(); j++) 
			   {
				   if (al[i].equals(names[j]))
				   { // got the duplicate element } } }
			   }
		   }


		  }  
		 }  

	}

public class Practice {
	public HashSet<String> dupli(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Java");
		names.add("JeeScript");
		names.add("Python");
		names.add("C");
		names.add("Ruby");
		names.add("Java");



		HashSet<String> hs=new HashSet<>();
		HashSet<String> duplicates= new HashSet<>();
		for (String i:names){
			if(hs.add(i)){
				duplicates.add(i);
			}
			else{
				System.out.println("duplicate: "+duplicates.add(i));
				duplicates.add(i);
			}
		}
		return duplicates;
	}
	public static void main(String args[]) {

		//Practice pr =new Practice();
		//HashSet<String> aa=pr.dupli();
		//System.out.println(aa);

		ArrayList<String> names = new ArrayList<String>();
		names.add("Java");
		names.add("JeeScript");
		names.add("Python");
		names.add("C");
		names.add("Ruby");
		names.add("Ruby");
		names.add("Java");
		names.add("Java");
		names.add("Ruby");
		names.add("Java");
		names.add("Java");
		names.add("C");
		names.add("Java");
		names.add("Python");


		for (int i = 0; i <=names.size(); i++) {
			for (int j = i +1; j < names.size(); j++) {
				if (names.get(i).equals(names.get(j)) ) {				
					System.out.println("Duplicate values are: "+names.get(j));
				}
			}
		}

		Set<String> store = new HashSet<>();
		for (String name : names) {
			if (store.add(name)==false) {
				System.out.println("found a duplicate element in array : "+ name);
			}
		}

		Map<String, Integer> nameAndCount = new HashMap<>(); 
		// build hash table with count 
		for (String name : names) { 
			Integer count = nameAndCount.get(name);
			if (count == null) 
			{ 
				nameAndCount.put(name, 1);
			} 
			else { 
				nameAndCount.put(name, ++count);
			} 
		}
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element from array : "+ entry.getKey());
			}
		}




	}
}





*/