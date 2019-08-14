/*7. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in ascending order 
using Comparable interface and print them in console.
b. Sort the user-defined class objects based on String value in ascending order
using Comparable interface and print them in console.*/

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable3 implements Comparable<Comparable3>{
	int id;
	String name;
	Comparable3(int id,String name){		this.id=id;this.name=name;
	}
	
/*	@Override
	public int compareTo(Comparable3 o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}*/
	@Override
	public int compareTo(Comparable3 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public static void main(String[] args) {
		ArrayList<Comparable3> al=new ArrayList<>();
	
		al.add(new Comparable3(100,"Ravi"));
		al.add(new Comparable3(121,"Patel"));
		al.add(new Comparable3(105,"Chandu"));
		al.add(new Comparable3(111,"Bhasker"));
		Collections.sort(al);
		for (Comparable3 value : al) {
			System.out.println(value.id+" "+value.name);
		}

	}


}

