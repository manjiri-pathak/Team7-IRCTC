package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookedFoodMenuPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"beverages\"]")
	WebElement beverages;
	
	@FindBy(xpath="//*[@id=\"breakfast\"]")
	WebElement breakfast;
	
	@FindBy(xpath="//*[@id=\"meal\"]")
	WebElement meal;
	
	@FindBy(xpath="//*[@id=\"tabhold\"]/div[1]/div[5]/span[2]/a")
	WebElement alacart;
	
	@FindBy(xpath="//*[@id=\"raj1\"]")
	WebElement AC1_EC;
	
	@FindBy(xpath="//*[@id=\"raj1\"]")
	WebElement A2_A3_CC;
	
	@FindBy(xpath="//*[@id=\"raj1\"]")
	WebElement runningLateMenu;
	
	@FindBy(xpath="//*[@id=\"raj1\"]")
	WebElement duronto;
	
	@FindBy(xpath="//*[@id=\"gatimanmeal\"]")
	WebElement gatimanmeal;
	
	@FindBy(xpath="//*[@id=\"Tej22119\"]")
	WebElement tejas1;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div[4]/p[1]/a")
	WebElement tejas2;
	
	@FindBy(xpath="//*[@id=\"vandebharat\"]")
	WebElement vandebharat;
	
	@FindBy(xpath="//*[@id=\"middle\"]/a/img")
	WebElement closeButton;
	
	public CookedFoodMenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickBeverages() {
		beverages.click();
	}
	public void clickBreakfast() {
		breakfast.click();
	}
	public void clickMeal() {
		meal.click();
	}
	public void clickAlacart() {
		alacart.click();
	}
	public void clickAC1_EC() {
		AC1_EC.click();
	}
	public void clickA2_A3_CC() {
		A2_A3_CC.click();
	}
	public void clickRunningLateMenu() {
		runningLateMenu.click();
	}
	public void clickDuronto() {
		duronto.click();
	}
	public void clickGatimanmeal() {
		gatimanmeal.click();
	}
	public void clickTejas1() {
		tejas1.click();
	}
	public void clickTejas2() {
		tejas2.click();
	}
	public void clickVandebharat() {
		vandebharat.click();
	}
	public void clickClose() {
		closeButton.click();
	}
	
}
