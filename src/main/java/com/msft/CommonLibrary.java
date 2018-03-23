package main.java.com.msft;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import selenium.util.ScreenException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import main.java.com.msft.uiconstants.MSFTUiConstants;
import selenium.util.ScreenException;




/*public class CommonLibrary {*/
	
	public class CommonLibrary extends MSFTCommonLibrary {
		
		/****
		 * DataBase Connetion and method to test DB 
		 * ***/
		// Connection object
		static Connection con = null;
		// Statement object
		private static Statement stmt;

		public void Databaseconnection(String query , String actual) throws Exception{

			try{
				// Make the database connection
				String dbClass = "com.mysql.jdbc.Driver";
				Class.forName(dbClass).newInstance();
				// Get connection to DB
				Connection con = DriverManager.getConnection(MSFTUiConstants.getDB_URL(),MSFTUiConstants.getDB_USER(),MSFTUiConstants.getDB_PASSWORD());
				// Statement object to send the SQL statement to the Database
				stmt = con.createStatement();
				System.out.println("Connected to Database");
				// Get the contents of table from DB
				ResultSet res = stmt.executeQuery(query);
				while (res.next())
				{
					String expected = res.getString(1);
					//System.out.print(res.getString(1));
					Assert.assertEquals(expected, actual);
					System.out.println("actual value-------->" + actual); 
					System.out.println("expected value------>"  + expected);
				}

			}catch (Exception e) {
				Assert.assertNull(e);
			}
		}

		/****
		 *  method to go home page 
		 *****/
		public void gotoHomePage(String methodName) throws ScreenException {

			try {
				//Home icon link in all pages
				urlnavigate(MSFTUiConstants.getApplicationUrl());
			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}


		/****
		 * Random Generation of number 
		 *****/
		public int random() throws Exception{

			try{
				Random randomObj = new Random();
				int randomNo = randomObj.nextInt(10000) +4 ;
				System.out.println("Random No :" + randomNo);

				Random random = new Random();
				int rando= random.nextInt(100) + 4;
				System.out.println("Random No :" + rando);
				return (randomNo+rando);
			}catch (Exception e) {
				Assert.assertNull(e);
			}
			return 0;
		}
		public int Randomemail() throws Exception{

			try{

				Random randomObj = new Random();
				int randomNo = randomObj.nextInt(100000) + 2;
				System.out.println("Random No :" + randomNo);

				Random random = new Random();
				int rando= random.nextInt(1000) + 2;
				System.out.println("Random No :" + rando);
				return (randomNo+rando);


			}catch (Exception e) {
				Assert.assertNull(e);
			}
			return 0;
		}
		/****
		 * 
		 * Actions Method to select action drop down
		 * 
		 * ***/
		public void actions(String locator, String linkText,String methodName) throws ScreenException {

			try {
				getXpathWebElement(locator,methodName);
				click();
				getXpathWebElement(linkText, methodName);
				click();
			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}

		public void actionsverify(String locator, String linkText,String methodName) throws ScreenException {

			try {
				getXpathWebElement(locator,methodName);
				click();
				waitForElementPresent(linkText, methodName);
				click();
			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}

		/****
		 * 
		 * Actions Method to verify candidate resume/image exists or not.
		 * 
		 * ***/

		public void imageverification(String locator) throws ScreenException {

			try {
				Boolean IsImagePresent = driver.findElements(By.xpath(locator)).size()!=0;
				if(!IsImagePresent)
				{
					System.out.println("Image is not displayed and"+" "+"Candidate resume does not exist");
				}
				else
				{
					System.out.println("Image is displayed and"+" "+"Candidate resume exist");
				}
			}
			catch(Throwable t)
			{
				Assert.assertNull(t);
			}
		}

		/****
		 * 
		 * Actions Method to verify candidate resume/image exists or not.
		 * 
		 * ***/

		public void Scrolldownpage() throws ScreenException {

			try {
				//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
				JavascriptExecutor js = ((JavascriptExecutor) driver);

				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			}
			catch(Throwable t)
			{
				Assert.assertNull(t);

			}
		}

		/****
		 * 
		 * Actions Method to verify candidate resume/image exists or not.
		 * 
		 * ***/

		public void Scrolluppage() throws ScreenException {

			try {
				//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Actions actions = new Actions(driver);
				actions.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();

			}
			catch(Throwable t)
			{
				Assert.assertNull(t);

			}
		}
		/****
		 * 
		 * WindowHandle Method to switch to popup windows  or New Windows
		 * 
		 * ***/
		public void windowHandle() throws ScreenException {

			try {
				@SuppressWarnings("unused")
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
				while (iterator.hasNext()){
					subWindowHandler = iterator.next();
				}
				driver.switchTo().window(subWindowHandler); // switch to popup window
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}
		/**
		 * Switching to parent window
		 * */
		public void parentWindow() throws ScreenException {

			try {
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window

				driver.switchTo().window(parentWindowHandler);  // switch back to parent window

			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}
		/****
		 * 
		 * Gridfun Method to Select griddropdwon values
		 * 
		 * ***/
		public void gridfun(String locator, String xpath,String link,String methodName) throws ScreenException {

			try {
				getXpathWebElement(locator, methodName);
				click();
				getXpathWebElement(xpath, methodName);
				click();
				getXpathWebElement(link, methodName);
				click();
			} catch (Throwable t) {

				Assert.assertNull(t);
			}

		}	
		/**
		 * 
		 * Method to handle combo-box
		 *
		 */
		public void dropdown(String locator,String text) throws ScreenException {
			//log.info("Selecting values from combobox");
			try {
				Select s = new Select(driver.findElement(By.xpath(locator)));
				s.selectByVisibleText(text);
			} catch(Exception e) {
				Assert.assertNull(e);
				throw new WebDriverException(e.getMessage());
			}

		}

		/**
		 * 
		 * Method to handle combo-box
		 * Choosing the value for drop-down box by passing index
		 *
		 */
		public void dropdownbyindex(String locator,int index) throws ScreenException {
			//log.info("Selecting values from dropdown by index");
			try {
				Select s = new Select(driver.findElement(By.xpath(locator)));
				s.selectByIndex(index);
			} catch(Exception e) {
				Assert.assertNull(e);
				throw new WebDriverException(e.getMessage());
			}
		}

		/**
		 * 
		 * Method to compare  table header values with tagName 'th'
		 *
		 */
		public void tableheader(String locator, String[] exp) throws Exception { 
			try {
				WebElement select = driver.findElement(By.xpath(locator));  
				List<WebElement> allOptions = select.findElements(By.tagName("th"));
				String[] act = new String[allOptions.size()];
				if(allOptions.size() !=0){
					int i = 0;
					for (WebElement option : allOptions) {
						act[i++] = option.getText();

					}
					List<String> expected = Arrays.asList(exp);
					List<String> actual = Arrays.asList(act);
					System.out.println("actual value-------->" + actual);
					System.out.println("expected value------>"  + expected);
					Assert.assertNotNull(expected);
					Assert.assertNotNull(actual);
					Assert.assertTrue(actual.containsAll(expected));
				}else {
					Assert.assertNull(allOptions.size() ==0);
				}
			}catch (Exception e) {
				Assert.assertNull(e);
				e.printStackTrace();
			}
		}
		/**
		 * 
		 * Method to compare  dropdown values with tagName 'option'
		 *  
		 *
		 */
		public void dropvalueswithexp(String locator, String[] exp) throws Exception { 
			try {
				WebElement select = driver.findElement(By.xpath(locator));  
				List<WebElement> allOptions = select.findElements(By.tagName("option"));
				String[] act = new String[allOptions.size()];
				if(allOptions.size() !=0){
					int i = 0;
					for (WebElement option : allOptions) {
						act[i++] = option.getText();

					}
					List<String> expected = Arrays.asList(exp);
					List<String> actual = Arrays.asList(act);
					System.out.println("actual value-------->" + actual);
					System.out.println("expected value------>"  + expected);
					Assert.assertNotNull(expected);
					Assert.assertNotNull(actual);
					Assert.assertTrue(actual.containsAll(expected));
				}else {
					Assert.assertNull(allOptions.size() ==0);
				}
			}catch (Exception e) {
				Assert.assertNull(e);
				e.printStackTrace();
			}
		}
		/**
		 * 
		 * Method to compare  header text values  with  tagName 'a'
		 *
		 */
		public void headertext(String locator, String[] exp) throws Exception { 
			try {
				WebElement select = driver.findElement(By.xpath(locator));
				List<WebElement> allOptions = select.findElements(By.tagName("a"));
				String[] act = new String[allOptions.size()];
				//System.out.println("Options value------>" + allOptions.size());
				if(allOptions.size() !=0){
					int n = 0;
					for (WebElement e : allOptions) {
						act[n++] = e.getText();
						//System.out.println("Options value------>" + e.getText());
					}
					System.out.println("expected value------>" + exp.length);//hard coded value
					System.out.println("actual value-------->" + act.length);// value present in dropbox
					List<String> expected = Arrays.asList(exp);
					List<String> actual = Arrays.asList(act);
					System.out.println("actual value-------->" + actual);
					System.out.println("expected value------>"  + expected);
					Assert.assertNotNull(expected);
					Assert.assertNotNull(actual);
					Assert.assertTrue(actual.containsAll(expected));
				}else {
					Assert.assertNull(allOptions.size() ==0);
				}
			}catch (Exception e) {
				Assert.assertNull(e);
				e.printStackTrace();
			}
		}
		/**
		 * This method is to select date in  date picker
		 */
		public void setdate(String startdatelocator ,int increasedbydays ,String endatelocator) throws Exception {

			try {
				//start date			
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				Date date = new Date();
				driver.findElement(By.xpath(startdatelocator)).clear();
				driver.findElement(By.xpath(startdatelocator)).sendKeys(dateFormat.format(date));
				//end date
				Calendar cal = Calendar.getInstance();			
				cal.add(Calendar.DATE, increasedbydays);
				Date result = cal.getTime();
				//System.out.println("End Date which is after " + increasedbydays + " days : " + dateFormat.format(result));
				driver.findElement(By.xpath(endatelocator)).clear();
				driver.findElement(By.xpath(endatelocator)).sendKeys(dateFormat.format(result));	
			}catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void tabFunction(String xpath) throws Exception {

			try {
					
				WebElement element = driver.findElement(By.xpath(xpath));
				//Actions actions1 = new Actions(driver);
				element.sendKeys(Keys.TAB);

			}catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void selectdate(String startdatelocator) throws Exception {

			try {
				//start date			
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				Date date = new Date();
				driver.findElement(By.xpath(startdatelocator)).sendKeys(dateFormat.format(date));

			}catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		/********************
		 * 
		 * mouse over funtion
		 * 
		 * ******************/
		public void Mouseover(String locator) throws Exception {

			try {
							
				Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath(locator));
				action.moveToElement(we).build().perform();
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		/**
		 * This method is to Check pagination
		 */
		public void pagination() throws Exception {
			List<WebElement> pagination =driver.findElements(By.xpath("//*[@class='leo_pagination']/a"));
			// checkif pagination link exists

			if(pagination.size()>0){
				System.out.println("pagination exists");
				System.out.println("pagination " + pagination.size());
				// click on pagination link

				for(int i=2; i<pagination .size(); i++){
					driver.findElement(By.xpath("//*[@class='leo_pagination']/a["+i+"]")).click();
				}
			} else {
				System.out.println("pagination not exists");
			} 
		}

		public String currentdirdoc;
		public void Uploaddoc() throws Exception {
			currentdirdoc = System.getProperty("user.dir");
			sendKeys(currentdirdoc + "\\src\\main\\java\\com\\leo\\selenium\\util\\dotnetresumedoc.doc");
		}
		public String currentdirdocx;
		public void Uploaddocx() throws Exception {
			currentdirdocx = System.getProperty("user.dir");
			sendKeys(currentdirdocx + "\\src\\main\\java\\com\\leo\\selenium\\util\\Vinitha_Toom.docx");
		}
		public String currentdirrtf;
		public void Uploadrtf() throws Exception {
			currentdirrtf = System.getProperty("user.dir");
			sendKeys(currentdirrtf + "\\src\\main\\java\\com\\leo\\selenium\\util\\Candidateresumertf.rtf");
		}
		public String currentdirpdf;
		public void Uploadpdf() throws Exception {
			currentdirpdf = System.getProperty("user.dir");
			sendKeys(currentdirpdf + "\\src\\main\\java\\com\\leo\\selenium\\util\\candidatepdf.pdf");
		}
		public String currentdirtxt;
		public void Uploadtxt() throws Exception {
			currentdirtxt = System.getProperty("user.dir");
			sendKeys(currentdirtxt + "\\src\\main\\java\\com\\leo\\selenium\\util\\Candresumetxt.txt");
		}
		public String currentdirhtml ;
		public void Uploadhtml() throws Exception {
			currentdirhtml = System.getProperty("user.dir");
			sendKeys(currentdirhtml + "\\src\\main\\java\\com\\leo\\selenium\\util\\candidateresumehtml.html");
		}
		public String currentdrtxt ;
		public void Uploaddocumenttxt() throws Exception {
			currentdrtxt = System.getProperty("user.dir");
			sendKeys(currentdrtxt + "\\src\\main\\java\\com\\leo\\selenium\\util\\forDocumentSearch.txt");
		}

	}

