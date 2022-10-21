package tests;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.WebDriverProvider;
import pages.CookedFoodMenuPage;


public class CookedFoodMenuTest {
	ChromeOptions chromeOptions;
	public static WebDriver driver;
	public static String url="https://menurates.irctc.co.in/";
	CookedFoodMenuPage foodPage;
	WebDriverProvider browser;
	
	Logger log = LogManager.getLogger(CookedFoodMenuTest.class.getName());

	@BeforeTest
	public void setUp()
	{
		log.info("SETUP STARTED FOR COOKED FOOD MENU PAGE...");

		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
			
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
		//This is Pom Code of CookedFoodMenu page
		foodPage=new CookedFoodMenuPage(driver);
	}
	
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Beverages Menu
	@Test(priority=1)
	public void viewBeverages() {
		try{
		log.info("TEST VIEWING BEVERAGES MENU ...");
	
		//Open the URL
		driver.get(url);
		//CLick on Beverages menu button
		foodPage.clickBeverages();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING BEVERAGES MENU COMPLETED...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Breakfast Menu
	@Test(priority=2)
	public void viewBreakfast() {
		try{
		log.info("TEST VIEWING BREAKFAST MENU ...");
			
		//Open the URL
		driver.get(url);
		
		//Click on Breakfast menu button
		foodPage.clickBreakfast();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING BREAKFAST MENU COMPLETED...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Meal Menu
	@Test(priority=3)
	public void viewMeal() {
		try{
		
		log.info("TEST VIEWING MEAL MENU ...");
		
		//Open the URL
		driver.get(url);
		
		//CLick on Meals menu button
		foodPage.clickMeal();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING MEAL MENU COMPLETED...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing A-la-Carte Menu
	@Test(priority=4)
	public void viewAlacart() {
		try{
		log.info("TEST VIEWING A-LA-CARTE MENU ...");

		//Open the URL
		driver.get(url);
		
		//CLick on A-la-Carte menu button
		foodPage.clickAlacart();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING A-LA-CARTE MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing AC1/EC Menu
	@Test(priority=5)
	public void viewAC1_EC() {
		try{
		log.info("TEST VIEWING AC1/EC MENU ...");

		//Open the URL
		driver.get(url);
		
		//CLick on AC1/EC menu button
		foodPage.clickAC1_EC();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING AC1/EC MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing A2/A3/CC menu
	@Test(priority=6)
	public void viewA2_A3_CC() {
		try{
		log.info("TEST VIEWING A2/A3/CC MENU ...");

		//Open the URL
		driver.get(url);
		
		//Click on A2/A3/CC menu button
		foodPage.clickA2_A3_CC();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING A2/A3/CC MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Running Late menu
	@Test(priority=7)
	public void viewRunningLateMenu() {
		try{
		log.info("TEST VIEWING RUNNING LATE MENU ...");

		//Open the URL
		driver.get(url);
		
		//Click on Running Late menu button
		foodPage.clickRunningLateMenu();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING RUNNING LATE MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Duronto menu
	@Test(priority=8)
	public void viewDuronto() {
		try{
		log.info("TEST VIEWING DURONTO MENU ...");

		//Open the URL
		driver.get(url);
		
		//Click on Duronto menu button
		foodPage.clickDuronto();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING DURONTO MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Gatiman Meal menu
	@Test(priority=9)
	public void viewGatimanmeal() { 
		try{
		log.info("TEST VIEWING GATIMAN MEAL MENU ...");

		//Open the URL
		driver.get(url);
		
		//
		foodPage.clickGatimanmeal();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING GATIMAN MEAL MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Tejas 2211920 menu
	@Test(priority=10)
	public void viewTejas1() {
		try{
		log.info("TEST VIEWING TEJAS 2211920 MENU ...");

		//Open the URL
		driver.get(url);
		
		//
		foodPage.clickTejas1();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING TEJAS 2211920 MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Tejas 8250102 menu
	@Test(priority=11)
	public void viewTejas2() {
		try{
		log.info("TEST VIEWING TEJAS 8250102 MENU ...");

			//Open the URL
		driver.get(url);
		
		//
		foodPage.clickTejas2();
		//After viewing switch back to previous frame
		driver.switchTo().parentFrame();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING TEJAS 8250102 MENU COMPLETED ...");

	}
/* -------------------------------------------------------------------------------------------------------*/
	//TC--> To test viewing Vande Bharat menu
	@Test(priority=12)
	public void viewVandebharat() {
		try{
		log.info("TEST VIEWING VENDE BHARAT MENU ...");

		//Open the URL
		driver.get(url);
			
		//
		foodPage.clickVandebharat();
		//After viewing click close button
		foodPage.clickClose();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("TEST VIEWING VENDE BHARAT MENU COMPLETED ...");

	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
