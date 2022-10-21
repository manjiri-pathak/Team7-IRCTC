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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.WebDriverProvider;
import pages.BusPage;
import pages.TrainsPanel;
import utilities.ScreenShot;
import utilities.ShipmentTest;

public class BusTest1 {

	public static WebDriver driver;
	public static Sheet sh;
	public static JavascriptExecutor js;
	BusPage buspage;
	public static String url="https://irctc.co.in";
	public static String url2="https://www.bus.irctc.co.in/home";
	ShipmentTest excel;
	String[][] busdata;
	WebDriverProvider browser;
	ScreenShot ss;
	String sshot;
	
	Logger log = LogManager.getLogger(BusTest1.class.getName());

	
	
	@BeforeTest
	public void setUp()
	{
		try {
		log.info("SETUP STARTED FOR BUS PAGE...");
		
		//WebDriverProvider class is for cross browser Testing
		browser=new WebDriverProvider(driver);
		
		//Below code is for Opening browser
		driver= browser.setBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//This is for using excel
		excel=new ShipmentTest();
		busdata=excel.getBus();
		
		//This is Pom Code of Bus page
		buspage=new BusPage(driver);
	
		}catch(Exception e) {e.printStackTrace();}

	}


//-------------------------------------------------------------------------------------------------------
//////TC01--> To test login functionality with some empty fields


@Test(priority=1)
public void LoginWithEmptyCredentials() {
	try {
	log.info("TEST LOGIN FUNCTIONALITY WITH SOME EMPTY FIELDS...");

	//Open the URl
	driver.get(url);
	
	////click on OK button
	buspage.okButton();
	
	// click on panel for login
	buspage.panel();
	
	//close the advertisement
	buspage.advet();
	
	// click on Buses
	buspage.buses();
	
	
	//change the control to the new tab and close the previous tab
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));
	
	//click on the login button
	buspage.Blogin();
	
	
	//Enter userName and password
	buspage.Buname("");
	buspage.Bupass("");
	
	//click on the login button
	buspage.Blogin2();
	
