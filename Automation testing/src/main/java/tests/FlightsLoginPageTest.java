package tests;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Base.WebDriverProvider;

import pages.FlightsLoginPage;
import pages.TrainsPanel;
import utilities.ScreenShot;
import utilities.ShipmentTest;

public class FlightsLoginPageTest {
	public static WebDriver driver;
	public static Sheet sh;
	public static JavascriptExecutor js;
	FlightsLoginPage flightloginpage;
	public static String url="https://irctc.co.in";
	ShipmentTest excel;
	String[][] flightdata;
	ScreenShot ss;
	String sshot;
	WebDriverProvider browser;
	
	Logger log = LogManager.getLogger(FlightsLoginPageTest.class.getName());

	@BeforeTest
	public void setUp()
	{
		try {
		
			log.info("SETUP STARTED FOR FLIGHTSPAGE...");
			
			//WebDriverProvider class is for cross browser Testing
			browser=new WebDriverProvider(driver);
			
			//Below code is for Opening browser
			driver= browser.setBrowser("edge");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			//This is for using excel
			excel=new ShipmentTest();
			flightdata=excel.getFlight();
			
			//This is Pom Code of Flights page
			flightloginpage=new FlightsLoginPage(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
	//Airline page login with empty fields
	@Test(priority=1)
	public void Flightstc01(){
		log.info("TEST AIRLINE PAGE LOGIN WITH EMPTY FIELDS...");
		try {
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
		//click on later
        flightloginpage.later();
        driver.switchTo().window(newTb.get(0));
        driver.close();
        driver.switchTo().window(newTb.get(1));
		
		//click on login link
        flightloginpage.Flogin();
		//enter username
		flightloginpage.Funame(" ");
		//enter password
		flightloginpage.Fpass(" ");
		//click login
		flightloginpage.Flogin2();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE LOGIN WITH EMPTY FIELDS COMPLETED...");
	}
	
	
	 //Airline page login with invalid credentials
	@Test(priority=2)
	public void Flightstc02(){
		log.info("TEST AIRLINE PAGE LOGIN WITH INVALID CREDENTIALS...");
		try {
		
		//load URL
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
        driver.switchTo().window(newTb.get(0));
        driver.close();
        driver.switchTo().window(newTb.get(1));
		
		
        //flightloginpage.later();
        flightloginpage.Flogin();
		//enter username
		flightloginpage.Funame(flightdata[2][0]);
		//enter password
		flightloginpage.Fpass(flightdata[3][0]);
		//click login
		flightloginpage.Flogin2();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE LOGIN WITH INVALID CREDENTIALS COMPLETED...");

	}
	
	//Airline page login with valid credentials
	
		@Test(priority=3)
		public void Flightstc03() {
			log.info("TEST AIRLINE PAGE LOGIN WITH VALID CREDENTIALS...");

			try {
				
			//load URL
			driver.get(url);
			
			// click on OK button
			flightloginpage.okbutton();
			//click on menu tab
			flightloginpage.panel();
			//click on advertise x
			flightloginpage.add();
			//click on flights
			flightloginpage.flight();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	        //switch to new tab
	        driver.switchTo().window(newTb.get(1));
	        driver.switchTo().window(newTb.get(0));
	        driver.close();
	        driver.switchTo().window(newTb.get(1));
			
	        //click on later
	       // flightloginpage.later();
	        //click on login link
			flightloginpage.Flogin();
			//enter username
			flightloginpage.Funame(flightdata[0][0]);
			//enter password
			flightloginpage.Fpass(flightdata[1][0]);
			//click login
			flightloginpage.Flogin2();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			log.info("TEST AIRLINE PAGE LOGIN WITH VALID CREDENTIALS COMPLETED...");

		}
		
	//Airline page search flights
	@Test(priority=4)
	public void Flightstc04() {
		log.info("TEST AIRLINE PAGE SEARCH FLIGHTS...");

		try {
			
		//load URL
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb2 = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb2.get(1));
        driver.switchTo().window(newTb2.get(0));
        driver.close();
        driver.switchTo().window(newTb2.get(1));
        //Click on source city dropdown
		flightloginpage.from(flightdata[0][1]);
		//select city
		flightloginpage.fromclick();
		//Click on destination dropdown
		flightloginpage.to(flightdata[1][1]);
		//select city
		flightloginpage.toclick();
		//Click on date
		flightloginpage.date();
		//select date
		flightloginpage.dateclick();
		//click on search button
		flightloginpage.search();
		//validate displayed flight
		flightloginpage.disp();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE SEARCH FLIGHTS COMPLETED...");
	}
	
	//Airline page book flights
	@Test(priority=5)
	public void Flightstc05(){
		log.info("TEST AIRLINE PAGE BOOK FLIGHTS...");
		try {
			
		//load URL
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb5 = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb5.get(1));
        driver.switchTo().window(newTb5.get(0));
        driver.close();
        driver.switchTo().window(newTb5.get(1));
        //click on login link
        flightloginpage.Flogin();
        //enter username
        flightloginpage.Busername(flightdata[0][0]);
		//enter password
		flightloginpage.Fpass(flightdata[1][0]);
		//click login
		flightloginpage.Flogin2();
		
        
        //click on source city dropdown
        flightloginpage.from(flightdata[0][1]);
        //select city 
		flightloginpage.fromclick();
		//click on destination city		
		flightloginpage.to(flightdata[1][1]);
		//select city
		flightloginpage.toclick();
		//Click on date
		flightloginpage.date();
		//select date
		flightloginpage.dateclick();
		//click on search
		flightloginpage.search();
		//validate displayed flight
		flightloginpage.disp();
		//click on book button
		flightloginpage.book();
		//load new tab
		ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb1.get(1));
        driver.switchTo().window(newTb1.get(0));
        driver.close();
        driver.switchTo().window(newTb1.get(1));
        //enter firstname
		flightloginpage.Bfname(flightdata[0][2]);
		//enter lastname
		flightloginpage.Blname(flightdata[1][2]);
		//click on name salutation dropdown
		flightloginpage.nselec1();
		//select salutation
		flightloginpage.nselec2();
		//scroll down the webpage
		js.executeScript("window.scrollBy(0,2400)", "");
		//click on gender dropdown
		flightloginpage.sselec1();
		//select gender
		flightloginpage.sselec2();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE BOOK FLIGHTS COMPLETED...");

		
	}
	
	//Airline page Ticket Status
	@Test(priority=6)
	public void Flightstc06() {
		
		log.info("TEST AIRLINE PAGE TICKET STATUS...");

		try {
			
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
        driver.switchTo().window(newTb.get(0));
        driver.close();
        driver.switchTo().window(newTb.get(1));
        //click on later
        //flightloginpage.later();
        //click on login link
		flightloginpage.Flogin();
		//enter username
		flightloginpage.Funame(flightdata[0][0]);
		//enter password
		flightloginpage.Fpass(flightdata[1][0]);
		//click login
		flightloginpage.Flogin2();
		//Click on profile icon
        flightloginpage.profile();
        //click on my account option
        flightloginpage.myacc();
        //click on Myjourny tab
        flightloginpage.bookedticket();
        //Click on profile 
        flightloginpage.profile();
        //click on logout
        flightloginpage.logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE TICKET STATUS COMPLETED...");

	}
 
	//Airline page Ticket Cancellation
	@Test(priority=7)
	public void Flightstc07(){
		log.info("TEST AIRLINE PAGE TICKET CANCELLATION...");

		try {
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb3 = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb3.get(1));
        driver.switchTo().window(newTb3.get(0));
        driver.close();
        driver.switchTo().window(newTb3.get(1));
        //click on later
        //flightloginpage.later();
        //click on login link
		flightloginpage.Flogin();
		//enter username
		flightloginpage.Funame(flightdata[0][0]);
		//enter password
		flightloginpage.Fpass(flightdata[1][0]);
		//click login
		flightloginpage.Flogin2();
		//click on profile
       flightloginpage.profile();
       //click on my account tab
        flightloginpage.myacc();
       //click on ticket cancellation tab
        flightloginpage.cancelation();
        //click on profile icon
        flightloginpage.profile();
        //click on logout option
        flightloginpage.logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE TICKET CANCELLATION COMPLETED...");

	}    
       

	//Airline page view full profile
	@Test(priority=8)
	public void Flightstc08() {
		log.info("TEST AIRLINE PAGE VIEW FULL PROFILE...");

		try {
			
		driver.get(url);
		
		// click on OK button
		flightloginpage.okbutton();
		//click on menu tab
		flightloginpage.panel();
		//click on advertise x
		flightloginpage.add();
		//click on flights
		flightloginpage.flight();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
        driver.switchTo().window(newTb.get(0));
        driver.close();
        driver.switchTo().window(newTb.get(1));
        //click on later
		
		//flightloginpage.later();
		//click on login
		
		flightloginpage.Flogin();
		
		//enter username
		flightloginpage.Funame(flightdata[0][0]);
		//enter password
		flightloginpage.Fpass(flightdata[1][0]);
		//click login
		flightloginpage.Flogin2();
		//click on profile
        flightloginpage.profile();
        //click on my account option
        flightloginpage.myacc();
        //click on profile panel
        flightloginpage.fullprofile();
        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST AIRLINE PAGE VIEW FULL PROFILE COMPLETED...");

       
	}

	@AfterTest
	public void tearDown() 
	{
		driver.close();
	}
	

}
