import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TypingTextInToTextbox {

	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "G://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  //Locating element by Name and type given texts in to input box.
		 driver.findElement(By.name("fname")).sendKeys("Keyur Makwana");
		 
		 Thread.sleep(2000);
		} 
	}