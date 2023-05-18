package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @author Santhanam
 * @since 11/05/2023
 * @see This class is used to capture locators of Login Page and following POM
 *      design pattern
 */

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;
	@FindBy(id = "pass")
	private WebElement txtPassword;
	@FindBy(xpath = "//button[text()=\"Login\"]")
	private WebElement btnLogin;
	@FindBy(id = "errorMessage")
	private WebElement errorMsgLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getErrorMsgLogin() {
		return errorMsgLogin;
	}
	
	
	public void browserlaunch() {
		launchBrowser();
		launchUrl("https://www.omrbranch.com/");
	}
	/**
	 * @author Santhanam
	 * @since 11/05/2023
	 * @see This method is used to perform login functionality
	 * @param emailAddress
	 *            and password should be passed as a string
	 */
	public void login(String userName,String password) {
		insertValue(getTxtUserName(), userName);
		insertValue(getTxtPassword(), password);
		btnClick(getBtnLogin());
		
		
	}
	/**
	 * @author Santhanam
	 * @since 11/05/2023
	 * @see This method is used to perform login functionality using Enter key
	 * @param emailAddress
	 *              and password should be passed as a string
	 */

	public void loginWithEnter(String userName,String password) throws AWTException {
		insertValue(getTxtUserName(),userName);
		insertValue(getTxtPassword(), password);
		keyPressEnter();

	}
	/**
	 * @author Santhanam
	 * @since 11/05/2023
	 * @see This method is used to get login error message
	 * @return Which will return actLoginErrorMsg as a string
	 */
	public String getLoginErrorMsg() {
		String actLoginErrorMsg = getTheText(getErrorMsgLogin());
		return actLoginErrorMsg;
		
	}

}