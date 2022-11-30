package com.testing;

public interface Login_DataFile {

	Login_Xls_Reader xr=new Login_Xls_Reader( "C:\\Users\\priya\\workspace3\\Final_Project\\Project_Data\\Manual_TestCases.xlsx" );
	
	public String openURL=xr.getCellData("Senario1_TestData", 1, 1);  //Catching URL which require for precondition
	
	public String username_005=xr.getCellData("Senario1_TestData", 1, 5); 
	public String password_005=xr.getCellData("Senario1_TestData", 2, 5); 
	
	public String username_006=xr.getCellData("Senario1_TestData", 1, 6); 
	public String password_006=xr.getCellData("Senario1_TestData", 2, 6); 
	
	public String username_007=xr.getCellData("Senario1_TestData", 1, 7); 
	public String password_007=xr.getCellData("Senario1_TestData", 2, 7); 
	
	public String username_008=xr.getCellData("Senario1_TestData", 1, 8); 
	public String password_008=xr.getCellData("Senario1_TestData", 2, 8); 
	
	public String username_009=xr.getCellData("Senario1_TestData", 1, 9); 
	public String password_009=xr.getCellData("Senario1_TestData", 2, 9); 
	
	public String username_010=xr.getCellData("Senario1_TestData", 1, 10); 
	public String password_010=xr.getCellData("Senario1_TestData", 2, 10); 
	
	public String username_012=xr.getCellData("Senario1_TestData", 1, 11); 
	public String password_012=xr.getCellData("Senario1_TestData", 2, 11); 
	
	public String username_013=xr.getCellData("Senario1_TestData", 1, 12); 
	public String password_013=xr.getCellData("Senario1_TestData", 2, 12);
}

