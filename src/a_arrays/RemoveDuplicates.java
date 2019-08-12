package a_arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicates {
	@Test
	 void m1(){
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi1");
		al.add("Ravi2");
		al.add("Ravi3");
		al.add("Ravi4");
		al.add("Ravi1");
		al.add("Ravi1");
		al.add("Ravi2");
		al.add("Ravi2");
		al.add("Ravi3");
		al.add("Ravi4");
		al.add("Ravi4");
		al.add("Ravi4");
		
		LinkedHashSet<String> h=new LinkedHashSet<>(al);
		ArrayList<String> al1=new ArrayList<>(h);
		System.out.println(al1);
	}


}
