import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementById {

	public WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "E://MyWork//Automation//Selenium-3//Drivers//geckodriver.exe");
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i <= 20; i++) {
			WebElement btn = driver.findElement(By.id("submitButton"));// Locating element by id
			if (btn.isEnabled()) {
				// if webelement's attribute found enabled then this code will be executed.
				System.out.print("\nCongr8s... Button is enabled and webdriver is clicking on it now");

				// Locating button by id and then clicking on it.
				driver.findElement(By.id("submitButton")).click();
				i = 20;

			} else {
				// if webelement's attribute found disabled then this code will
				// be executed.
				System.out.print("\nSorry but Button is disabled right now..");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test2() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i <= 20; i++) {
			WebElement btn = driver.findElement(By.id("submitButton"));// Locating element by id
			if (btn.isEnabled()) {
				// if webelement's attribute found enabled then this code will be executed.
				System.out.print("\nCongr8s... Button is enabled and webdriver is clicking on it now");

				// Locating button by id and then clicking on it.
				driver.findElement(By.id("submitButton")).click();
				i = 20;

			} else {
				// if webelement's attribute found disabled then this code will
				// be executed.
				System.out.print("\nSorry but Button is disabled right now..");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}