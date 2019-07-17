package arrays;

import java.util.Arrays;

public class TestC {
	
	 public static void main(String[] args) {
		 
		 
		 
		 Boolean[] bits = new Boolean[5];
	        for (int i = 0; i <bits.length; i++) {
	        	 if(i==0){
	        	Boolean.valueOf(false);}
	        	 else{
	        		 Boolean.valueOf(false);
	        	 }
	        	
			}  
	        
	        isPalindrome(bits,"");
	    }
	 
	 public static Boolean isPalindrome(Boolean[] bits,String test) {
	    	//boolean result = true;
	    	
	    	System.out.println("bits value is: "+bits.length);
	    	Boolean result=Boolean.parseBoolean("true"); 
	        System.out.println("result is: "+result);
	        for (int i = 0; i < bits.length; i++) {
	            Boolean a = bits[i];
	            Boolean b = bits[bits.length - i - 1];
	            if (a != b)
	                result = false;
	        }
	        return result;
	    }

	   
}
