package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class loginPageModel extends ModelBase {

	public loginPageModel(WebDriver driver) {
		super(driver);
	}

	WebElement loginButton = null;
	WebElement uid = null;
	WebElement password = null;
	WebElement submitButton = null;
	

	public WebElement loginButton() {
		loginButton = driver.findElement(By.linkText("Log In"));
		return loginButton;
	}

	public WebElement uid() {
		uid = driver.findElement(By.xpath("//input[@id='email']"));
		return uid;

	}

	public WebElement password() {
		password = driver.findElement(By.xpath("//input[@id='pwd']"));
		return password;
	}

	public WebElement submitButton() {
		submitButton = driver.findElement(By.xpath("//button[@id='submitBtn']"));
		return submitButton;
	}

	

}
