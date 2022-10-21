package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantryCarPage {
WebDriver driver;
	
	@FindBy(xpath="/html/body/app-root/ng-component/div[1]/div/div/form/input")
	WebElement pnr;
	
	@FindBy(xpath="/html/body/app-root/ng-component/div[1]/div/div/form/button")
	WebElement submitButton;
	
	public PantryCarPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchStation(String pnrNo) {
		pnr.sendKeys(pnrNo);
	}
	public void clickSubmit() {
		submitButton.click();
	}
}
