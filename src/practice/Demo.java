package practice;

public class Demo {

	
	public static void main(String args[]) {
		try  
        {  
        int data=50/0; //may throw exception   
                         // if exception occurs, the remaining statement will not exceute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
            System.out.println(10);  
        }  
		try  
        {  
        int data=60/0; //may throw exception   
                         // if exception occurs, the remaining statement will not exceute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
    }  
}
