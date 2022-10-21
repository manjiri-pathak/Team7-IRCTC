package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelpage {

	WebDriver driver;
	JavascriptExecutor js;
	@FindBy(id="filterText")
	WebElement searchhotel;
	
	@FindBy(xpath="/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a")
	WebElement searchlist;
	
	@FindBy(xpath="//button[contains(text(),'Find Hotel')]")
	WebElement searchbutton;
	
    
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-fulllayout[1]/app-hoteldetail[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/b[1]")
	WebElement bookcon;
    

    
    @FindBy(xpath="/html/body/app-root/app-fulllayout/homeheader/app-loginmodal/div/div/div/div")
	WebElement loginpop;

	@FindBy(xpath="//span[contains(text(),'No Hotel Found')]")
	WebElement emptyerror;

    @FindBy(xpath="/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div")
	WebElement onehotel;

    @FindBy(xpath="/html/body/app-root/app-fulllayout/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a")
	WebElement loginc;

    @FindBy(xpath="//*[contains(@placeholder,'User Name')]")
	WebElement uname;
	
	@FindBy(xpath="//*[contains(@placeholder,'Enter Password')]")
	WebElement pass;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement signin;

	@FindBy(xpath="/html/body/app-root/app-fulllayout/homeheader/app-loginmodal/div/div/div/div/div/div[1]/div/p")
	WebElement errm;
	
	
	public Hotelpage(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void currenturl() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("Page title of new tab: " + newTb);
	}
    
	public void source(String src) {
		searchhotel.sendKeys(src);
	}
	
	public void search() {
		searchbutton.click();
	}
	
	public void searchClick(){
        searchlist.click();
    }
	public boolean sourceAvailable() {
		return searchlist.isDisplayed();
	}

    public boolean loginPop(){
        return loginpop.isDisplayed();
    }

    public void bookC(){

        bookcon.click();
    }
	
	public void searchButton() {
		searchbutton.click();
	}
	public String error() {
		return emptyerror.getText();
	}

    public void loginClick(){
        loginc.click();
}

    public void clickHotel() {

        onehotel.click();
    }
	public void js500() {
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	public void js550() {
		js.executeScript("window.scrollBy(0,550)", "");
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
	public boolean err(){
		return errm.isDisplayed();
	}
	
	
}
