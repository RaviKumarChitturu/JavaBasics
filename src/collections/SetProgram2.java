
/*2. Write a program to add all String objects from one HashSet to other HashSet without using addAll()
 *  and then print the objects of second HashSet in console.
*/

package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;


public class SetProgram2 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");		hs.add("Element2");
		hs.add("Element3");		hs.add("Element4");
		
		HashSet<String> hs1=new HashSet<>(hs);
				
		//Using Iterator			
		Iterator<String> itr=hs1.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Using SplitIterator
		System.out.println("Split Iterator");
		Spliterator<String> spl=hs1.spliterator();
			spl.forEachRemaining(System.out::println);
	}

}
