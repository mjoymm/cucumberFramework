package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderNavigation {
	public HeaderNavigation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "div.dropdown-login #dropdownCurrency")
	private WebElement drpdownMyAccount;


	@FindBy(how = How.CSS, using = "div.dropdown-login .dropdown-item:last-child")
	private WebElement optnSignUp;
	
	@FindBy(how = How.CSS, using = "div.dropdown-login .dropdown-item:nth-child(1)")
	private WebElement optnLogin;
	
	@FindBy(how = How.CSS, using = "[data-title=flights]")
	private WebElement lnkFlights;
	
	@FindBy(how = How.CSS, using = "#sidebar_left .sidebar.go-left.user_menu>li:nth-child(1)>a")
	private WebElement drpdownAccount;
	
	@FindBy(how = How.CSS, using = ".open .dropdown-menu li:nth-child(2) a")
	private WebElement optnLogout;
	
	private void clickMyAccount() {
		drpdownMyAccount.click();
	}
	
	private void clickSignUpOption() {
		optnSignUp.click();
	}
	
	private void clickLoginOption() {
		optnLogin.click();
	}
	
	public void goToFLightsPage() {
		lnkFlights.click();
	}
	
	public void goToLoginPage() {
		clickMyAccount();
		clickLoginOption();
	}
	
	public void goToSignUpPage() {
		clickMyAccount();
		clickSignUpOption();
	}
}
