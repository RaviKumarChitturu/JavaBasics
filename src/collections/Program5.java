
/*5. Write a program to add 6 string objects into ArrayList and display all the data 
 * in console using for, for each, Iterator and ListIterator.
*/

package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {



	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");al.add("String2");al.add("String3");
		al.add("String4");al.add("String5");al.add("String6");
		//for loop
		System.out.println("Printing Array values using for loop");
		for (int i = 0; i <al.size(); i++) {
			System.out.print(al.get(i)+" ");
			
		}
		//for each loop
		System.out.println();
		System.out.println();
		System.out.println("Printing Array values using foreach loop");
		for (String s : al) {
			System.out.print(s+" ");
			
		}
		//iterator
		System.out.println();
		System.out.println();
		System.out.println("Printing Array values using iterator cursor");
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
			
		}
		
			
		

	}

}
