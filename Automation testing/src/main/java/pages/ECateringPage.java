package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECateringPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"page-container\"]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/input")
	WebElement searchStationField;
	
	@FindBy(xpath="//*[@id=\"pnr-input\"]")
	WebElement pnr;
	
	////*[@id="page-container"]/div/div[1]/div[2]/div[1]/div[2]/div[2]/form/button
	@FindBy(xpath="//*[@id=\"page-container\"]/div/div[1]/div[2]/div[1]/div[2]/div[2]/form/button")
	WebElement pnrSubmitButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/div[3]/button[1]")
	WebElement groupOrderButton;
	
	@FindBy(xpath="//*[@id=\"page-container\"]/div/div[1]/div[6]/div/div/div/div/ul/li[1]/div/a[1]")
	WebElement junction;
	
	public ECateringPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchStation(String station) {
		searchStationField.sendKeys(station);
	}
	
	public void pnrSearch(String pnrNo) {
		pnr.sendKeys(pnrNo);
	}
	public void pnrSubmit() {
		pnrSubmitButton.click();
	}
	
	public void groupOrder() {
		groupOrderButton.click();
	}
	
	public void clickJunction() {
		junction.click();
	}
}
