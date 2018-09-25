import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DropDownCommands {
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "G://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	//@AfterTest (enabled = false)
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test (priority=1)
	public void test() throws InterruptedException {
		
		WebElement webelement = driver.findElement(By.xpath(".//select[@id='continents']"));
		Select select = new Select(webelement);
		
		select.selectByVisibleText("Europe");
		Thread.sleep(2000);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		List<WebElement> size = select.getOptions();
		int ListSize = size.size();
		
		for (int i=0; i<ListSize; i++) {
			String value = select.getOptions().get(i).getText();
			System.out.println(value);
			/*if(value.equals("Africa")) {
				select.selectByIndex(i);
				break; 
			} */
		}
	}
}
