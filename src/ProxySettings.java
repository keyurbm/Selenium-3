import java.io.IOException;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProxySettings {

	WebDriver driver;

	@BeforeTest
	public void setUpDriver() {
		// Set proxy IP and port. Here localhost Is proxy IP and 8080 Is Port
		// number.
		// You can change both values as per your requirement.
		String PROXY = "localhost:9999";
		// Bellow given syntaxes will set browser proxy settings using
		// DesiredCapabilities.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY)
				.setSocksProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		// Use Capabilities when launch browser driver Instance.
		System.setProperty("webdriver.gecko.driver", "G://geckodriver.exe");
		driver = new FirefoxDriver(cap);
	}

	@Test
	public void start() throws IOException {
		System.out
				.println("Check your webdriver driver Instance's proxy setttings.");
	}
}