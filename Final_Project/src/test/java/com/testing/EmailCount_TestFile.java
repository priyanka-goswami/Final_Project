package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailCount_TestFile {
	
	EmailCount_PageFile ecp=new EmailCount_PageFile();
	
  @BeforeClass
  public void beforeMethod() throws InterruptedException {
	ecp.invokeBrowser();
	ecp.openURL();
  }
  
  @Test
  public void TC001Test() throws InterruptedException { 	
	  ecp.enterEmailPassword();
  }
  
  @Test
  public void TC002Test() throws InterruptedException { 	
	  ecp.verifyURL();
  }
  @Test
  public void TC005Test() throws InterruptedException {	
  ecp.displayEmail();
  }
  
  @Test
  public void TC006Test() throws InterruptedException { 	
	  ecp.totalEmails();
  }
  @AfterClass
  public void afterMethod() throws InterruptedException {
	  ecp.closeBrowser();
  }
}
