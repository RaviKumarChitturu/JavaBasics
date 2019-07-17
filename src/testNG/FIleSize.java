package testNG;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FIleSize {
	public static String Test="KesiReddy";
	public int i=3;
	@Test
	public void currentBillDate() throws Exception {
		
			File file = new File("D:\\Docs\\EHR101_091710_Final.pptx");	
			long fileSizeInBytes = file.length();		
			DecimalFormat df = new DecimalFormat("0.00");
			float sizeKb = 1024.0f;
		    float sizeMb = sizeKb * sizeKb;
		    String fileSize=df.format(fileSizeInBytes / sizeMb);
		    System.out.println(fileSize+" MB");    
	}

	

}
