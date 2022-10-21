package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TrainsPanel {
	WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okbutton;
	
	@FindBy(xpath="//app-header/div[1]/div[2]/a[1]/i[1]")
	WebElement panel;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/label/span[1]/strong")
	WebElement trains;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[2]/a/span")
	WebElement foreigntourist;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement foreigntouristok;
	
	@FindBy(xpath="//*[contains(@aria-controls,'pr_id_1_list') and contains(@role,'searchbox')]")
	WebElement source;
	
	@FindBy(xpath="//*[contains(@class,'ng-star-inserted') and contains(text(),'KALYAN JN - KYN')]")
	WebElement sourcelist;
	
	@FindBy(xpath="//*[contains(@aria-controls,'pr_id_2_list') and contains(@role,'searchbox')]")
	WebElement destination;
	
	@FindBy(xpath="//*[contains(@class,'ng-tns-c57-9 ng-star-inserted') and contains(text(),'PUNE JN - PUNE')]")
	WebElement destinationlist;
	
	@FindBy(xpath="//button[contains(text(),'Search')]")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[3]/a/span")
	WebElement connectingjourneybooking;
	
	@FindBy(xpath="/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")
	WebElement connectingjourneybookingok;
	
	@FindBy(xpath="//app-header/div[@id='slide-menu']/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[4]/label[1]/span[1]")
	WebElement irctctrains;
	
	@FindBy(xpath="//app-header/div[@id='slide-menu']/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")
	WebElement groupbooking;
	
	@FindBy(xpath="//a[contains(text(),'Proceed for Group booking')]")
	WebElement pgroupbooking;
	
	@FindBy(xpath="//body/app-root[1]/tourpackagelist[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/figcaption[1]/a[1]")
	WebElement ooty;
	
	@FindBy(xpath="/html/body/app-root/tourpackagelist/div[2]/div/div[3]/div/div[2]/div/div[3]/div/a[2]")
	WebElement ootybook;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[4]/ul/li[2]/a/span")
	WebElement travelins;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[contains(@formcontrolname,'userid') and contains(@placeholder,'User Name')]")
	WebElement uname;
	
	@FindBy(xpath="//*[contains(@formcontrolname,'password') and contains(@placeholder,'Password')]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[5]/label/span[1]")
	WebElement cticket;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[5]/ul/li[1]/a/span")
	WebElement eticket;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[5]/ul/li[2]/a/span")
	WebElement coticket;
	
	@FindBy(xpath="//*[@id=\"train\"]/span/input")
	WebElement trainscheduleinput;
	
	
	@FindBy(xpath="//*[@id=\"p-highlighted-option\"]/span")
	WebElement trainscheduleinput1;
	
	@FindBy(xpath="//*[@id=\"divMain\"]/div/app-check-train-schedule/div[2]/div/div/div/div[2]/button")
	WebElement trainschedulesubmit;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[7]/a/span")
	WebElement trainschedule;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[8]/a/span")
	WebElement tracktrain;
	
	@FindBy(xpath="//*[@id=\"trainNo\"]")
	WebElement tracktraininput;
	
	
	@FindBy(xpath="//*[@id='jStation']/option[2]")
	WebElement tracktrainoption;
	
	
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[9]/a/span")
	WebElement ftrpanel;
	
	public TrainsPanel(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void okButton() {
		okbutton.click();
	}
	
	public void panelClick() {
		js.executeScript("arguments[0].click();",panel);
	}
	
	public void trains() {
		js.executeScript("arguments[0].click();",trains);
	}
	public void foreigntourist() {
		js.executeScript("arguments[0].click();",foreigntourist);
	}

	public void foreigntouristok() {
		foreigntouristok.click();
	}
	
	public void source(String src) {
		source.sendKeys(src);
	}
	
	public void sourceList() {
		sourcelist.click();
	}
	
	public void destination(String dest) {
		destination.sendKeys(dest);
	}
	
	public void destinationList() {
		destinationlist.click();
	}
	
	public void searchButton() {
		searchbutton.click();
	}
	public void connectingjourneybooking() {
		js.executeScript("arguments[0].click();",connectingjourneybooking);
	}
	public void connectingjourneybookingok() {
		connectingjourneybookingok.click();
	}
	public void irctctrains() {
		js.executeScript("arguments[0].click();",irctctrains);
	}
	public void groupbooking() {
		js.executeScript("arguments[0].click();",groupbooking);
	}
	
	public void pgroupbooking() {
		js.executeScript("arguments[0].click();",pgroupbooking);
	}
	public void ooty() {
		ooty.click();
	}
	public void ootybook() {
		ootybook.click();
	}
	
	public void travelins() {
		js.executeScript("arguments[0].click();",travelins);
	}
	public void loginButton() {
		loginbutton.click();
	}
	public void setUsername(String username)
	{
		uname.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void signin() {
		signin.click();
	}
	
	public void eTicket() {
		js.executeScript("arguments[0].click();",eticket);	
		}
	public void cTicket() {
		js.executeScript("arguments[0].click();",cticket);
	}
	public void coTicket() {
		js.executeScript("arguments[0].click();",coticket);
	}
	public void trainschedule() {
		js.executeScript("arguments[0].click();",trainschedule);
	}
	public void trainscheduleinput1() {
		trainscheduleinput1.click();
	}
	public void trainschedulesubmit() {
		trainschedulesubmit.click();
	}
	
	public void trainscheduleinput(String str) {
		trainscheduleinput.sendKeys(str);
	}
	
	public void tracktrain() {
		js.executeScript("arguments[0].click();",tracktrain);
	}
	public void tracktrainoption() {
		
		tracktrainoption.click();
		
	}
	public void tracktraininput(String str){
		tracktraininput.sendKeys(str);
	}
	
	public void ftrpanel() {
		js.executeScript("arguments[0].click();",ftrpanel);
	}
	
	public void js250() {
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public void js500() {
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	public void js550() {
		js.executeScript("window.scrollBy(0,550)", "");
	}
}
