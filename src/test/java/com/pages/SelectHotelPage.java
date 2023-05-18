package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @author Santhanam
 * @since 12/05/2023
 * @see This class is used to capture locators of Select Hotel and following POM
 *      design pattern
 */
public class SelectHotelPage extends BaseClass {
	
	public static String hotelName;
	public static String hotelPrize;
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement rdoLowToHigh;

	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement rdoHighToLow;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textAllPrize;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textHotelPrize;

	@FindBy(xpath = "//a[text()='Continue'])[1]")
	private WebElement btnContinue;

	@FindBy(id = "room_type")
	private WebElement textRoomType;

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textSelectHotel;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])[1]")
	private WebElement textHotelName;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']")
	private List<WebElement> textAllHotelName;

	public List<WebElement> getTextAllHotelName() {
		return textAllHotelName;
	}

	public WebElement getRdoLowToHigh() {
		return rdoLowToHigh;
	}

	public WebElement getRdoHighToLow() {
		return rdoHighToLow;
	}

	public List<WebElement> getTextAllPrize() {
		return textAllPrize;
	}

	public WebElement getTextHotelPrize() {
		return textHotelPrize;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTextRoomType() {
		return textRoomType;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to get select hotel success message
	 * @return Which will return actSelecthHotelSuccessMsg as a String
	 */
	public String getSelectHotelMsg() {
		String actSuccessSelectMsg = getTheText(getTextSelectHotel());
		return actSuccessSelectMsg;
	}

	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to get roomType text
	 * @return Which will return textRoomType as a String
	 */
	public String getRoomTypeMsg() {
		String actRoomType = getTheText(getTextRoomType());
		return actRoomType;
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to select first hotel and save hotel name and prize
	 */
	
	public void selectFirstHotelAndSave() {

		hotelName = getTheText(getTextHotelName());

		hotelPrize = getTheText(getTextHotelPrize());

		btnClick(getBtnContinue());

	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to accept book hotel alert
	 */

	public void acceptAlert() {
		alrtAccept();
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to dismiss book hotel alert
	 */

	public void dismissAlert() {
		alrtDismiss();
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to click radio button of low to high
	 */

	public void clickPriceLowToHigh() {
		btnClick(getRdoLowToHigh());
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to click radio button of high to low
	 */

	public void clickPriceHighToLow() {
		btnClick(getRdoHighToLow());

	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to sort hotel prize low to high
	 * @return Which will return b as a boolean
	 */

	public boolean sortPriceLowToHigh() {
		List<String> listBeforeSort = new ArrayList<String>();

		List<WebElement> list = driver.findElements(By.xpath("//strong[@class=\"total-prize\"]"));
		for (WebElement price : list) {
			listBeforeSort.add(price.getText());
		}
		List<String> listAfterSort = new ArrayList<String>(listBeforeSort);
		Collections.sort(listAfterSort);
		boolean b = listAfterSort.equals(listBeforeSort);
		// System.out.println(b);
		return b;
	}

	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to sort hotel prize high to low
	 * @return Which will return b as a boolean
	 */


	public boolean sortPriceHighToLow() {
		List<String> listBeforeSort = new ArrayList<String>();

		List<WebElement> list = driver.findElements(By.xpath("//strong[@class=\"total-prize\"]"));
		for (WebElement price : list) {
			listBeforeSort.add(price.getText());
		}
		List<String> listAfterSort = new ArrayList<String>(listBeforeSort);
		Collections.sort(listAfterSort);
		Collections.reverse(listAfterSort);
		boolean b = listAfterSort.equals(listBeforeSort);
		// System.out.println(b);
		return b;

	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to verify roomType
	 */
	public String sameRoomType() {
		
		String actRoomType = getTheText(getTextRoomType());
		return actRoomType;
	}
	/**
	 * @author Santhanam
	 * @since 12/05/2023
	 * @see This method is used to verify roomType
	 * @return Which will return b as a boolean
	 */
	public boolean hotelNameEndsWithSameRoomType(String roomType) {
		List<Boolean> listHotelNames = new ArrayList<Boolean>();
		for (WebElement hotelNames : getTextAllHotelName()) {
			String text = hotelNames.getText();
			boolean a = text.contains(roomType);
			listHotelNames.add(a);

		}

		boolean b = listHotelNames.contains(false);
		return b;
		
	}

}
