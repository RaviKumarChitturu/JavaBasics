
/*6. Write a program to add first 10 integers in HashSet using for loop and
 *  Delete all the integers except even numbers from the HashSet and 
 * then print the HashSet having even numbers in console.
*/

package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;



public class SetProgram6 {

	public static void main(String[] args) {
						   
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 1; i <= 10; i++) {
			hs.add(i);
			
		}
		System.out.println("Hashset Before Removed elemets:"+hs);
		
		//Using Iterator			
		Iterator<Integer> itr=hs.iterator();
		System.out.println("Iterator");
		while(itr.hasNext()){ 
			int i=itr.next();
			if(i%2!=0){
				itr.remove();
			}
			
		}
		System.out.println("Hashset After Removed elemets:"+hs);
				
	}

}
