import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleThree {
	
	//String driverPath = "<path to gecko driver executable>";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver","E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	}

	@Test
	public void LogIn_Test() {
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Keyur");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Makwana");
		driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("9909123789");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("KBM");
		//To submit form.
		//You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='submit' and @value='Submit']")).submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String alrt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alrt);
	}
	
	@AfterTest
	public void closeDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}
}