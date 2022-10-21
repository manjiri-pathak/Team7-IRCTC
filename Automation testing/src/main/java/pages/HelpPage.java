package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HelpPage {  
	WebDriver driver;	
	JavascriptExecutor js;

	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OkButton;
	
	@FindBy(xpath = "//img[@id='disha-banner-close']")
    WebElement closebanner;
	
	@FindBy(xpath="//div[@class='h_menu_drop_button hidden-xs']//i[@class='fa fa-align-justify']")
	WebElement NAVbutton;
	
	@FindBy(xpath="//label[contains(text(),'ALERTS')]")
	WebElement Alertbutton;
	
	@FindBy(xpath = "//a[@id='updateAnchorId']")
	WebElement UpdateBtn;
	
	@FindBy(xpath = "//a[@id='genInfoAnchorId']")
	WebElement Generalinfo;
	
	@FindBy(xpath = "//a[@id='genSpecialTrainsId']")
	WebElement QuickLnkButton;
	
	@FindBy(xpath = "//a[@id='genCancelledTrainId']")
	WebElement RailwayUpdateButton;
	
	@FindBy(xpath="//label[normalize-space()='CONTACT US']")
	WebElement ContactButton;
	
	@FindBy(xpath="//label[normalize-space()='ASK DISHA']")
	WebElement AskDishaButton;
	
	public HelpPage(WebDriver driver) {
		this.driver=driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OkButton() {
		OkButton.click();
	}
	
	public void CloseBanner() {
        closebanner.click();
    }
	
	public void NAVButton() {
		js.executeScript("arguments[0].click();",NAVbutton);
	}
	
	public void AlertButton() {
		js.executeScript("arguments[0].click();",Alertbutton);
	}
	public void UpdateBtn() {
		UpdateBtn.click();
	}
	
	public void Generalinfo() {
		Generalinfo.click();
	}
	
	public void QuickLnkButton() {
		QuickLnkButton.click();
	}
	
	public void RailwayUpdateButton() {
		RailwayUpdateButton.click();
	}
	
	public void ContactButton() {
		js.executeScript("arguments[0].click();",ContactButton);	}		
	
	public void AskDishaButton() {
		js.executeScript("arguments[0].click();",AskDishaButton);
	}
	
			
		
}


