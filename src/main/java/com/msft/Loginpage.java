package main.java.com.msft;
import java.awt.List;
import java.awt.Robot;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import main.java.com.msft.uiconstants.LoginPageConstants;
import main.java.com.msft.uiconstants.MSFTUiConstants;


import java.awt.Robot;
import java.awt.event.KeyEvent;



public class Loginpage extends CommonLibrary {
	
	//Verify Home page Logo
	public void Verfiyhomepagelogo(String methodName) throws Exception {
		try {
			 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			
			
			//URL launching
			urlnavigate(MSFTUiConstants.getApplicationUrl());
			//Verify Home page logo
			
			waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
			driver.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			Assert.assertNull(e);
			
			
		}
	}
	
	//Verfiy exrernal Sign in with Google account
	public void Verfiyexrernalsignwithgoogleaccount(String methodName) throws Exception {
		try {
			methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			
			
			//URL launching
			urlnavigate(MSFTUiConstants.getApplicationUrl());
		/*	driver.manage().deleteAllCookies();*/
			//Verify Home page logo
			waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
			//click on sign in link
			waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
			click();
			//click on sign in with Google
			Thread.sleep(4000);
			waitForElementPresent(LoginPageConstants.getClickonsigninwithgoogle(),methodName);
			getXpathWebElement(LoginPageConstants.getClickonsigninwithgoogle(), methodName);
			click();
			
			//click on sign in with google email or phone
			waitForElementPresent(LoginPageConstants.getSignInWithGoogleEmailOrPhone(),methodName);
			getXpathWebElement(LoginPageConstants.getSignInWithGoogleEmailOrPhone(), methodName);
			click();
			// sign in with google email value
			Thread.sleep(3000);
			String actualemailresult="qa5phenom@gmail.com";
			sendKeys(LoginPageConstants.getSignInWithGoogleEmailValue());
			//click on sign in with google next button
			waitForElementPresent(LoginPageConstants.getClickOnSignInWithGoogleNextButton(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSignInWithGoogleNextButton(), methodName);
			click();
			//click on Password
			waitForElementPresent(LoginPageConstants.getSignInWithGooglePassword(),methodName);
			getXpathWebElement(LoginPageConstants.getSignInWithGooglePassword(), methodName);
			/*click();*/
			Thread.sleep(3000);
			//password send value
			sendKeys(LoginPageConstants.getSignInWithGooglePasswordSendValue());
			//click on sign in password next button
			waitForElementPresent(LoginPageConstants.getClickOnSigninWithGooglePasswordNextButton(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSigninWithGooglePasswordNextButton(), methodName);
			click();
           //Verify Home page logo
			waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
			//click on sign in link
			waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
			click();
			//click on profile
			waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
			click();
			Thread.sleep(3000);
			String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getProfileSummaryEmail())).getText();
		    Assert.assertEquals(actualemailresult, expectedemailresult);
			//click on sign in link
			waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
			click();
			//click on Sign out
			Thread.sleep(3000);
			waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
			getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
			click();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			Assert.assertNull(e);
			
			
		}
	}
	
	//Verfiy exrernal Sign in with Linkedin  account
		public void Verfiyexrernalsignwithlinkedinaccount(String methodName) throws Exception {
			try {
				 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
				
				
				//URL launching
				urlnavigate(MSFTUiConstants.getApplicationUrl());
			/*	driver.manage().deleteAllCookies();*/
				//Verify Home page logo
				waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
				//click on sign in link
				waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
				click();
				//click on sign in with Linkedin
				Thread.sleep(4000);
				waitForElementPresent(LoginPageConstants.getClickOnSignInWithLinkedIn(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnSignInWithLinkedIn(), methodName);
				click();
				
				//click on sign in with Linkedin email 
				waitForElementPresent(LoginPageConstants.getLinkedinEmailAddress(),methodName);
				getXpathWebElement(LoginPageConstants.getLinkedinEmailAddress(), methodName);
				click();
				// sign in with google email value
				Thread.sleep(3000);
				String actualemailresult="imomentous.test@gmail.com";
				sendKeys(LoginPageConstants.getLinkedinEmailAddressSendValue());
				//click on Password
				waitForElementPresent(LoginPageConstants.getLinkedinPassword(),methodName);
				getXpathWebElement(LoginPageConstants.getLinkedinPassword(), methodName);
				click();
				//password Send value
				sendKeys(LoginPageConstants.getLinkdeinPasswordSendValue());
				//click on sign in with Linkedin Sign in  button
				waitForElementPresent(LoginPageConstants.getClickOnLinkedinSignInButton(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnLinkedinSignInButton(), methodName);
				click();
	           //Verify Home page logo
				waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
				//click on sign in link
				waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
				click();
				//click on profile
				waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
				click();
				Thread.sleep(3000);
				String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getProfileSummaryEmail())).getText();
			    Assert.assertEquals(actualemailresult, expectedemailresult);
				//click on sign in link
				waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
				click();
				//click on Sign out
				waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
				getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
				click();
				driver.close();
				
			}catch (Exception e) {
				e.printStackTrace();
				Assert.assertNull(e);
				
				
			}
		}
		
