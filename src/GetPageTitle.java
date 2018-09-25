import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class GetPageTitle {

	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "E://MyWork//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.navigate().to("");
	}

	@Test(priority=0) 
		public void test2(){
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 //By xpath
		 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		 
		 //By Linktext
		 //driver.findElement(By.linkText("Click Here")).click();
		 
		 Thread.sleep(5000);
		 
		 //Wait for page title
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.titleContains(": MyTest"));
		 
		//Get and store page title in to variable
		 String title = driver.getTitle();
		 System.out.println(title);
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}