package com.opensource.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{

	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Objetos
	By txtUsername = By.xpath("//input[@id='txtUsername']");
	By txtPassword = By.xpath("//input[@id='txtPassword']");
	By btnLogin = By.xpath("//input[@id='btnLogin");
	
	//Metodos
	
	/**
	 * set up enviroment
	 * @author maaj_
	 */
	public void setup(String url) {
		launchBrowser(url);
	}
	
	/**
	 * metodo login orange
	 * @author maaj_
	 */
	public void logingOrange(String username, String password) {
		reportLog("Login orange web page");
		type(username, txtUsername);
		type(password, txtPassword);
		click(btnLogin);
		implicitWait(5);
		
	}
	


}
