package exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		String s="abc";  
		int i=Integer.parseInt(s);//NumberFormatException 
		System.out.println("Value is: "+i);

	}

}
