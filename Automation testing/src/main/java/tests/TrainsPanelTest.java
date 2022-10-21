package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import jdk.internal.org.jline.utils.Log;
import pages.Promotions;
import pages.TrainsPanel;
import utilities.*;
import Base.Base;
import Base.WebDriverProvider;

public class TrainsPanelTest {
	
	public static WebDriver driver;
	public static Sheet sh;
	TrainsPanel trainspanel;
	public static JavascriptExecutor js ;
	public static String url="https://irctc.co.in";
	
	ShipmentTest excel;
	String[][] traindata;
	WebDriverProvider browser;
	ScreenShot ss;
	String sshot;
	Base base;
	
	Logger log = LogManager.getLogger(TrainsPanelTest.class.getName());
	
	
	
	@BeforeTest
	public void setUp()
	{
		try {
			log.info("SETUP STARTED FOR TrainsPaneldataCase");
			
			//WebDriverProvider class is for cross browser Testing
			browser=new WebDriverProvider(driver);
			
			//Below code is for Opening browser
			driver= browser.setBrowser("edge");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			//This is for using excel
			excel=new ShipmentTest();
			traindata=excel.getTrain();
			
			//This is Pom Code of TrainPanel page
			trainspanel=new TrainsPanel(driver);
		}catch(Exception e) {}
		
	}

	
	
