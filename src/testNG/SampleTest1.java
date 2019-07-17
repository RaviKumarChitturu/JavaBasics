package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest1 {
	public WebDriver d;

	@Test
	public void Login() throws Exception   {
		d.findElement(By.id("TxtEmail")).click();
		d.findElement(By.id("TxtEmail")).sendKeys("qa.circulus@gmail.com");
		d.findElement(By.id("TxtPassword")).click();
		d.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		d.findElement(By.id("BtnLogin")).click();
		Thread.sleep(5000);
	}

	@BeforeTest
	public void URL() {
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://qa.circulus.io");
	}
	@AfterTest
	public void Close() {
		
		d.quit();
	}

}
