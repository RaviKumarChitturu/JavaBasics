package arrays;

public class SingleDimensionalArray {
	public static void main(String args[])
	  {
	    int marks[] = new int[5];
		
	    //System.out.println("Elements are " + marks.length);            
	   // System.out.println("Default value: " + marks[0]);            
		// Now assign values
	    marks[0] = 50;
	    marks[1] = 60;
	    marks[2] = 70;
	    marks[3] = 80;
	    marks[4] = 90;

	    //System.out.println("Value of 1st element: " + marks[0]);            

	    System.out.println("\nPrint the values in a single row");
	    for(int i = 0; i < marks.length; i++)
	    {
		System.out.print(marks[i] + "\t");  // to print in a single line, <strong>ln</strong> is removed
	    }

	   // System.out.println("\n\nOther way of printing supported from JDK 1.5");
	    for(int k : marks)
	    {
	        System.out.print(k );
	    }    
	  }

}
