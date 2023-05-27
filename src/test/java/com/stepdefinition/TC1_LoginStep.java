package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import io.cucumber.java.en.*;
import junit.framework.*;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on OMRBranch Login page")
	public void user_is_on_omr_branch_login_page() throws FileNotFoundException, IOException {


	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String userName, String password) {

		pom.getLoginPage().login(userName, password);

	}

	@SuppressWarnings("deprecation")
	@Then("User should verifies the login Error message after click login button {string}")
	public void user_should_verifies_the_login_error_message_after_click_login_button(String expErrorLoginMsg) {
		Assert.assertEquals("verify error msg after login", expErrorLoginMsg, pom.getLoginPage().getLoginErrorMsg().contains(expErrorLoginMsg));
	}

	@When("User enters the {string} and {string} using Enter key")
	public void user_enters_the_and_using_enter_key(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);
	}

}
