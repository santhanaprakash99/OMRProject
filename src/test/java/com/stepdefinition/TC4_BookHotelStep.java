package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep extends BaseClass{

	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should verify the book hotel success message {string} after accept the alert message")
	public void user_should_verify_the_book_hotel_success_message_after_accept_the_alert_message(String string) {
		
		
	}

	@When("User add guest details {string},{string},{string},{string}, {string} and User add the GST details {string},{string} and {string}")
	public void user_add_guest_details_and_user_add_the_gst_details_and(String salutation, String firstName, String lastName, String mobileNO,
			String email, String regNo, String companyName, String companyAddress) {
		
		pom.getSelectHotelPage().acceptAlert();
		pom.getBookHotelPage().guestDetails(salutation, firstName, lastName, mobileNO, email);
		pom.getBookHotelPage().gstDetails(regNo, companyName, companyAddress);
		pom.getBookHotelPage().btnNextGuest();
	    
	}




	@When("User add guest details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String salutation, String firstName, String lastName, String mobileNO,
			String email) {
		
		pom.getSelectHotelPage().acceptAlert();
		pom.getBookHotelPage().guestDetails(salutation, firstName, lastName, mobileNO, email);
		pom.getBookHotelPage().btnNextGuest();
		
	}

	@When("User add the GST details {string},{string} and {string}")
	public void user_add_the_gst_details_and(String regNo, String companyName, String companyAddress) {
		pom.getBookHotelPage().gstDetails(regNo, companyName, companyAddress);
		
	}

	@When("User add special request {string}")
	public void user_add_special_request(String request) {
		
		pom.getBookHotelPage().specialRequest(request);

	}

	@When("User proceeds payment options {string}")
	public void user_proceeds_payment_options(String cardType, io.cucumber.datatable.DataTable dataTable) {
		
		pom.getBookHotelPage().addPayment(cardType, dataTable);
		pom.getBookHotelPage().btnSubmit();

	}

	@Then("User should verify error message for guest details after without entering the details {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_for_guest_details_after_without_entering_the_details_and(String errorBookingFor,
			String errorSalutation, String errorFirstName, String errorLastName, String errorMobileNO, String errorEmail) {
		
	}

	@Then("User verify Booking sucess message {string} and save order id")
	public void user_verify_booking_sucess_message_and_save_order_id(String sucessMsg) {

	}

	@Then("User verify Booking sucess message \"Booking is Confirmed\"and save the order id")
	public void user_verify_booking_sucess_message_booking_is_confirmed_and_save_the_order_id() {

	}

	@Then("User verify booked hotel is same as selected hotel")
	public void user_verify_booked_hotel_is_same_as_selected_hotel() {

	}

	@Then("User verify Booking sucess message {string} and save the order id")
	public void user_verify_booking_sucess_message_and_save_the_order_id(String sucessMsg) {

	}

	@Then("User  select the first hotel continue button and save the Hotel Name,Price")
	public void user_select_the_first_hotel_continue_button_and_save_the_hotel_name_price() {
	    
	}




}
