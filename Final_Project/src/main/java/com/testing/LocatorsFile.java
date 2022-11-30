package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

	//Scenario1: Locators
	@FindBy(xpath="//input[contains(@id,\"identifierId\")]") public WebElement emailTextBox;									//Locating Textbox to enter email/phone number
	@FindBy(xpath="//div[contains(@id, \"identifierNext\")]") public WebElement nextEmailButton;		  					 //Locating Next button 
	@FindBy(xpath="//input[contains(@name, \"Passwd\")]") public WebElement passwordTextBox;		   					//Locating Textbox to enter password
	@FindBy(id="passwordNext") public WebElement nextPasswordButton; 												 					 //Locating Nextbutton 
	@FindBy(xpath="//div[contains(@class, 'o6cuMc')]") public WebElement emptyEmailMessage;							//Locating Error while leaving email empty
	@FindBy(xpath="//div[contains(@class,'OyEIQ uSvLId')]") public WebElement emptyPasswordMessage;		   //Locating Error while leaving password empty
	@FindBy(xpath="//div[contains(@class, 'o6cuMc')]") public WebElement notFoundAccountMessage;               //Locating Error while entering invalid email
	
	//Scenario2: Locators							
	@FindBy(xpath="//div[contains(@id,':kj')]/span/span[2]") public WebElement totalEmail; 									 //Locating total number of emails in inbox
	
	//Scenario3: Locators
	@FindBy(xpath="//div[contains(@id,\":3a\")]") public WebElement selectedEmail;													  //Locate specific email to select and delete
	@FindBy(xpath="//*[@id=\":4\"]/div/div[2]/div[1]/div/div/div[2]/div[3]") public WebElement deleteButton; 	  //Locate delete option for email
    @FindBy(xpath="(//div[contains(@class, \"TO\")])[6]") public WebElement trashMenu;  										 //Locate trash option
	@FindBy(xpath="(//td[contains(@class, \"oZ-x3 xY\")])[51]") public WebElement deletedEmail;  							 //Locate delete email
	@FindBy(xpath="//span[contains(@class, 'bAq')]") public WebElement deleteMessageAlert;                                 //Locate deleted message verified message
	@FindBy(xpath="(//div[contains(@class,\"asa\")])[18]") public WebElement moveToButton; 								// Locate move to option
	@FindBy(xpath="(//div[contains(@class, \"J-N\")])[35]") public WebElement moveInboxOption;   					   //Locate to inbox from trash
	@FindBy(xpath="(//div[contains(@class, \"aim\")])[1]") public WebElement inboxMenu;                                     //Locate inbox option

	//Scenario4: Locators
	@FindBy(xpath="//div[contains(@id,\":2k\")]") public WebElement readEmail;                                     			 	 //Locate read email
	@FindBy(xpath="(//div[contains(@class,\"asa\")])[11]") public WebElement actionButton;              					 //Locate action button
	@FindBy(xpath="(//div[contains(@class, 'J-N-Jz')])[9]") public WebElement markAsUnreadOption;     			 //Locate option to mark as unread
	@FindBy(xpath="//span[contains(@class, 'bAq')]") public WebElement msgFromUnread;                  				 //Locate message of unread action event
	@FindBy(xpath="(//div[contains(@class, \"J-N-Jz\")])[8]") public WebElement marlAsReadOption;       			 //Locate mark as read option in action button
	
}
