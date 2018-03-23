package main.java.com.msft;

import java.awt.List;
import java.awt.Robot;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import main.java.com.msft.uiconstants.LoginPageConstants;
import main.java.com.msft.uiconstants.MSFTUiConstants;
import main.java.com.msft.uiconstants.ProfilePageConstants;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Profilepage  extends CommonLibrary {
	
	//Verfiy profile link in profile page
		public void Verfiyprofilelinkinprofilepage(String methodName) throws Exception {
			try {
				 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
				
				
					//URL launching
					urlnavigate(MSFTUiConstants.getApplicationUrl());
				/*	driver.manage().deleteAllCookies();*/
					//Verify Home page logo
					waitForElementPresent(ProfilePageConstants.getMicrosoftLogo(),methodName);
					
					//click on sign in link
					waitForElementPresent(ProfilePageConstants.getClickOnSign(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickOnSign(), methodName);
					click();
					//click on sign in with Google
					Thread.sleep(5000);
					waitForElementPresent(ProfilePageConstants.getClickonsigninwithgoogle(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickonsigninwithgoogle(), methodName);
					click();
					
					//click on sign in with google email or phone
					waitForElementPresent(ProfilePageConstants.getSignInWithGoogleEmailOrPhone(),methodName);
					getXpathWebElement(ProfilePageConstants.getSignInWithGoogleEmailOrPhone(), methodName);
					click();
					// sign in with google email value
					Thread.sleep(3000);
					String actualemailresult="phenompeople783@gmail.com";
					sendKeys("phenompeople783@gmail.com");
					//click on sign in with google next button
					waitForElementPresent(ProfilePageConstants.getClickOnSignInWithGoogleNextButton(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickOnSignInWithGoogleNextButton(), methodName);
					click();
					//click on Password
					waitForElementPresent(ProfilePageConstants.getSignInWithGooglePassword(),methodName);
					getXpathWebElement(ProfilePageConstants.getSignInWithGooglePassword(), methodName);
					/*click();*/
					Thread.sleep(3000);
					//password send value
					sendKeys(ProfilePageConstants.getSignInWithGooglePasswordSendValue());
					//click on sign in password next button
					waitForElementPresent(ProfilePageConstants.getClickOnSigninWithGooglePasswordNextButton(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickOnSigninWithGooglePasswordNextButton(), methodName);
					click();
		           //Verify Home page logo
					waitForElementPresent(ProfilePageConstants.getMicrosoftLogo(),methodName);
					//click on sign in link
					waitForElementPresent(ProfilePageConstants.getClickOnSign(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickOnSign(), methodName);
					click();
					//click on profile
					waitForElementPresent(ProfilePageConstants.getClickOnProfile(),methodName);
					getXpathWebElement(ProfilePageConstants.getClickOnProfile(), methodName);
					click();
					//Profile link in profile page
					waitForElementPresent(ProfilePageConstants.getProfileLink(),methodName);
					
				/*	Loginpage l=new Loginpage();
					l.Verfiyexrernalsignwithgoogleaccount();*/
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
				Assert.assertNull(e);
				
				
			}
		}
		
		//Update Contact Information details in profile page
				public void Updatecontactinformationdetails(String methodName) throws Exception {
					try {
						 methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
						
							//URL launching
							urlnavigate(MSFTUiConstants.getApplicationUrl());
							driver.manage().deleteAllCookies();
							//Verify Home page logo
							waitForElementPresent(ProfilePageConstants.getMicrosoftLogo(),methodName);
							
							//click on sign in link
							waitForElementPresent(ProfilePageConstants.getClickOnSign(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnSign(), methodName);
							click();
							//click on sign in with Google
							Thread.sleep(4000);
							waitForElementPresent(ProfilePageConstants.getClickonsigninwithgoogle(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickonsigninwithgoogle(), methodName);
							click();
							
							//click on sign in with google email or phone
							waitForElementPresent(ProfilePageConstants.getSignInWithGoogleEmailOrPhone(),methodName);
							getXpathWebElement(ProfilePageConstants.getSignInWithGoogleEmailOrPhone(), methodName);
							click();
							// sign in with google email value
							Thread.sleep(3000);
							/*String actualemailresult="phenompeople783@gmail.com";
							sendKeys("phenompeople783@gmail.com");*/
							
							String actualemailresult="prospectqa365@gmail.com";
							sendKeys("prospectqa365@gmail.com");
							//click on sign in with google next button
							waitForElementPresent(ProfilePageConstants.getClickOnSignInWithGoogleNextButton(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnSignInWithGoogleNextButton(), methodName);
							click();
							//click on Password
							Thread.sleep(3000);
							waitForElementPresent(ProfilePageConstants.getSignInWithGooglePassword(),methodName);
							getXpathWebElement(ProfilePageConstants.getSignInWithGooglePassword(), methodName);
							click();
							Thread.sleep(3000);
							//password send value
							sendKeys("Phenom@123");
							//click on sign in password next button
							waitForElementPresent(ProfilePageConstants.getClickOnSigninWithGooglePasswordNextButton(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnSigninWithGooglePasswordNextButton(), methodName);
							click();
				           //Verify Home page logo
							waitForElementPresent(ProfilePageConstants.getMicrosoftLogo(),methodName);
							//click on sign in link
							Thread.sleep(3000);
							waitForElementPresent(ProfilePageConstants.getClickOnSign(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnSign(), methodName);
							click();
							//click on profile
							waitForElementPresent(ProfilePageConstants.getClickOnProfile(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnProfile(), methodName);
							click();
							//Profile link in profile page
							waitForElementPresent(ProfilePageConstants.getProfileLink(),methodName);
							//click on edit profile button
							Thread.sleep(4000);
							Mouseover(ProfilePageConstants.getClickOnEditProfile());
							waitForElementPresent(ProfilePageConstants.getClickOnEditProfile(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnEditProfile(), methodName);
							click();
							Thread.sleep(3000);
							//first Name
							waitForElementPresent(ProfilePageConstants.getFirstName(),methodName);
							getXpathWebElement(ProfilePageConstants.getFirstName(), methodName);
							click();
							clear();
							//first name send value
							sendKeys(ProfilePageConstants.getFirstNameSendValue());
							String ActualFirstname="Phenom";
							//Middle Name
							waitForElementPresent(ProfilePageConstants.getMiddleName(),methodName);
							getXpathWebElement(ProfilePageConstants.getMiddleName(), methodName);
							click();
							clear();
							//Middle name send value
							sendKeys(ProfilePageConstants.getMiddleNameSendValue());
							String ActualMiddlename="qa";
							//Last Name
							waitForElementPresent(ProfilePageConstants.getLastName(),methodName);
							getXpathWebElement(ProfilePageConstants.getLastName(), methodName);
							click();
							clear();
							//Last name send value
							sendKeys(ProfilePageConstants.getLastNameSendValue());
							String ActualLastname="People";
							//Preferred First Name
							waitForElementPresent(ProfilePageConstants.getPreferredName(),methodName);
							getXpathWebElement(ProfilePageConstants.getPreferredName(), methodName);
							click();
							clear();
							//Preferred  name send value
							sendKeys(ProfilePageConstants.getPreferredNameSendValue());
							String Actualpreferredname="PP";
							//Professional Title
							waitForElementPresent(ProfilePageConstants.getProfessionalTitle(),methodName);
							getXpathWebElement(ProfilePageConstants.getProfessionalTitle(), methodName);
							click();
							clear();
							//Professional Title send value
							sendKeys(ProfilePageConstants.getProfessionalTitleSendValue());
							String Actualprefessionaltitle="Analyst";
							//Phone number dropdown zero
							waitForElementPresent(ProfilePageConstants.getPhoneNumberDropdownZero(),methodName);
							dropdown(ProfilePageConstants.getPhoneNumberDropdownZero(), "Home");
							String ActualPhoneNumberDropdownZero="Home";
							//Phone number zero
							waitForElementPresent(ProfilePageConstants.getPhoneNumberZero(),methodName);
							getXpathWebElement(ProfilePageConstants.getPhoneNumberZero(), methodName);
							click();
							clear();
							//Phone number zero send value
							sendKeys(ProfilePageConstants.getPhoneNumberZeroSendValue());
							String ActualPhoneNumberZero="0000000000";
							//Click On Add Pheno Number Link
							waitForElementPresent(ProfilePageConstants.getClickOnAddPhenoNumberLink(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnAddPhenoNumberLink(), methodName);
							click();
							//Phone Number Dropdown One
							waitForElementPresent(ProfilePageConstants.getPhenoNumberDropdownOne(),methodName);
							dropdown(ProfilePageConstants.getPhenoNumberDropdownOne(), "Mobile");
							String ActualPhoneNumberDropdownone="Mobile";
							//Phone Number One
							waitForElementPresent(ProfilePageConstants.getPhoneNumberOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getPhoneNumberOne(), methodName);
							click();
							clear();
							//Phone number One send value
							sendKeys(ProfilePageConstants.getPhenoNumberOneSendValue());
							String ActualPhoneNumberone="1111111111";
							//Street Address Drop down One
							waitForElementPresent(ProfilePageConstants.getStreetAddressDropdownOne(),methodName);
							dropdown(ProfilePageConstants.getStreetAddressDropdownOne(), "Home");
							String ActualStreetAddressOne="Home";
							
							//Street Address Field One
							waitForElementPresent(ProfilePageConstants.getStreetAddressFieldOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressFieldOne(), methodName);
							click();
							clear();
							//Street Address Field one send value
							sendKeys(ProfilePageConstants.getStreetAddressFieldOneSendValue());
							String ActualStreetAddressFieldOne="Hitech city";
							//Street Address Line One
							waitForElementPresent(ProfilePageConstants.getStreetAddressLineOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressLineOne(), methodName);
							click();
							clear();
							//Street Address Field one send value
							sendKeys(ProfilePageConstants.getStreetAddressLineOneSendValue());
							String ActualStreetAddressLineOne="Hitech City 1";
							//Street City One
							waitForElementPresent(ProfilePageConstants.getStreetCityOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCityOne(), methodName);
							click();
							clear();
							//Street City one send value
							sendKeys(ProfilePageConstants.getStreetCityOneSendValue());
							String ActualStreetCityOne="Hyderabad";
							//Street Zip Or Postal Code One
							waitForElementPresent(ProfilePageConstants.getStreetZipOrPostalCodeOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetZipOrPostalCodeOne(), methodName);
							click();
							clear();
							//Street Zip Or Postal Code one send value
							sendKeys(ProfilePageConstants.getStreetZipOrPotalCodeOneSendValue());
							String ActualStreetZipOrPotalCodeOne="50000";
							//Street Country Dropdown One
							waitForElementPresent(ProfilePageConstants.getStreetCountryDropdownOne(),methodName);
							dropdown(ProfilePageConstants.getStreetCountryDropdownOne(), "India");
							String ActualStreetCountryDropdownOne="India";
							//Street State Or Province Drop down One
							waitForElementPresent(ProfilePageConstants.getStreetStateOrProvinceDropdownOne(),methodName);
							dropdown(ProfilePageConstants.getStreetStateOrProvinceDropdownOne(), "Telangana");
							String ActualStreetStateOrProvinceDropdownOne="Telangana";
							//Street County One
							waitForElementPresent(ProfilePageConstants.getStreetCountyOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCountyOne(), methodName);
							click();
							clear();
							//Street County  one send value
							sendKeys(ProfilePageConstants.getStreetCountySendValueOne());
							String ActualStreetCountyone="County 1";
							
							
							//Click On Add Street Address
							waitForElementPresent(ProfilePageConstants.getClickOnAddStreetAddress(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnAddStreetAddress(), methodName);
							click();
							
							//Street Address Drop down Two
							waitForElementPresent(ProfilePageConstants.getStreetAddressDropdownTwo(),methodName);
							dropdown(ProfilePageConstants.getStreetAddressDropdownTwo(), "Other");
							String ActualStreetAddressDropdownTwo="Other";
							//Street Address Field Two
							waitForElementPresent(ProfilePageConstants.getStreetAddressFieldTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressFieldTwo(), methodName);
							click();
							clear();
							//Street Address Field Two send value
							sendKeys(ProfilePageConstants.getStreetAddressFieldTwoSendValue());
							String ActualStreetAddressFieldtwo="Madhapur";
							//Street Address Line Two
							waitForElementPresent(ProfilePageConstants.getStreetAddressLineTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressLineTwo(), methodName);
							click();
							clear();
							Thread.sleep(3000);
							//Street Address Line Two send value
							sendKeys(ProfilePageConstants.getStreetAddressLineTwoSendValue());
							String ActualStreetAddressLinetwo="Madahpur 1";
							
							//Street City Two
							waitForElementPresent(ProfilePageConstants.getStreetCityTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCityTwo(), methodName);
							click();
							clear();
							//Street City Two send value
							sendKeys(ProfilePageConstants.getStreetCityTwoSendValue());
							String ActualStreetCityTwo="Vijaywada";
							//Street Zip Or Postal Code Two
							waitForElementPresent(ProfilePageConstants.getStreetZipOrPostalCodeTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetZipOrPostalCodeTwo(), methodName);
							click();
							clear();
							//Street Zip Or Postal Code Two send value
							sendKeys(ProfilePageConstants.getStreetZipOrPostalCodeTwoSendValue());
							String ActualStreetZipOrPotalCodetwo="500081";
							//Street Country Dropdown Two
							waitForElementPresent(ProfilePageConstants.getStreetCountryDropdownTwo(),methodName);
							dropdown(ProfilePageConstants.getStreetCountryDropdownTwo(), "India");
							String ActualStreetCountryDropdowntwo="India";
							
							//Street State Or Province Drop down Two
							Thread.sleep(3000);
							waitForElementPresent(ProfilePageConstants.getStreetStateOrProvinceTwo(),methodName);
							dropdown(ProfilePageConstants.getStreetStateOrProvinceTwo(), "Telangana");
							String ActualStreetStateOrProvinceDropdowntwo="Telangana";
							//Street County Two
							waitForElementPresent(ProfilePageConstants.getStreetCountyTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCountyTwo(), methodName);
							click();
							clear();
							//Street County  Two send value
							sendKeys(ProfilePageConstants.getStreetCountyTwoSendValue());
							String ActualStreetCountytwo="County 2";
						    //Click On Add Street address One
							waitForElementPresent(ProfilePageConstants.getClickOnAddStreetaddressOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnAddStreetaddressOne(), methodName);
							click();
							//Street Address Drop down Three
							waitForElementPresent(ProfilePageConstants.getStreetAddressDropdownThree(),methodName);
							dropdown(ProfilePageConstants.getStreetAddressDropdownThree(), "Work");
							String ActualStreetAddressDropdownThree="Work";
							
							//Street Address Field Three
							waitForElementPresent(ProfilePageConstants.getStreetAddressFieldThree(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressFieldThree(), methodName);
							click();
							clear();
							//Street Address Field Three send value
							sendKeys(ProfilePageConstants.getStreetAddressFieldThreeSendValue());
							String ActualStreetAddressFieldthree="Kodhapur";
							//Street Address Line Three
							waitForElementPresent(ProfilePageConstants.getStreetAddressLineThree(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetAddressLineThree(), methodName);
							click();
							//Street Address Field Three send value
							sendKeys(ProfilePageConstants.getStreetAddressLineThreeSendValue());
							//Street City Three
							waitForElementPresent(ProfilePageConstants.getStreetCityThree(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCityThree(), methodName);
							click();
							clear();
							//Street City Three send value
							sendKeys(ProfilePageConstants.getStreetCityThreeSendValue());
							String ActualStreetAddressLinethree="Kodhapur 1";
							//Street Zip Or Postal Code Three
							waitForElementPresent(ProfilePageConstants.getStreetZipOrPostalCodeThree(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetZipOrPostalCodeThree(), methodName);
							click();
							clear();
							//Street Zip Or Postal Code Three send value
							sendKeys(ProfilePageConstants.getStreetZipOrPostalCodeThreeSendValue());
							String ActualStreetZipOrPotalCodethree="500083";
							//Street Country Dropdown Three
							waitForElementPresent(ProfilePageConstants.getStreetCountryDropdownThree(),methodName);
							dropdown(ProfilePageConstants.getStreetCountryDropdownThree(), "India");
							String ActualStreetCountryDropdownthree="India";
							//Street State Or Province Drop down Three
							Thread.sleep(3000);
							waitForElementPresent(ProfilePageConstants.getStreetStateOrProvinceDropdownThree(),methodName);
							dropdown(ProfilePageConstants.getStreetStateOrProvinceDropdownThree(), "Telangana");
							String ActualStreetStateOrProvinceDropdownthree="Telangana";
							//Street County Three
							waitForElementPresent(ProfilePageConstants.getStreetCountyThree(),methodName);
							getXpathWebElement(ProfilePageConstants.getStreetCountyThree(), methodName);
							click();
							clear();
							//Street County  Three send value
							sendKeys(ProfilePageConstants.getStreetCountyThreeSendValue());
							String ActualStreetCountythree="County 3";
							//Web Site Url One
							waitForElementPresent(ProfilePageConstants.getWebSiteUrlOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getWebSiteUrlOne(), methodName);
							click();
							clear();
							// Web Site Url One Send Value
							sendKeys(ProfilePageConstants.getWebSiteUrlOneSendValue());
							String ActualWebSiteUrlOne="www.gmail.com";
							//Click On Add Url
							waitForElementPresent(ProfilePageConstants.getClickOnAddUrl(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnAddUrl(), methodName);
							click();
							//Web Site Url Two
							waitForElementPresent(ProfilePageConstants.getWebSiteUrlTwo(),methodName);
							getXpathWebElement(ProfilePageConstants.getWebSiteUrlTwo(), methodName);
							click();
							clear();
							//Web Site Url Two Send Value
							sendKeys(ProfilePageConstants.getWebSiteUrlTwoSendValue());
							String ActualWebSiteUrltwo="www.google.com";
							Thread.sleep(3000);
							
							
							//Comapany Name
							waitForElementPresent(ProfilePageConstants.getComapanyName(),methodName);
							getXpathWebElement(ProfilePageConstants.getComapanyName(), methodName);
							click();
							clear();
							//Company Name Send Value
							sendKeys(ProfilePageConstants.getCompanyNameSendValue());
							String ActualCompanyName="Amazon";
							//Job Title
							waitForElementPresent(ProfilePageConstants.getJobTitle(),methodName);
							getXpathWebElement(ProfilePageConstants.getJobTitle(), methodName);
							click();
							clear();
							//Job title  Send Value
						    sendKeys(ProfilePageConstants.getJobTitleSendVlue());
						    String ActualJobTitle="Software Engineer";
						    //Experience Start Date Drop Down
						    waitForElementPresent(ProfilePageConstants.getExperienceStartDateDropDown(),methodName);
							dropdown(ProfilePageConstants.getExperienceStartDateDropDown(), "January");
							 String ActualExperienceStartDateDropDown="January";
							//Experience Start Year
							waitForElementPresent(ProfilePageConstants.getExperienceStartYear(),methodName);
							getXpathWebElement(ProfilePageConstants.getExperienceStartYear(), methodName);
							click();
							clear();
							//Experience Start Year Send Value
						    sendKeys(ProfilePageConstants.getExperienceStartYearSendValue());
						    String ActualExperienceStartYear="2010";
						    //Experience End Date Drop down
						    waitForElementPresent(ProfilePageConstants.getExperienceEndDateDropdown(),methodName);
							dropdown(ProfilePageConstants.getExperienceEndDateDropdown(), "April");
							String ActualExperienceEndDateDropDown="April";
							//Experience End Year
							waitForElementPresent(ProfilePageConstants.getExperienceEndYear(),methodName);
							getXpathWebElement(ProfilePageConstants.getExperienceEndYear(), methodName);
							click();
							clear();
							//Experience End Year Send value
						    sendKeys(ProfilePageConstants.getExperienceStartYearSendValue());
						    String ActualExperienceEndYear="2020";
						    //Description
						    waitForElementPresent(ProfilePageConstants.getDescription(),methodName);
							getXpathWebElement(ProfilePageConstants.getDescription(), methodName);
							click();
							clear();
							//Description Send Value
						    sendKeys(ProfilePageConstants.getDescriptionSendValue());
						    String ActualDescription="Description add";
						    
						    //click on add positin 
						    waitForElementPresent("//*[@id='profileForm']/div[3]/div[2]/div/div/section/section/div[2]/ppc-content/a/span",methodName);
							getXpathWebElement("//*[@id='profileForm']/div[3]/div[2]/div/div/section/section/div[2]/ppc-content/a/span", methodName);
							click();
						    //Company Name One
						    waitForElementPresent(ProfilePageConstants.getCompanyNameOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getCompanyNameOne(), methodName);
							click();
							clear();
							//Company Name Send Value eOne
							 sendKeys(ProfilePageConstants.getCompanyNameSendValueOne());
							 String ActualCompanyNameone="Flipkart";
							 //Job Tilte One
							 waitForElementPresent(ProfilePageConstants.getJobTilteOne(),methodName);
							 getXpathWebElement(ProfilePageConstants.getJobTilteOne(), methodName);
							 click();
							 clear();
							//Job title  Send Value one
							sendKeys(ProfilePageConstants.getJobTitleSendValueOne());
							String ActualJobTitleone="Senior Software Engineer";
						  //Experience Start Date Drop Down One
							waitForElementPresent(ProfilePageConstants.getExperienceStartDateDropDownOne(),methodName);
							dropdown(ProfilePageConstants.getExperienceStartDateDropDownOne(), "January");
							String ActualExperienceStartDateDropDownOne="January";
							//Experience Start Year one
							waitForElementPresent(ProfilePageConstants.getExperienceStartYearOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getExperienceStartYearOne(), methodName);
							click();
							clear(); 
							//Experience Start Year Send Value one
						    sendKeys(ProfilePageConstants.getExperienceStartYearSendValueOne());
						    String ActualExperienceStartYearOne="2011";
						    
						    //Experience End Date Drop down one
						    waitForElementPresent(ProfilePageConstants.getExperienceEndDateDropdownOne(),methodName);
							dropdown(ProfilePageConstants.getExperienceEndDateDropdownOne(), "April");
							 String ActualExperienceEndDateDropdownOne="April";
							//Experience End Year one
							waitForElementPresent(ProfilePageConstants.getExperienceEndYearOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getExperienceEndYearOne(), methodName);
							click();
							clear();
							Thread.sleep(2000);
							//Experience End Year Send value
						  /*  sendKeys(ProfilePageConstants.getExperienceEndYearsSendValueOne());*/
							sendKeys("2021");
							String ActualExperienceEndYearsSendValueOne="2021";
						    //Description
						    waitForElementPresent(ProfilePageConstants.getDescriptionOne(),methodName);
							getXpathWebElement(ProfilePageConstants.getDescriptionOne(), methodName);
							click();
							clear();
							//Description Send Value
						    sendKeys(ProfilePageConstants.getDescriptionSendvalueOne());
						    String ActualDescriptionOne="Description add1";
						    //Education
						    Thread.sleep(4000);
						    //click on school zero
						    waitForElementPresent("//*[@id='profileForm']/div[4]/div[2]/div/div/section/section/div[1]/div[1]/div/div[2]/label/span[1]",methodName);
							getXpathWebElement("//*[@id='profileForm']/div[4]/div[2]/div/div/section/section/div[1]/div[1]/div/div[2]/label/span[1]", methodName);
							click();
						    waitForElementPresent(ProfilePageConstants.getClickonSchoolZero(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickonSchoolZero(), methodName);
						    click();
						    //click on search
							 waitForElementPresent(ProfilePageConstants.getClickonSearch(),methodName);
							 getXpathWebElement(ProfilePageConstants.getClickonSearch(), methodName);
							 click();
						    //school zero send value
							sendKeys(ProfilePageConstants.getSchoolZeroSendValue());
							
							
						    //iteme selected
							 waitForElementPresent(ProfilePageConstants.getItemeSelected(),methodName);
							 getXpathWebElement(ProfilePageConstants.getItemeSelected(), methodName);
							 click();
							 //Education country
							 Thread.sleep(3000);
							 waitForElementPresent(ProfilePageConstants.getStreetCountryDropdownOne(),methodName);
							 dropdown(ProfilePageConstants.getStreetCountryDropdownOne(),"option[14]");
							/* waitForElementPresent("//*[@id='country0']",methodName);*/
							 /*dropdown("//*[@id='country0']","India");*/
							 //education state or province zero
							 Thread.sleep(3000);
							/* waitForElementPresent("//*[@id='educationState/province0']",methodName);*/
							/* dropdown("//*[@id='educationState/province0']","Telangana");*/
							 waitForElementPresent(ProfilePageConstants.getEducationStateOrProvinceZero(),methodName);
							 dropdown(ProfilePageConstants.getEducationStateOrProvinceZero(),"option[5]");
							 //Years attended
							/* waitForElementPresent(ProfilePageConstants.getItemeSelected(),methodName);
							 getXpathWebElement(ProfilePageConstants.getItemeSelected(), methodName);
							 click();*/
							 //dates attended zero dropdown
							 waitForElementPresent(ProfilePageConstants.getDatesAttendedZero(),methodName);
							 dropdown(ProfilePageConstants.getDatesAttendedZero(), "2015");
							 //dates ended zero
							 waitForElementPresent(ProfilePageConstants.getDatesEndedZero(),methodName);
							 dropdown(ProfilePageConstants.getDatesEndedZero(), "2018");
							 //click on field of study
							 Thread.sleep(3000);
							 waitForElementPresent(ProfilePageConstants.getClickOnFieldOfStudy(),methodName);
							 getXpathWebElement(ProfilePageConstants.getClickOnFieldOfStudy(), methodName);
							 click();
							 //click on search
							 Thread.sleep(3000);
							 waitForElementPresent(ProfilePageConstants.getClickonSearch(),methodName);
							 getXpathWebElement(ProfilePageConstants.getClickonSearch(), methodName);
							 /*click();*/
							 //filed of study one send value
							 Thread.sleep(3000);
							 sendKeys(ProfilePageConstants.getFiledOfStudyOneSendValue());
						/*	 sendKeys("Finance");*/
							//iteme selected
							 waitForElementPresent(ProfilePageConstants.getItemeSelected(),methodName);
							 getXpathWebElement(ProfilePageConstants.getItemeSelected(), methodName);
							 click();
							 //level of education dropdown
							 waitForElementPresent(ProfilePageConstants.getLevelOfEducationDropdown(),methodName);
							 dropdown(ProfilePageConstants.getLevelOfEducationDropdown(), "Bachelors (or equivalent)");
						  //By Clicking This You Agree To Microsoft check box 
							waitForElementPresent(ProfilePageConstants.getByClickingThisYouAgreeToMicrosoftcheckbox(),methodName);
							getXpathWebElement(ProfilePageConstants.getByClickingThisYouAgreeToMicrosoftcheckbox(), methodName);
							click();
							
							
							
							
							/*//click on save button
							waitForElementPresent(ProfilePageConstants.getClickOnSaveButton(),methodName);
							getXpathWebElement(ProfilePageConstants.getClickOnSaveButton(), methodName);
							click();*/
							
							
						
					}catch (Exception e) {
						e.printStackTrace();
						Assert.assertNull(e);
						
						
					}
				}

}
