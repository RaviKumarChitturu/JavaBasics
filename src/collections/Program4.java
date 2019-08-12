
/*4. Write a program for the following scenarios:
a. Delete all the objects from fist ArrayList that are contained in second ArrayList
b. Delete all the objects from fist ArrayList that are NOT contained in second ArrayList
*/

package collections;

import java.util.ArrayList;

public class Program4 {



	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");al.add("String2");al.add("String3");al.add("String4");al.add("String5");
			
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("String21");al2.add("String22");al2.add("String23");al2.add("String4");al2.add("String5");
		
		/* Delete all the objects from fist ArrayList that are contained in second ArrayList
		 * al.removeAll(al2);
		System.out.println(al);*/
		
		//Delete all the objects from fist ArrayList that are NOT contained in second ArrayList
		al.retainAll(al2);
		System.out.println(al);
		

	}

}
