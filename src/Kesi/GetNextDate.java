package Kesi;

import java.util.Calendar;
import java.util.Date;

public class GetNextDate {
	
	public static Date getNextDate(Date nowDate) {
	    Calendar c = Calendar.getInstance();
	    c.setTime(nowDate);
	    c.add(Calendar.MONTH, 1);
	    c.set(Calendar.DATE, c.getMaximum(Calendar.DATE));
	    Date nextDate = c.getTime();
	    return nextDate;
	}

	public static void main(String[] args) {
		 Date nowDate = new Date();
		 Date nextDate = getNextDate(nowDate);
		 System.out.println(nextDate);
	}

}
