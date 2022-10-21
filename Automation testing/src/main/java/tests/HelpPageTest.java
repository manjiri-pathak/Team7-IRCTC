package tests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Base.Base;
import pages.HelpPage;
import utilities.ScreenShot;
import utilities.ShipmentTest;


public class HelpPageTest {
	public static WebDriver driver;
	
	public static JavascriptExecutor js;
	HelpPage helppage;
	Base base;
	public static String url="https://irctc.co.in";
	Logger log = LogManager.getLogger(HelpPageTest.class.getName());

	@BeforeTest
	public void setUp()
	{
		log.info("SETUP STARTED FOR HelpPageTest");
		base=new Base();
		driver=base.ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		helppage=new HelpPage(driver);

	}
	@Test(priority=1)
	public void AlertsPanelTestCase()  {
		
		try {
		log.info("Test Alerts Panel ");
		//Open the URl
		driver.get(url);
		
		//Click on Ok Button of HomePage 
		helppage.OkButton();
		
		//Click on Panel to Click it	
		helppage.NAVButton();
		
		//Click on Alert section of Panel
		helppage.AlertButton();
		
		//After opening Alert,click on update section
		helppage.UpdateBtn();
		
		//After opening Alert,click on General Information section
		helppage.Generalinfo();
		
		//After opening Alert,click on Quick Links section
		helppage.QuickLnkButton();
		
		//After opening Alert,click on Railway Update section
		helppage.RailwayUpdateButton();
		
		}catch(Exception e) {e.printStackTrace();}
		
		
	}
	@Test(priority=2)
	public void ConatctUsTestCase()  {
		
		try {
		log.info("Test Contact Us Panel ");

		//Open the URl
		driver.get(url);
		
		//Click on Ok Button of HomePage
		helppage.OkButton();
		
		//Click on Panel to Click it	
		helppage.NAVButton();
		
		//Click on Contact Us Section
		helppage.ContactButton();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	@Test(priority=3)
	public void AskDishaTestCase()  {
		
		try {
		log.info("Test ask Disha Panel ");

		//Open the URl
		driver.get(url);
			
		//Click on Ok Button of HomePage
		helppage.OkButton();
			
		//Click on Panel to Click it	
		helppage.NAVButton();
			
		//Click on ASk Disha Section
		helppage.AskDishaButton();
		
		}catch(Exception e) {e.printStackTrace();}
		}
	@AfterTest  
	public void tearDown() {
		driver.close();
	}
	}