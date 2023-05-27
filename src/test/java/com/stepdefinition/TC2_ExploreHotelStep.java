package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC2_ExploreHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@When("User search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String stateName, String cityName, String roomType, String checkInDate,
			String checkOutDate, String rooms, String adults, String children) {
		 
		implicitWait();
		
		pom.getExploreHotelPage().exploreHotels(stateName, cityName, roomType, checkInDate, checkOutDate, rooms, adults,
				children);
		
		pom.getExploreHotelPage().exploreHotels();

	}


	@When("User search hotels {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String stateName, String cityName, String checkInDate, String checkOutDate,
			String rooms, String adults) {

		pom.getExploreHotelPage().exploreHotels(stateName, cityName, checkInDate, checkOutDate, rooms, adults);
		
		pom.getExploreHotelPage().exploreHotels(); 
	}

	@Then("User should verify error message after click search button {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_after_click_search_button_and(String errorState, String errorCity,
			String errorCheckInDate, String errorCheckOutDate, String errorRooms, String errorAdults) {
		pom.getExploreHotelPage().exploreHotels();
	}

	@Then("User should verify same selected {string} filter is present")
	public void user_should_verify_same_selected_filter_is_present(String sFilter) {
		//pom.getExploreHotelPage().selectRoomType(sFilter);

	}	

}
