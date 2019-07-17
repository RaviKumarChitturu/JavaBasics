package controlflow;

import java.util.ArrayList;



public class Whileloop {

	public static void main(String[] args)
	{
		
		int b=100;
		String  asd = "";
		ArrayList<Integer> AppArray = new ArrayList<>();
		/*//while (i<=b)
		for(i=1;i<b;i++)
		{
			System.out.println("Main for loop value is: "+i);	
			int d=10;
			for(int s=1;s<=d;s++){
			System.out.println("Inner For loop value is: "+s);
			//ArrayList<Integer> AppArray = new ArrayList<>();
			//AppArray.add(s);
			AppArray.add(s);
			//System.out.println(AppArray);
			}
			
			if(i==10){
		    asd="Disable";
			}
			
			if(asd.contentEquals("Disable"))
			{
				System.out.println("In the if condtion the main for loop value is: "+i);
				break;
			}
			
			//i++;
		}
		System.out.println(AppArray);
		System.out.println(AppArray.size());
		System.out.println("Execution done");*/
		
		int s=1;
		while (s<=10) {
			
			System.out.println("While loop: "+s);
			s++;
		}
		System.out.println("After while loop");
	}
}

