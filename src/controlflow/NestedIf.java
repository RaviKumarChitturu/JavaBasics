package controlflow;

public class NestedIf {

	public static void main(String args[]) {
		int x = 300;
		int y = 120;
		String a="Test1";

		if(a.equals("Test"))
		{
			System.out.print("Enterd in 'if' condition");
			
		} 
		else if( x == 30 ) 
		{
			System.out.print("Enterd in 'else if' condition");
		}
		else if( y == 10 ) 
		{
			System.out.print("Enterd in '2 else if' condition");
		}
		else
		{
			System.out.print("Enterd in 'else' condition");
		}
	}


}

