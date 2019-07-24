package a.arrays;

import java.util.Arrays;

public class ArrayCopying {
	int a[]={10,20,30,40,50};
	int b[]=new int[a.length];
	void Manualcopy(){
		System.out.println("-----Manualcopy----------");
		//copying one array to another
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		//printing array
				for(int i=0;i<b.length;++i){
					System.out.print(b[i]+" ");
				}
				System.out.println();
	}
	
	void copyof(){
		System.out.println("-----copyof----------");
		//copying one array to another
		b=Arrays.copyOf(a, a.length);
		//printing array
		for(int i=0;i<b.length;++i){
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	void clone1(){
		System.out.println("-----clone1----------");
		//copying one array to another
		b=a.clone();
		//printing array
				for(int i=0;i<b.length;++i){
					System.out.print(b[i]+" ");
				}
				System.out.println();
	}

	public static void main(String[] args) {
		ArrayCopying copy=new ArrayCopying();
         copy.clone1();
         copy.copyof();
         copy.Manualcopy();
	}

}
