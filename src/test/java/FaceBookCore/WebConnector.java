package FaceBookCore;

import java.io.FileInputStream;




import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;

import Utility.TestConfig;
import Utility.monitoringMail;
import Utility.testUtil;



public class WebConnector {
	public static WebDriver driver;
	public static Properties OR;
	public static Properties Config;
	public static FileInputStream fis;
	
	public static Logger app_logs=Logger.getLogger("devpinoyLogger");
	
	public  WebConnector() {
		if(driver==null){
			OR=new Properties();
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\FaceBookConfig\\OR.properties");
																		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			app_logs.debug("Loading OR property file");	
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Config=new Properties();
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\FaceBookConfig\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
				app_logs.debug("Loading Config property file");	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}	
	}
     
		
public void OpenBrowser(){
		
		if(Config.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			  //System.setProperty("webdriver.chrome.silentOutput", "true");
			   
			//Creating an instance of chrome level class to disable browser level notifications.   
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		    
			System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\chromedriver.exe");
			driver = new ChromeDriver(options);
			
		}else if(Config.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\LatestDriverJars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}else if(Config.getProperty("browser").equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumDrivers\\IELatestDriver\\New\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
		
		
//@AfterSuite
public void QuitDriver() throws MessagingException {
 
// if (driver!=null)
	app_logs.debug("Sending Mail");
	
	  testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
	  monitoringMail mail = new monitoringMail();
	  try{
		  mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
			
		} catch(AddressException e){
			// TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	  System.out.println("Sending Mail Successfully.......");
	  app_logs.debug("Sending Mail Successfully......");
     driver.quit();
     app_logs.debug("Closing Browser.");
}
}


	
	