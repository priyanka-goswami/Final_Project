package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarkAsRead_TestFile  {
 
	MarkAsRead_PageFile mar=new MarkAsRead_PageFile();
	
	 @BeforeClass
	  public void beforeMethod() throws InterruptedException {
		mar.invokeBrowser();
		mar.openURL();	
	  }
	 @Test
	  public void TC001Test() throws InterruptedException {
		  mar.enterEmailPassword();
	  }
	 
	 @Test
	  public void TC003Test() throws InterruptedException {
		  mar.selectReadEmail();
	  }

	 @Test
	  public void TC004Test() throws InterruptedException {
		  mar.readToUnread();
	  }
	 
	 @Test
	  public void TC005Test() throws InterruptedException {
		  mar.unreadToReadAgain();
	  }
	  @AfterClass
	  public void afterMethod() throws InterruptedException {
		 mar.closeBrowser();
	  }
	
}
