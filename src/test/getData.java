package test;

import org.testng.annotations.DataProvider;

public class getData {
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }*/

	@DataProvider (name = "testData")
	public static Object[][] sample()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";

	return data;
	}
}
