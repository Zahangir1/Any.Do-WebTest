package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TC001_LoginPage {
	WebDriver driver = null;

	public TC001_LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By gmailBtn = By.xpath("//body/div[@id='root']/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
	By emailField = By.xpath("//input[@id='identifierId']");
	By nextBtn1 = By.xpath("//span[contains(text(),'Next')]");
	By passwordField = By.xpath("//div[@id='password']");
	By nextBtn2 = By.xpath("//span[contains(text(),'Next')]");

	public void clickOnEmail() {
		driver.findElement(gmailBtn).sendKeys(Keys.RETURN);
	}

	public void enterEmail(String text) {
		driver.findElement(emailField).sendKeys(text);
	}
	
//	public void enterEmail() {
//		driver.findElement(emailField).click();
//	}


	public void clkNextBtn1() {
		driver.findElement(nextBtn1).click();
	}

	public void enterPassword(String text) {
		driver.findElement(passwordField).sendKeys(text);
	}
//	public void enterPassword() {
//		driver.findElement(passwordField).click();
//	}
	
	public void clkNextBtn2() {
		driver.findElement(nextBtn2).click();
	}

}
