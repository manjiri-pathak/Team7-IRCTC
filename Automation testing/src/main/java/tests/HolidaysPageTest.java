package tests;


import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.*;
import pages.HolidaysPage;
import utilities.ShipmentTest;

public class HolidaysPageTest {
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static Sheet sh;
	HolidaysPage holidays;
	
	public static String url="https://irctc.co.in";
	String current="https://www.irctctourism.com/tourpacakage_search?searchKey=&tagType=&travelType=Domestic&sector=All&bdar=3";
	
	ShipmentTest excel;
	String[][] holidaydata;
	WebDriverProvider browser;

	Logger log = LogManager.getLogger(HolidaysPageTest.class.getName());
	
	@BeforeMethod
	public void setUp()
	{
		log.info("SETUP STARTED FOR HOLIDAYS PAGE ");
		try{
				
		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
				
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
		//This is for using excel
		excel=new ShipmentTest();
		holidaydata=excel.getHoliday();
			
		//This is Pom Code of Holidays page
		holidays=new HolidaysPage(driver);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//STC--> To book bharat gaurav train tickets on accuarte details
	@Test(priority=1)
	public void holidaystc01()  {
				
		//Open URl
		driver.get(url);
		
		try {
			
		log.info("Test Bharat gaurav train booking ");
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//close diwali banner
		holidays.CloseBanner();
		
		//click on holidays banner
		
		holidays.Holidaysmenu();
		
		//select trains
		holidays.Trains();
		//click on book now
		holidays.currenturl();
		
		//click book now

		holidays.BookNow();
		
		//select start date
		holidays.StartDate(holidaydata[0][0]);
		
		//select board station
		holidays.BoardingStation(holidaydata[0][1]);
		
		//select deboard station
		holidays.DebaordingStation(holidaydata[0][2]);
		
		//continue button
		holidays.continueBtn();
		
		//select number of rooms
		holidays.Room(holidaydata[0][3]);
		
		//click on book button
		holidays.Book();
		
		//select guest login typee
		holidays.Guest();
		
		//enter email
		holidays.Email(holidaydata[0][17]);
		
		//enter number
		holidays.Number(holidaydata[0][18]);
		
		//click on login
		holidays.Login();
		
		//enter firstname
		holidays.FirstName(holidaydata[0][4]);
		
		//enter last name
		holidays.LastName(holidaydata[0][5]);
		
		//enter age
		holidays.Age(holidaydata[0][6]);
		
		//select gender
		holidays.Gender(holidaydata[0][7]);
		
		//enter nominee name
		holidays.NomineeName(holidaydata[0][8]);
		
		//enter relation with nominee
		holidays.Realation(holidaydata[0][9]);
		
		//enter nominee contact number
		holidays.Contact(holidaydata[0][10]);
		
		//enter your addres
		holidays.Address(holidaydata[0][11]);
		
		//enter city
		holidays.City(holidaydata[0][12]);
		
		//enter state
		holidays.State(holidaydata[0][19]);
		
		//enter pin code
		holidays.PinCode(holidaydata[0][13]);
		
		//enter country
		holidays.country(holidaydata[0][14]);
		
		//select id card type
		holidays.IDCard(holidaydata[0][15]);
		
		//enter id card number
		holidays.IDNo(holidaydata[0][16]);
		
		//click submit
		holidays.Submit();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//TC--> To book tickets on inaccuarte details
	@Test(priority=2)
	public void holidaystc02() {
		
		//Open the Url
		driver.get(url);
		
		try {
		log.info("Test Bharat gaurav train booking on inaccuarte details ");
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//close diwali banner
		holidays.CloseBanner();
		
		//click on holidays banner
		
		holidays.Holidaysmenu();
		
		//select trains
		holidays.Trains();
		
		//click on book now
		holidays.currenturl();
		
		//Click on book button 
		holidays.BookNow();
		
		//select start date
		holidays.StartDate(holidaydata[0][0]);
		
		//select boarding station
		holidays.BoardingStation(holidaydata[0][1]);
		
		//select deboarding station
		holidays.DebaordingStation(holidaydata[2][3]);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//TC--> To check contact us button
	@Test(priority=3)
	public void holidaystc03() {
		
		//Open url
		driver.get(url);
		
		try {
		log.info("to test bharat gaurav contact us button");
		
		// click on OK button
			holidays.okButton();
				
		//open side menu bar						
		holidays.sideMenu();
				
		//close diwali banner
		holidays.CloseBanner();
				
		//click on holidays banner
		holidays.Holidaysmenu();
				
		//select trains
		holidays.Trains();
		
		//move to train pacakge page
		holidays.currenturl();
		
		//click on contact us button
		holidays.Contactus();
				
		} catch (Exception e) {
			e.printStackTrace();
		}


				
	
	}
	
	//TC--> To test pnr number with accurate login details
	@Test(priority=4)
	public void holidaystc04() {
		
		//Open url
		driver.get(url);
		
		try {
		log.info("pnr number with accurate login details");
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		js.executeScript("window.scrollBy(0,600)", "");
		
		//close diwali banner
		holidays.CloseBanner();
		js.executeScript("window.scrollBy(0,550)", "");
		
		//click on holidays banner
		holidays.Holidaysmenu();
		
		//select tourpackage
		holidays.Stay();
		
		//click on book now
		holidays.Logins();
		
		//enter user name
		holidays.UserName(holidaydata[0][21]);
		
		//enter user password
		holidays.Password(holidaydata[0][22]);
		
		//clcik on login button
		holidays.LoginBtn();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		       
	}
	//TC--> To test login with wrong cred
	@Test(priority=5)
	public void holidaystc05() {
		//Open url
		driver.get(url);
		
		try {
			log.info("test login with wrong cred");
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//close diwali banner
		holidays.CloseBanner();
		
		//click on holidays banner
		
		holidays.Holidaysmenu();
		
		//select tourpackage
		holidays.Stay();
		
		//click on book now
		holidays.Logins();
		
		//enter user name
		holidays.UserName(holidaydata[1][21]);
		
		//enter user password
		holidays.Password(holidaydata[1][22]);
		
		//click on login button
		holidays.LoginBtn();
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//TC--> To test pnr number with accurate login details
	@Test(priority=6)
	public void holidaystc06() {

		//Open url
		driver.get(url);
		
		try {
		log.info("test pnr number with accurate login details");
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//scroll to make element visible
		js.executeScript("window.scrollBy(0,600)", "");
		
		//close diwali banner
		holidays.CloseBanner();
		js.executeScript("window.scrollBy(0,550)", "");
		
		//click on holidays banner
		holidays.Holidaysmenu();
		
		//select tourpackage
		holidays.Stay();
		
		//click on book now		
		holidays.Logins();
		
		//enter user  name
		holidays.UserName(holidaydata[0][21]);
		
		//enter user password
		holidays.Password(holidaydata[0][22]);
		
		//Click on login button
		holidays.LoginBtn();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		holidays.PNR(holidaydata[0][23]);
		
		holidays.PNRSearch();
		holidays.PNRerror();

		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		       
	}
	//TC--> To check contact us button
	@Test(priority=7)
	public void holidaystc07()  {
		//Open url
		driver.get(url);
		try {
			
		// click on OK button
		holidays.okButton();
				
		//open side menu bar						
		holidays.sideMenu();
				
		//close diwali banner
		holidays.CloseBanner();
				
		//click on holidays banner
		holidays.Holidaysmenu();
				
		//select trains
		holidays.Stay();
				
		//contact us button 
		holidays.Contactus();
		
		} catch (Exception e) {
					e.printStackTrace();
		}
				

//
//				
//	
	}
	
		//SC11TC08--> To book tour on accurate details
		
	@Test(priority=8)
	public void holidaystc08() {
		
		//Open url
		driver.get(url);
		
		try {
		log.info(" book tour on accurate details");
			
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//close diwali banner
		holidays.CloseBanner();
		
		//click on holidays banner
		holidays.Holidaysmenu();
		
		//select tourpackage
		holidays.Tour();
		
		//click on book now
		holidays.BookNow();
		
		//select start date
		holidays.StartDate(holidaydata[0][0]);
		
		//enter boarding station
		holidays.Boardingstn(holidaydata[0][1]);
		
		//enter deboarding station
		holidays.Deboardstn(holidaydata[0][2]);
	
		
		//clcik on continue button
		holidays.continueBtn();
		
		//select the number of rooms
		holidays.Room(holidaydata[0][3]);
		
		//click on book now
		holidays.Book();
		
		//select guest login typee
		holidays.Guest();
		
		//enter email
		holidays.Email(holidaydata[0][17]);
		
		//enter number
		holidays.Number(holidaydata[0][18]);
		
		//click on login
		holidays.Login();
		
		//enter firstname
		holidays.FirstName(holidaydata[0][4]);
		
		//enter last name
		holidays.LastName(holidaydata[0][5]);
		
		//enter age
		holidays.Age(holidaydata[0][6]);
		
		//select gender
		holidays.Gender(holidaydata[0][7]);
		
		//enter nominee name
		holidays.NomineeName(holidaydata[0][8]);
		
		//enter relation with nominee
		holidays.Realation(holidaydata[0][9]);
		
		//enter nominee contact number
		holidays.Contact(holidaydata[0][10]);
		
		//enter your address
		holidays.Address(holidaydata[0][11]);
		
		//enter city
		holidays.City(holidaydata[0][12]);
		
		//enter state
		holidays.State(holidaydata[0][19]);
		
		//enter pin code
		holidays.PinCode(holidaydata[0][13]);
		
		//enter country
		holidays.country(holidaydata[0][14]);
		
		//select id card type
		holidays.IDCard(holidaydata[0][15]);
		
		//enter id card number
		holidays.IDNo(holidaydata[0][16]);
		
		//click submit
		holidays.Submit();
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	//TC--> To book tickets on inaccurate details
	@Test(priority=9)
	public void holidaystc10()  {
		
		//Open url
		driver.get(url);
		
		try {
			
		log.info("book tickets on inaccurate details");
		
		
		// click on OK button
		holidays.okButton();
		
		//open side menu bar						
		holidays.sideMenu();
		
		//close diwali banner
		holidays.CloseBanner();
		
		//click on holidays banner
		holidays.Holidaysmenu();
		
		//select trains
		holidays.Tour();
		
		//click on book now
		holidays.BookNow();
		
		//select start date
		holidays.StartDate(holidaydata[2][0]);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	}	
	
	//SC11TC10--> To check contact us button
	@Test(priority=10)
	public void holidaystc11()  {
		
		driver.get(url);
		
		try {
		log.info("check contact us button");
		
		// click on OK button
		holidays.okButton();	
				
		//open side menu bar						
		holidays.sideMenu();
				
		//close diwali banner
		holidays.CloseBanner();
				
		//click on holidays banner
		holidays.Holidaysmenu();
			
		//select trains
		holidays.Tour();
		
		//click on contactus button
		holidays.Contactus();
				} catch (Exception e) {
					e.printStackTrace();
				} 

	}
@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}