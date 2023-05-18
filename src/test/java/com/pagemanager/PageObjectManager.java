package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.ExploreHotelPage;
import com.pages.LoginPage;
import com.pages.MyBookingPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private ExploreHotelPage exploreHotelPage;
	private BookHotelPage bookHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private MyBookingPage myBookingPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public ExploreHotelPage getExploreHotelPage() {
		return (exploreHotelPage == null) ? exploreHotelPage = new ExploreHotelPage() : exploreHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}

	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage == null) ? bookingConfirmationPage = new BookingConfirmationPage()
				: bookingConfirmationPage;

	}

	public MyBookingPage getMyBookingPage() {
		return (myBookingPage == null) ? myBookingPage = new MyBookingPage() : myBookingPage;
	}

}