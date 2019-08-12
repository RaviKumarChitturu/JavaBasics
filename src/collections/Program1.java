
/*1. Write a program for the following scenarios:
a. Add 5 string objects into one ArrayList
b. Insert one string object at 2nd position
c. Delete the value at 3rd index
d. Update the value at 3rd position with 1st index value
e. Display the value of 4th position in console
f. Display the count of objects available in ArrayList.*/

package collections;

import java.util.ArrayList;

public class Program1 {



	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");al.add("String2");al.add("String3");al.add("String4");al.add("String5");
		al.add(1, "Inserted String");
		al.remove(3);
		al.set(3, "Updated String");
		System.out.println(al.get(4));
		System.out.println(al.size());

	}

}
