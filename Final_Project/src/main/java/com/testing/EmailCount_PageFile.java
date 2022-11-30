package com.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EmailCount_PageFile extends LocatorsFile {

	// assign driver variable to intialize webelements
	public WebDriver driver;

	// Invoking google chrome broswer
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\workspace3\\Final_Project\\Project_Data\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	// Opening Gmail website to perform testing
	public void openURL() {
		driver.get("https://www.gmail.com");
	}

	// Entering valid Email & Password to login
	public void enterEmailPassword() throws InterruptedException {
		Thread.sleep(1000);
		emailTextBox.sendKeys("testingproject074@gmail.com");
		Thread.sleep(1000);
		nextEmailButton.click();
		passwordTextBox.sendKeys("Test@1234");
		Thread.sleep(1000);
		nextPasswordButton.click();
		Thread.sleep(1000);
	}

	// Checking is current page is inbox or not
	public void verifyURL() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://mail.google.com/mail/u/0/#inbox";
		Assert.assertEquals(expectedURL, actualURL);
		System.out.println("Current page is Inbox");
	}

	// Displaying number of Emails in Inbox
	public void displayEmail() {
		List<WebElement> displayedEmail = driver.findElements(By.xpath("//tr[@jscontroller=\"ZdOxDb\"]"));
		System.out.println("Displayed Emails on 1st page = " + displayedEmail.size());
	}

	// Total number of the Emails in Inbox
	public void totalEmails() {
		System.out.println("Total Number of Emails in Inbox =" + totalEmail.getText());
	}

	// Closing Browser
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
