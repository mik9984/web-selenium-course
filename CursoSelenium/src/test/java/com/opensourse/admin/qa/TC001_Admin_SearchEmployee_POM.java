package com.opensourse.admin.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;
import com.opensource.login.LoginPage;
import com.opensourse.admin.UserManagmentPage;

public class TC001_Admin_SearchEmployee_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	LoginPage login;
	UserManagmentPage um;
	String username, password;
	
	@BeforeTest
  public void beforeTest() {
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper .chromeDriverConnection();
	  login = new LoginPage(driver);
	  um = new UserManagmentPage(driver);
	  
	  //Setup date
	  this.username = "Admin";
	  this.password = "admin123";
  }

  @Test
  public void TC001_Admin_SearchEmployee_POM_Script() {
	  //Step - 1
	  login.setup(GlobalVariables.QA_URL);
	  
	  //Step 2
	  login.logingOrange(username, password);
	  
	  //Step 3
	  um.validateLoginSuccesFully();
	  
	  //Step 4
	  um.clickAdmin();
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
