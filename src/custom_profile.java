import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class custom_profile {
	WebDriver driver;

	@BeforeTest
	public void StartBrowser() {
		// Create object of webdriver's inbuilt class ProfilesIni to access Its
		// method getProfile.
		ProfilesIni firProfiles = new ProfilesIni();
		// Get access of newly created profile WebDriver_Profile.
		FirefoxProfile wbdrverprofile = firProfiles.getProfile("kbm");
		//FirefoxProfile wbdrverprofile = new FirefoxProfile(new file("C:\Program Files (x86)\Mozilla Firefox\firefox.exe"));
		System.setProperty("webdriver.gecko.driver", "E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver(wbdrverprofile);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void OpenURL() {
		driver.get("http://www.google.com");
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
