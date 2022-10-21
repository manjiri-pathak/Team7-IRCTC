package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Base.*;
import pages.Loyalty;
import utilities.ScreenShot;
import utilities.ShipmentTest;


public class LoyaltyPageTest {
	
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static Sheet sh;
	Loyalty loyalty;
	
	public static String url="https://irctc.co.in";
	
	
	ShipmentTest ship;
	String[][] loyaltydata;
	
	ScreenShot screenshot;
	String sshot;
	
	WebDriverProvider browser;

	Logger log = LogManager.getLogger(LoyaltyPageTest.class.getName());
	
	@BeforeTest
	public void setUp()
	{
		//This line will be printed in log file
		log.info("SETUP STARTED FOR LOYALTY PAGE...");
		
		try{
			
		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
				
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
		//This is Pom Code of Loyalty page
		loyalty=new Loyalty(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//sbi card test
	@Test(priority=1)
	public void sbicard() {
		try{
		//This line will be printed in log file
		log.info("TEST CASE FOR SBI CARD..");
		
		//Open the url
		driver.get(url);
		
		//Click on Ok Button of HomePage
		loyalty.okButton();
		
		//open side menu bar						
		loyalty.sideMenu();
		
		//close diwali banner
		loyalty.CloseBanner();
		
		//side scroll
		loyalty.Sidescroll();
		
		//select loyalty menu
		loyalty.Loyaltymenu();
		
		//cick on sbi cards page
		loyalty.Sbicards();
		
		//This line will be printed in log file
		log.info("TEST CASE FOR SBI CARD COMPLETED..");
		
		}  catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	//bob card test
	@Test(priority=2)
	public void bobcard() {
		
		try{
		//This line will be printed in log file
		log.info("TEST CASE FOR BOB CARD..");

		//Open the url
		driver.get(url);
		
		//Click on Ok Button of HomePage
		loyalty.okButton();
		
		//open side menu bar						
		loyalty.sideMenu();
		
		//close diwali banner
		loyalty.CloseBanner();
		
		// select side menu
		loyalty.Sidescroll();
		
		//select loyalty menu
		loyalty.Loyaltymenu();
		
		//click on bob card page
		loyalty.Bobcards();
		
		//THis line will be printed in log file
			log.info("TEST CASE FOR BOB CARD COMPLETED..");
		}  catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	}

