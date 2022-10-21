package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Base.WebDriverProvider;
import pages.HomePage;
import pages.TrainsPanel;
import utilities.ShipmentTest;


public class HomePageTest {
	
	public static WebDriver driver;
	public static Sheet sh;
	HomePage homepage;
	public static JavascriptExecutor js ;
	public static String url="https://irctc.co.in";
	
	ShipmentTest excel;

	String[][] homedata;
	WebDriverProvider browser;

	Base base;
	Logger log = LogManager.getLogger(HomePageTest.class.getName());

	
	@BeforeTest
	public void setUp() 
	{
		try {
		log.info("SETUP STARTED FOR TrainsPaneldataCase");
		
		//Base class for screenshot
		base=new Base();
		
		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
		
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		//This is for using excel
		excel=new ShipmentTest();
		homedata=excel.getHome();
		
		//This is Pom Code of TrainPanel page
		homepage=new HomePage(driver);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=1)
	public void LoginTestCase() {
		log.info("Test HomePage Login With valid Credentials");
	
			// TC1-> HomePage Login With valid Credentials
			try {
			//Open The Url
			driver.get(url);
			
			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Click on Panel to Click it
			homepage.panelClick();
			
			//Click on Login Button
			homepage.loginButton();
			
			//Enter Username in login page
			homepage.setUsername(homedata[0][0]);
			
			//Enter Password in login page
			homepage.setPassword(homedata[0][1]);
			
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
			
			//Click on sign in Button
			homepage.signin();
			
			
			
			
		
		
			// TC2-> HomePage Login With Invalid Credentials
			log.info("Test HomePage Login With Invalid Credentials");
			//Open The Url
			driver.get(url);
						
			//Click on Ok Button on HomePage
			homepage.okButton();
						
			//Click on Panel to Click it
			homepage.panelClick();
					
			//Click on Login Button
			homepage.loginButton();
						
			//Enter Username in login page
			homepage.setUsername(homedata[1][0]);
						
			//Enter Password in login page
			homepage.setPassword(homedata[1][1]);
						
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
						
			//Click on sign in Button
			homepage.signin();
			
			
			
			
			// TC3-> HomePageLogin With Empty Fields
			log.info("Test HomePage Login With Empty Fields");
			//Open The Url
			driver.get(url);
									
			//Click on Ok Button on HomePage
			homepage.okButton();
									
			//Click on Panel to Click it
			homepage.panelClick();
								
			//Click on Login Button
			homepage.loginButton();
									
			//Enter Username in login page
			homepage.setUsername("");
									
			//Enter Password in login page
			homepage.setPassword("");
									
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
									
			//Click on sign in Button
			homepage.signin();
				
		}catch(Exception e) {e.printStackTrace();}
}
	
		
		@Test(priority=2)
		public void SearchTestCase()  {
			

			try {	
				
			//TC1-> HomePage Route exists or not
				log.info("Test HomePage Route exists or not");	
			//Open The Url	
			driver.get(url);
					
			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Enter Source Station in Home page
			homepage.source(homedata[0][2]);
			
			//Select source station available from List
			homepage.sourceList();
			
			//Enter Destination Station in Home page
			homepage.destination(homedata[1][2]);
			
			//Select destination station available from List
			homepage.destinationList();
			
			
			//TC2-> HomePage correct keyword is get displayed or not
			log.info("Test HomePage correct keyword is get displayed or not");	

			//Open The Url	
			driver.get(url);
					
			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Enter Source Station in Home page
			homepage.source(homedata[2][2]);
						
			//Enter Destination Station in Home page
			homepage.destination(homedata[3][2]);
			
			//Click on Search Button to search trains
			homepage.searchButton();
			
			
			//TC3-> HomePage search operation is allowed without user login credentials
			log.info("Test HomePage search operation is allowed without user login credentials");	

			//Open The Url	
			driver.get(url);
					
			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Enter Source Station in Home page
			homepage.source(homedata[0][2]);
			
			//Select source station available from List
			homepage.sourceList();
			
			//Enter Destination Station in Home page
			homepage.destination(homedata[1][2]);
			
			//Select destination station available from List
			homepage.destinationList();
			
			//Click on Search Button to search trains
			homepage.searchButton();
			
			//Scrolling Down to see trains
			homepage.js500();
			
			
			//TC4->HomePage FROM/TO stations fields are empty
			log.info("Test HomePage FROM/TO stations fields are empty");	

			//Open The Url	
			driver.get(url);
					
			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Enter Source Station in Home page
			homepage.source("");
			
			//Enter Destination Station in Home page
			homepage.destination("");
			
			//Click on Search Button to search trains
			homepage.searchButton();
			
			
			}catch(Exception e) {e.printStackTrace();}
		}			
			
			
		
		
		
		
	
		
		@Test(priority=3)
		public void BookingTestCase()  {
			
			try {
				
			//TC1->Book ticket without using  user login credentials
			log.info("Test Book ticket without using  user login credentials");	

			//Open The Url	
			driver.get(url);
						
			//Click on Ok Button on HomePage
			homepage.okButton();
				
			//Enter Source Station in Home page
			homepage.source(homedata[0][2]);
				
			//Select source station available from List
			homepage.sourceList();
				
			//Enter Destination Station in Home page
			homepage.destination(homedata[1][2]);
				
			//Select destination station available from List
			homepage.destinationList();
				
			//Click on Search Button to search trains
			homepage.searchButton();
			
			//Click on Button To select Tier as sleeper,etc
			homepage.tierButton();
			
			//Click on Available Button 
			homepage.clAvailableButton();
			
			//click on Book Button to Book ticket
			homepage.bookButton();
			
			//Click on Agree Button
			homepage.iAgreeButton();
			
			
			//TC2-> User can book ticket with correct user login credentials
			log.info("Test book ticket with correct user login credentials");	

			//Open The Url	
			driver.get(url);
						
			//Click on Ok Button on HomePage
			homepage.okButton();
				
			//Enter Source Station in Home page
			homepage.source(homedata[0][2]);
				
			//Select source station available from List
			homepage.sourceList();
				
			//Enter Destination Station in Home page
			homepage.destination(homedata[1][2]);
				
			//Select destination station available from List
			homepage.destinationList();
				
			//Click on Search Button to search trains
			homepage.searchButton();
			
			//Click on Button To select Tier as sleeper,etc
			homepage.tierButton();
			
			//Click on Available Button 
			homepage.clAvailableButton();
			
			//click on Book Button to Book ticket
			homepage.bookButton();
			
			//Click on Agree Button
			homepage.iAgreeButton();
			
			//Enter Username in Login Page  
			homepage.setUsername(homedata[0][0]);
			
			//Enter Password in Login Page  
			homepage.setPassword(homedata[0][1]);
			
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
									
			//Click on sign in Button
			homepage.signin();
			
			//Enter Passenger Name in Passenger Details
			homepage.passengerName(homedata[0][3]);
			
			//Enter Passenger Age in Passenger Details
			homepage.passengerAge(homedata[1][3]);
			
			//Enter Passenger gender in Passenger Details
			homepage.Gender();
			
			//Enter Passenger Birth Type in Passenger Details
			homepage.Birth();
			
			//Enter Passenger Mobile Number in Passenger Details
			homepage.mobileNumber(homedata[2][3]);
			
			//Click Submit Button to submit details
			homepage.submitButton();
			
			//Scrolling Page 
			homepage.js500();
			
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
			
			//Click on Review Button to see details 
			homepage.reviewButton();
			
			
			//TC3-> user can book the ticket without entering the verification CAPTCHA
			log.info("Test book the ticket without entering the verification CAPTCHA");	

			//Open The Url	
			driver.get(url);
						
			//Click on Ok Button on HomePage
			homepage.okButton();
				
			//Enter Source Station in Home page
			homepage.source(homedata[0][2]);
				
			//Select source station available from List
			homepage.sourceList();
				
			//Enter Destination Station in Home page
			homepage.destination(homedata[1][2]);
				
			//Select destination station available from List
			homepage.destinationList();
				
			//Click on Search Button to search trains
			homepage.searchButton();
			
			//Click on Button To select Tier as sleeper,etc
			homepage.tierButton();
			
			//Click on Available Button 
			homepage.clAvailableButton();
			
			//click on Book Button to Book ticket
			homepage.bookButton();
			
			//Click on Agree Button
			homepage.iAgreeButton();
			
			//Enter Username in Login Page  
			homepage.setUsername(homedata[0][0]);
			
			//Enter Password in Login Page  
			homepage.setPassword(homedata[0][1]);
			
			//Sleep for Entering captcha manually
			Thread.sleep(10000);
									
			//Click on sign in Button
			homepage.signin();
			
			//Enter Passenger Name in Passenger Details
			homepage.passengerName(homedata[0][3]);
			
			//Enter Passenger Age in Passenger Details
			homepage.passengerAge(homedata[1][3]);
			
			//Enter Passenger gender in Passenger Details
			homepage.Gender();
			
			//Enter Passenger Birth Type in Passenger Details
			homepage.Birth();
			
			//Enter Passenger Mobile Number in Passenger Details
			homepage.mobileNumber(homedata[2][3]);
			
			//Click Submit Button to submit details
			homepage.submitButton();
			
			//Scrolling Page 
			homepage.js500();
			
			//Click on Review Button to see details 
			homepage.reviewButton();
			
			
			
		}catch(Exception e) {e.printStackTrace();}
		}
		
			
		@Test(priority=4)
		public void PnrTestCase()  {
			
			try {
			driver.get(url);
			
			//TC01->user can check their ticket status using PNR number
			log.info("Test user can check their ticket status using PNR numbe");	

			//Click on Ok Button on HomePage
			homepage.okButton();
			
			//Click on Pnr Status Section
			homepage.homepnrbutton();
			
			//Switching Tabs
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(newTb.get(1));
		    
		    //Enter Pnr Number
		    homepage.pnrInput(homedata[0][4]);
		    
		    //Click on Submit Button after entering pnr number 
		    homepage.pnrSubmit();
			
			//Sleep for entering captcha
			Thread.sleep(10000);
			
			 //Click on Submit Button after entering captcha
			homepage.captchaSubmitButton();
			
			//Scrolling
			homepage.js250();
			
			//ScreenShot 
			base.takeSnapShot(driver,"Resources\\ScrenShots\\ConfirmPnr.png");
			
			
			
			//TC02-> website is showing the user, their number in the waiting list
			log.info("website is showing the user, their number in the waiting list");	

			//Click on PNR Enquiry button to enter another pnr number
			homepage.pnrEnquiryButton();
			
			//Enter Pnr Number
			homepage.pnrInput(homedata[1][4]);
			
			//Click on Submit Button after entering pnr number 
			homepage.captchaSubmitButton();
			
			//ScreenShot
			base.takeSnapShot(driver,"ScrenShots\\WaitPnr.png");
			
			
			//TC03-> website is showing the user, their number in the waiting list
			log.info("website is showing the user, their number in the waiting list");	

			//Click on PNR Enquiry button to enter another pnr number
			homepage.pnrEnquiryButton();
			
			//Enter Pnr Number
			homepage.pnrInput(homedata[1][4]);
			
			//Click on Submit Button after entering pnr number 
			homepage.captchaSubmitButton();
			
			}catch(Exception e) {e.printStackTrace();}
}
		
	
		
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
		}
		
	

