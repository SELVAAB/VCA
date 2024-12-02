package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.hook.Hooks;
import com.page.VCAlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VCAstepdefinition {
	
	
	
	
	
	public  WebDriver driver = Hooks.driver;
	
	
	VCAlogin vca;
	
	
	
	@Given("Launch the url in the chrome browser")
	public void launch_the_url_in_the_chrome_browser() {
		
		VCAlogin vca= new VCAlogin (driver);
		
		vca.login();
	}

	@Given("Click on login now button")
	public void click_on_login_now_button() {
	    
	}

	@When("Click on the myVCA")
	public void click_on_the_my_vca() {
	   
	}

	@When("Redirect to the my vca login page")
	public void redirect_to_the_my_vca_login_page() {
	   
	}

	@When("Enter valid email")
	public void enter_valid_email() {
	  
	}

	@Then("Click on login button redirect to the my vca dashboard")
	public void click_on_login_button_redirect_to_the_my_vca_dashboard() {
	   
	}

	@Then("Enter valid password")
	public void enter_valid_password() {
	   
	}



	
	
	
	
	
	
	
	

}
