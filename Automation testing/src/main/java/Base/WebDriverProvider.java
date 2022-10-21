package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverProvider {
    WebDriver driver;
    
    public WebDriverProvider(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
        public WebDriver setBrowser(String browser) {
            if(browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                return driver;
            }
            else if(browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                return driver;
            }
            else if(browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                return driver;
            }
            return driver;
            
            
        }
}
