package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Base.Base;
import Base.WebDriverProvider;
import pages.HelpPage;
import pages.TrainsPanel;
import tests.*;
import utilities.ShipmentTest;
public class Main {

	WebDriverProvider browser;
	WebDriver driver;
	
	BusTest1 buspage;
	CookedFoodMenuTest foodpage;
	ECateringTest ecatering;
	FlightsLoginPageTest flightpage;
	HelpPageTest helppage;
	HolidaysPageTest holidaypage;
	HomePageTest homepage;
	LoyaltyPageTest loyaltypage;
	PantryCarTest pantrypage;
	PromotionsTest promotionpage;
	TrainsPanelTest trainpage;
	
	@BeforeTest
	public void setUp() {
		
		// calling pages
		buspage=new BusTest1();
		foodpage=new CookedFoodMenuTest();
		ecatering=new ECateringTest();
		flightpage=new FlightsLoginPageTest();
		helppage=new HelpPageTest();
		holidaypage=new HolidaysPageTest();
		homepage=new HomePageTest();
		loyaltypage=new LoyaltyPageTest();
		pantrypage=new PantryCarTest();
		promotionpage=new PromotionsTest();
		trainpage=new TrainsPanelTest();
	
		
	}
	
	@Test(priority=1)
	public void BusPage() {
		buspage.setUp();
		buspage.LoginWithEmptyCredentials();
		buspage.LoginWithInvalidCredentials();
		buspage.LoginWithValidCredentials();
		buspage.SearchWithLogin();
		buspage.SearchWithoutLogin();
		buspage.Package();
		buspage.tearDown();
		
	}
	
	@Test(priority=2)
	public void FoodPage() {
		
		foodpage.setUp();
		foodpage.viewBeverages();
		foodpage.viewBreakfast();
		foodpage.viewMeal();
		foodpage.viewAlacart();
		foodpage.viewAC1_EC();
		foodpage.viewA2_A3_CC();
		foodpage.viewRunningLateMenu();
		foodpage.viewDuronto();
		foodpage.viewGatimanmeal();
		foodpage.viewTejas1();
		foodpage.viewTejas2();
		foodpage.viewVandebharat();
		foodpage.tearDown();
		
	}
	
	@Test(priority=3)
	public void ECatering() {
		
		ecatering.setUp();
		ecatering.searchRestStation();
		ecatering.searchRestPNR();
		ecatering.popStations();
		ecatering.orderGroup();
		ecatering.tearDown();
		
	}
	
	@Test(priority=4)
	public void Flightpage() {
		
		flightpage.setUp();
		flightpage.Flightstc01();
		flightpage.Flightstc02();
		flightpage.Flightstc03();
		flightpage.Flightstc04();
		flightpage.Flightstc05();
		flightpage.Flightstc06();
		flightpage.Flightstc07();
		flightpage.Flightstc08();
		flightpage.tearDown();
		
	}

	@Test(priority=5)
	public void HelpPage() {
		
		helppage.setUp();
		helppage.ConatctUsTestCase();
		helppage.AlertsPanelTestCase();
		helppage.AskDishaTestCase();
		helppage.tearDown();
		
}
	
	@Test(priority=6)
	public void HolidaysPage() {
		
		holidaypage.setUp();
		holidaypage.holidaystc01();
		holidaypage.holidaystc02();
		holidaypage.holidaystc03();
		holidaypage.holidaystc04();
		holidaypage.holidaystc05();
		holidaypage.holidaystc06();
		holidaypage.holidaystc07();
		holidaypage.holidaystc08();
		holidaypage.holidaystc10();
		holidaypage.holidaystc11();
		holidaypage.tearDown();
		
}
	
	@Test(priority=7)
	public void HomePage() {
		
		homepage.setUp();
		homepage.LoginTestCase();
		homepage.SearchTestCase();
		homepage.BookingTestCase();
		homepage.PnrTestCase();
		homepage.tearDown();
		
}
	
	@Test(priority=8)
	public void LoyaltyPage() {
		
		loyaltypage.setUp();
		loyaltypage.sbicard();
		loyaltypage.bobcard();
		loyaltypage.tearDown();
		
}
	
	@Test(priority=9)
	public void pantryPage() {
		
		pantrypage.setUp();
		pantrypage.orderThroughPNR();
		pantrypage.tearDown();
		
}
	
	@Test(priority=10)
	public void Promotions() {
		
		promotionpage.setUp();
		promotionpage.BannerTestCase();
		promotionpage.AndroidAppTestCase();
		promotionpage.IosAppTestCase();
		promotionpage.TourismAppTestCase();
		promotionpage.AirAppTestCase();
		promotionpage.UtsAppTestCase();
		promotionpage.WifiTestCase();
		promotionpage.NVSPTestCase();
		pantrypage.tearDown();
		
}
	@Test(priority=11)
	public void TrainsPanelPage() {
		
		trainpage.setUp();
		trainpage.TouristTestCase();
		trainpage.FtrTestCase();
		trainpage.ConnectingjourneybookingTestcase();
		trainpage.CancelTicketTestCase();
		trainpage.TrainScheduleTestCase();
		trainpage.TrackTrainTestCase();
		trainpage.trainsgr();
		trainpage.tearDown();
		
}
	
	
}
