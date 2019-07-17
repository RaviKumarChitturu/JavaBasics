package test;

import java.io.PrintStream;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Practice {
  @Test
  public void test() {
	  ArrayList<String>test = new ArrayList<>();
	  /*String a="Testing";
	  Assert.assertTrue(a.matches(a));
	  System.out.println("Case1");*/
	  
	 /* String sValue = "a";
	 
	  Assert.assertEquals("C", sValue);
	  System.out.println("Case1");
	  String sValue1 = "QA";
	  Assert.assertEquals("b", sValue1);
	  System.out.println("Case2");*/
	  //assertNotEquals()
	  
	  try {
		  Assert.assertTrue("Testin".matches("Testing"));  
		  System.out.println("case1");
		  } 
	  catch (Error e) {
		  System.out.println(e.toString());
		  System.out.println("case1 in error ");
		  test.add("error"+e);
		  }
	  
	  try {
		  Assert.assertTrue("kesi".matches("kesi"));
		  System.out.println("case2 in pass ");
		  } catch (Error e) {
		  System.out.println(e.toString());
		  System.out.println("case2 in error");
		  test.add("error1"+e);
		  }
	  
	  Assert.assertEquals(test.size(), 0);
		  
	  
	  
	
}
}