package tests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.WebDriverProvider;
import pages.PantryCarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ShipmentTest;

public class PantryCarTest {
	public static WebDriver driver;
	ChromeOptions chromeOptions;
	public static String url="https://www.irctctourism.com/BookFood/#/";
	ShipmentTest excel;
	String[][] pantrydata;
	WebDriverProvider browser;
	PantryCarPage pantryPage;
	
	Logger log = LogManager.getLogger(PantryCarTest.class.getName());

	@BeforeTest
	public void setUp()
	{
		log.info("SETUP STARTED FOR PANTRY PAGE...");

		try {
		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
						
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//This is for using excel
		excel=new ShipmentTest();
		pantrydata=excel.getPantry();	
		
		
		//This is Pom Code of Pantry page
		pantryPage=new PantryCarPage(driver);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
/* -------------------------------------------------------------------------------------------------------*/
	//SC03TC05--> To test meal booking for prepaid trains by entering PNR	
	@Test(priority=1)
	public void orderThroughPNR() {
		try{
		log.info("TEST MESL BOOKING FOR PREPAID TRAINS BY  ENTERING PNR...");

		//Open the URl
		driver.get(url);
		//Pick data from Excel sheet, enter PNR to order food
		pantryPage.searchStation(pantrydata[0][0]);
		//Click on Submit button
		pantryPage.clickSubmit();
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST MESL BOOKING FOR PREPAID TRAINS BY  ENTERING PNR COMPLETED...");

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}