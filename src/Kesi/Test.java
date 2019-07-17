package Kesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	//public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) {
		
		//String SelectedPaymentAmount = "$ 55,050.00";
		//String price = SelectedPaymentAmount.replace("$","");
		//System.out.println("The value is: "+price);
		
		String a="Circulus was unable to perform data entry services on this bill. You will not be charged for this data entry attempt.<br/>Reason : Image is blur.";
		
		
		if(a.contains("<br/>")){
			System.out.println("Yes");
			a.trim();
			a=a.replace("<br/>", "\n");
			System.out.println(a);
		}
		
		System.out.println("The value is: "+a.substring(0, 5).trim());
		System.out.println("The value is: "+a.substring(0, 5).length());
      
	}

}
