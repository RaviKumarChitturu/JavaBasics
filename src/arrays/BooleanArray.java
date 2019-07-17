package arrays;

import java.util.Arrays;

public class BooleanArray {
	
	 public static void main(String[] args) {

		 boolean boovar = true;
	        String str = String.valueOf(boovar);
	        System.out.println("String is: "+str);
	        
	        /* Method 2: using toString() method 
	         * of Boolean class
	         */
	        boolean boovar2 = false;
	        String str2 = Boolean.toString(boovar2);
	        System.out.println("String2 is: "+str2);
	        
	       
	        boolean boovar3 = Boolean.valueOf("dsdsd");
	        String str3 = Boolean.toString(boovar3);
	        System.out.println("String3 is: "+str3);
	        
	   }
}