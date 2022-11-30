
package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrashEmail_TestFile {
	
	TrashEmail_PageFile tef=new TrashEmail_PageFile();
	
	  @BeforeClass
	  public void beforeMethod() throws InterruptedException {
		tef.invokeBrowser();
		tef.openURL();
	  }
	  
	  @Test
	  public void TC001Test() throws InterruptedException { 	
		  tef.enterEmailPassword();
	  }
	  
	  @Test
	  public void TC004Test() throws InterruptedException { 	
		 tef.selecteEmail();
	  }
	  
	  @Test
	  public void TC005Test() throws InterruptedException { 	
	     tef.deleteSelectedEmail();
	  }
	  
	  @Test
	  public void TC006Test() throws InterruptedException { 	
	     tef.totalEmails();
	  }
	  
	  @Test
	  public void TC008Test() throws InterruptedException { 	
	     tef.moveToInbox();
	  }
	  
 @Test
	  public void TC009Test() throws InterruptedException { 	
	     tef.totalEmails();
	  }
	 
	  @AfterClass
	  public void afterMethod() throws InterruptedException {
		  tef.closeBrowser();
	  }
}
