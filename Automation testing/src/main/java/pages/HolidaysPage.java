package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysPage {
	WebDriver driver;
	JavascriptExecutor js;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okbutton;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/label[1]")
	WebElement holdiaysmenu ;
	@FindBy(xpath = "//img[@id='disha-banner-close']")
	WebElement closebanner;
	@FindBy(xpath = "//app-header/div[1]/div[2]/a[1]/i[1]")
	WebElement sidemenu;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[2]/label[1]/span[1]")
	WebElement tour;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[2]/ul[1]/li[1]")
	WebElement domestic;
	@FindBy(xpath = "//app-header/div[@id='slide-menu']/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[1]/label[1]/span[1]")
	WebElement trains;
	@FindBy(xpath="//app-header/div[@id='slide-menu']/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement bharat;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[3]/label[1]/span[1]")
	WebElement stays;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")
	WebElement retiring;
	@FindBy(partialLinkText =  "Book N")
	WebElement booknow;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/select[1]")
	WebElement startDate;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/select[1]")
	WebElement boardingstn;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/select[1]")
	WebElement deboardstsn;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[2]/select[1]")
	WebElement pax;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/button[1]")
	WebElement continuebtn;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[2]/select[1]")
	WebElement room;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/tourpackagebooking[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[10]/button[1]")
	WebElement book;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/login[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement guest;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement email;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement number;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")
	WebElement login;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/input[1]")
	WebElement firstname;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/input[1]")
	WebElement lastname;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]/input[1]")
	WebElement age;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/select[1]")
	WebElement gender;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")
	WebElement nomineename;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement relation;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/select[1]")
	WebElement gst;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[5]/input[1]")
	WebElement address;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[6]/input[1]")
	WebElement city;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[7]/select[1]")
	WebElement state;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[8]/input[1]")
	WebElement pincode;
	@FindBy (xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[9]/select[1]")
	WebElement country;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[11]/select[1]")
	WebElement idcard;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[12]/input[1]")
	WebElement idno;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[2]")
	WebElement submit;
	
	@FindBy(partialLinkText =  "Contact")
	WebElement contactus;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/homeheader[1]/header[1]/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/a[3]")
	WebElement coemail;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/label[1]")
	WebElement loyalty;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[2]/label[1]/a[1]/span[1]")
	WebElement sidescroll;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]/span[1]")
	WebElement bobcredit;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")
	WebElement aboutcard;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]/span[1]")
	WebElement sbicredit;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement aboutsbicard;

	@FindBy(partialLinkText =  "Login")
	WebElement logins;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	WebElement username;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;
	//<a class="btn btn-radius-none btn-yellow mt-2" href="/tourpackageBooking?packageCode=NZBG01">Book Now </a>
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
	WebElement loginbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
	WebElement error;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement pnrno;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/form[1]/div[2]/span[1]")
	WebElement pnerror;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]")
	WebElement pnrsearch;
	
	public HolidaysPage(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	public void okButton() {
		okbutton.click();
	}
	public void sideMenu() {
		sidemenu.click();
	}
	public void CloseBanner() {
		closebanner.click();
	}
	public void Holidaysmenu()
	{
		holdiaysmenu.click();
	}
	public void Tour() {
		Actions action = new Actions(driver);
	    action.moveToElement(tour).moveToElement(domestic).click().build().perform();
	    js.executeScript("window.scrollBy(0,550)", "");
	    }
	
	public void Trains() {
		Actions action = new Actions(driver);
	    action.moveToElement(trains).moveToElement(bharat).click().build().perform();
	   
	    }
	
	public void Stay() {
		Actions action = new Actions(driver);
	    action.moveToElement(stays).moveToElement(retiring).click().build().perform();
	   
	    }
	
	public void currenturl() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      //System.out.println("Page title of new tab: " + driver.getTitle());
	}
	public  void BoardingStation(String board) {
		boardingstn.sendKeys(board);
	}
	public  void DebaordingStation(String deboard) {
		deboardstsn.sendKeys(deboard);
	}
	
	
	
	public void BookNow()
	{
		
		booknow.click();
	}
	public void StartDate(String date) {
		startDate.sendKeys(date);
	}
	public void Boardingstn(String board) {
		boardingstn.sendKeys(board);
	}
public void Deboardstn(String deboard) {
	deboardstsn.sendKeys(deboard);
}
public void Rooms(String rooms) {
	room.sendKeys(rooms);
}
	public void PAX(String persons) {
		pax.sendKeys(persons);
	}
	
	public void continueBtn() {
		continuebtn.click();
	}
	public void Room(String rooms) {
		room.sendKeys(rooms);
	}
	public void Book() {
		book.click();;
	}
	public void Guest()
	{
		guest.click();
	}
	public void Email(String emails) {
		email.sendKeys(emails);
	}
	public void Number(String numbers) {
		number.sendKeys(numbers);
	}
	
	public void FirstName(String firstName) {
		firstname.sendKeys(firstName);
	}
	public void LastName(String lastName) {
		lastname.sendKeys(lastName);
	}
	public void Age(String agee) {
		age.sendKeys(agee);
	}
	public void Gender(String genderr) {
		gender.sendKeys(genderr);
	}
	public void NomineeName(String nname) {
		nomineename.sendKeys(nname);
	}
	public void Realation(String relationn) {
		relation.sendKeys(relationn);
	}
	public void Contact(String contactno) {
		contactus.sendKeys(contactno);
	}
	public void Address(String addresss) {
		address.sendKeys(addresss);
	}
	public void City(String cityy) {
		city.sendKeys(cityy);
	}
	public void State(String states) {
		state.sendKeys(states);
	}
	public void PinCode(String pin) {
		pincode.sendKeys(pin);
	}
	public void country(String countryy) {
		country.sendKeys(countryy);
	}
	public void IDCard(String idtype) {
		idcard.sendKeys(idtype);
	}
	public void IDNo(String idnos) {
		idno.sendKeys(idnos);
	}
	
	public void Submit() {
		submit.click();;
	}
	
	public void Contactus() {
		contactus.click();
	}
	public void Login() {
		login.click();
	}
	public void UserName(String usernames) {
		username.sendKeys(usernames);
	}
	public void Password(String passwords) {
		password.sendKeys(passwords);
	}
	public void LoginBtn() {
		loginbtn.click();
	}
	public void Logins() {
		logins.click();
	}
	
	
	
	public void Error() {
		error.getText();
	}
	public void PNR(String pnr) {
		pnrno.sendKeys(pnr);
	}
	public void PNRerror() {
		pnerror.getText();
	}
	public void PNRSearch() {
		pnrsearch.click();
	}
}
