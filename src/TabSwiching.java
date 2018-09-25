import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabSwiching {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver", "G://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	@Test
	public void testTabs() throws InterruptedException {
		// open the first tab
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		// open the second tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);

		// switch to the previous tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "" + Keys.SHIFT + "" + Keys.TAB);
		Thread.sleep(2000);
	}
	

}
