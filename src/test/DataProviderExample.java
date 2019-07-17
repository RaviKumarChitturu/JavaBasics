package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.getData;


public class DataProviderExample {
	
	/*getData gt;
	@BeforeClass
	public void  open (){
		gt =new  getData();
	}*/
	
	@Test(dataProvider="testData", dataProviderClass=getData.class)
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}
	
	/*@DataProvider
	public Object[][] getData()
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
	}*/

}
