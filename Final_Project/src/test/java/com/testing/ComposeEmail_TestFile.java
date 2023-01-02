package com.testing;

import org.testng.annotations.Test;

/* With correct credentials user is go on inbox and composing new email with subject "Testing Email" and send it to abc01@gmail.com */


public class ComposeEmail_TestFile  extends ComposeEmail_PageFile {
	
	ComposeEmail_PageFile cp=new ComposeEmail_PageFile();
  
	@Test
  public void beforeMethod() throws InterruptedException {
	  cp.invokeBrowser();
	  cp.openURL();
	  cp.enterEmailPassword();
	  
  }
  @Test
  public void createNewEmail() throws InterruptedException
  {
	  cp.composeEmail();
	  
	  
  }
}
