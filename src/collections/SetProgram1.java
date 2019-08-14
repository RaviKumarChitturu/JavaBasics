
/*1. Write a program to add 5 string objects into HashSet and
 *  then print the objects using Iterator and Spliterator cursors.
*/

package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;


public class SetProgram1 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");		hs.add("Element2");
		hs.add("Element3");		hs.add("Element4");
		
				
		//Using Iterator			
		Iterator<String> itr=hs.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Using SplitIterator
		System.out.println("Split Iterator");
		Spliterator<String> spl=hs.spliterator();
			spl.forEachRemaining(System.out::println);
	}

}
