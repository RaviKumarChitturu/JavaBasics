package ArraysRavi;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arrays {
	void add_Set_Remove(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");     //Add
		System.out.println(a1);
		a1.set(1, "Raja");   //set
		System.out.println(a1);
		a1.set(0, "Amruth");
		System.out.println(a1);
		a1.remove(0);       //Remove
		System.out.println(a1);
	}
	void addAll(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.addAll(a1); // Adding a1 elements in a2 arraylist using addall method
		System.out.println(a2);
	}
	void clear(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		System.out.println(a1);
		a1.clear();
		System.out.println("Zero elements available now"+a1);
	}

	@SuppressWarnings("unchecked")
	void cloneArray(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		System.out.println(a1);
		ArrayList<String> a2= (ArrayList<String>) a1.clone();
		System.out.println(a2);

	}
	void conatins(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		for (String object: a1) {
			System.out.println(object);
		}
		System.out.println(a1.contains("Kumar"));
		System.out.println(a1.contains("Raja"));
	}
	void get(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
	}
	//listiterator forward/backward 
	void listiterator(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Kumar");
		a1.add("Raja");
		a1.add("Amruth");

		ListIterator<String> listitr=a1.listIterator();
		System.out.println("Forward iterator");
		while(listitr.hasNext()){
			System.out.println(listitr.next());
		}
		System.out.println("Backward iterator");
		while(listitr.hasPrevious()){
			System.out.println(listitr.previous());			
		}
		//Inserting an element in an array 
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Ravi");
		a2.add("Kumar");
		a2.add("Raja");
		a2.add("Amruth");
		ListIterator<String> listitr1=a2.listIterator();
		System.out.println(listitr1.next());
		listitr1.add("Inserted Data");
		System.out.println("Updated data"+a2);
		
       //Remove an element from an array
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("A");a3.add("B");a3.add("C");
		a3.add("D");a3.add("E");a3.add("F");
		ListIterator<String> listitr2=a3.listIterator();
	    listitr2.next();//A
	    listitr2.next();//B
		listitr2.remove();//Removed B element
		System.out.println(a3);
				
	}
	public static void main(String[] args){
		Arrays p=new Arrays();
		//p.add_Set_Remove();
		//p.addAll();
		//p.clear();
		//p.cloneArray();
		//p.conatins();
		//p.get();
		  p.listiterator();
	}

}
