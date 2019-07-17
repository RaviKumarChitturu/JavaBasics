package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsEnabled {
	WebDriver driver;

	@BeforeClass
	public void openBrowser(){
		driver =  new FirefoxDriver();
		driver.get("http://qa.circulus.io");
		driver.manage().window().maximize();
	}


	@Test
	public void MyTest()   {


		boolean SignInButton = driver.findElement(By.xpath(".//*[@id='BtnLogin']")).isEnabled();
		System.out.println("Button value is: "+SignInButton);

		if(SignInButton==true){
			System.out.println("Button is enabled");
		}
		else{
			System.out.println("Button is disabled");
		}
	}
	@AfterClass
	public void Colse(){
		driver.close();
	}


}
