import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementByTagname {
	// To open Firefox browser
	WebDriver driver = null;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Locating element by tagName and store its text in to variable dropdown.
		String dropdown = driver.findElement(By.tagName("select")).getText();
		System.out.print("Drop down list values are as bellow :\n" + dropdown);
		
		//Select select = new Select (driver.findElement(By.tagName("select")));
		//select.selectByVisibleText("Volvo");
		//select.selectByIndex(1);
	}
}
