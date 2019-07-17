package exceptions;

public class Testtrycatch2 {
	public static void main(String args[]){  
		   try{  
		      int data=50/0;
		      System.out.println(data);
		   }
		   catch(ArithmeticException e){
			   System.out.println("ddddddddddddd "+e);
			   System.out.println("rest of the code..."); 
			}  
		   
		}  
}
