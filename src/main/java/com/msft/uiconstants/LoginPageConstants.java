package main.java.com.msft.uiconstants;

import java.lang.reflect.Field;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class LoginPageConstants {

	private Log log = LogFactory.getLog("LoginPageConstants");
	
	
	public static String MicrosoftLogo = "microsoftlogo";
	public static String ClickOnSign = "clickonsign";
	public static String clickonsigninwithgoogle = "clickonsigninwithgoogle";
	public static String SignInWithGoogleEmailOrPhone = "signinwithgoogleemailorphone";
	public static String SignInWithGoogleEmailValue = "signinwithgoogleemailvalue";
	public static String ClickOnSignInWithGoogleNextButton = "clickonsigninwithgooglenextbutton";
	public static String SignInWithGooglePassword = "signinwithgooglepassword";
	public static String SignInWithGooglePasswordSendValue = "signinwithgooglepasswordsendvalue";
	public static String ClickOnSigninWithGooglePasswordNextButton = "clickonsigninwithgooglepasswordnextbutton";
	public static String ClickOnSignOut = "clickonsignout";
	public static String ClickOnProfile = "clickonprofile";
	public static String ProfileSummaryEmail = "profilesummaryemail";
	public static String ClickOnSignInWithLinkedIn = "clickonsigninwithlinkedin";
	
	public static String LinkedinEmailAddress = "linkedinemailaddress";
	public static String LinkedinEmailAddressSendValue = "linkedinemailaddresssendvalue";
	public static String LinkedinPassword = "linkedinpassword";
	public static String LinkdeinPasswordSendValue = "linkdeinpasswordsendvalue";
	public static String ClickOnLinkedinSignInButton = "clickonlinkedinsigninbutton";
	
	public static String ClickOnSignInWithFacebook = "clickonsigninwithfacebook";
	public static String FacebookEmailAddress = "facebookemailaddress";
	public static String FacebookEmailAddressSendvalue = "facebookemailaddresssendvalue";
	public static String FacebookPassword = "facebookpassword";
	public static String FacebookPasswordSendValue = "facebookpasswordsendvalue";
	public static String ClickonFacebookLoginButton = "clickonfacebookloginbutton";
	
	public static String ClickOnSignInWithMicrosoft = "clickonsigninwithmicrosoft";
	public static String MicrosoftEmailAddress = "microsoftemailaddress";
	public static String MicrosoftEmailAddressSendValue = "microsoftemailaddresssendvalue";
	public static String MicrosoftSignInNextButton = "microsoftsigninnextbutton";
	public static String MicrosoftPassword = "microsoftpassword";
	public static String Microsiftpasswordsendvalue = "microsiftpasswordsendvalue";
	public static String MicrosoftProfileSummaryEmail = "microsoftprofilesummaryemail";
	
	public static String ClickOnMicrosoftEmployeeSignIn = "clickonmicrosoftemployeesignin";
	public static String ClickOnSignInWithaUsernameAndPasswordInsteadLink = "clickonsigninwithausernameandpasswordinsteadlink";
	public static String MicrosoftEmployeePassword = "microsoftemployeepassword";
	public static String MicrosoftEmployeddSignInButton = "microsoftemployeddsigninbutton";
	public static String MicrosoftEmployeeProfilrSummaryEmail = "microsoftemployeeprofilrsummaryemail";

	public static String ClickOnLinkedInEmployeeSignIn = "clickonlinkedinemployeesignin";
	
	
public LoginPageConstants() {

	try {
		ReadXMLFile readXml = new ReadXMLFile();
		readXml.loadLoginPageConstants();
		
		Field[] arrayOfField = this.getClass().getDeclaredFields();
		for (Field field : arrayOfField) {
			field.setAccessible(true);
			Object localObject = field.get(this);
			if (localObject instanceof String) {
				field.set(this, readXml.getValue((String) localObject));
			}
		}
	} catch (Exception localException) {
		log.info("Exception in LoginPageConstants" + localException.getMessage());
	}
}




public static String getMicrosoftLogo() {
	return MicrosoftLogo;
}



public static void setMicrosoftLogo(String microsoftLogo) {
	MicrosoftLogo = microsoftLogo;
}




public static String getClickOnSign() {
	return ClickOnSign;
}




public static void setClickOnSign(String clickOnSign) {
	ClickOnSign = clickOnSign;
}




public static String getClickonsigninwithgoogle() {
	return clickonsigninwithgoogle;
}




public static void setClickonsigninwithgoogle(String clickonsigninwithgoogle) {
	LoginPageConstants.clickonsigninwithgoogle = clickonsigninwithgoogle;
}




public static String getSignInWithGoogleEmailOrPhone() {
	return SignInWithGoogleEmailOrPhone;
}




public static void setSignInWithGoogleEmailOrPhone(String signInWithGoogleEmailOrPhone) {
	SignInWithGoogleEmailOrPhone = signInWithGoogleEmailOrPhone;
}




public static String getSignInWithGoogleEmailValue() {
	return SignInWithGoogleEmailValue;
}




public static void setSignInWithGoogleEmailValue(String signInWithGoogleEmailValue) {
	SignInWithGoogleEmailValue = signInWithGoogleEmailValue;
}




public static String getClickOnSignInWithGoogleNextButton() {
	return ClickOnSignInWithGoogleNextButton;
}




public static void setClickOnSignInWithGoogleNextButton(String clickOnSignInWithGoogleNextButton) {
	ClickOnSignInWithGoogleNextButton = clickOnSignInWithGoogleNextButton;
}




public static String getSignInWithGooglePassword() {
	return SignInWithGooglePassword;
}




public static void setSignInWithGooglePassword(String signInWithGooglePassword) {
	SignInWithGooglePassword = signInWithGooglePassword;
}




public static String getSignInWithGooglePasswordSendValue() {
	return SignInWithGooglePasswordSendValue;
}




public static void setSignInWithGooglePasswordSendValue(String signInWithGooglePasswordSendValue) {
	SignInWithGooglePasswordSendValue = signInWithGooglePasswordSendValue;
}




public static String getClickOnSigninWithGooglePasswordNextButton() {
	return ClickOnSigninWithGooglePasswordNextButton;
}




public static void setClickOnSigninWithGooglePasswordNextButton(String clickOnSigninWithGooglePasswordNextButton) {
	ClickOnSigninWithGooglePasswordNextButton = clickOnSigninWithGooglePasswordNextButton;
}




public static String getClickOnSignOut() {
	return ClickOnSignOut;
}




public static void setClickOnSignOut(String clickOnSignOut) {
	ClickOnSignOut = clickOnSignOut;
}




public static String getClickOnProfile() {
	return ClickOnProfile;
}




public static void setClickOnProfile(String clickOnProfile) {
	ClickOnProfile = clickOnProfile;
}




public static String getProfileSummaryEmail() {
	return ProfileSummaryEmail;
}




public static void setProfileSummaryEmail(String profileSummaryEmail) {
	ProfileSummaryEmail = profileSummaryEmail;
}




public static String getClickOnSignInWithLinkedIn() {
	return ClickOnSignInWithLinkedIn;
}




public static void setClickOnSignInWithLinkedIn(String clickOnSignInWithLinkedIn) {
	ClickOnSignInWithLinkedIn = clickOnSignInWithLinkedIn;
}




public static String getLinkedinEmailAddress() {
	return LinkedinEmailAddress;
}




public static void setLinkedinEmailAddress(String linkedinEmailAddress) {
	LinkedinEmailAddress = linkedinEmailAddress;
}




public static String getLinkedinEmailAddressSendValue() {
	return LinkedinEmailAddressSendValue;
}




public static void setLinkedinEmailAddressSendValue(String linkedinEmailAddressSendValue) {
	LinkedinEmailAddressSendValue = linkedinEmailAddressSendValue;
}




public static String getLinkedinPassword() {
	return LinkedinPassword;
}




public static void setLinkedinPassword(String linkedinPassword) {
	LinkedinPassword = linkedinPassword;
}




public static String getLinkdeinPasswordSendValue() {
	return LinkdeinPasswordSendValue;
}




public static void setLinkdeinPasswordSendValue(String linkdeinPasswordSendValue) {
	LinkdeinPasswordSendValue = linkdeinPasswordSendValue;
}




public static String getClickOnLinkedinSignInButton() {
	return ClickOnLinkedinSignInButton;
}




public static void setClickOnLinkedinSignInButton(String clickOnLinkedinSignInButton) {
	ClickOnLinkedinSignInButton = clickOnLinkedinSignInButton;
}




public static String getClickOnSignInWithFacebook() {
	return ClickOnSignInWithFacebook;
}




public static void setClickOnSignInWithFacebook(String clickOnSignInWithFacebook) {
	ClickOnSignInWithFacebook = clickOnSignInWithFacebook;
}




public static String getFacebookEmailAddress() {
	return FacebookEmailAddress;
}




public static void setFacebookEmailAddress(String facebookEmailAddress) {
	FacebookEmailAddress = facebookEmailAddress;
}




public static String getFacebookEmailAddressSendvalue() {
	return FacebookEmailAddressSendvalue;
}




public static void setFacebookEmailAddressSendvalue(String facebookEmailAddressSendvalue) {
	FacebookEmailAddressSendvalue = facebookEmailAddressSendvalue;
}




public static String getFacebookPassword() {
	return FacebookPassword;
}




public static void setFacebookPassword(String facebookPassword) {
	FacebookPassword = facebookPassword;
}




public static String getFacebookPasswordSendValue() {
	return FacebookPasswordSendValue;
}




public static void setFacebookPasswordSendValue(String facebookPasswordSendValue) {
	FacebookPasswordSendValue = facebookPasswordSendValue;
}




public static String getClickonFacebookLoginButton() {
	return ClickonFacebookLoginButton;
}




public static void setClickonFacebookLoginButton(String clickonFacebookLoginButton) {
	ClickonFacebookLoginButton = clickonFacebookLoginButton;
}




public static String getClickOnSignInWithMicrosoft() {
	return ClickOnSignInWithMicrosoft;
}




public static void setClickOnSignInWithMicrosoft(String clickOnSignInWithMicrosoft) {
	ClickOnSignInWithMicrosoft = clickOnSignInWithMicrosoft;
}




public static String getMicrosoftEmailAddress() {
	return MicrosoftEmailAddress;
}




public static void setMicrosoftEmailAddress(String microsoftEmailAddress) {
	MicrosoftEmailAddress = microsoftEmailAddress;
}




public static String getMicrosoftEmailAddressSendValue() {
	return MicrosoftEmailAddressSendValue;
}




public static void setMicrosoftEmailAddressSendValue(String microsoftEmailAddressSendValue) {
	MicrosoftEmailAddressSendValue = microsoftEmailAddressSendValue;
}




public static String getMicrosoftSignInNextButton() {
	return MicrosoftSignInNextButton;
}




public static void setMicrosoftSignInNextButton(String microsoftSignInNextButton) {
	MicrosoftSignInNextButton = microsoftSignInNextButton;
}




public static String getMicrosoftPassword() {
	return MicrosoftPassword;
}




public static void setMicrosoftPassword(String microsoftPassword) {
	MicrosoftPassword = microsoftPassword;
}




public static String getMicrosiftpasswordsendvalue() {
	return Microsiftpasswordsendvalue;
}




public static void setMicrosiftpasswordsendvalue(String microsiftpasswordsendvalue) {
	Microsiftpasswordsendvalue = microsiftpasswordsendvalue;
}




public static String getMicrosoftProfileSummaryEmail() {
	return MicrosoftProfileSummaryEmail;
}




public static void setMicrosoftProfileSummaryEmail(String microsoftProfileSummaryEmail) {
	MicrosoftProfileSummaryEmail = microsoftProfileSummaryEmail;
}




public static String getClickOnMicrosoftEmployeeSignIn() {
	return ClickOnMicrosoftEmployeeSignIn;
}




public static String getClickOnSignInWithaUsernameAndPasswordInsteadLink() {
	return ClickOnSignInWithaUsernameAndPasswordInsteadLink;
}




public static void setClickOnSignInWithaUsernameAndPasswordInsteadLink(
		String clickOnSignInWithaUsernameAndPasswordInsteadLink) {
	ClickOnSignInWithaUsernameAndPasswordInsteadLink = clickOnSignInWithaUsernameAndPasswordInsteadLink;
}




public static void setClickOnMicrosoftEmployeeSignIn(String clickOnMicrosoftEmployeeSignIn) {
	ClickOnMicrosoftEmployeeSignIn = clickOnMicrosoftEmployeeSignIn;
}




public static String getMicrosoftEmployeePassword() {
	return MicrosoftEmployeePassword;
}




public static void setMicrosoftEmployeePassword(String microsoftEmployeePassword) {
	MicrosoftEmployeePassword = microsoftEmployeePassword;
}




public static String getMicrosoftEmployeddSignInButton() {
	return MicrosoftEmployeddSignInButton;
}




public static void setMicrosoftEmployeddSignInButton(String microsoftEmployeddSignInButton) {
	MicrosoftEmployeddSignInButton = microsoftEmployeddSignInButton;
}




public static String getMicrosoftEmployeeProfilrSummaryEmail() {
	return MicrosoftEmployeeProfilrSummaryEmail;
}




public static void setMicrosoftEmployeeProfilrSummaryEmail(String microsoftEmployeeProfilrSummaryEmail) {
	MicrosoftEmployeeProfilrSummaryEmail = microsoftEmployeeProfilrSummaryEmail;
}




public static String getClickOnLinkedInEmployeeSignIn() {
	return ClickOnLinkedInEmployeeSignIn;
}




public static void setClickOnLinkedInEmployeeSignIn(String clickOnLinkedInEmployeeSignIn) {
	ClickOnLinkedInEmployeeSignIn = clickOnLinkedInEmployeeSignIn;
}







}
