package com.testing;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Login_TestFile  extends Login_PageFile{
	
	Login_PageFile lpf=new Login_PageFile();

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  lpf.invokeBrowser();
	  lpf.openURL(); 
  }
  @Test
  public void TC001()
  {
	  lpf.emailTextBoxPresent();
  }
  @Test
  public void TC002()
  {
	  lpf.emailNextButtonPresent();
  }
  @Test
  public void TC003() throws InterruptedException
  {
	  lpf.passwordTextboxPresent();
  }
  @Test
  public void TC004() throws InterruptedException
  {
	  lpf.passwordNextButtonPresent();
  }
  @Test
  public void TC005Test() throws InterruptedException { 	
	  lpf.blankEmail();
  }
  
  @Test
  public void TC006Test() throws InterruptedException { 	
	  lpf.blankPassword();
  }
  
  @Test
  public void TC007Test() throws InterruptedException { 	
	  lpf.validEmailInvalidPassword();
  }

 @Test
  public void TC008Test() throws InterruptedException { 	
	  lpf.emailWithoutSign();
  }
 @Test
 public void TC009Test() throws InterruptedException { 	
	  lpf.withoutGmail();
 }
 
 @Test
 public void TC010Test() throws InterruptedException { 	
	  lpf.wrongPhonenumber();
 }
 
 @Test
 public void TC012Test() throws InterruptedException { 	
	  lpf.radomEmail();
 }
 
 @Test
 public void TC013Test() throws InterruptedException { 	
	  lpf.validEmailPassword();
 }
 
  @AfterMethod
	public void afterMethod() throws InterruptedException {
		lpf.closeBrowser();
	}
}
