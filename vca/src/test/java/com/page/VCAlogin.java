package com.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilites.Base;

public class VCAlogin extends Base {
	
	
public WebDriver driver;
	
	
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	
	
	//constructor

	public VCAlogin(WebDriver driver) {
		this.driver = driver;

	PageFactory.initElements(driver, this);

	}
	
	
	
	
	@FindBy(xpath = "//span[@class='d-none d-lg-block']")
	
	public WebElement myvca;
	
	
	@FindBy(xpath = "//a[@class='btn btn-bright-alt-outline myvca-login-modal__btn']")
	
	public WebElement login ;
	
	
	
	
	public void login() {
		
		//wait.until(ExpectedConditions.visibilityOf(myvca));
		
		myvca.click();

		
		//wait.until(ExpectedConditions.visibilityOf(login));
		
		login.click();
		
	}
	
	

}
