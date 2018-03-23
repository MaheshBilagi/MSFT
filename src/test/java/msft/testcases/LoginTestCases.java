package test.java.msft.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import main.java.com.msft.Loginpage;
import main.java.com.msft.uiconstants.LoginPageConstants;
import main.java.com.msft.uiconstants.MSFTUiConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")

public class LoginTestCases extends Loginpage {
	
	private WebDriver driver;
	private WebElement element;
	private LoginPageConstants uiConstants;
	private MSFTUiConstants msftUiConstants;
	
	
	
	
	private String methodName;
	@BeforeMethod
	@Parameters(value = {"browser"})
	@BeforeTest(description="Navigates to the Login page")
	public void setUp(String browser) throws Exception {
		try {
			
			
			msftUiConstants = new MSFTUiConstants();
			uiConstants = new LoginPageConstants();
			
			/*jobs = new AddNewJobPageConstants();*/
			String selectedBrowser = browser;
			LaunchingBrowser(selectedBrowser);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	@Test(description="TC#1 Verfiy Home Page Logo")
	public void testVerfiyhomepagelogo() throws InterruptedException, IOException, Exception {
		try {

			Verfiyhomepagelogo(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	

	
	@Test(description="TC#4 Verfiy exrernal Sign in with Linkedin account")
	public void testVerfiyexrernalsignwithgoogleaccount() throws InterruptedException, IOException, Exception {
		try {

			Verfiyexrernalsignwithgoogleaccount(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	@Test(description="TC#3 Verfiy exrernal Sign in with Linkedin account")
	public void testVerfiyexrernalsignwithlinkedinaccount() throws InterruptedException, IOException, Exception {
		try {

			Verfiyexrernalsignwithlinkedinaccount(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}

	@Test(description="TC#4 Verfiy exrernal Sign in with Facebook account")
	public void testVerfiyexrernalsignwithfacebookaccount() throws InterruptedException, IOException, Exception {
		try {

			Verfiyexrernalsignwithfacebookaccount(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	
	@Test(description="TC#5 Verfiy exrernal Sign in with Microsoft account")
	public void testVerfiyexrernalsignwithmicrosoftaccount() throws InterruptedException, IOException, Exception {
		try {

			Verfiyexrernalsignwithmicrosoftaccount(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	@Test(description="TC#6 Verfiy Internal Microsoft Employeee Sign in ")
	public void testVerfiyinternalmicrosoftemployeesignin() throws InterruptedException, IOException, Exception {
		try {

			Verfiyinternalmicrosoftemployeesignin(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
	@Test(description="TC#7 Verfiy Internal Linkedin Employeee Sign in ")
	public void testVerfiyinternallinkedinemployeesignin() throws InterruptedException, IOException, Exception {
		try {

			Verfiyinternallinkedinemployeesignin(methodName);

		}catch (Exception exception) {
			exception.printStackTrace();
		}

}
}
