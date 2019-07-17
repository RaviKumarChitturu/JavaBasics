package testNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	public static final int t = 3;
	int count;
	@Test(invocationCount=t)
  public void f() {
		count++;
	 // System.out.println(t);
	  System.out.println(count);
  }
}
