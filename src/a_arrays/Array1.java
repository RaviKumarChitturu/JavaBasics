package a_arrays;

import org.testng.annotations.Test;

// Printing primitive data type array values 
/*public class Array1 {
  static int[] a={1,5,7,9};
	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
System.out.println();
	}
	

}*/

public class Array1 {
   @Test
	void m1(){
		//int[] a= new int[3];
		  int a[]={9,15,12,13,14};
		  for (int j : a) {
			System.out.println(j);
		}
		System.out.println("New Array length:"+a.length);
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(min>a[i]){
				min=a[i];
			
			}
			
		}
		System.out.println(min);
	}
	
}
