package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusPage {
	WebDriver driver;
	JavascriptExecutor js;
	public BusPage(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okbutton;
	
	
	@FindBy(xpath="/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i")
	WebElement panel;
	
	@FindBy(xpath="//img[@id='disha-banner-close']")
	WebElement Adv;
	
	
	@FindBy(xpath="//label[contains(text(),'BUSES')]")
	WebElement BUSES;	

	
	@FindBy(linkText="Login")
	WebElement BLogin;
	
	@FindBy(id="dropdown11")
	WebElement dropdown;	
	
	
	
	@FindBy(xpath="//input[@id='loginuserid']")
	WebElement BUname;
	
	
	@FindBy(xpath="//*[@id=\"pwd\"]")
	WebElement BUpass;
	
	
	@FindBy(xpath="//*[@id=\"home\"]/div/form/div[3]/button")
	WebElement BLogin2;
	

	
		
	@FindBy(id="departFrom")
	WebElement From;
	
	

	@FindBy(xpath="//div[.='Mumbai (Dadar)']")
	WebElement Source;
	
//	Actions act1=new Actions(driver);
//	act1.moveToElement(driver.findElement(By.xpath("//div[.='Mumbai (Dadar)']"))).click().build().perform();
	public void SOURCE() {
	Actions act=new Actions(driver);
	act.moveToElement(Source).click().build().perform();;
	}
	
	
	@FindBy(xpath="//div[.='Pune']")
	WebElement Dest;
	
//	Actions act2=new Actions(driver);

	public void DEST() {
	Actions act1=new Actions(driver);
	act1.moveToElement(Dest).click().build().perform();;
	}
	
	@FindBy(xpath="//a[normalize-space()='12']")
	WebElement Date2;
	
	public void DATE2() {
	Actions act2=new Actions(driver);
	act2.moveToElement(Date2).click().build().perform();;
	}
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/figcaption[1]/a[1]")
	WebElement Package;
	
	public void PACKAGE() {
	Actions act3=new Actions(driver);
	act3.moveToElement(Package).click().build().perform();;
	}



	
	@FindBy(id="goingTo")
	WebElement To;
	

	@FindBy(xpath="//a[normalize-space()='12']")
	WebElement Date;
	
	
	
	
	@FindBy(xpath="/html/body/app-root/app-header/header/nav[1]/div/div[2]/div[2]/ul/li[2]/div/a[3]")
	WebElement Logout;
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/div[3]/div[2]/div[2]/form[1]/div[4]/button[1]")
	WebElement Search;
	
	
	@FindBy(xpath="	//span[contains(text(),'Please enter origin city')]\r\n")
	WebElement EmptyError;
	
	
	
	
	@FindBy(xpath="//*[@id=\"modalLoginForm\"]/div/div/button")
	WebElement cross;
	

	@FindBy(xpath="/html/body/app-root/app-home/div[1]/app-header/p-toast/div/p-toastitem/div/div/a")
	WebElement cross1;
	
	
		@FindBy(xpath="//h2[contains(text(),'No buses found.')]")
	WebElement Nobusesfounderror;
	
		
		
	@FindBy(className ="info-danger")
	WebElement invalidUserDetailsError;
	

	
	
//	act.moveToElement(driver.findElement(By.xpath("//div[text()='Mumbai']"))).click().build().perform();
//	

	
	public void TO() {
	Actions act=new Actions(driver);
	act.moveToElement(To).click().build().perform();;
	}
	
	public void DATE() {
	Actions act=new Actions(driver);
	act.moveToElement(Date).click().build().perform();;
	}
	
	public void js500() {
		js.executeScript("window.scrollBy(0,300)", "");
	}
	

	

	public void okButton() {
		okbutton.click();
	}
	public void panel() {
		panel.click();
	}
	public void advet() {
		Adv.click();
	}
	public void buses() {
		BUSES.click();
	}
//	public void busesTickets() {
//		BusTicket.click();
//	}
	public void Blogin() {
		BLogin.click();
	}
	public void Buname(String src1) {
		BUname.sendKeys(src1);
	}
	public void Bupass(String src2) {
		BUpass.sendKeys(src2);
	}
	public void Blogin2() {
		BLogin2.click();
	}
	public void Logout() {
		Logout.click();
	}
//	public void Depart() {
//		Depart.click();
//	}
//	
	
	
	
	
	
	public void from(String src4) {
		From.click();
		From.sendKeys(src4);
	}
	
	
	
//	public void Select() {
//		select.click();
//	}
	
	
	public void to(String src5) {
		To.click();
		To.sendKeys(src5);
	}
	
	
	
	

	
	public void  date(String date) {
		Date.click();
		Date.sendKeys(date);
	}
	
	
	
	
	
	
	
	
	public void search() {
		Search.click();
	}
	public void Cross() {
		cross.click();
	}
	public void Cross1() {
		cross1.click();
	}
	public String error() {
		return invalidUserDetailsError.getText();
	}
	

	public void Dropdown() {
		dropdown.click();
	}

	
}
