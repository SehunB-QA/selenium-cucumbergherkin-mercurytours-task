package com.qa.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MercuryTourStepDefs {
	
	private static RemoteWebDriver driver;
	@Given("I can access {string}")
	public void i_can_access(String string) {
		driver = SelenuimWebDriver.getDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		driver.get("http://" + string);
	}

	@Given("I navigate to the register page link")
	public void i_navigate_to_the_register_page_link() {
          WebElement registerPageLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
          registerPageLink.click();
	}

	@When("I make account on the website")
	public void i_make_account_on_the_website() {
	    WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[2]/input"));
	    usernameInput.sendKeys("testusername321");
	    
	    WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
	    passwordInput.sendKeys("testpassword321");
	    
	    WebElement confirmPasswordInput = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
	    confirmPasswordInput.sendKeys("testpassword321");
	    
	    WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
	    submitButton.click();
	}

	@When("i go to login with the same account details")
	public void i_go_to_login_with_the_same_account_details() {
	    WebElement signinPageLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"));
	    signinPageLink.click();
	    
	    WebElement usernameSigninInput = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
	    usernameSigninInput.sendKeys("testusername321");
	    
	    WebElement passwordSigninInput = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	    passwordSigninInput.sendKeys("testpassword321");
	    
	    WebElement submitLoginButton = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	    submitLoginButton.click();
	}

	@Then("I should have logged in successfully with this {string} text displayed")
	public void i_should_have_logged_in_successfully_with_this_text_displayed(String string) {
	  
		WebElement successfulLoginText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
		
		assertEquals(string, successfulLoginText.getText());
	}


}
