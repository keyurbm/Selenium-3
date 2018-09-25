import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Noofrowsandcols {

	@Test
	public void test(){
		// TODO Auto-generated method stub
		WebDriver wd;
		System.setProperty("webdriver.gecko.driver","E://My Work//Automation//Selenium-3//Drivers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E://My Work//Automation//Selenium-3//Drivers//chromedriver.exe") ;
		wd = new ChromeDriver();
        wd.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
        
        //No.of Columns
        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        
        //No.of rows 
        List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th[1]")); 
        System.out.println("No of rows are : " + rows.size());
        
        wd.close();
	}
}
