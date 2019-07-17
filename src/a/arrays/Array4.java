package a.arrays;
// Printing wrapperclass data type array values 
public class Array4 {
	 Integer b=100;
	//static Integer[] a=  {100,20};
	Integer[] a= new Integer(b);
	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		
	}

}