	//close the login panel
	buspage.Cross();
	log.info("TEST LOGIN FUNCTIONALITY WITH SOME EMPTY FIELDS COMPLETED...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

///-------------------------------------------------------------------------------------------------------
//////TC02--> To test login functionality with invalid credentials


@Test(priority=2)
public void LoginWithInvalidCredentials() {
	log.info("TEST LOGIN FUNCTIONALITY WITH INVALID CREDENTIALS...");
	try {
	//open the URL
	driver.get(url);
	
	//click on OK button
	buspage.okButton();
	
	
	// click on panel for login
	buspage.panel();
	
	//close the advertisement
	buspage.advet();
	
	// click on Buses
	buspage.buses();
	
	
	//change the control to the new tab and close the previous tab
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));
		
	// click on login button
	buspage.Blogin();
	
		
	//Enter userName and password
	buspage.Buname(busdata[1][0]);
	buspage.Bupass(busdata[1][1]);
	
	//click on login 
	buspage.Blogin2();
	
	//close the login panel
	buspage.Cross();
	
	
	//close the driver
	driver.close();
	
	log.info("TEST LOGIN FUNCTIONALITY WITH INVALID CREDENTIALS COMPLETED...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}




///* -------------------------------------------------------------------------------------------------------
////TC03--> To test login functionality with valid credentials


@Test(priority=3)
public void LoginWithValidCredentials(){
	log.info("TEST LOGIN FUNCTIONALITY WITH VALID CREDENTIALS...");
	try{
	//open the URL
		driver.get(url);
		
		//click on OK button
		buspage.okButton();
		
		
		// click on panel for login
		buspage.panel();
		
		//close the advertisement
		buspage.advet();
		
		// click on Buses
		buspage.buses();

	//change the control to the new tab and close the previous tab	
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));

	
	// click on login button
	buspage.Blogin();

	
	//Enter userName and password
	buspage.Buname(busdata[0][0]);
	buspage.Bupass(busdata[0][1]);
	

	//click on login 
	buspage.Blogin2();

	//open the login dropdown
	buspage.Dropdown();

	//click on the logout button
	buspage.Logout();
	
	//close the driver
	driver.close();
	log.info("TEST LOGIN FUNCTIONALITY WITH VALID CREDENTIALS COMPLETED...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

/* -------------------------------------------------------------------------------------------------------*/
//TC04-->To test if the search operation is allowed with login 

@Test(priority=4)

public void SearchWithLogin()  {
	
	log.info("TEST SEARCH OPERATION WITH LOGIN...");
	try {
	driver.get(url);
	//click on OK button
	buspage.okButton();
	
	// click on panel for login
	buspage.panel();
	
	//click on the advertisment
	buspage.advet();
	
	// click on Buses
	buspage.buses();

	//change the control to the new tab and close the previous tab
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));

	// click on login button
	buspage.Blogin();

	
	
	//Enter userName and password
	buspage.Buname(busdata[0][0]);
	buspage.Bupass(busdata[0][1]);
	
	//click on login 
	buspage.Blogin2();

	
	
	//enter the source
	buspage.SOURCE();
	
	//get the source from excelsheet
	buspage.to(busdata[2][1]);
	
	//enter the destination
	buspage.DEST();
	
	//enter the date
	buspage.DATE2();

	//click on search
	buspage.search();
	
	//click on the login dropdown
	buspage.Dropdown();
	
	//click on the logout button
	buspage.Logout();
	log.info("TEST SEARCH OPERATION WITH LOGIN COMPLETED...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

///* -------------------------------------------------------------------------------------------------------*/
////TC05--> To test if the search operation is allowed without login 

@Test(priority=5)
public void SearchWithoutLogin()  {
	log.info("TEST SEARCH OPERATION WITHOUT LOGIN...");
	try {
	//open the url
	driver.get(url);
	
	//click on OK button
	buspage.okButton();
	
	// click on panel for login
	buspage.panel();
	
	//CLICK ON ADVERTISEMANET
	buspage.advet();
	
	// click on Buses
	buspage.buses();
	
	
	//change the control to the new tab and close the previous tab
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));
	
	// click on login button
	buspage.Blogin();
	
	
	//Enter userName and password
	buspage.Buname(busdata[0][0]);
	buspage.Bupass(busdata[0][1]);
	
	//click on login 
	buspage.Blogin2();
	
	
	
	
	
	//get the source 
	buspage.from(busdata[2][0]);
	
	//enter the source in the source field
	buspage.SOURCE();
	
	//get the destination
	buspage.to(busdata[2][1]);
	
	//enter the destination in the destination field
	buspage.DEST();
	
	//enter the date
	buspage.DATE2();
	
	
	//click on the search
	buspage.search();
	log.info("TEST SEARCH OPERATION WITHOUT LOGIN COMPLETED...");

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}



//* -------------------------------------------------------------------------------------------------------*/
////TC06--> To test if trending packages are clickable or not




@Test(priority=6)
public void Package()  {
	
	log.info("TEST STRENDING PACKAGES ARE CLICKABLE OR NOT...");
	try {
	//open the url
	driver.get(url);

	//click on OK button
	buspage.okButton();
	
	// click on panel for login
	buspage.panel();
	
	//close the advertisement
	buspage.advet();
	
	// click on Buses
	buspage.buses();
	
	//change the control to the new tab and close the previous tab
	ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.switchTo().window(newTab.get(0));
	driver.close();
	driver.switchTo().window(newTab.get(1));
	
	
	//scroll down 
	buspage.js500();
	
	//click on the trending package
	buspage.PACKAGE();
	log.info("TEST STRENDING PACKAGES ARE CLICKABLE OR NOT COMPLETED...");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	}
}
	
	
	

