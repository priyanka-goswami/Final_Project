package com.testing;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import net.sourceforge.htmlunit.corejs.javascript.ast.ErrorCollector;

public class Login_PageFile extends LocatorsFile implements DataFile {

// assign driver variable to initialize webelements
	public WebDriver driver; 

// Invoking browser
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\workspace3\\Final_Project\\Project_Data\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(); // set default browser as Chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

// Opening Gmail website to perform testing
	public void openURL() {
		driver.get("https://www.gmail.com");
	}

	// **************************** Test Cases of User Interface**************************//

// checking user interface- TC001
	public void emailTextBoxPresent() {
		System.out.println("Is Email Text box present - " + emailTextBox.isDisplayed());
	}

// Checking user interface- TC002
	public void emailNextButtonPresent() {
		System.out.println("Is Next button present - " + nextEmailButton.isDisplayed());
	}

// Checking user interface- TC003
	public void passwordTextboxPresent() throws InterruptedException {
		emailTextBox.sendKeys(username_013);
		Thread.sleep(2000);
		nextEmailButton.click();
		Thread.sleep(2000);
		System.out.println("Is password textbox present after entering correct email - " + passwordTextBox.isDisplayed());
	}

// Checking user interface-TC004
	public void passwordNextButtonPresent() throws InterruptedException {
		emailTextBox.sendKeys(username_013);
		Thread.sleep(2000);
		nextEmailButton.click();
		Thread.sleep(2000);
		System.out.println("Is password textbox present after entering correct email - " + nextPasswordButton.isDisplayed());
	}

//******************** TEST Cases with Excel Data*****************//

		
//Check blank email- TC005
	public void blankEmail() throws InterruptedException {
		Thread.sleep(1000);
		emailTextBox.sendKeys(username_005);
		Thread.sleep(1000);
		nextEmailButton.click();
		String expectedError005 = "Enter an email or phone number";
		String actualError005 = emptyEmailMessage.getText();
		Assert.assertEquals(expectedError005, actualError005);
	}

 // Check blank password- TC006
	public void blankPassword() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		emailTextBox.sendKeys(username_006);
		nextEmailButton.click();
		passwordTextBox.sendKeys(password_006);
		nextPasswordButton.click();
		Thread.sleep(4000);
		String actualError006 = emptyPasswordMessage.getText();
		Thread.sleep(4000);
		String expectedError006 = "Enter a password";
		Assert.assertEquals(actualError006, expectedError006);
	}

//Valid Email/Phone number , Invalid Password- TC007
	public void validEmailInvalidPassword() throws InterruptedException {
		Thread.sleep(1000);
		emailTextBox.sendKeys(username_007);
		Thread.sleep(1000);
		nextEmailButton.click();
		Thread.sleep(1000);
		passwordTextBox.sendKeys(password_007);
		Thread.sleep(1000);
		nextPasswordButton.click();
		Thread.sleep(2000);
		String actualError007 = emptyPasswordMessage.getText();
		Thread.sleep(2000);
		String expectedError007 = "Wrong password. Try again or click Forgot password to reset it.";
		Assert.assertEquals(actualError007, expectedError007);
	}

//Invalid Email-without @ - TC008
	public void emailWithoutSign() throws InterruptedException {
		Thread.sleep(1000);
		emailTextBox.sendKeys(username_008);
		Thread.sleep(2000);
		nextEmailButton.click();
		Thread.sleep(2000);
		String actualError008 = notFoundAccountMessage.getText();
		Thread.sleep(2000);
		System.out.println(actualError008);
		String expectedError008 = "Couldn’t find your Google Account";
		Assert.assertEquals(actualError008, expectedError008);
	}

//Valid Email without gmail.com, Valid Password- TC009
	public void withoutGmail() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		emailTextBox.sendKeys(username_009);
		nextEmailButton.click();
		passwordTextBox.sendKeys(password_009);
		nextPasswordButton.click();
		Thread.sleep(4000);
		String actualURL = driver.getCurrentUrl();
		Thread.sleep(4000);
		if (actualURL.contains("inbox")) {
			System.out.println("Welcome you are logged in Successfully");
		} else {
			System.out.println("Test Failed");
		}
	}

//Check wrong phonenumber - TC010
	public void wrongPhonenumber() throws InterruptedException {
		Thread.sleep(2000);
		emailTextBox.sendKeys(username_010);
		Thread.sleep(2000);
		nextEmailButton.click();
		Thread.sleep(2000);
		String actualError010 = notFoundAccountMessage.getText();
		Thread.sleep(2000);
		String expectedError010 = "Couldn’t find your Google Account";
		Assert.assertEquals(actualError010, expectedError010);
	}

//Invalid Email-random email- TC012
	public void radomEmail() throws InterruptedException {
		Thread.sleep(1000);
		emailTextBox.sendKeys(username_012);
		Thread.sleep(1000);
		nextEmailButton.click();
		Thread.sleep(2000);
		String actualError012 = notFoundAccountMessage.getText();
		Thread.sleep(2000);
		String expectedError012 = "Couldn’t find your Google Account";
		Assert.assertEquals(actualError012, expectedError012);
		;
	}

//Valid Email/Phone number, Valid Password
	public void validEmailPassword() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		emailTextBox.sendKeys(username_013);
		nextEmailButton.click();
		passwordTextBox.sendKeys(password_013);
		nextPasswordButton.click();
		Thread.sleep(4000);
		String actualURL = driver.getCurrentUrl();
		Thread.sleep(4000);
		if (actualURL.contains("inbox")) {
			System.out.println("Welcome you are logged in Successfully");
		} else {
			System.out.println("Test Failed");
		}
	}

//Closing Browser
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
