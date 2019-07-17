package date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;


public class GetTime {

	public static String getDate11(String InputTime) throws ParseException {
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date Time = sdf.parse(InputTime);
		DateFormat out = new SimpleDateFormat("hh:mm aa");
		String outTime = out.format(Time);
		//System.out.println(outTime);
		return outTime;
	}

	public static Date getDate(String dateText) throws ParseException
	{
		SimpleDateFormat dateFormat;
		dateFormat=Pattern.matches("[0-1][\\d]/[0-3][\\d]/[\\d]{4}", dateText)?new SimpleDateFormat("MM/dd/yyyy"):new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		Date date = dateFormat.parse(dateText); 
		Calendar c = Calendar.getInstance();
		c.setTime(date); // Now use user defined date 
		return date;
	}

	//Get Time in Milliseconds
	public static String getTime_Milliseconds()
	{
		Date date= new Date();
		long time = date.getTime();
		String str = String.valueOf(time);
		String text=str.substring(str.length() - 5);
		return text;
	}

	public static void main(String[] args) throws ParseException, InterruptedException {

		String a=getTime_Milliseconds();
		System.out.println("AutoInv"+a);
		/*Thread.sleep(1000);
		String b=getCurrent();
		System.out.println(b);*/

		/*LocalTime time=LocalTime.now();
		//System.out.println("Now Time is: "+time);

		LocalDate today = LocalDate.now();
		//System.out.println("Current Date: "+today);

		LocalDate date=LocalDate.now();
		System.out.println(date.getDayOfWeek());




		String ctOff="19:25:26.105";
		LocalTime CutofTime=LocalTime.parse(ctOff);
		System.out.println("Cutof Time is: "+CutofTime);

		if(time.isBefore(CutofTime)){
			System.out.println("Before");
			System.out.println("Current Date: "+today.minusDays(3));
			//System.out.println("Current Date: "+today+2);
		}
		else{
			System.out.println("After");
			System.out.println("Current Date: "+today.plusDays(3));
		}*/



		/*DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date Time = sdf.parse("11:00:00.0000000");
			DateFormat out = new SimpleDateFormat("hh:mm aa");
			String outTime = out.format(Time);
			System.out.println(outTime);*/

		/*	DateFormat format1 = new SimpleDateFormat("hh:mm:ss");
			 Date date = format1.parse("11:00:00.0000000");
		    SimpleDateFormat format2 = new SimpleDateFormat("hh:mm a");
		      String result = format2.format(date);
			 System.out.println(result);*/


		/*DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			Date Time = sdf.parse(TimeFormat);
			DateFormat out = new SimpleDateFormat("hh:mm aa");
			String outTime = out.format(Time);*/


		/*Date date=getDate("02/01/2018 12:00:52 AM");
		System.out.println(date);*/

	}





}

