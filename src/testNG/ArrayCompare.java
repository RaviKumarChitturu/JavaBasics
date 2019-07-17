package testNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;




public class ArrayCompare {
  @Test
  public void f() {
	
	 // ArrayList<String> actual = (ArrayList<String>) Arrays.asList("a", "b", "c");
	 // ArrayList<String> expected = (ArrayList<String>) Arrays.asList("a", "b", "c");
	  
	  ArrayList<String> actList = new ArrayList<String>();
		/*actList.add("Orange");
		actList.add("Mango");
		actList.add("Apple");
		actList.add("Grapes");
		actList.add("Banana");
		actList.add("Apple");
		actList.add("Orange");*/

		actList.add("Papaya");
		actList.add("Mango");
		actList.add("Blueberry");
		actList.add("Banana");
		//actList.add("Grapes");
		

		
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Papaya");
		expList.add("Mango");
		expList.add("Blueberry");
		expList.add("Grapes");
		expList.add("Banana");
	  //Assert.assertEquals(actList.contains(expList), expList);
		System.out.println(expList);
		
		for(Iterator<String> itr=expList.iterator(); itr.hasNext();){
			String elem=itr.next();
			if(actList.remove(elem)){
				itr.remove();
			}
		}
		if(actList.isEmpty() && expList.isEmpty()){
			
		}
		else{		
			System.out.println("Unmatched Documents from Actual Data:"+actList.size());
			System.out.println("Unmatched Documents from Actual Data:"+actList);
			System.out.println("Unmatched Documents from Expected Data: "+expList.size());
			System.out.println("Unmatched Documents from Expected Data: "+expList);
		}
	  
	  
  }
}
