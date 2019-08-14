package a_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		al.add("Ravi");
		al.add("Patel");
		al.add("Bhasker");
		
		Collections.sort(al);
		System.out.println(al);

	}

}
