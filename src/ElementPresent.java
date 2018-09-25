import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementPresent {
	public WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver",
				"E://MyWork//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	};

	@Test
	public void test() throws InterruptedException {
		for (int i = 1; i < 6; i++) {

			// To verify element is present on page or not.
			String XPath = "//input[@id='text" + i + "']";
			Boolean iselementpresent = driver.findElements(By.xpath(XPath))
					.size() != 0;
			if (iselementpresent == true) {
				System.out.print("\nTargeted TextBox" + i
						+ " Is Present On The Page");
			} else {
				System.out.print("\nTargeted Text Box" + i
						+ " Is Not Present On The Page");
			}
		}
	}
}
