import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseHoverEvent {

	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@Test
	public void test () throws IOException {  
		//Generate mouse hover event on main menu to click on sub menu
		Actions actions = new Actions(driver);
		WebElement webelement = driver.findElement(By.xpath("//div[@id='menu1']/div"));
		actions.moveToElement(webelement).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Google"));
	 }
}