package exceptions;

public class TestFinallyBlock {
	public static void main(String args[]){  
		try{  
			int data=25/0;  
			System.out.println(data);  
		}  
		catch(NullPointerException e)
		{
			System.out.println("Catch block "+e);
		}  
		/*finally
		{
		System.out.println("finally block is always executed");
		}  
		System.out.println("rest of the code...");  */
	}  
}
