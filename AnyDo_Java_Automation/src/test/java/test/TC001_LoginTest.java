package test;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base_AnyDo.Driver_Setup;

import pageObject.TC001_LoginPage;

public class TC001_LoginTest extends Driver_Setup {
	String baseUrl = "https://desktop.any.do/";

	@Test
	public void loginPageVerify() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);

		TC001_LoginPage loginPage = new TC001_LoginPage(driver);

		loginPage.clickOnEmail();
		Thread.sleep(5000);

		loginPage.enterEmail("demomail342@gmail.com");
		Thread.sleep(5000);
		System.out.println("Successfully take enter e-mail");

		loginPage.clkNextBtn1();
		Thread.sleep(5000);

		loginPage.enterPassword("Maildemo@342");
		Thread.sleep(5000);
		System.out.println("Successfully take enter password");
		
		loginPage.clkNextBtn2();
		Thread.sleep(5000);
		

	}
/*	
	@Test
	public void enterIntoKidsBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("demomail342@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='password']")).sendKeys("Maildemo@342");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(10000);
		String kids = "Login";
		System.out.println("Successfully visit: " + kids);

	}
*/
	
}
