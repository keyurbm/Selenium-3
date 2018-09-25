import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebPageTableData {
	
	public WebDriver driver;
	
	@BeforeTest
		public void setup() {
			System.setProperty("webdriver.gecko.driver", "E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		}
	
	@AfterTest
		public void tearDown() { 
			driver.quit();
		}
	
	@Test
	public void print_data() {
		
		//Get number of rows In table.
		List<WebElement> Row_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
		System.out.println("Number Of Rows = " + Row_count.size());
		
		//Get number of columns In table.
		List<WebElement> Col_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
		System.out.println("Number Of Rows = " + Col_count.size());
		
		//divided xpath In three parts to pass Row_count and Col_count values.
		String first_part = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";
		
		//Used for loop for number of rows.
		for (int i=1; i<=Row_count.size(); i++) {
			//Used for loop for number of columns.
			for (int j=1; j<=Col_count.size(); j++) {
				//Prepared final xpath of specific cell as per values of i and j.
				String final_xpath = first_part + i + second_part + j + third_part;
				//Will retrieve value from located cell and print It.
				String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
				System.out.println(Table_data + " ");
			}
			System.out.println(" ");
			System.out.println(" ");
		}
	}
	
}
