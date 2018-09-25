import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class JavaSE_Test2 {
	@Test
	public void Login() {
		System.setProperty("webdriver.gecko.driver",
				"E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");

		 WebDriver driver= new FirefoxDriver();			
 		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://moneyboats.com/");			
	     
	        //Maximize window		
	        driver.manage().window().maximize();		
	        		
	        //Vertical scroll down by 600  pixels		
	        js.executeScript("window.scrollBy(0,600)");	
	}
}
