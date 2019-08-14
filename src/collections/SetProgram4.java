
/*4. Write a program to add 5 string objects into Set reference and
 *  then print the objects in ascending order using 'cursors' & 'for each loop'.
*/

package collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;


public class SetProgram4 {

	public static void main(String[] args) {
		// In TreeSet insertion order is not preserved but data must be displayed in ascending order
		 
				   
		Set<String> s=new TreeSet<>();
		
		s.add("Element1");	
		s.add("Element3");	
		s.add("Element2");
		s.add("Element4");
		
								
		//Using Iterator			
		Iterator<String> itr=s.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){ 
			System.out.print(itr.next()+" ");
		}
		//Using SplitIterator
		System.out.println();
		System.out.println("Split Iterator");
		Spliterator<String> spl=s.spliterator();
			spl.forEachRemaining(System.out::print);
				
		//Using ForEach loop
			
			for (String ele : s) {
				System.out.println(ele);
				
			}
			
			//For Integer values................

			Set<Integer> i=new TreeSet<>();
			i.add(2);i.add(10);i.add(11);i.add(4);i.add(5);i.add(20);i.add(1);i.add(3);
			
			//Using Iterator			
			Iterator<Integer> it=i.iterator();
			System.out.println("Iterator");
			while(it.hasNext()){ 
				System.out.print(it.next()+" ");
			}
			//Using SplitIterator
			System.out.println();
			System.out.println("Split Iterator");
			Spliterator<Integer> sp=i.spliterator();
				sp.forEachRemaining(System.out::print);
				
			//Using ForEach loop
				System.out.println();
				System.out.println("For Each loop");
				for (Integer ele1 : i) {
					System.out.print(ele1);
					
				}
				
			
	}

}
