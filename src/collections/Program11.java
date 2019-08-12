
/*11. Write a program for the following scenarios:
a. Add 4 string objects into one LinkedList
b. Add one object at first position and last position
c. Delete the object at 3rd position
d. Update the value at 4th position with 2nd index value

*/

package collections;

import java.util.LinkedList;

public class Program11 {



	public static void main(String[] args) {
		
		LinkedList<String> al2= new LinkedList<String>();
		al2.add("Element1");		al2.add("Element2");
		al2.add("Element3");		al2.add("Element4");
					
		System.out.println("LinkedList:"+al2);
		al2.add(0, "Element0");
        al2.addFirst("Element10");
        al2.addLast("Element5");
        System.out.println("LinkedList:"+al2);
        al2.remove(2);
        System.out.println("LinkedList:"+al2);
        al2.set(4, al2.get(2));
        System.out.println("LinkedList:"+al2);
		
	}

}
