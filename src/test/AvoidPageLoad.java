package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;


public class AvoidPageLoad {
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		// Create custom profile and set preference webdriver.load.strategy = unstable
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("webdriver.load.strategy", "unstable");

		// Load firefox driver with custom profile.
		driver = new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	@Test
	public void clickBeforeLoad() {
		// This action will not wait for page to load completely.
		// Click action will be performed during page load.
		driver.findElement(By.xpath("//button[@onclick='myFunctionf()']")).click();
		System.out.println("Button got clicked");
	}
}
