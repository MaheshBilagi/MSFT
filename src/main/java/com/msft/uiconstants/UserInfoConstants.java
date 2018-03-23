package main.java.com.msft.uiconstants;

import java.lang.reflect.Field;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/*import org.apache.commons.logging.LogFactory

import main.java.com.leo.uiconstants.ReadXMLFile;*/

/*import main.java.com.zions.uiconstants.ReadXMLFile;*/

public class UserInfoConstants {
	
	private Log log = LogFactory.getLog("UserInfoConstants");
	public static  String USERNAME="username";
	public static String PASSWORD ="passWord";
	public static String INVALIDUSR="invalidusername";
	public static String INVALIDPASSWORD="invalidpassword";
	
	public UserInfoConstants() {
		try {
			ReadXMLFile readXml = new ReadXMLFile();
			readXml.loadUserInfoConstants();
			Field[] arrayOfField = this.getClass().getDeclaredFields();
			for (Field field : arrayOfField) {
				field.setAccessible(true);
				Object localObject = field.get(this);
				if (localObject instanceof String) {
					field.set(this, readXml.getValue((String) localObject));
				}
			}
		} catch (Exception localException) {
			log.info("Exception in UserInfoConstants" + localException.getMessage());
		}
	}

	public static String getUSERNAME() {
		return USERNAME;
	}

	public static void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public static String getPASSWORD() {
		return PASSWORD;
	}
	public static void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public static String getINVALIDUSR() {
		return INVALIDUSR;
	}

	public static void setINVALIDUSR(String iNVALIDUSR) {
		INVALIDUSR = iNVALIDUSR;
	}

	public static String getINVALIDPASSWORD() {
		return INVALIDPASSWORD;
	}

	public static void setINVALIDPASSWORD(String iNVALIDPASSWORD) {
		INVALIDPASSWORD = iNVALIDPASSWORD;
	}


}
