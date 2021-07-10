package com.opensource.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Selenium wrapper class base class
 * @author mik amador
 *
 */
public class SeleniumWrapper {

	private WebDriver driver;
	
	/**
	 * contructor selenium wrapper
	 * @author mike amador
	 * @param driver
	 * @return
	 * 
	 */
	public SeleniumWrapper (WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * metodo chrome driver conection
	 * @author mik amador
	 */
	
	public WebDriver chromeDriverConnection() {
		 System.setProperty(GlobalVariables.CHROME_DRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);  
		  driver = new ChromeDriver();
		  return driver;
	}
	
	/**
	 * reporter
	 * @author maaj_
	 */
	public void reportLog(String log) {
		Reporter.log(log);
	}
	
	/**
	 * Implicit wait
	 * @author mik amador
	 */
	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	/**
	 * launch browser
	 * @author mik amador
	 */
	public void launchBrowser (String url) {
		try {
			reportLog("Launching... " + url + " aplication");
			driver.get(url);
			driver.manage().window().maximize();
			implicitWait(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		/**
		 * find element
		 * @author maaj_
		 */
		public WebElement findElement(By locator) {
			return driver.findElement(locator);
		}
		
		/**
		 * type test send keys
		 * @author maaj_
		 */
		public void type (String inputTex, By locator) {
			driver.findElement(locator).sendKeys(inputTex);
		}
		
		/**
		 * click object
		 * @author maaj_
		 */
		public void click(By locator) {
			driver.findElement(locator).click();
		}
		
		/**
		 * Wait for element present
		 * @author maaj_
		 */
		public void waitForElementPresent(By locator) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			}catch(TimeoutException e) {
				e.printStackTrace();				
			}
		}
	}

