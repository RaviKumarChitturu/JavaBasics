package practice;

public class SingleDimensionArray {

	//array declaration,instantiation and initilization
	static int[] a;//={123,124,125,236};

	//array declaration and instantiation
	static int b[]= new int[10];

	public static void passingDataToArray(){
		int number=0;
		for(int i=0;i<b.length;i++){

			b[i]=number;
			number++;
		}
	}

	public static void iterateArray(){
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}


	public static void main(String[] args) {

		passingDataToArray();
		iterateArray();
	}



}
