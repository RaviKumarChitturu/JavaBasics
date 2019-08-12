
/*8. Write a program for the following scenarios:
a. Add 7 string objects into one ArrayList
b. Display all the objects in ascending order
c. Display all the objects in descending order using 2 possible approaches.
*/

package collections;

import java.util.ArrayList;
import java.util.Collections;


public class Program8 {



	public static void main(String[] args) {
		
		//a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
		ArrayList<String> al=new ArrayList<String>();
		al.add("element4");al.add("element3");al.add("element1");/*al.add("element10");al.add("element20");*/
		al.add("element5");al.add("element7");al.add("element2");al.add("element6");
		
		System.out.println("Before sort:"+al);
		//Sorting in Ascending order
		Collections.sort(al);
		System.out.println("After sort:"+al);
		
		//Sorting in Descending order one way
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse sort:"+al);
		
		//Sorting in Descending order another way
		Collections.reverse(al);
		System.out.println("Reverse sort:"+al);
		
		
		
	}

}
