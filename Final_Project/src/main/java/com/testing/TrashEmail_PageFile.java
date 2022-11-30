package com.testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TrashEmail_PageFile extends LocatorsFile implements Login_DataFile {

	// assign driver variable to initialize webelements
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
		emailTextBox.sendKeys(username_013);
		Thread.sleep(1000);
		nextEmailButton.click();
		passwordTextBox.sendKeys(password_013);
		Thread.sleep(1000);
		nextPasswordButton.click();
		Thread.sleep(1000);
	}

	// Select particular one email from Inbox
	public void selecteEmail() throws InterruptedException {
		selectedEmail.click();
		System.out.println("Is email selected: " + selectedEmail.isSelected());

	}

	// Delete selected email
	public void deleteSelectedEmail() throws InterruptedException {
		Thread.sleep(3000);
		deleteButton.click();
		System.out.println(deleteMessageAlert.getText());
	}

	// Print total number of emails in Inbox
	public void totalEmails() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Total Number of Emails in Inbox  =" + totalEmail.getText());
	}

	// Move deleted email to Inbox again
	public void moveToInbox() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		trashMenu.click();
		deletedEmail.click();
		System.out.println("Is deleted email selected: " + deletedEmail.isSelected());
		moveToButton.click();
		moveInboxOption.click();
		inboxMenu.click();
		System.out.println("Email moved successfully to Inbox");
	}

	// Closing Browser
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
