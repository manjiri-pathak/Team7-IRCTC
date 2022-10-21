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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Base.WebDriverProvider;
import pages.HomePage;
import pages.Promotions;
import pages.TrainsPanel;
import utilities.ShipmentTest;


public class PromotionsTest {

			
		public static WebDriver driver;
		public static Sheet sh;
		Promotions promotions;
		public static JavascriptExecutor js ;
		public static String url="https://irctc.co.in";
		
		WebDriverProvider browser;
		Base base;
		
		Logger log = LogManager.getLogger(PromotionsTest.class.getName());
		
		@BeforeTest
		public void setUp() 
		{
			//This line will be printed in log file
			log.info("SETUP STARTED FOR PROMOTIONS PAGE...");
			
			try {
			//WebDriverProvider class is for cross browser Testing
			browser=new WebDriverProvider(driver);
				
			//Below code is for Opening browser
			driver= browser.setBrowser("chrome");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
			//This is Pom Code of Promotions page
			promotions=new Promotions(driver);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Test(priority=1)
		public void promotionpage() {
			
			//Click on URl
			driver.get(url);
			
			//Click on Ok Button of HomePage 
			promotions.okButton();
			
			//Click on Panel to Click it
			promotions.panelClick();
			
			//Click on Promotions Section
			promotions.promotions();
			
			
		}
		
		@Test(priority=2)
		public void BannerTestCase() {
			
			
			
			
			//This line will be printed in log file
			log.info("TEST CASE FOR BANNER ADVERTISEMENT...");
			
			//Calling promotionpage()
			promotionpage();
			
			// Click on advertise with us section
			promotions.advertisewithus();
			
			//Click on banner Section
			promotions.banner();
			
			//Switch tabs
			ArrayList<String> banner = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(banner.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(banner.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR BANNER ADVERTISEMENT COMPLETED..");
			
			//CHATBOT...
			
			//This line will be printed in log file
			log.info("TEST CASE FOR CHATBOT ADVERTISEMENT...");
			//Calling promotionpage()
			promotionpage();
			
			//Click on advertise with us section
			promotions.advertisewithus();
			
			//Click on chatbot Section
			promotions.chatbot();
			
			//Switch tabs
			ArrayList<String> chatbot = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(chatbot.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(chatbot.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR CHATBOT ADVERTISEMENT COMPLETED..");
		}
		
		@Test(priority=3)
		public void AndroidAppTestCase() {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR ANDROID APP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			//Click on Rail Connect App section
			promotions.railconnectapp();
			
			//Under that Click on android app section
			promotions.androidapp();
			
			//Switch tabs
			ArrayList<String> androidapp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(androidapp.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(androidapp.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR ANDROID APP FEATURE COMPLETED..");
		}
		
		@Test(priority=4)
		public void IosAppTestCase() {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR IOS APP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			//Click on Rail Connect App section
			promotions.railconnectapp();
			
			//Under that Click on IOS app section
			promotions.iosapp();
			
			//Switch tabs
			ArrayList<String> iosapp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(iosapp.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(iosapp.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR IOS APP FEATURE COMPLETED..");
		}
		
		@Test(priority=5)
		public void TourismAppTestCase() {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR TOURISM APP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			// Click on Tourism app section
			promotions.tourismapp();
			
			//Switch tabs
			ArrayList<String> tourismapp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tourismapp.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(tourismapp.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR TOURISM APP FEATURE COMPLETED..");
		}
		
		@Test(priority=6)
		public void AirAppTestCase() {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR AIR APP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			// Click on Air app section
			promotions.airapp();
			
			//Switch tabs
			ArrayList<String> airapp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(airapp.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(airapp.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR AIR APP FEATURE COMPLETED..");
		}
		

		@Test(priority=7)
		public void UtsAppTestCase() {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR UTS APP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			//Click on Uts app section
			promotions.utsapp();
			
			//Switch tabs
			ArrayList<String> utsapp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(utsapp.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(utsapp.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR UTS APP FEATURE COMPLETED..");
		}
		
		@Test(priority=8)
		public void WifiTestCase() {
			

			//This line will be printed in log file
			log.info("TEST CASE FOR WIFI FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			//Click on Wifi section
			promotions.wifi();
			
			//Switch tabs
			ArrayList<String> wifi = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(wifi.get(1));
			driver.close();
			
			//Switch to first tab
			driver.switchTo().window(wifi.get(0));
			
			//This line will be printed in log file
			log.info("TEST CASE FOR WIFI FEATURE COMPLETED..");
		}
		
			
		
		@Test(priority=9)
		public void NVSPTestCase() {
			try {
			
			//This line will be printed in log file
			log.info("TEST CASE FOR NVSP FEATURE..");
			
			//Calling promotionpage()
			promotionpage();
			
			//Click on NVSP Section
			promotions.nvsp();
					
			//Switch Tabs
			ArrayList<String> nvsp = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(nvsp.get(1));
		    driver.close();
		    
		    //Switch to First Tab
		    driver.switchTo().window(nvsp.get(0));
		    
		    //This line will be printed in log file
			log.info("TEST CASE FOR NVSP FEATURE COMPLETED..");
			
			}catch(Exception e){}
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
		
		
		
	
	
}
