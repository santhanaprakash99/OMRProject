package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @author Santhanam
 * @since 12/05/2023
 * @see This class is used to capture locators of Explore Hotel page and following POM design pattern
 */

public class ExploreHotelPage extends BaseClass {
	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement clkUserWelcome;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement clkMyAccpunt;

	@FindBy(id = "state")
	private WebElement ddnState;

	@FindBy(id = "city")
	private WebElement ddnCity;

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(name = "check_in")
	private WebElement txtCheckin;

	@FindBy(name = "check_out")
	private WebElement txtCheckout;

	@FindBy(id = "no_rooms")
	private WebElement ddnNoOfRooms;

	@FindBy(id = "no_adults")
	private WebElement ddnNoOfAdults;

	@FindBy(id = "no_child")
	private WebElement txtNoOfChild;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement frameIn;

	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	@FindBy(id = "invalid-state")
	private WebElement errorMsgState;

	@FindBy(id = "invalid-city")
	private WebElement errorMsgCity;

	@FindBy(id = "invalid-check_in")
	private WebElement errorMsgCheckin;

	@FindBy(id = "invalid-check_out")
	private WebElement errorMsgCheckout;

	@FindBy(id = "invalid-no_rooms")
	private WebElement errorMsgNoOfRooms;

	@FindBy(id = "invalid-no_adults")
	private WebElement errorMsgNoOfAdults;

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement ddnWelcomeMsg;

	@FindBy(xpath = "//h5[text()='Explore Hotels']")
	private WebElement textExploreHotel;

	public WebElement getClkUserWelcome() {
		return clkUserWelcome;
	}

	public WebElement getClkMyAccpunt() {
		return clkMyAccpunt;
	}

	public WebElement getDdnState() {
		return ddnState;
	}

	public WebElement getDdnCity() {
		return ddnCity;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getDdnNoOfRooms() {
		return ddnNoOfRooms;
	}

	public WebElement getDdnNoOfAdults() {
		return ddnNoOfAdults;
	}

	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	public WebElement getFrameIn() {
		return frameIn;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getErrorMsgState() {
		return errorMsgState;
	}

	public WebElement getErrorMsgCity() {
		return errorMsgCity;
	}

	public WebElement getErrorMsgCheckin() {
		return errorMsgCheckin;
	}

	public WebElement getErrorMsgCheckout() {
		return errorMsgCheckout;
	}

	public WebElement getErrorMsgNoOfRooms() {
		return errorMsgNoOfRooms;
	}

	public WebElement getErrorMsgNoOfAdults() {
		return errorMsgNoOfAdults;
	}

	public WebElement getDdnWelcomeMsg() {
		return ddnWelcomeMsg;
	}

	public WebElement getTextExploreHotel() {
		return textExploreHotel;
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to get login success message 
	 * @return Which will return actloginSuccessMsg as a String 
	 */
	public String loginSuccessMsg() {
		
		String actloginSuccessMsg = getTheText(getTextExploreHotel());
		return actloginSuccessMsg;
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to select all the fields in explore hotel page
	 * @param selectState,selectCity,selectRoomType,checkIn,checkOut,noOfRoom,noOfAdults and noOfChildren should be passed as a String
	 */
	public void exploreHotels(String stateName, String cityName, String roomType, String checkInDate,
			String checkOutDate, String rooms, String adults, String children) {
		selectText(getDdnState(), stateName);
		selectText(getDdnCity(), cityName);
		selectText(getDdnRoomType(), roomType);
		jsInsert(getTxtCheckin(), checkInDate);
		jsInsert(getTxtCheckout(), checkOutDate);
		selectText(getDdnNoOfRooms(), rooms);
		selectText(getDdnNoOfAdults(), adults);
		selectText(getTxtNoOfChild(), children);

	}

	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to select mandatory fields in explore hotel page
	 * @param selectState,selectCity,checkIn,checkOut,noOfRoom and noOfAdults should be passed as a String
	 */
	public void exploreHotels(String stateName, String cityName, String checkInDate, String checkOutDate, String rooms,
			String adults) {
		selectText(getDdnState(), stateName);
		selectText(getDdnCity(), cityName);
		selectText(getTxtCheckin(), checkInDate);
		selectText(getTxtCheckout(), checkOutDate);
		selectText(getDdnNoOfRooms(), rooms);
		selectText(getDdnNoOfAdults(), adults);

	}

	
	public void selectRoomType(String roomType) {
		boolean b = roomType.contains("/");
		if (b) {
			String[] x = roomType.split("/");
			for (String y : x) {	
			selectText(getDdnRoomType(), y);
			}
			
		} else {
			selectText(getDdnRoomType(), roomType);
		}
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to click search button wihtout entering any field inexplore hotel page
	 */


	public void exploreHotels() {
		frameIn(getFrameIn());
		btnClick(getBtnSearch());
		frameOut();
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get state error message
	 * @return Which will return actStateErrorMsg as a String
	 */


	public String getErrState() {
		String actStateErrorMsg = getTheText(getErrorMsgState());
		return actStateErrorMsg;
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get city error message
	 * @return Which will return actCityErrorMsg as a String
	 */

	public String getErrCity() {
		String actCityErrorMsg = getTheText(getErrorMsgCity());
		return actCityErrorMsg;
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get checkin error message
	 * @return Which will return actCheckinErrorMsg as a String
	 */

	public String getErrCheckIn() {
		String actCheckinErrorMsg = getTheText(getErrorMsgCheckin());
		return actCheckinErrorMsg;
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get checkout error message
	 * @return Which will return actCheckoutErrorMsg as a String
	 */

	public String getErrCheckOut() {
		String actCheckoutErrorMsg = getTheText(getErrorMsgCheckout());
		return actCheckoutErrorMsg;
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get noOfRooms error message
	 * @return Which will return actNoOfRoomsErrorMsg as a String
	 */
	public String gerErrRooms() {
		String actNoOfRoomsErrorMsg = getTheText(getErrorMsgNoOfRooms());
		return actNoOfRoomsErrorMsg;
	}
	/**
	 * @author Santhanam
	 * @return 
	 * @since 12/05/2023
	 * @see This method is used to get noOfAdults error message
	 * @return Which will return actNoOfAdultsErrorMsg as a String
	 */
	public String getErrAdults() {
		String actNoOfAdultsErrorMsg = getTheText(getErrorMsgNoOfAdults());
		return actNoOfAdultsErrorMsg;
	}

}
