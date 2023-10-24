package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classProject3 {

	static String Url = "https://www.saucedemo.com/";
	
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";
    static String PerformanceUserName = "performance_glitch_user";
    
    

	static String mypassWord = "secret_sauce";

	static WebDriver driver = new ChromeDriver();
	 
	
	static void loginFunction(String userName,String password) {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(userName);
		WebElement passwordInputField = driver.findElement(By.id("password"));
		passwordInputField.sendKeys(mypassWord);
		driver.findElement(By.id("login-button")).click();
	}
}