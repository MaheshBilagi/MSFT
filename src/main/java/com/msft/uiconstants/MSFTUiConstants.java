package main.java.com.msft.uiconstants;

import java.lang.reflect.Field;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*import main.java.com.zions.uiconstants.ReadXMLFile;*/

public class MSFTUiConstants {
	
	private Log log = LogFactory.getLog("MSFTUiConstants");
	public static String ApplicationUrl = "applicationurl";
	// Constant for Database URL
	public static String DB_URL = "dburl";   
	// Constant for Database Username
	public static String DB_USER = "dbusrname";
	// Constant for Database Password
	public static String DB_PASSWORD = "dbpassword";
	
	public MSFTUiConstants() {
		

		try {
			ReadXMLFile readXml = new ReadXMLFile();
			Field[] arrayOfField = this.getClass().getDeclaredFields();
			for (Field field : arrayOfField) {
				field.setAccessible(true);
				Object localObject = field.get(this);
				if (localObject instanceof String) {
					field.set(this, readXml.getValue((String) localObject));
				}
			}
		} catch (Exception localException) {
			log.info("Exception in MSFTUiConstants"
					+ localException.getMessage());
		}
	}

	public static String getApplicationUrl() {
		return ApplicationUrl;
	}

	public static void setApplicationUrl(String applicationUrl) {
		ApplicationUrl = applicationUrl;
	}

	public static String getDB_URL() {
		return DB_URL;
	}

	public static void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}

	public static String getDB_USER() {
		return DB_USER;
	}

	public static void setDB_USER(String dB_USER) {
		DB_USER = dB_USER;
	}

	public static String getDB_PASSWORD() {
		return DB_PASSWORD;
	}

	public static void setDB_PASSWORD(String dB_PASSWORD) {
		DB_PASSWORD = dB_PASSWORD;
	}
	

}
