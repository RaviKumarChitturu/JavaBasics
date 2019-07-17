package test;
import java.util.Arrays;

public class ExecutionClass{

	public static void main(String[] args){
	int[] b = {1,2,3,4};
	
	BusinessClass bObj= new BusinessClass();
	
	bObj.implementation1(b);

}
 }

class BusinessClass{
	
	void implementation1(int[] arr){
		
		for(int i:arr){
		System.out.println(i);
	}
	
	
}
	
}