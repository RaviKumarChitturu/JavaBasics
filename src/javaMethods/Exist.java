package javaMethods;

import java.text.DecimalFormat;

import org.testng.annotations.Test;

public class Exist {

	@Test (enabled=false,  invocationCount=5)
	public  void exittest() {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		 
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 9)
            {
                System.out.println("exit...");
 
                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                                  arr[i]);
        }
        System.out.println("End of Program");

	}
	@Test
	public  void environment() {
		System.gc();
		
	
	}
	
	@Test
	public  String gettwodecimaldouble(String value)
	{
		double outvalue = Double.valueOf(value);
		DecimalFormat df1 = new DecimalFormat("#0.00");
		return df1.format(outvalue);
	}

}
