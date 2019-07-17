package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class ArrayPrint {

	
	public static String repeatVendor(int i){
		String[] venName={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
				,"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
				,"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"};
		return venName[i];
	}
	public static void main(String[] args) {
		String[] venName={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
				,"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
				,"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"};
		//System.out.println(venName);
		System.out.println(Arrays.toString(venName));
	
		for (int i = 0; i < 30; i++) {
			  System.out.print(i%10);
			//repeatVendor(i%10);
			}

	}

}
