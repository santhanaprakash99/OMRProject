package com.stepdefinition;

import io.cucumber.java.en.*;

public class TC2_ExploreHotelStep {
	

	@When("User search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String stateName, String cityName, String roomType, String checkInDate, String checkOutDate, String rooms, String adults, String children) {
	    
	}
	@Then("User should verify  select hotel sucess message after click search button {string}")
	public void user_should_verify_select_hotel_sucess_message_after_click_search_button(String sucessSelectHotelMsg) {
	   
	}
	
	@When("User search hotels {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String stateName, String cityName, String checkInDate, String checkOutDate, String rooms, String adults) {
	   
	}
	

	@Then("User should verify error message after click search button {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_after_click_search_button_and(String errorState, String errorCity, String errorCheckInDate, String errorCheckOutDate, String errorRooms, String errorAdults) {
	  
	}
	
	@Then("User should verify same selected {string} filter is present")
	public void user_should_verify_same_selected_filter_is_present(String sFilter) {
	    
	}












}
