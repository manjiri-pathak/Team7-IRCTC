package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Promotions {

	WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okbutton;
	
	@FindBy(xpath="//app-header/div[1]/div[2]/a[1]/i[1]")
	WebElement panel;
	
	@FindBy(xpath="//app-header/div[@id='slide-menu']/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[10]/label[1]")
	WebElement promotions;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[1]/a/span[1]")
	WebElement advertisewithus;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[1]/ul/li[1]/a/span")
	WebElement banner;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[1]/ul/li[3]/a/span")
	WebElement chatbot;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[2]/a/span[1]")
	WebElement railconnectapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[2]/ul/li[1]/a/span")
	WebElement androidapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[2]/ul/li[2]/a/span")
	WebElement iosapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[2]/ul/li[2]/a/span")
	WebElement tourismapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[4]/a/span")
	WebElement airapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[5]/a")
	WebElement utsapp;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[6]/a/span")
	WebElement wifi;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[8]/a/span")
	WebElement trainsglance;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[1]/div[2]/div[2]/a")
	WebElement trainsglancebook;
	
	@FindBy(xpath="/html/body/app-root/tagbooking/div/div[2]/div/div/div/div/form/div[3]/select")
	WebElement trainsglancenoofbooks;
	
	@FindBy(xpath="/html/body/app-root/tagbooking/div/div[2]/div/div/div/div/form/div[4]/button")
	WebElement trainsglancecontinue;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[9]/a/span")
	WebElement nvsp;
	
	@FindBy(xpath="//*[@id=\"modalLRInput10\"]")
	WebElement tguname;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div[2]/input")
	WebElement tgpass;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div[3]/button")
	WebElement tglogin;
	
	@FindBy(xpath="/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr/td[2]/div/div[1]/input")
	WebElement tfname;
	
	@FindBy(xpath="/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr/td[2]/div/div[2]/input")
	WebElement tlname;
	
	@FindBy(xpath="/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[2]/div[7]/select")
	WebElement tstate;
	
	@FindBy(xpath="/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[4]/div/button[2]")
	WebElement tsubmit;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[10]/a/span")
	WebElement mahilaehaat;
	
	@FindBy(xpath="//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[10]/ul/li[12]/a/span")
	WebElement mtourism;
	
	public Promotions(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void js100() {
		js.executeScript("window.scrollBy(0,250)", "");
	}
	public void js150() {
		js.executeScript("window.scrollBy(0,250)", "");
	}
	public void js200() {
		js.executeScript("window.scrollBy(0,250)", "");
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
	public void okButton() {
		okbutton.click();
	}
	
	public void panelClick() {
		js.executeScript("arguments[0].click();",panel);
	}
	
	public void promotions() {
		js.executeScript("arguments[0].click();",promotions);
	}
	
	public void advertisewithus() {
		js.executeScript("arguments[0].click();",advertisewithus);
	}
	
	public void banner() {
		js.executeScript("arguments[0].click();",banner);
	}
	
	public void chatbot() {
		js.executeScript("arguments[0].click();",chatbot);
	}
	
	public void railconnectapp() {
		js.executeScript("arguments[0].click();",railconnectapp);
	}
	
	public void androidapp() {
		js.executeScript("arguments[0].click();",androidapp);
	}
	
	public void iosapp() {
		js.executeScript("arguments[0].click();",iosapp);
	}
	
	public void tourismapp() {
		js.executeScript("arguments[0].click();",tourismapp);
	}
	
	public void airapp() {
		js.executeScript("arguments[0].click();",airapp);
	}
	
	public void utsapp() {
		js.executeScript("arguments[0].click();",utsapp);
	}
	
	public void wifi() {
		js.executeScript("arguments[0].click();",wifi);
	} 
	
	public void trainsglance() {
		js.executeScript("arguments[0].click();",trainsglance);
	}
	
	public void trainsglancebook() {
		trainsglancebook.click();
	}
	public void trainsglancenoofbooks() {
		Select trainsglancenoofbooks1= new Select(trainsglancenoofbooks);
		trainsglancenoofbooks1.selectByVisibleText("15");;
	}
	public void trainsglancecontinue() {
		trainsglancecontinue.click();
	}
	
	public void tguname(String str) {
		tguname.sendKeys(str);
	}
	public void tgpass(String str) {
		tgpass.sendKeys(str);
	}
	public void nvsp() {
		js.executeScript("arguments[0].click();",nvsp);
	}
	public void tglogin() {
		tglogin.click();
	}
	
	public void tfname(String str) {
		tfname.sendKeys(str);
	}
	public void tlname(String str) {
		tlname.sendKeys(str);
	}
	public void tstate() {
		Select tstate1= new Select(tstate);
		tstate1.selectByVisibleText("MAHARASHTRA");;
	}
	public void tsubmit() {
		tsubmit.click();
	}
	public void mahilaehaat() {
		js.executeScript("arguments[0].click();",mahilaehaat);
	}
	public void mtourism() {
		js.executeScript("arguments[0].click();",mtourism);
	}

}
