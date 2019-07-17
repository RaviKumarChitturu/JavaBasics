package controlflow;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class ForLoop {

	public static void main(String[] args)
	{
		ArrayList<String> allStatus= new ArrayList<String>();
		/*for (int i=1;i<=10;i++)
		{ 
			
			System.out.println(i);
			
		}*/
		
		for (int i=1; i <=10; i++) {
			try {
				String status="Test";	
				allStatus.add(status);
			} catch (Exception e) {					
				continue;
			}									
		}
		System.out.println(allStatus);
	}
}


