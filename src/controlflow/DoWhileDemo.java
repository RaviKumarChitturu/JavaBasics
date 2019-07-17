package controlflow;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.util.Date;

import date.GetTime;
import test.getData;

public class DoWhileDemo {

	public static void main(String[] args) {
		/*int i=1;
		do{
			System.out.println(i);
			Date now = new java.util.Date(); 
			Timestamp current = new java.sql.Timestamp(now.getTime()); 
			System.out.println("current timestamp: " + current);	
			i++;
		}while(i<=10);*/
		System.out.println(getTime());
	}
	
	public static Timestamp getTime(){	
		Date now = new java.util.Date(); 
		Timestamp current = new java.sql.Timestamp(now.getTime());
		return current;	
	}
	
	
}
