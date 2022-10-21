package tests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.WebDriverProvider;
import pages.ECateringPage;
import utilities.ShipmentTest;

public class ECateringTest {
	
	public static WebDriver driver;
	public static String url="https://www.ecatering.irctc.co.in/";
	ECateringPage caterPage;
	ShipmentTest excel;
	String[][] caterdata;
	WebDriverProvider browser;
	
	Logger log = LogManager.getLogger(ECateringTest.class.getName());

	@BeforeTest
	public void setUp()
	{
		try {
		log.info("SETUP STARTED FOR E-CATERING PAGE...");

		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
			
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//This is for using excel
		excel=new ShipmentTest();
		caterdata=excel.getEcatering();
		
		//This is Pom Code of E-Catering page
		caterPage=new ECateringPage(driver);
	}catch(Exception e)
		{
		e.printStackTrace();
	}
	}
/* -------------------------------------------------------------------------------------------------------*/
	//SC03TC01--> To search restaurants available at particular station	
	@Test(priority=1)
	public void searchRestStation() {
		try{
		
		log.info("TEST SEARCH RESTURANTS AVAILABLE AT PARTICULAR STATION...");

		//Open the URl
		driver.get(url);
		//Get Station names from Excel, enter value to order food
		caterPage.searchStation(caterdata[0][0]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST SEARCH RESTURANTS AVAILABLE AT PARTICULAR STATION COMPLETED...");


	}
/* -------------------------------------------------------------------------------------------------------*/
	//SC03TC02--> To search for restaurants based on PNR	
	@Test(priority=2)
	public void searchRestPNR() {
		try{
		log.info("TEST SEARCH RESTURANTS BASED ON PNR...");

		//Open the URl
		driver.get(url);
		//Get PNR values from Excel, enter value to order food
		caterPage.pnrSearch(caterdata[0][1]);
		//Click on submit
		caterPage.pnrSubmit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST SEARCH RESTURANTS BASED ON PNR COMPLETED...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//SC03TC04--> To test ordering from most popular stations
	@Test(priority=3)
	public void popStations() {
		try{
		log.info("TEST ORDERING FROM MOST POPULAR STATIONS...");

		//Open the URl
		driver.get(url);
		
		//Scroll		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		//Thread.sleep(10000);
		
		//Click on Book Now
		caterPage.clickJunction();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST ORDERING FROM MOST POPULAR STATIONS COMPLETED...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//SC03TC03--> To test group orders of over 15 people	
	@Test(priority=4)
	public void orderGroup() {
		try{
		log.info("TEST GROUP ORDERS OF OVER 5 PEOPLE...");

		//Open the URl
		driver.get(url);
		
		//Scroll		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		//Thread.sleep(10000);
		
		//Click on Book Now
		caterPage.groupOrder();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST GROUP ORDERS OF OVER 5 PEOPLE COMPLETED...");

		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
