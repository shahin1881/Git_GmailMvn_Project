package StepDefinitionFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import FaceBookCore.WebConnector;
import Utility.testUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadPhotoTest extends  WebConnector{

	
	@Given("^click on Profile Button$")
    public void click_on_profile_button() throws Throwable {
        try
        {
        	System.out.println("click on Profile Buttonclick on Profile Button");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("profilebtn"))).click();
        app_logs.debug("click on Profile Button");
        //driver.findElement(By.xpath("//span[text()='Rani Sharma']")).click();
    }catch(Throwable t){
 	   testUtil.captureScreenshot("UploadPhotoTest");
    Assert.assertTrue(false,t.getMessage());
    }
	} 
	
	
    @When("^click on EditProfile Button$")
    public void click_on_editprofile_button() throws Throwable {
       try
       {
    	System.out.println("click on EditProfile Button");
        driver.findElement(By.xpath(OR.getProperty("editprofile"))).click();
        app_logs.debug("click on EditProfile Button");
    }catch(Throwable t){
  	   testUtil.captureScreenshot("UploadPhotoTest");
  	    Assert.assertTrue(false,t.getMessage());
  	    }
    }
    
    
    
   
    	
   
    
    @Then("^User click on UploadPhoto button$")
    public void user_click_on_uploadphoto_button() throws Throwable {
    try
    {
	 WebElement wc =driver.findElement(By.xpath(OR.getProperty("Uploadbtn")));
        wc.click();
        
    	Thread.sleep(1000L);
		Screen screen = new Screen();
		
		Thread.sleep(2000L);	
		Pattern Img1 = new Pattern("C:\\Screenshort_Img\\Capture_1.png");
		Pattern Img2 = new Pattern("C:\\Screenshort_Img\\Capture_2.png");

		//Actions action = new Actions(driver);
			screen.wait(Img1,20);
			
		//path of the file which we want to load
		screen.type(Img1,"C:\\Users\\Laxmi Computers\\Rani.png");
					
		
		screen.click(Img2);
		Thread.sleep(5000);
       }catch(Throwable t){
			   testUtil.captureScreenshot("UploadPhotoTest");
			    Assert.assertTrue(false,t.getMessage());
			    }
        }
    
    
    
    @Then("^User click on Save Buttton$")
    public void user_click_on_save_buttton() throws Throwable {
    	try
    	{
    	
    	System.out.println("User click on Save Buttton");
	        driver.findElement(By.xpath(OR.getProperty("Savebtn"))).click();
	        app_logs.debug("User click on Save Buttton");
	        QuitDriver();
   
    
   }catch(Throwable t){
	   testUtil.captureScreenshot("UploadPhotoTest");
	    Assert.assertTrue(false,t.getMessage());
	    }
 }
    
  
}
