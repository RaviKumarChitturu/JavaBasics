package test;

public class Testarray3 {
	
	public static void main(String[] args) {
		int arr[][]={{1,2},{2,3},{4,5}};  
		
		System.out.println(arr.length);  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<2;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
	}

}
