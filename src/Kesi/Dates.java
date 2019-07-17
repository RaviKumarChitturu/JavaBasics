package Kesi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Dates {
	
  @Test
  public void addDaysToDate() throws Exception {
		Date todayDate = new Date();
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = sdf.format(todayDate);
		Date parsedDate = sdf.parse(strDate);
		//System.out.println(strDate);
		//System.out.println(parsedDate);

		Calendar now = Calendar.getInstance();
		//now.setTime(parsedDate); 
		//now.add(Calendar.DAY_OF_MONTH, 10);
		//System.out.println(sdf.format(now.getTime()));
		String a= sdf.format(now.getTime());
		System.out.println(a);
		//return sdf.format(now.getTime());
	}

}
