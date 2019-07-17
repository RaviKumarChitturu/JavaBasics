package Kesi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;



public class DoubleDemo {
	
	public static void main(String[] args) throws ParseException {

	     // compares the two specified double values
	     double d1 = 15456.45;
	     double d2 = 15456.45;
	     
	     String p="50,000.56";
	     NumberFormat format = NumberFormat.getInstance(Locale.US);
	   // System.out.println(Double.valueOf(format.toString()));
	    System.out.println((format.parse(p).doubleValue()));
	    
	    Double d = new Double(format.parse(p).doubleValue());
	    System.out.println(d.intValue());
	    
	   
	   
	    
	    //System.out.println(d);
	     int retval = Double.compare(d1, d2);
	     
	     if (d1==d2){
	    	 System.out.println("Both are equl");
	     }
	     else{
	    	 System.out.println("Not equl");
	     }
	    
	   /*  if(retval > 0) {
	        System.out.println("d1 is greater than d2");
	     }
	     else if(retval < 0) {
	        System.out.println("d1 is less than d2");
	     }
	     else {
	        System.out.println("d1 is equal to d2");
	     }*/
	   }

}
