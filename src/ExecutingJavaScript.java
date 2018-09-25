import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutingJavaScript {

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
	public void test () {  
	  String CurrentURL = driver.getCurrentUrl();
	  System.out.println("My Current URL Is  : "+CurrentURL);
	  
	  //Get and store domain name in variable
	  JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  String DomainUsingJS=(String)javascript.executeScript("return document.domain");  
	  System.out.println("My Current URL Is  : "+DomainUsingJS);
	 }
}