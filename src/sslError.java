import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.Wdm;

public class sslError {
	WebDriver driver;

	@BeforeTest
	public void StartBrowser() {
		// Create object of webdriver's inbuilt class ProfilesIni to access Its
		// method getProfile.
		ProfilesIni firProfiles = new ProfilesIni();
		// Get access of newly created profile WebDriver_Profile.
		FirefoxProfile wbdrverprofile = firProfiles.getProfile("kbm");
		wbdrverprofile.setAcceptUntrustedCertificates(true);
		wbdrverprofile.setAssumeUntrustedCertificateIssuer(false);
		//FirefoxProfile wbdrverprofile = new FirefoxProfile(new file("C:\Program Files (x86)\Mozilla Firefox\firefox.exe"));
		System.setProperty("webdriver.gecko.driver", "E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		driver = new FirefoxDriver(wbdrverprofile);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void OpenURL() {
		driver.get("http://www.amazon.co.in");
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
	
	
}
