package com.opensourse.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC005_Admin_CreateUserDisabled {

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void TC005_Admin_CreateUserDisabled_Script() {

		// Data
		String username = "Admin";
		String password = "admin123";
		String employee = "Aaliyah Haq";
		int random = (int) (Math.random() * 100);
		String newuser = "Jorge Campos" + random;
		String mainPwd = "admin123";

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Step 1 -Open Browser "OrangeHRM" web page
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 2 - Enter Username and Password
		Reporter.log("Open Browser \\\"OrangeHRM\\\" web page");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		// driver.findElement(By.id("txtUserName")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 3 - Validate that you have logged in successfully
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_viewAdminModule']")));

		// Step 4 - Click Admin - Go to the admin page
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));

		// Step 5 - Click Add
		Reporter.log("Click Add");
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		

		// Step 6 - Enter valid Employee Name
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys(employee);

		// Step 7 - Enter valid username
		Reporter.log("Enter valid username");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(newuser);

		//Step 8 - Change Status Disabled
		Reporter.log("Change Status Disabled");
		//Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		//dropdown.selectByValue("0");
		driver.findElement(By.xpath("//option[@value='0']")).click();
		
		
		// Step 9 - Enter new password and confirm
		Reporter.log("Enter new password and confirm");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys(mainPwd);
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys(mainPwd);

		// Step 10 - Click Save
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		// Step 11 - Search username in field "Username"
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newuser);

		// Step 12 - Click Search
		Reporter.log("Click Search");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13 - Verify username exist in table
		Reporter.log("Verify username exist in table");
		String getUsername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		// hard assertion si no es igual a lo que tiene la prueba finaliza no continua
		// la ejecucion
		Assert.assertEquals(getUsername, newuser);

		// soft assertion si el valor no es igual la prueba sigue ejecutandose y al
		// final de la prueba se tiene
		// que llamar al softassert para que reporte si fallo o no
		//SoftAssert softassert = new SoftAssert();
		//softassert.assertEquals(getUsername, newuser);

		// Step - 14 Log out
		Reporter.log("Log out");
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step - 15 Close Browser
		Reporter.log("Close Browser");
		driver.close();

		
	}

	@AfterTest
	public void afterTest() {
	}

}
