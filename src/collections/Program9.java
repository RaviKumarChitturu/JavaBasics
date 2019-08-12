
/*9. Write a program for the following scenarios:
a. Create one string array with 3 values and convert this array as 
ArrayList and then print the values from ArrayList individually.

b. Add 4 string objects into one ArrayList and Convert this ArrayList 
as Array and then print the values from Array individually.

*/

package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Program9 {



	public static void main(String[] args) {
		
		String[] a={"Ravi1,Ravi2,Ravi3"};
		
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(a));
		System.out.println("Arraylist:"+al);
		
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Element1");		al2.add("Element2");
		al2.add("Element3");		al2.add("Element4");
					
		String[] b= al2.toArray(new String[al2.size()]);
      
      for (String s : b) {
    	  System.out.print(s+" ");
		
	}
		
	}

}
