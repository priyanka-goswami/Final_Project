package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MarkAsRead_PageFile extends LocatorsFile {
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

	//Selecting one of readed email
	public void selectReadEmail() throws InterruptedException {
		readEmail.click();
		actionButton.click();
		Thread.sleep(2000);
	}

	// Make read email to unread
	public void readToUnread() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		markAsUnreadOption.click();
		System.out.println(msgFromUnread.getText());
	}

	// Make unread email to read again
	public void unreadToReadAgain() throws InterruptedException {
		Thread.sleep(2000);
		actionButton.click();
		Thread.sleep(2000);
		marlAsReadOption.click();
		System.out.println(msgFromUnread.getText());

	}

	// Closing Browser
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
