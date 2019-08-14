/*8. Write a program for the following scenarios:
a. Sort the user-defined class objects based on int value in descending order
 using Comparable interface and print them in console.
b. Sort the user-defined class objects based on String value in descending order 
using Comparable interface and print them in console.
*/

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable4 implements Comparable<Comparable4>{
	int id;
	String name;
	Comparable4(int id,String name){		this.id=id;this.name=name;
	}
	
/*	@Override
	public int compareTo(Comparable3 o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}*/
	@Override
	public int compareTo(Comparable4 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public static void main(String[] args) {
		ArrayList<Comparable4> al=new ArrayList<>();
	
		al.add(new Comparable4(100,"Ravi"));
		al.add(new Comparable4(121,"Patel"));
		al.add(new Comparable4(105,"Chandu"));
		al.add(new Comparable4(111,"Bhasker"));
		Collections.sort(al);
		Collections.reverse(al);
		for (Comparable4 value : al) {
			System.out.println(value.id+" "+value.name);
		}

	}


}