	@Test(priority=1)
	public void TouristTestCase() {
		try {
		//TC-> To test Foreign Tourist Booking Function
		log.info("Test Foreign Tourist Booking Function");
		//Open the Url 
		driver.get(url);
		
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
		
		//Click on Panel to Click it
		trainspanel.panelClick();
		
		//Click on Trains Section OF Panel
		trainspanel.trains();
		
		//Cick on Foregign Tourist Section on Panel
		trainspanel.foreigntourist();
		
		//Cick on Foregign Tourist Ok Button 
		trainspanel.foreigntouristok();
		
		//Enter Source station name and select it 
		trainspanel.source(traindata[0][2]);
		trainspanel.sourceList();
			
		//Enter Destination station name and select it 
		trainspanel.destination(traindata[1][2]);
		trainspanel.destinationList();
		
		//Click on Search Button to search train 
		trainspanel.searchButton();
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	@Test(priority=2)
	public void FtrTestCase()  {
		
		try{
			log.info("Test Fucntionality of FTR function");
		//TC-> To test fucntionality of FTR function

		//Open the Url 
		driver.get(url);
			
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
			
		//Click on Panel to Click it
		trainspanel.panelClick();
			
		//Click on Trains Section OF Panel
		trainspanel.trains();
		
		//Click on FTR Section OF Panel
		trainspanel.ftrpanel();
		
		//Switch tabs
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(1));
		driver.close();
		
		//Switch Back to First Tab
		driver.switchTo().window(newTb.get(0));
		
		}catch(Exception e) {e.printStackTrace();} 
	}
	
	@Test(priority=3)
	public void ConnectingjourneybookingTestcase() {
		//TC-> To test connecting journey Function
		try {
		log.info("Test connecting journey Function");
		//Open the Url 
		driver.get(url);
					
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
					
		//Click on Panel to Click it
		trainspanel.panelClick();
					
		//Click on Trains Section OF Panel
		trainspanel.trains();
		
		//Cick on Connecting Journey Booking Section
		trainspanel.connectingjourneybooking();
		
		//Cick on Connecting Journey Booking Ok Button 
		trainspanel.connectingjourneybookingok();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	@Test(priority=4)
	public void CancelTicketTestCase()  {
		
		
		try {
		log.info("Test Cancel Ticket Panel Function");
		//TC-> To test Cancel Ticket Panel Function
			
		//E-TICKET
			
		//Open the Url 
		driver.get(url);
						
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
						
		//Click on Panel to Click it
		trainspanel.panelClick();
						
		//Click on Login Button To Login
		trainspanel.loginButton();
		
		//Enter Username in login page
		trainspanel.setUsername(traindata[0][0]);
		
		//Enter password in login page
		trainspanel.setPassword(traindata[0][1]);
		
		//Sleep for entering captcha manually
		Thread.sleep(10000);
		trainspanel.signin();
		
		//Click on panel 
		trainspanel.panelClick();
		
		//Click on Train Section
		trainspanel.trains();
		
		//Click on Cancel Ticket
		trainspanel.cTicket();
		
		//Click on E-Ticket
		trainspanel.eTicket();
		
		
		//Counter Ticket 
		
		//Open the Url 
		driver.get(url);
		
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
		
		//Click on Panel to Click it
		trainspanel.panelClick();
		
		//Click on Train Section
		trainspanel.trains();
		
		//Click on Cancel Ticket
		trainspanel.cTicket();
		
		//Click on Counter Ticket
		trainspanel.coTicket();
		
		//Swithch Tabs
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(1));
		driver.close();
		
		//Switch Back to First Tab
		driver.switchTo().window(newTb.get(0));
				
	}catch(Exception e) {e.printStackTrace();}
	}
	
	
	@Test(priority=5)
	public void TrainScheduleTestCase() {
		
		//TC-> To test Train Schedule  Function
		log.info("Test Train Scheudle Function");
		try {
		//valid train number
		//Open the Url 
		driver.get(url);
				
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
				
		//Click on Panel to Click it
		trainspanel.panelClick();
				
		//Click on Train Section
		trainspanel.trains();
		
		//Click on Train Schedule Section
		trainspanel.trainschedule();
		
		//Enter the train number for Seeing Schedule and select it
		trainspanel.trainscheduleinput(traindata[0][5]);
		trainspanel.trainscheduleinput1();
		
		//Clcik on Sugmit Button for getting schedule
		trainspanel.trainschedulesubmit();
		
		//invalid train number
		//Open the Url 
		driver.get(url);
						
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
						
		//Click on Panel to Click it
		trainspanel.panelClick();
						
		//Click on Train Section
		trainspanel.trains();
				
		//Click on Train Schedule Section
		trainspanel.trainschedule();
				
		//Enter the train number for Seeing Schedule and select it
		trainspanel.trainscheduleinput(traindata[1][5]);
		trainspanel.trainscheduleinput1();
				
		//Clcik on Sugmit Button for getting schedule
		trainspanel.trainschedulesubmit();
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
		
	@Test(priority=6)
	public void TrackTrainTestCase()  {
	//TC-> To test Track train Fucntion
		try {
			log.info("Test Track Train Function");
		//Open the Url 
		driver.get(url);
							
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
							
		//Click on Panel to Click it
		trainspanel.panelClick();
							
		//Click on Train Section
		trainspanel.trains();
		
		//Click on Track Train Section
		trainspanel.tracktrain();
		
		//Switch tabs 
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(1));
	    
	    //sleep for entering captcha manually
		Thread.sleep(15000);
		
		//Enter train number
		trainspanel.tracktraininput(traindata[3][3]);
		
		//Click on station to select
		trainspanel.tracktrainoption();
		
		//Scrolling Page
		trainspanel.js500();
		driver.close();
		
		//Switch Back to First Tab
		driver.switchTo().window(newTb.get(0));
		}catch(Exception e) {e.printStackTrace();}
	}
	
	@Test(priority=7)
	public void trainsgr()  {
 		//TC-> To test Group Booking Function
		try {
			log.info("Test Group Booking Function");
		//Open the Url 
		driver.get(url);
							
		//Click on Ok Button of HomePage 
		trainspanel.okButton();
								
		//Click on Panel to Click it
		trainspanel.panelClick();
								
		//Click on Train  Panel 
		trainspanel.trains();
		
		//Click o IRCTC train section
		trainspanel.irctctrains();
		
		//Click on group Boooking
		trainspanel.groupbooking();
		
		//switch tabs
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(1));
	   
	    //Click on Book now button 
	    trainspanel.pgroupbooking();
		
		//Switch tabs
		ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb1.get(1));
	    
	    
		}catch(Exception e) {e.printStackTrace();}
	
}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	
	
}
