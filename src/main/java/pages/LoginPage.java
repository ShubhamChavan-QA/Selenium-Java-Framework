package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Log;

public class LoginPage {

	private WebDriver driver;

	private By usernameTextBox = By.id("username");
	private By passwordTextBox = By.id("password");
	private By loginBtn = By.id("submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameTextBox).sendKeys("student");

	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextBox).sendKeys("Password123");
	}

	public void clickLogin() {

		Log.info("Clicking login button...");
		driver.findElement(loginBtn).click();
	}

}
