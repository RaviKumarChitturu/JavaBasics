package controlflow;

import java.util.ArrayList;
import java.util.List;

public class BreakStatement {
	
	public static void main(String[] args)
	{ 
		for (int i=1;i<=10;i++)
		{ 
			/*if(i==15)
				break;*/
			System.out.println(i);
		}
	System.out.println("Testing");
	
	List<String> l1= new ArrayList<String>();
	List<String> l2= new ArrayList<String>();
	l1.add("Kesi");
	l1.add("Kesi1");
	
	l2.addAll(l1);
	System.out.println(l2);
	System.out.println(l1);
	System.out.println(l1.size());
	System.out.println(l2.size());
		
	}

}

