import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Findelement {

	WebDriver driver = null;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver","E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test()
	public void test() throws InterruptedException {
		WebElement option = driver.findElement(By.xpath("//option[@id='country5']"));
		System.out.print(option.getAttribute("id") + " - " + option.getText());
		List<WebElement> options = driver.findElements(By.xpath("//option"));
		System.out.println(options.size());
		for (int i = 0; i <= options.size(); i++) {
			String str = options.get(i).getAttribute("id") + " - "+ options.get(i).getText();
			System.out.println(str);
			
			SoftAssert softassert = new SoftAssert();
			softassert.assertAll();
		}
	}
}
