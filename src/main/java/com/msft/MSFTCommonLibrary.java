package main.java.com.msft;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import selenium.util.GetCurrentDir;
import selenium.util.ScreenException;



import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

import main.java.com.msft.uiconstants.MSFTUiConstants;

import selenium.util.GetCurrentDir;
import selenium.util.ScreenException;

/*import main.java.com.zions.uiconstants.ZionsUiConstants;*/

public class MSFTCommonLibrary {
	
	protected static WebDriver driver;
	private WebElement element;
	DesiredCapabilities capabilities;
	private static Log log = LogFactory.getLog("MSFTCommonLibrary"); 
	private ChromeDriverService chromeService;

	/**
	 * This method launch's the browser based on required browser
	 * 
	 * @param browser
	 *          It is to set browser value 
	 * 
	 */
	public String currentdir;
	public void LaunchingBrowser(String selectedBrowser) {
		try {	  
			currentdir = System.getProperty("user.dir");
			if (selectedBrowser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (selectedBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", currentdir + "/src/main/java/com/leo/selenium/util/Jars/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (selectedBrowser.equalsIgnoreCase("iexplorer")) {
				System.setProperty("webdriver.ie.driver",currentdir + "/src/main/java/com/leo/selenium/util/Jars/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (selectedBrowser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			}else if (selectedBrowser.equalsIgnoreCase("htmlunit")) {
				driver = new OperaDriver();
			}
			
		}
		catch (WebDriverException e) {
			System.out.println(e.getMessage());
			Assert.assertNull(e);
		}
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		/**
		 * This method used for Passing the url
		 */
		driver.navigate().to(MSFTUiConstants.getApplicationUrl());

	}
	
	
	public void urlnavigate(String Url) throws Exception{

		try{
			driver.navigate().to(Url);
		}catch (Exception e) {
			Assert.assertNull(e);
			e.printStackTrace();
		}
	}
	
	public void clickAnElementByXpath(String xpath) {
		  WebDriverWait wait = new WebDriverWait(driver, 45);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		  driver.findElement(By.xpath(xpath)).click();
		 }
	
	
	/**
	 * Method to handle the browser alerts.
	 * ***/
	public void alertpopup() throws IOException,Exception {
		try {

			Alert alertpopup=driver.switchTo().alert();
			alertpopup.accept();

		}
		catch(Exception exception)
		{
			Assert.assertNull(exception);
			exception.printStackTrace();
		}
	}

	/**
	 * This method get the XPATHS element's
	 */

	public void getXpathWebElement(String xpath,String methodName) throws Exception {
		//log.info(" ENTERING XPATH WEBELEMENT ");
		try {

			element = driver.findElement(By.xpath(xpath));

		}
		catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(t);

		}

	}

	/**
	 * This method get the ID's element's
	 */
	public void getIdWebElement(String id,String methodName) throws ScreenException {
		//log.info(" ENTERING ID WEBELEMENT ");
		try {
			element = driver.findElement(By.id(id));

		} catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(t);
		}

	}
	/**
	 * This method get the CSS element's
	 */
	public void getcssWebElement(String selector,String methodName) throws ScreenException {
		//log.info(" ENTERING CSS WEBELEMENT ");
		try {
			element = driver.findElement(By.cssSelector(selector));
		} catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(t);
		}

	}
	/**
	 * This method get the link element's
	 */
	public void getlinkWebElement(String linkText,String methodName) throws ScreenException {
		//log.info(" ENTERING CSS WEBELEMENT ");
		try {
			element = driver.findElement(By.linkText(linkText));
		} catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(t);
		}
	}
	/**
	 * This method waits for presence of specific xpath or Id of the Web element
	 * and takes screen shot if it is not available
	 * 
	 * @param locator
	 *            It is the Identifier of the UI object
	 * 
	 * @param methodName
	 *            It stores screenshot in the method Name from which the call is
	 *            triggered
	 * 
	 * @param waitingTime
	 *            It is the specifies time to wait
	 */
	public static void waitForElementPresent(String locator,String methodName)
			throws IOException, Exception {
		try {
			By by = By.xpath(locator);
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(presenceOfElementLocated(by));
		}
		catch (Exception e) {
			captureScreenShot(methodName);
			Assert.assertNull(e);
		}
	}

	static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
		return new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		};
	}

	/**
	 * This method is to verify the presence of particular Text.
	 *  
	 *
	 * @param text
	 * The text to be found in the UI
	 *
	 *
	 * @throws InterruptedException
	 */

	public void verifyTextOnThePage (String expected,String methodName) throws InterruptedException{
		try{

			if(driver.getPageSource().contains(expected)){
				System.out.println("Text is present ----->"+ expected);
			}else{
				System.out.println("Text is absent ---->" + expected);
			}
		}
		catch (WebDriverException e) {
			captureScreenShot(methodName);
			Assert.assertNull(e);
			throw new WebDriverException(e.getMessage());
		}
	} 
	/**
	 * It will capture the ScreenShot with the given name
	 *
	 * @param methodName
	 * It stores screenshot in the method Name from which the call is
	 * triggered
	 */
	public static void captureScreenShot(String methodName) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot,new File(GetCurrentDir.getCurrentDirectory()+  File.separator + methodName + ".png"));
		} catch (Exception e1) {
			log.info("EXCEPTION IN CAPTURE SCREENSHOT " + e1.getMessage());
		}
	}
	/**
	 * This method is to click on a particular Web element
	 */
	public void click() throws Exception {
		try {
			element.click();

		} catch (Throwable e) {
			Assert.assertNull(e);
		}
	}
	/**
	 * This method is to clear a particular Text from the Application UI
	 */
	public void clear() throws Exception {
		try {
			element.clear();
		} catch (Throwable t) {
			Assert.assertNull(t);
		}
	}
	/**
	 * This method is to type a particular Text its an alternate of the type
	 * method
	 * 
	 * @param text
	 *   The text to be passed as value for the Text field in the UI
	 */

	public void sendKeys(String text) throws Exception {
		try {
			element.sendKeys(text);
		} catch (Throwable t) {
			Assert.assertNull(t);

		}
	}
	/**
	 * This method is to click on the submit button
	 */

	public void submit(String methodName) throws Exception {
		try {
			element.submit();
		} catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(t);

		}
	}
	public void pagetitle(String title,String methodName) throws Exception {
		try {
			Assert.assertTrue(driver.getTitle().contains(title));
		} catch (Throwable t) {
			captureScreenShot(methodName);
			Assert.assertNull(title);

		}
	}
	/**
	 * This method is to close  the Browser..
	 */
	public void closeBrowser() {
		//log.info(" BROWSER CLOSING ");
		if (driver != null) {
			driver.quit();
			if (chromeService != null) {
				chromeService.stop();
			}
		}
	}

}
