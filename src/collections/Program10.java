
/*
10. Write a program to add first 10 integers in ArrayList using for loop and 
Delete all the integers except even numbers from the ArrayList and 
then print the ArrayList having even numbers in console.

*/

package collections;

import java.util.ArrayList;


public class Program10 {



	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			al.add(i);
			
		}
System.out.println("Main Array: "+al);

for (int i = 0; i <al.size(); i++){
	  // System.out.println(al.get(i));
	   if(al.get(i)%2!=0){
		   al.remove(i);
	   }
	
}

System.out.println("After Removed Array: "+al);
	}
	
	

}
