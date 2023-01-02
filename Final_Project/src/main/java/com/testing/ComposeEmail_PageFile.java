package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ComposeEmail_PageFile extends LocatorsFile implements DataFile{

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
		driver.get("https:www.gmail.com");
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
		Thread.sleep(3000);
	}
	
	//Composing new email
	public void composeEmail() throws InterruptedException {
		composeEmailButton.click();
		Thread.sleep(1000);
		senderEmailTextbox.sendKeys("abc01@gmail.com");
		Thread.sleep(1000);
		subjectTextbox.sendKeys("Testing Email");
		Thread.sleep(1000);
		bodyTextbox.sendKeys("This is my first automation email");
		Thread.sleep(1000);
		sendButton.click();
		Thread.sleep(1000);
		String sendMessage =sendMessageAlert.getText();
		System.out.println("Message send verification "+ sendMessage);
		
	}
}
