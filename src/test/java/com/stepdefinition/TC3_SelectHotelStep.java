package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User select the first hotel continue button and save the Hotel Name,Price")
	public void user_select_the_first_hotel_continue_button_and_save_the_hotel_name_price() {
		
		pom.getSelectHotelPage().selectFirstHotelAndSave();
		pom.getSelectHotelPage().btnContinue();
	  
		
	}
	@Then("User should verify the book hotel success message  {string} afte accept the alert message")
	public void user_should_verify_the_book_hotel_success_message_afte_accept_the_alert_message(String successMsg) {
		
		pom.getSelectHotelPage().acceptAlert();
	}
	
	@Then("User verify the Select hotel success message after  and dismiss the alert message {string}")
	public void user_verify_the_select_hotel_success_message_after_and_dismiss_the_alert_message(String successMsg) {
		 pom.getSelectHotelPage().dismissAlert();
	}
	

	@Then("User should verify the prices  are in ascending order after click the price low to high radiobutton")
	public void user_should_verify_the_prices_are_in_ascending_order_after_click_the_price_low_to_high_radiobutton() {
	   pom.getSelectHotelPage().clickPriceLowToHigh();
	}
	
	@Then("User should verify the prices  are in descending order after click the price high to low radiobutton")
	public void user_should_verify_the_prices_are_in_descending_order_after_click_the_price_high_to_low_radiobutton() {
		 pom.getSelectHotelPage().clickPriceHighToLow();
	}
	
	@Then("User should verify the all the hotels names are ends with the same selected {string} filter")
	public void user_should_verify_the_all_the_hotels_names_are_ends_with_the_same_selected_filter(String roomType) {
	    pom.getSelectHotelPage().hotelNameEndsWithSameRoomType(roomType);
	}











}
