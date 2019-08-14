/*8. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in descending order
 using Comparable interface and print them in console.
b. Sort the user-defined class objects based on String value in descending order 
using Comparable interface and print them in console.
*/

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable2 implements Comparable<Comparable2>{
	int id;
	String name;
	Comparable2(int id){		this.id=id;
	}
	Comparable2(String name){		this.name=name;
	}
/*	@Override
	public int compareTo(Comparable2 o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}*/
	@Override
	public int compareTo(Comparable2 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public static void main(String[] args) {
		ArrayList<Comparable2> al=new ArrayList<>();
		al.add(new Comparable2("Patel"));
		al.add(new Comparable2("Ravi"));
		al.add(new Comparable2("Bhasker"));
		al.add(new Comparable2("Chandu"));
		/*al.add(new Comparable2(100));
		al.add(new Comparable2(121));
		al.add(new Comparable2(105));
		al.add(new Comparable2(111));*/
		Collections.sort(al);
		Collections.reverse(al);
		for (Comparable2 string : al) {
			System.out.println(string.name);
			//System.out.println(string.id);
		}

	}


}

