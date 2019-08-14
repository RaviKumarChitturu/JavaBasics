
/*3. Write a program to add 6 string objects into HashSet reference and 
 * then print the objects using Iterator and Spliterator cursors in the same insertion order.
*/

package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;


public class SetProgram3 {

	public static void main(String[] args) {
		/* In linked HashSet insertion order is preserved means in what way we have added values
		 * the same order displayed
		 */
		   
		HashSet<String> hs=new LinkedHashSet<>();
		hs.add("Element1");	
		hs.add("Element3");	
		hs.add("Element2");
		hs.add("Element4");
		
						
		//Using Iterator			
		Iterator<String> itr=hs.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){ 
			System.out.print(itr.next()+" ");
		}
		//Using SplitIterator
		System.out.println();
		System.out.println("Split Iterator");
		Spliterator<String> spl=hs.spliterator();
			spl.forEachRemaining(System.out::print);
	}

}