		//Verfiy exrernal Sign in with Facebook  account
				public void Verfiyexrernalsignwithfacebookaccount(String methodName) throws Exception {
					try {
						 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
						
						
						//URL launching
						urlnavigate(MSFTUiConstants.getApplicationUrl());
					/*	driver.manage().deleteAllCookies();*/
						//Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on sign in with Facecebook
						Thread.sleep(4000);
						waitForElementPresent(LoginPageConstants.getClickOnSignInWithFacebook(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignInWithFacebook(), methodName);
						click();
						
						//click on sign in with Facebook email 
						waitForElementPresent(LoginPageConstants.getFacebookEmailAddress(),methodName);
						getXpathWebElement(LoginPageConstants.getFacebookEmailAddress(), methodName);
						click();
						// sign in with Facebook email value
						Thread.sleep(3000);
						String actualemailresult="bilagimahesh@gmail.com";
						sendKeys(LoginPageConstants.getFacebookEmailAddressSendvalue());
						//click on Password
						waitForElementPresent(LoginPageConstants.getFacebookPassword(),methodName);
						getXpathWebElement(LoginPageConstants.getFacebookPassword(), methodName);
						click();
						//password Send value
						sendKeys(LoginPageConstants.getFacebookPasswordSendValue());
						//click on sign in with Facebook Log in  button
						waitForElementPresent(LoginPageConstants.getClickonFacebookLoginButton(),methodName);
						getXpathWebElement(LoginPageConstants.getClickonFacebookLoginButton(), methodName);
						click();
			           //Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on profile
						waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
						click();
						Thread.sleep(3000);
						String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getProfileSummaryEmail())).getText();
					    Assert.assertEquals(actualemailresult, expectedemailresult);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on Sign out
						waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
						click();
						driver.close();
						
					}catch (Exception e) {
						e.printStackTrace();
						Assert.assertNull(e);
						
						
					}
				}

				
				//Verfiy exrernal Sign in with Microsoft  account
				public void Verfiyexrernalsignwithmicrosoftaccount(String methodName) throws Exception {
					try {
						 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
						
						
						//URL launching
						urlnavigate(MSFTUiConstants.getApplicationUrl());
					/*	driver.manage().deleteAllCookies();*/
						//Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on sign in with Microsoft
						Thread.sleep(4000);
						waitForElementPresent(LoginPageConstants.getClickOnSignInWithMicrosoft(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignInWithMicrosoft(), methodName);
						click();
						
						//click on sign in with Microsoft email 
						waitForElementPresent(LoginPageConstants.getMicrosoftEmailAddress(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftEmailAddress(), methodName);
						click();
						// sign in with Facebook email value
						Thread.sleep(3000);
						String actualemailresult="phenomprodtest@hotmail.com";
						sendKeys(LoginPageConstants.getMicrosoftEmailAddressSendValue());
						//click on next button
						waitForElementPresent(LoginPageConstants.getMicrosoftSignInNextButton(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftSignInNextButton(), methodName);
						click();
						Thread.sleep(3000);
						//click on Password
						waitForElementPresent(LoginPageConstants.getMicrosoftPassword(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftPassword(), methodName);
						/*click();*/
						Thread.sleep(3000);
						//password Send value
						/*sendKeys("Welcome123##");*/
						sendKeys(LoginPageConstants.getMicrosiftpasswordsendvalue());
						//click on next button
						waitForElementPresent(LoginPageConstants.getMicrosoftSignInNextButton(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftSignInNextButton(), methodName);
						click();
			           //Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on profile
						waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
						click();
						Thread.sleep(3000);
						String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getMicrosoftProfileSummaryEmail())).getText();
					    Assert.assertEquals(actualemailresult, expectedemailresult);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on Sign out
						waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
						click();
						driver.close();
						
					}catch (Exception e) {
						e.printStackTrace();
						Assert.assertNull(e);
						
						
					}
				}
				

				//Verfiy Internal Microsoft Employeee Sign in
				public void Verfiyinternalmicrosoftemployeesignin(String methodName) throws Exception {
					try {
						 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
						
						
						//URL launching
						urlnavigate(MSFTUiConstants.getApplicationUrl());
					/*	driver.manage().deleteAllCookies();*/
						//Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on sign in with Microsoft
						Thread.sleep(4000);
						waitForElementPresent(LoginPageConstants.getClickOnMicrosoftEmployeeSignIn(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnMicrosoftEmployeeSignIn(), methodName);
						click();
						//click on sign in with Microsoft email 
						waitForElementPresent(LoginPageConstants.getMicrosoftEmailAddress(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftEmailAddress(), methodName);
						click();
						// sign in with Facebook email value
						Thread.sleep(3000);
						String actualemailresult="v-diatti@microsoft.com";
						sendKeys("v-diatti@microsoft.com");
						//click on next button
						waitForElementPresent(LoginPageConstants.getMicrosoftSignInNextButton(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftSignInNextButton(), methodName);
						click();
						//click on Sign in with a username and password instead
						waitForElementPresent(LoginPageConstants.getClickOnSignInWithaUsernameAndPasswordInsteadLink(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignInWithaUsernameAndPasswordInsteadLink(), methodName);
						click();
						
						
						Thread.sleep(3000);
						//click on Password
						waitForElementPresent(LoginPageConstants.getMicrosoftEmployeePassword(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftEmployeePassword(), methodName);
						click();
						Thread.sleep(3000);
						//password Send value
						sendKeys("phen0m@M$ft");
						/*sendKeys(LoginPageConstants.getMicrosiftpasswordsendvalue());*/
						//click on Sign in button
						waitForElementPresent(LoginPageConstants.getMicrosoftEmployeddSignInButton(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftEmployeddSignInButton(), methodName);
						click();
						//click on next button
						waitForElementPresent(LoginPageConstants.getMicrosoftSignInNextButton(),methodName);
						getXpathWebElement(LoginPageConstants.getMicrosoftSignInNextButton(), methodName);
						click();
			           //Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on profile
						waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
						click();
						Thread.sleep(3000);
						String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getMicrosoftEmployeeProfilrSummaryEmail())).getText();
					    Assert.assertEquals(actualemailresult, expectedemailresult);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on Sign out
						waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
						click();
						driver.close();
						
					}catch (Exception e) {
						e.printStackTrace();
						Assert.assertNull(e);
						
						
					}
				}
				
				//Verfiy Internal Linkedin Employeee Sign in
				public void Verfiyinternallinkedinemployeesignin(String methodName) throws Exception {
					try {
						 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
						
						
						//URL launching
						urlnavigate(MSFTUiConstants.getApplicationUrl());
					/*	driver.manage().deleteAllCookies();*/
						//Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on sign in with Linkedin
						Thread.sleep(3000);
						waitForElementPresent(LoginPageConstants.getClickOnLinkedInEmployeeSignIn(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnLinkedInEmployeeSignIn(), methodName);
						click();
						/*Thread.sleep(3000);*/
						//click on sign in with Linkedin email 
						waitForElementPresent(LoginPageConstants.getLinkedinEmailAddress(),methodName);
						getXpathWebElement(LoginPageConstants.getLinkedinEmailAddress(), methodName);
						click();
						// sign in with google email value
						Thread.sleep(3000);
						String actualemailresult1="imomentous.test@gmail.com";
						sendKeys(LoginPageConstants.getLinkedinEmailAddressSendValue());
						//click on Password
						waitForElementPresent(LoginPageConstants.getLinkedinPassword(),methodName);
						getXpathWebElement(LoginPageConstants.getLinkedinPassword(), methodName);
						click();
						//password Send value
						sendKeys(LoginPageConstants.getLinkdeinPasswordSendValue());
						//click on sign in with Linkedin Sign in  button
						waitForElementPresent(LoginPageConstants.getClickOnLinkedinSignInButton(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnLinkedinSignInButton(), methodName);
						click();
			           //Verify Home page logo
						waitForElementPresent(LoginPageConstants.getMicrosoftLogo(),methodName);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on profile
						waitForElementPresent(LoginPageConstants.getClickOnProfile(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnProfile(), methodName);
						click();
						Thread.sleep(3000);
						String expectedemailresult=driver.findElement(By.xpath(LoginPageConstants.getProfileSummaryEmail())).getText();
					    Assert.assertEquals(actualemailresult1, expectedemailresult);
						//click on sign in link
						waitForElementPresent(LoginPageConstants.getClickOnSign(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSign(), methodName);
						click();
						//click on Sign out
						waitForElementPresent(LoginPageConstants.getClickOnSignOut(),methodName);
						getXpathWebElement(LoginPageConstants.getClickOnSignOut(), methodName);
						click();
						driver.close();
						
					}catch (Exception e) {
						e.printStackTrace();
						Assert.assertNull(e);
						
						
					}
				}

}
