import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementByClassname {

	private WebDriver driver;

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
		// Locating element by className and store its text to variable datentime
		//String datentime = driver.findElement(By.className("date-header")).getText();
		String datentime = driver.findElement(By.xpath("//h2[@class='date-header']/span[1]")).getText();
		System.out.print(datentime);
	}
}