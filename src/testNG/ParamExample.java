package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamExample {
	public static String a="Test1";
	public String b="Test2";
	
	/*@Parameters("param one")
	@Test
	public void testOptionParamOne(String paramOne) {

		System.out.println("Parameter passed from XML ::" + paramOne);
	}
*/
	
	@Test
	public void testOptionParamTwo() {

		//System.out.println("Optional value passed ::" + paramTwo);
		stload(a);
		
	}
	
	public static void stload(String a) {
		System.out.println("Data is: "+a);
	}
	
}
