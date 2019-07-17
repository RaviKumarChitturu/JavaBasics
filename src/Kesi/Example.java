package Kesi;

import java.lang.reflect.Array;
//import java.lang.reflect.Array;
import java.util.Arrays;

public class Example {

	static int array[] = {150, 99, 10000, 84849, 111, 212, 314, 21, 442, 455, 244, 554, 22, 22, 211};
	
	static int array1[] = {1,2,3};

	static void Printrange() {
		int a=array.length;
		//Array.get(array, array.length);
		
		//System.out.println(a);
		for (int i = 0; i <array.length; i++) {
			//System.out.println("numbers with in range: "+i+" and value is "+array.length.);
			//System.out.println("Loop value is: "+i+"  "+Array.get(array, array.length));
			//System.out.println("Loop value is: "+i);
			
			
			if (array[i] > 100 && array[i] < 500) {
				System.out.println("numbers with in range" + i);
			}
		}
	}
	static void Printrange1() {
		
		
		//System.out.println(a);
		for (int i = 0; i <array1.length; i++) {
			
				System.out.println(Arrays.toString(array1));
			
		}
	}
	public static void main(String[] args) {
		Printrange();
	}
}
