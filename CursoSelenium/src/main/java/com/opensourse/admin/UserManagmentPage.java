package com.opensourse.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagmentPage extends SeleniumWrapper {

	public UserManagmentPage(WebDriver driver) {
		super(driver);
	}
	
	By linkUM = By.xpath("//a[@id=\'menu_admin_viewAdminModule']\"");
	By txtusername = By.xpath("//input[@id='searchSystemUser_userName']");

	/**
	 * Validate login succes
	 */
	public void validateLoginSuccesFully () {
		reportLog("Validate that you have logged in successfully");
		waitForElementPresent(linkUM);
		
	}
	
	/**
	 * click admin
	 */
	public void clickAdmin() {
		reportLog("Click Admin - Go to the admin page");
		click(linkUM);
		waitForElementPresent(txtusername);
	}
}
