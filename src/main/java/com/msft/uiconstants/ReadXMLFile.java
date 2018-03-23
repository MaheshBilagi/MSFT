package main.java.com.msft.uiconstants;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import selenium.util.ScreenException;

public class ReadXMLFile {
	
	private  Element eElement;
	private Log log = LogFactory.getLog(getClass());
	private  final String msfts = "./src/main/resources/env-config.xml";
	private  final String constants = "./src/main/resources/LoginConstants.xml";
	private  final String userinfo= "./src/main/resources/UserInfo.xml";
	private  final String profile = "./src/main/resources/ProfileConstants.xml";
	
	
	
	
	
	
	private  final String ENVIRONMENT = "environment";
	private  final String UICONSTANTDATA = "uiConstants";
	private  final String USERINFO = "userInfo";
	private  final String PROFILEDATA = "profile";
	
	public ReadXMLFile() throws ScreenException {
		log.info("LOADING DATA FROM XML FILE");
		loadLoginConstants(msfts,ENVIRONMENT);
	}
	public void loadLoginConstants(String properties,String rootTag) throws ScreenException {

		try {
			File fXmlFile = new File(properties);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			NodeList nList = doc.getElementsByTagName(rootTag);
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					eElement = (Element) nNode;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadLoginPageConstants() throws ScreenException {
		loadLoginConstants(constants,UICONSTANTDATA);
	}
	public void loadUserInfoConstants() throws ScreenException {
		
		loadLoginConstants(userinfo,USERINFO);
	}
	
	public void loadProfileConstants()throws ScreenException {
		loadLoginConstants(profile,PROFILEDATA);
	}

	
	

	
	
	
	public String getValue(String elementName) {

		NodeList nlList = eElement.getElementsByTagName(elementName).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);		
		if(nValue==null){
			return null; 
		}

		return nValue.getNodeValue();
	}

}
