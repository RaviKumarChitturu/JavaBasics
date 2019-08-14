/*7. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in ascending order 
using Comparable interface and print them in console.
b. Sort the user-defined class objects based on String value in ascending order
using Comparable interface and print them in console.*/

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 implements Comparable<Comparable1>{
	int id;
	String name;
	Comparable1(int id){		this.id=id;
	}
	Comparable1(String name){		this.name=name;
	}
	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
/*	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}*/
	public static void main(String[] args) {
		ArrayList<Comparable1> al=new ArrayList<>();
	/*	al.add(new Comparable1("Ravi"));
		al.add(new Comparable1("Patel"));
		al.add(new Comparable1("Bhasker"));*/
		al.add(new Comparable1(100));
		al.add(new Comparable1(121));
		al.add(new Comparable1(105));
		al.add(new Comparable1(111));
		Collections.sort(al);
		for (Comparable1 string : al) {
			System.out.println(string.id);
		}

	}


}

