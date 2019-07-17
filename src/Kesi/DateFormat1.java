package Kesi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat1 {

	public String togetDB2AppdateConvesion(String Date) throws ParseException {

		System.out.println(Date);
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date Time = sdf.parse(Date);
		DateFormat out = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		String finalDate = out.format(Time);
		System.out.println(finalDate);

		return finalDate;

	}

	public static void main(String[] args) throws ParseException {

		DateFormat1 df = new DateFormat1();
		df.togetDB2AppdateConvesion("2015-09-02 19:16:52.223");

	}

}
