package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.*;

public class CommonStep {

	PageObjectManager pom = new PageObjectManager();

	@SuppressWarnings("deprecation")
	@Then("User should verifies the login success message after click login button {string}")
	public void user_should_verifies_the_login_success_message_after_click_login_button(String expSucessLoginMsg) {
		
		Assert.assertEquals(expSucessLoginMsg, pom.getExploreHotelPage().loginSuccessMsg());

	}

	@Then("User should verify  select hotel sucess message after click search button {string}")
	public void user_should_verify_select_hotel_sucess_message_after_click_search_button(String expSucessSelectHotelMsg) {
		
		Assert.assertEquals(expSucessSelectHotelMsg, pom.getSelectHotelPage().successSelectHotelMsg());
	}
	

}
