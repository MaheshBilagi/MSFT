package test.java.msft.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import main.java.com.msft.Loginpage;
import main.java.com.msft.Profilepage;
import main.java.com.msft.uiconstants.LoginPageConstants;
import main.java.com.msft.uiconstants.MSFTUiConstants;
import main.java.com.msft.uiconstants.ProfilePageConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")

public class ProfileTestCases  extends Profilepage {
	
	private WebDriver driver;
	private WebElement element;
	private LoginPageConstants uiConstants;
	private MSFTUiConstants msftUiConstants;
	private ProfilePageConstants profile;
	
	
	private String methodName;
	@BeforeMethod
	@Parameters(value = {"browser"})
	@BeforeTest(description="Navigates to the Profile page")
	public void setUp(String browser) throws Exception {
		try {
			
			
			msftUiConstants = new MSFTUiConstants();
			uiConstants = new LoginPageConstants();
			profile =new ProfilePageConstants();
			
			/*jobs = new AddNewJobPageConstants();*/
			String selectedBrowser = browser;
			LaunchingBrowser(selectedBrowser);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	

	
	@Test(description="TC#1 Verfiy profile link in profile page")
	public void testVerfiyprofilelinkinprofilepage() throws InterruptedException, IOException, Exception {
		try {

			Verfiyprofilelinkinprofilepage(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	
	@Test(description="TC#2 Update Contact Information details in profile page")
	public void testUpdatecontactinformationdetails() throws InterruptedException, IOException, Exception {
		try {

			Updatecontactinformationdetails(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
}
