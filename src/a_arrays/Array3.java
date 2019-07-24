package a_arrays;
// Printing default primitive data type array values by giving array length
public class Array3 {
	//here 5 is the array length
  static int[] a= new int[5];
      
       	public static void main(String[] args) {
     		a[0]=10;
     		a[1]=11;
     		a[2]=12;
     		a[3]=13;
     		a[4]=14;
     		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		 
		}

	}

}
