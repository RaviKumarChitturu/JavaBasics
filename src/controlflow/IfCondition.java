package controlflow;

public class IfCondition {
	public static String busunit="";
	public static String actcat="";
	public static String actcode="";

	public static void main(String[] args)
	{ 
		/*int a=10; int b=20;
		if (a<b)
		{
			System.out.println("if body / true body");
		}

		System.out.println("If condition program."); */


		/* String string1 = "HELLO";
     String string2 = "hello";
     String string3 = "Hello";

     int var1 = string1.compareToIgnoreCase(string2);
     System.out.println("string1 and string2 comparison: "+var1);

     int var2 = string1.compareToIgnoreCase(string3);
     System.out.println("string1 and string3 comparison: "+var2);

     int var3 = string1.compareToIgnoreCase("HELLt");
     System.out.println("string1 and HeLLo comparison: "+var3);*/

		String a="false";
		String b="true";
		String c="true";
		



		/*  if((a.contentEquals(b)|| c.contentEquals(b)))
     {
    	 System.out.println("if condition");
     }
     else{
    	 System.out.println("Else codition");
     }
		 */

		/*	String d="Bill";
		String e="Vendor Credit";
		String f="Expense";
		String g="pay";

		if(d.contains("Bill")&& (e.contains("ff")||(f.contains("Expense")||(g.contains("pay"))))){
			System.out.println("If condition executed");
		}
		else{
			System.out.println("Else condition executed");
		}*/

		for(int i=0;i<=50;i++){

			//System.out.println("loop value is: "+i+" and business unit is: "+busunit);
			getDOc(i);
		}

		
		
		

	}
	

	public static void getDOc(int i) {
		
		if(i<=10){
			busunit="92700";
			actcat="92700";
			actcode="92700";
			System.out.println(busunit);
			
		}
		else if(i>=11 && i<=20){
			busunit="92701";	
			System.out.println(busunit);
		}else if(i>=21 && i<=30){
			busunit="92702";
			System.out.println(busunit);
		}
		else{
			busunit="92703";	
			System.out.println(busunit);
		}
		
	}

}




