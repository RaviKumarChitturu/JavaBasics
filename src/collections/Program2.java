
/*2. Write a program to add objects of two ArrayLists into another ArrayList.*/

package collections;

import java.util.ArrayList;

public class Program2 {



	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");al.add("String2");al.add("String3");al.add("String4");al.add("String5");
		al.add(1, "Inserted String");
		al.remove(3);
		al.set(3, "Updated String");
		System.out.println(al.get(4));
		System.out.println(al.size());
		ArrayList<String> al2=new ArrayList<String>();
       al2.add("String21");al2.add("String22");al2.add("String23");
       al2.addAll(al);
   	ArrayList<String> al3=new ArrayList<String>(al2);
   	System.out.println(al3);
	
       
	}

}
