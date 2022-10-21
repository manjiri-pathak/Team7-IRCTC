package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loyalty {

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
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/label[1]")
	WebElement loyalty;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[2]/label[1]/a[1]/span[1]")
	WebElement sidescroll;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]/span[1]")
	WebElement sbicredit;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]/span[1]")
	WebElement bobcredit;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[3]/p-sidebar[1]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement aboutcard;
	public Loyalty(WebDriver driver) {
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
	public void Sidescroll() {
		Actions action = new Actions(driver);
	    action.moveToElement(sidescroll);
	   
	    }
	public void Loyaltymenu()
	{
		loyalty.click();
	}
	
	public void Bobcards() {
		Actions action = new Actions(driver);
	    action.moveToElement(bobcredit).moveToElement(aboutcard).click().build().perform();
	   
	    }
	
	public void Sbicards() {
		Actions action = new Actions(driver);
	    action.moveToElement(sbicredit).moveToElement(aboutcard).click().build().perform();
	   
	    }
	
	
	public void currenturl() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      //System.out.println("Page title of new tab: " + driver.getTitle());
	}
	
	
	
	
}
