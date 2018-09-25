import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MultiSelectCommands {
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "G://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	//@AfterTest (enabled=false)
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test (priority=1)
	public void test() throws InterruptedException {
		WebElement webelement = driver.findElement(By.name("selenium_commands"));
		Select select = new Select(webelement);
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.deselectByIndex(0);
		
		select.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		select.deselectByVisibleText("Navigation Commands");
		
		List<WebElement> size = select.getOptions();
		int ListSize = size.size();
		
		// Setting up the loop to print all the options
		for (int i=0; i<ListSize; i++) {
			// Storing the value of the option
			String value = select.getOptions().get(i).getText();
			
			// Printing the stored value
			System.out.println(value);
			
			// Selecting all the elements one by one
			select.selectByIndex(i);
			Thread.sleep(2000);
			
			// Step 7: Deselect all
			select.deselectAll();
		}
	}
}
