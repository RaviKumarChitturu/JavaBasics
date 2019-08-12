
/*3. Write a program to store the list of objects from 1st index to 4th index from one ArrayList to another ArrayList*/

package collections;

import java.util.ArrayList;

public class Program3 {



	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");al.add("String2");al.add("String3");al.add("String4");al.add("String5");
		al.add(1, "Inserted String");
		al.remove(3);
		al.set(3, "Updated String");
		System.out.println(al.get(4));
		System.out.println(al.size());
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("String21");al2.add("String22");al2.add("String23");
		al2.addAll(al);
		ArrayList<String> al3=new ArrayList<String>(al2);
		System.out.println(al3);
		ArrayList<String > al4= new ArrayList<String>(al3.subList(1, 4));
		System.out.println(al4);

	}

}
