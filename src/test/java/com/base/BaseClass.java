package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Actions a;

	JavascriptExecutor js;

	public WebDriver launchBrowser() {
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		return driver;
	}

	public WebDriver getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromiumdriver().setup();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}
		return driver;
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void visibilityOfElements(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void insertValue(WebElement element, String data) {
		visibilityOfElements(element);
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		visibilityOfElements(element);
		element.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public void closeBrowser() {
		driver.close();
	}

	public String getTheText(WebElement element) {
		visibilityOfElements(element);
		String attribute = element.getText();
		return attribute;
	}

	public void mouseOverAction(WebElement element) {
		visibilityOfElements(element);
		a.moveToElement(element);
	}

	public void dragAndDropAction(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public void dClick(WebElement element) {
		visibilityOfElements(element);
		a.doubleClick(element).perform();
	}

	public void rClick(WebElement element) {
		visibilityOfElements(element);
		a.contextClick(element);
	}

	public TargetLocator switchToElement() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public Alert switchToAlert() {
		Alert al = switchToElement().alert();
		return al;
	}

	public void alrtAccept() {
		switchToAlert().accept();
	}

	public void alrtDismiss() {
		switchToAlert().dismiss();
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void keyPressDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public void keyPressUP() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public void keyPressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void jsInsert(WebElement element, String data) {
		visibilityOfElements(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public String jsGet(WebElement element) {
		visibilityOfElements(element);
		String es = (String) js.executeScript("return arguments[0].getAttribute('value')", element);
		return es;

	}

	public void scrlUp(WebElement element) {
		visibilityOfElements(element);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrlDwn(WebElement element) {
		visibilityOfElements(element);
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void selectValue(WebElement element, String data) {
		visibilityOfElements(element);
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectText(WebElement element, String data) {
		visibilityOfElements(element);
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public void selectIndex(WebElement element, int data) {
		visibilityOfElements(element);
		Select s = new Select(element);
		s.selectByIndex(data);
	}

	public String getDataFromExcel(String loc, String sName, int rNo, int cNo) throws IOException {
		String value = null;
		File exelloc = new File(loc);
		FileInputStream fIn = new FileInputStream(exelloc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet(sName);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		int type = c.getCellType();
		if (type == 1) {
			value = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dt = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				value = sdf.format(dt);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);

			}
		}
		return value;
	}

	public void excelUpdate(String loc, String sName, int rNo, int cNo, String data) throws IOException {

		File exelloc = new File(loc);
		FileInputStream fIn = new FileInputStream(exelloc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet(sName);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);

		if (c == null) {
			c = r.createCell(cNo);
			c.setCellValue(data);
		}
		FileOutputStream fOut = new FileOutputStream(exelloc);
		w.write(fOut);
		// return data;
	}

	public void frameIn(WebElement element) {
		visibilityOfElements(element);
		driver.switchTo().frame(element);
	}

	public void frameOut() {
		driver.switchTo().defaultContent();
	}

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "/config/config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}
	
	
}
