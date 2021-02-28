package StepDefinitionFiles;

import java.io.IOException;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import FaceBookCore.WebConnector;
import Utility.testUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.core.util.ThreadSafePropertyEditor;

public class FaceBookLoginTest extends  WebConnector{

	//public static final WebElement UploadPhotoimage;
	WebConnector wc=new WebConnector();
	
	
	 @Given("^User is on facebook login page$")
	  
	 public void user_is_on_facebook_login_page() throws Throwable {
		 try
		 { 
		 System.out.println("User is on facebook Login Page");
		 
		 	 //h.init();
		    
		      OpenBrowser();
		 
             app_logs.debug("Launching browser");
		 	
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			
			app_logs.debug("Loading URL");
			
			driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
	 }catch(Throwable t){
   	   testUtil.captureScreenshot("FaceBookLoginTest");
   	   Assert.assertTrue(false,t.getMessage());
   		}
   	}

	    

	
	 @When("^User enters username as Password$")
	    public void user_enters_username_as_Password(DataTable data) throws IOException {
 	List<List<String>> obj=data.raw();
	 try{
  		app_logs.debug("Executing login Test");
  		//System.out.println("username: "+obj.get(1).get(0));
  		//System.out.println("password: "+obj.get(1).get(1));
  		
  		//xpath of FB username text box
  		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys(obj.get(1).get(0));
  		app_logs.debug("Giving username");
  		
  		//xpath of FB password TextBOx
  		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys(obj.get(1).get(1));
  		app_logs.debug("Giving password");
  		
 	    }catch(Throwable t){
 	    	   testUtil.captureScreenshot("FaceBookLoginTest");
 	    	   Assert.assertTrue(false,t.getMessage());
 	    		}
 	    	}
	    
	    
	  
	 @When("^User clicks on signIn button$")
	    public void user_clicks_on_signin_button() throws IOException  {
	        try{
	        	driver.findElement(By.xpath(OR.getProperty("logIn"))).click();
	        	app_logs.debug("login Successfully");
	        	Thread.sleep(3000);
	        	}catch(Throwable t){
	           testUtil.captureScreenshot("FaceBookLoginTest");
	           Assert.assertTrue(false,t.getMessage());
	        	}
		        }

	    

	    @Then ("^login should be successful$")
	    public void login_should_be_sucessful() throws Throwable {
	       try
	       {
	       System.out.println("login should be successful");
	       }catch(Throwable t){
	       	   testUtil.captureScreenshot("FaceBookLoginTest");
	       	   Assert.assertTrue(false,t.getMessage());
	       		}
	        

	   

	    
	    
	    

	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	