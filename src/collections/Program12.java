
/*12. Write a program to add all String objects from one ArrayList to other
 *  LinkedList without using addAll() and then print the objects of LinkedList in console.
*/

package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program12 {



	public static void main(String[] args) {
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Element1");		al2.add("Element2");
		al2.add("Element3");		al2.add("Element4");
		
		LinkedList<String> al= new LinkedList<String>(al2);
		
					
		System.out.println("LinkedList:"+al);
		
	}

}
