
/*6. Write a program to add 3 string objects into Vector 
 * and display all the data in console using all possible ways.
*/

package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Program6 {



	public static void main(String[] args) {
		Vector<String> al=new Vector<String>();
		al.add("String1");al.add("String2");al.add("String3");
		al.add("String4");al.add("String5");al.add("String6");
		//for loop
		System.out.println("for loop");
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i)+" ");
			
		}
		//for each loop
		System.out.println();
		System.out.println("foreach loop");
		for (String s : al) {
			System.out.println(s+" ");
			
		}
		//iterator
		System.out.println();
		System.out.println("iterator cursor");
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
			
		}
		//enumerator cursor only for vector list
		System.out.println();
		System.out.println("enumerator cursor");
			Enumeration<String> en=al.elements();
			while(en.hasMoreElements()){
				System.out.println(en.nextElement()+" ");
				
			}
		

	}

}
