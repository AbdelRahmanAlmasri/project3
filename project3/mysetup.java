package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mysetup extends classProject3 {
@BeforeMethod
public void mysetup1(){
	driver.get(Url);
}
//	@BeforeTest
//	public void mySetup1() {
//		driver.get(Url);
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		driver.manage().window().maximize();
//	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(StandardUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
loginFunction(StandardUserName, mypassWord);
		Thread.sleep(3000);
//		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
loginFunction(ProblemUserName, mypassWord);
		Thread.sleep(3000);
//		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
loginFunction(PerformanceUserName, mypassWord);
		Thread.sleep(3000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@AfterTest
	public void myPostTesting() {
	}
}