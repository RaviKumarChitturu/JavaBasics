package a_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class Swap {
	
	void iterator(){
		
		ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,5,9,10,23));
		
		ListIterator<Integer> b=a.listIterator();
		
		System.out.println("Normal Stored array");
		while (b.hasNext()) {
			System.out.print(b.next()+" ");
			
		}
		System.out.println();
		System.out.println("Reverse Stored array");
		while (b.hasPrevious()) {
			System.out.print(b.previous()+" ");
						}
	}

	void Swap1(){
		int[] a={1,9,6,4,2};
		int[] b=new int[a.length];
		System.out.println(a.length);
		int j=0;
		System.out.println("Reverse Array data:");
		for(int i=a.length-1;i>=0;i--){
			
			b[j]=a[i];
			
			System.out.print(b[j]+" ");
			j++;
		}
		
	}
	
	void swap3(){
		ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        
        System.out.println(list);
         
        Collections.swap(list, 1, 2);
         
        System.out.println(list);
	}
	
	public static void main(String[] args) {
		Swap s=new Swap();
		s.swap3();
	}
}
