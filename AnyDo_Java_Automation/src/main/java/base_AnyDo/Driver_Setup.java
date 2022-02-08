package base_AnyDo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Setup {
	// WebDriver is an interface that available in selenium jar files. driver is WebDriver reference variable
	// instantiate variable
	public WebDriver driver;

	// Setup instantiate a browser using WebDriverManager
	@BeforeSuite
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
	    driver = new ChromeDriver(); 
	}

	@AfterSuite
	public void close() {
		// driver.close();
		driver.quit();
	}

}
