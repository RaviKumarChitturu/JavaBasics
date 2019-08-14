
/*5. Write a program to add 6 string objects into TreeSet and print first & last objects and 
 * then delete them from TreeSet and also,print all remaining objects of TreeSet using Iterator.
*/

package collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;


public class SetProgram5 {

	public static void main(String[] args) {
		// In TreeSet insertion order is not preserved but data must be displayed in ascending order
		 
				   
		TreeSet<String> ts=new TreeSet<>();
		
		ts.add("Element1");	
		ts.add("Element3");	
		ts.add("Element2");
		ts.add("Element4");
		ts.add("Element6");
		ts.add("Element5");
		
		System.out.println("First Element:"+ts.first());
		System.out.println("Last Element:"+ts.last());	
		
		//To Delete First element
		ts.pollFirst();
		//To Delete Last element
		ts.pollLast();
		
		//Using Iterator			
		Iterator<String> itr=ts.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){ 
			System.out.print(itr.next()+" ");
		}
		//Using SplitIterator
		System.out.println();
		System.out.println("Split Iterator");
		Spliterator<String> spl=ts.spliterator();
			spl.forEachRemaining(System.out::println);
			
		//Using ForEach loop
			System.out.println("ForEach loop");
			for (String ele : ts) {
				System.out.println(ele);
				
			}
			
		
			
	}

}
